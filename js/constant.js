(function() {

  var constant = (any) => {
    return (_) => {
      return any;
    };
  };

  var alwaysOne = constant(1);

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

  var length = (array) => {
    return sum(map(alwaysOne)(array));
  }

  console.log(length([1,2,3]));
})();