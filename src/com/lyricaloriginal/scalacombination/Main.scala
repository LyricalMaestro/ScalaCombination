package com.lyricaloriginal.scalacombination

object Main {
  def main(args: Array[String]) {
    val n = 40;
    val m = 15;
    val answer = combination(n, m);
    println("Combination(" + n + ", " + m + ") = " + answer);
  }

  def combination(n: Int, m: Int): Int = {
    //TODO n <0, m < 0, n < mの時の例外処理を追加する。
    if (m == 0 || m == n) {
      return 1;
    } else if (m == 1 || n - 1 == m) {
      return n;
    } else {
      return combination(n - 1, m - 1) + combination(n - 1, m);
    }
  }
}