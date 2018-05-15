(function() {

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

})();