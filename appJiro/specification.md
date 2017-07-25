# ラーメン二郎の星マークをとってくるwebアプリ

## 使用技術：

webscraping

## 使用言語

scala

## 機能

webサイトからソースをとってくる
webサイトのソースをローカルに保存
保存したソースから星の数を抽出
文字列にしてアップロード

URL

https://tabelog.com/en/rstLst/1/?sw=%25E3%2583%25A9%25E3%2583%25BC%25E3%2583%25A1%25E3%2583%25B3%25E4%25BA%258C%25E9%2583%258E

https://tabelog.com/en/rstLst/2/?sw=%25E3%2583%25A9%25E3%2583%25BC%25E3%2583%25A1%25E3%2583%25B3%25E4%25BA%258C%25E9%2583%258E

https://tabelog.com/en/rstLst/3/?sw=%25E3%2583%25A9%25E3%2583%25BC%25E3%2583%25A1%25E3%2583%25B3%25E4%25BA%258C%25E9%2583%258E

doc >> text("#header")
doc内のソースの中にある#headerの中のテキストを取得（pタグやspanタグなど）

val items = doc >> elementList("#menu span")
id menuの中のspanタグの中のソースをListで取得

items.map(_ >> allText("a"))
上記で格納したitemsの中のaタグの中の文字列を取得

doc >> attr("content")("meta[name=viewport]")
headの中のcontentとmeta情報を取得

--

食べログのサイトから星の数をListに格納
Listの星のデータをindex.htmlのliに格納する。

.rd-vertical-ranking__listの要素を取得

星の数取ってきて並べ替えが必要？（星の数が多い順に）

ranking.htmlを作ってファイル出力
rankingを反映させた結果を反映