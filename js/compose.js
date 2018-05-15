(function() {

  var constant = (any) => {
    return (_) => {
      return any;
    };
  };

  var alwaysOne = constant(1);

  var compose = (f,g) => {
    return (arg) => {
      return f(g(arg));
    };
  };

  var map = (transform) => {
    return (array) => {
      return array.reduce((accumulator, item) => {
        return accumulator.concat(transform(item));
      },[]);
    };
  };

  var sum = (array) => {
    return array.reduce(
      (accumulator, item) => {
        return accumulator + item;
      },0
    );
  };


  var length = compose(sum,map(alwaysOne));

  console.log(length([1,2,3]));

})();