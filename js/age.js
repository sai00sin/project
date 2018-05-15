(function() {

/*
  var age = (birthYear) => {
    var today = new Date();
    var thisYear = today.getFullYear();
    return thisYear - birthYear;
  }
*/

  var age = (birthYear, thisYear) => {
    return thisYear - birthYear;
  };

  console.log(age(1982, 2018));

})();