(function() {
  var succ = (n) => {
    return n + 1; 
  };
  var prev = (n) => {
    return n - 1;
  };
  var add = (x, y) => {
    if(y < 1){ 
      return x;
    } else {
      return add(succ(x), prev(y));
    }
  };

  var times = (count, fun, arg, memo) => {
    if(count > 1) {
      console.log(memo)
      return times(count - 1, fun, arg, fun(memo, arg));
    } else {
      return fun(memo, arg);
    }
  };

  var multiply = (n,m) => {
    return times(m, add, n, 0);
  }

  var exponential = (n, m) => {
    return times(m, multiply, n, 1);
  }

  console.log(exponential(5,3));
})();