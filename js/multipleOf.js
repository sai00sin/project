(function() {



  var multipleOf = (n) => {
    return (m) => {
      if(m % n === 0) {
        return true;
      } else {
        return false;
      }
    };
  };
  
  console.log(multipleOf(2)(4));
  
})();