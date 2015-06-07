package com.lyricaloriginal.scalacombination

object Main {

  def main(args: Array[String]) {
    val n = 35;
    val m = 30;
    val answer = combination(n, m);
    println("Combination(" + n + ", " + m + ") = " + answer);
  }

  def combination(n: Int, m: Int): Int = {
    //TODO n <0, m < 0, n < mの時の例外処理を追加する。
    val combiValues = Array.ofDim[Int](n, m);
    return combination(n, m, combiValues);
  }

  def combination(n: Int, m: Int, combiValues: Array[Array[Int]]): Int = {
    if (m == 0 || m == n) {
      return 1;
    } else if (m == 1 || n - 1 == m) {
      return n;
    } else if(combiValues(n - 1)(m - 1) > 0){
      return combiValues(n - 1)(m - 1);
    }else{
      val value = combination(n - 1, m - 1, combiValues) + combination(n - 1, m, combiValues);
      combiValues(n - 1)(m - 1) = value;
      return value;
    }
  }
}