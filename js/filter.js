(function() {

  var succ = (n) => {
    return n + 1; 
  };

  var iterate = (init) => {
    return (step) => {
      return [init, (_) => {
        return iterate(step(init))(step);
      }];
    };
  };

  var enumFrom = (n) => {
    return iterate(n)(succ);
  };

  var twoStep = (n) => {
    return n + 2;
  };

  var evenStream = iterate(2)(twoStep);

  var filter = (predicate) => {
    return (aStream) => {
      var head = aStream[0];
      if(predicate( head) === true) {
        return [head, (_) => {
          return filter(predicate)(aStream[1]());
        }];
      } else {
        return filter(predicate)(aStream[1]());
      }
    };
  };

  var even = (n) => {
    return (n % 2) === 0;
  };

  var evenStream = filter(even)(enumFrom(1));

  var elemAt = (n) => {
    return (aStream) => {
      if(n === 1) {
        return aStream[0];
      } else {
        return elemAt(n - 1)(aStream[1]());
      };
    };
  };

  console.log(elemAt(3)(evenStream));

})();