(function() {

/*
	const add1 = (a) => a + 1
	const times2 = (a) => a * 2

	const pipe = (fns) => (x) => fns.reduce((v, f) => f(v), x)
	const times2add1 = pipe([times2, add1])
	console.log(times2add1(5))
*/

/*
	var array = [1, 2, 3];
	var result = array.reduce(function(previous, current, index, array) {
		return current;
	});

	console.log(result);
*/

/*
	var test = [0,1,2,3,4,5].reduce(function(previousValue, currentValue, index, array) {
		return previousValue + currentValue;
	},15);

	console.log(test);
*/

/*
	const formalGreeting = (name) => `Hello ${name}`
	const casualGreeting = (name) => `Sup ${name}`
	const male = (name) => `Mr. ${name}`
	const female = (name) => `Mrs. ${name}`
	const doctor = (name) => `Dr. ${name}`
	const phd = (name) => `${name} PhD`
	const md = (name) => `${name} M.D.`
	formalGreeting(male(phd("Chet")))

	const identity = (x) => x
	const greet = (name, options) => {
		return pipe([
			options.formal ? formalGreeting :
			casualGreeting,
			options.doctor ? doctor :
			options.male ? male :
			options.female ? female :
			identity,

			options.phd ? phd :
			options.md ? md :
			identity
		])(name)
	}
*/

/*
type Maybe = Nothing | Just x

const x = Maybe.Just(10)
const n = x.map(inc)
n.isJust()
n.value()
*/

/*
const x = Maybe.Nothing
const n = x.map(inc)
n.isNothing
*/			

/*
	var plus2 = function(x, y) { return x + y }
	console.log(plus2(2,5));
*/

/*
	function times_define(x) {
		return function(y) {
			return x * y
		}
	}

	var times = times_define(2);
	console.log(times(5));
*/

/*
	let getTriangle = function(base, height) {
		return base * height / 2;
	};
	console.log('三角形の面積は' + getTriangle(10, 2));
*/

/*
	let getTriangle = (base, height) => {
		return base * height / 2;
	};
	console.log('三角形の面積は' + getTriangle(10, 2));
*/

/*
	let getCircle = radius => radius * radius * Math.PI;
	console.log(getCircle(10));
*/

/*
	let show = () => console.log('Hello World!');
	show();
*/

	((() => {
		console.log("これ動きません");
	})());

})();