(function() {

  var times = (count, arg, memo, fun) => {
    if(count > 1) {
      return times(count - 1, arg, fun(arg, memo), fun);
    } else {
      return fun(arg, memo);
    }
  };

  var add = (n, m) => {
    return n + m;
  };

  var multiply = (n, m) => {
    return times(m, n, 0, add);
  };

  var exponential = (n, m) => {
    return times(m, n, 1, multiply);
  };



  console.log(exponential(2,6));


/*
  var timesForMultiply = (count, arg, memo) => {
    if(count > 1) {
      return timesForMultiply(count - 1, arg, arg + memo);
    } else {
      return arg + memo;
    }
  };

  var multiply = (n, m) => {
    return timesForMultiply(n, m, 0);
  };

  var timesForExponential = (count, arg, memo) => {
    if(count > 1) {
      return timesForExponential(count - 1, arg, arg * memo);
    }
  };

  var exponential = (n, m) => {
    return timesForExponential(m, n, 1);
  };
*/

})();