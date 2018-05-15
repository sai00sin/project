(function() {

/*
	var sum = (array) => {
		var result = 0;
		var index = 0;
		while(index < array.length) {
			result = result + array[index];
			index = index + 1;
		}
		return result;
	}
*/

	var sum = (array) => {
		return array.reduce(
			(accumulator, item) => {
				return accumulator + item;
			},0
		);
	};

	console.log(sum([1,2,3]));

})();