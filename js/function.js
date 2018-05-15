(function() {
  var empty = (_) => {
    return null;
  }

  var get = (key, obj) => {
    return obj(key);
  }

  var set = (key, value, obj) => {
    return (key2) => {
      if(key === key2) {
        return value;
      } else {
        return get(key2, obj);
      }
    };
  };

  
  
})();