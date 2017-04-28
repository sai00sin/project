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

β変換の具体例

1.まず、先頭の'λx.'は取り去って、ラムダ式（関数定義）本体を取り出します。
2.その本体内に出現する変数xをすべて（0箇所かもしれないし、100箇所かもしれない）、引数の式で置き換えます。
3.もちろん、変数の名前は'x'じゃなくてもいいです。
4.λ(x, y).(…x…y…) のようなときは、変数xだけじゃなくて変数yも対応する式で置き換えます。

例：

(λx.x*x)（(λy.2*y)(2)）

外側：
（(λy.2*y)(2)）*（(λy.2*y)(2)）
(2*2)*(2*2)

内側：
(λx.x*x)（(λy.2*2)(2)）
(λx.x*x)（2*2）
（2*2）*（2*2）

8

*/










/*
var answer (function (x, y) {
	return f(y, x);
})(5,2)
*/

var answer = (function (x, y) {return g(f(x, y));})(2, 5)

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

/*
jsラムダ
http://d.hatena.ne.jp/m-hiyama/20070208/1170905900

scala関数
https://codezine.jp/article/detail/5251

http://yakinikunotare.boo.jp/orebase2/scala/function/literal

val myadd:(Int, Int) => Int = (a:Int, b:Int) => {
  a + b
}:Int


*/