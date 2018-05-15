(function() {

	var empty = () => {
		return (pattern) => {
			return pattern.empty();
		};
	};

	var cons = (value, list) => {
		return (patern) => {
			return pattern.cons(value, list);
		};
	};

	var match = (data, pattern) => {
		return data(pattern);
	}



  console.log(exponential(5,3));
})();