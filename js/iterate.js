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

  var naturals = enumFrom(1);

  var twoStep = (n) => {
    return n + 2;
  };

  var evenStream = iterate(2)(twoStep);

  console.log(evenStream);

})();