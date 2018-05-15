(function() {

	var product = (array) => {
		return array.reduce((accumulator, item) => {
			return accumulator * item;
		}, 1);
	};

	console.log(product([1,2,3,4]));

})();