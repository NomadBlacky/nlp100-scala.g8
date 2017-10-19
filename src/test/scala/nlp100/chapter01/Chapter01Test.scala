package nlp100.chapter01

import org.scalatest.{FunSuite, Matchers}

/**
  * 第1章: 準備運動
  */
class Chapter01Test extends FunSuite with Matchers {

  override def suiteName: String = "第1章: 準備運動"

  test("00. 文字列の逆順") {
    /**
      * 文字列"stressed"の文字を逆に（末尾から先頭に向かって）並べた文字列を得よ．
      */
    val text = "stressed"

    val result = ""

    result shouldBe "desserts"
  }

  test("01. 「パタトクカシーー」") {
    /**
      * 「パタトクカシーー」という文字列の1,3,5,7文字目を取り出して連結した文字列を得よ．
      */
    val text = "パタトクカシーー"

    val result = ""

    result shouldBe "パトカー"
  }

  test("02. 「パトカー」＋「タクシー」＝「パタトクカシーー」") {
    /**
      * 「パトカー」＋「タクシー」の文字を先頭から交互に連結して文字列「パタトクカシーー」を得よ．
      */
    val text1 = "パトカー"
    val text2 = "タクシー"

    val result = ""

    result shouldBe "パタトクカシーー"
  }

  test("03. 円周率") {
    /**
      * "Now I need a drink, alcoholic of course, after the heavy lectures involving quantum mechanics."
      * という文を単語に分解し，各単語の（アルファベットの）文字数を先頭から出現順に並べたリストを作成せよ．
      */

    val result = List[Int]()

    result shouldBe List(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9)
  }

  test("04. 元素記号") {
    /**
      * "Hi He Lied Because Boron Could Not Oxidize Fluorine. New Nations Might Also Sign Peace Security Clause. Arthur King Can."
      * という文を単語に分解し，1, 5, 6, 7, 8, 9, 15, 16, 19番目の単語は先頭の1文字，
      * それ以外の単語は先頭に2文字を取り出し，
      * 取り出した文字列から単語の位置（先頭から何番目の単語か）への連想配列（辞書型もしくはマップ型）を作成せよ．
      */

    val result = Map()

    val expect = Map(
       1 -> "H" ,  2 -> "He",  3 -> "Li",  4 -> "Be",  5 -> "B" ,
       6 -> "C" ,  7 -> "N" ,  8 -> "O" ,  9 -> "F" , 10 -> "Ne",
      11 -> "Na", 12 -> "Mi", 13 -> "Al", 14 -> "Si", 15 -> "P" ,
      16 -> "S" , 17 -> "Cl", 18 -> "Ar", 19 -> "K" , 20 -> "Ca"
    )

    result shouldBe expect
  }

  test("05. n-gram") {
    /**
      * 与えられたシーケンス（文字列やリストなど）からn-gramを作る関数を作成せよ．
      * この関数を用い，"I am an NLPer"という文から単語bi-gram，文字bi-gramを得よ．
      */

    wordNGram("I am an NLPer", 2) shouldBe List(
      List("I", "am"), List("am", "an"), List("an", "NLPer")
    )
    charNGram("I am an NLPer", 2) shouldBe List(
      "I ", " a", "am", "m ", " a", "an", "n ", " N", "NL", "LP", "Pe", "er"
    )
  }

  def wordNGram(text: String, gram: Int): List[List[String]] = {
    List()
  }

  def charNGram(text: String, gram: Int): List[String] = {
    List()
  }

  test("06. 集合") {
    /**
      * "paraparaparadise"と"paragraph"に含まれる文字bi-gramの集合を，それぞれ, XとYとして求め，
      * XとYの和集合，積集合，差集合を求めよ．
      * さらに，'se'というbi-gramがXおよびYに含まれるかどうかを調べよ．
      */

    val x = Set("")
    val y = Set("")

    // 和集合
    Set() shouldBe Set("pa", "ar", "ra", "ap", "ad", "di", "is", "se", "ag", "gr", "ph")

    // 積集合
    Set() shouldBe Set("pa", "ar", "ra", "ap")

    // 差集合
    Set() shouldBe Set("ad", "di", "is", "se")

    // 含まれるか
    x // true
    y // false
  }

  test("07. テンプレートによる文生成") {
    /**
      * 引数x, y, zを受け取り「x時のyはz」という文字列を返す関数を実装せよ．
      * さらに，x=12, y="気温", z=22.4として，実行結果を確認せよ．
      */
    fail()
  }

  // def templete()

  test("08. 暗号文") {
    /**
      * 与えられた文字列の各文字を，以下の仕様で変換する関数cipherを実装せよ．
      * 英小文字ならば(219 - 文字コード)の文字に置換
      * その他の文字はそのまま出力
      * この関数を用い，英語のメッセージを暗号化・復号化せよ．
      */
    fail()
  }

  test("09. Typoglycemia") {
    /**
      * スペースで区切られた単語列に対して，各単語の先頭と末尾の文字は残し，それ以外の文字の順序をランダムに並び替えるプログラムを作成せよ．
      * ただし，長さが４以下の単語は並び替えないこととする．適当な英語の文
      * （例えば"I couldn't believe that I could actually understand what I was reading : the phenomenal power of the human mind ."）
      * を与え，その実行結果を確認せよ．
      */
    fail()
  }
}
