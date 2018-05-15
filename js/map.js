(function () {
  
  var succ = (n) => {
    return n + 1; 
  };
  
  var prev = (n) => {
    return n - 1;
  };

  var map = (transform) => {
    return (array) => {
      return array.reduce((accumulator, item) => {
        return accumulator.concat(transform(item));
      },[]);
    };
  };

  console.log(map(succ)([1,3,5]));

})();