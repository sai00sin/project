(function(){
    window.onload=function(){

/*

1.λ(x).(x*x) → λ(x) (x*x) ;ピリオドをとる
2.λ(x) (x*x) →　λ(x) {x*x} ；丸括弧を変換
3.λ(x) {x*x} → λ(x) {return x*x;}  ；式を変換
4.λ(x) {return x*x;} → function (x) {return x*x;}  ；λ（ラムダ）をfunctionに変換する。

http://d.hatena.ne.jp/m-hiyama/20070208/1170905900

*/

/*
var answer (function (x, y) {
	return f(y, x);
})(5,2)
*/

var answer = (function (x) {
	return h(g(x));
})(5)

console.log(answer)



/*
y= 3x+5について次の問に答えよ。
(1) x=2を代入したときのyの値を求めよ。 

Answer y=11
*/
/*
var y = (function (x) {
			return (3 * x) + 5;
	})(2)
console.log(y)
*/

	}
}());

// http://d.hatena.ne.jp/m-hiyama/20070208/1170905900