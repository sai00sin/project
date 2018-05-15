(function() {

  var elemAt = (n) => {
    return (anArray) => {
      if(n === 1) {
        return anArray[0];
      } else {
        var tail = anArray.slice(1, anArray.length);
        return elemAt(n - 1)(tail);
      };
    };
  };

  console.log(elemAt(4)([2,4,6]));

})();