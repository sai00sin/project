(function() {

  var exponential = (base) => {
    return (index) => {
      if(index === 0) {
        return 1;
      } else {
        return base * exponential(base)(index - 1);
      }
    };
  };

  var flip = (fun) => {
    return (x) => {
      return (y) => {
        return fun(y)(x);
      };
    };
  };

  var square = flip(exponential)(2);

  console.log(square(5));

})();