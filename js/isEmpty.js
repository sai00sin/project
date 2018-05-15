(function() {

	var isEmpty = (alist) => {
		return match(alist, {
			empty: (_) => {
				return true;
			},

			cons: (head, tail) => {
				return false;
			}
		});
	};

	var head = (alist) => {
		return match(alist, {
			empty: (_) => {
				return null;
			},

			cons: (head, tail) => {
				return head;
			}
		});
	};

	var tail = (alist) => {
		return match(alist, {
			empty: (_) => {
				return null;
			},

			cons: (head, tail) => {
				return tail;
			}
		});
	};

})();