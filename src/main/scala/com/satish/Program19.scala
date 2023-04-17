package com.satish

object Program19 {
  def main(args: Array[String]) {
    var s: Int = 0
    for (i <- 5 to 102) {
      s = s + (i*i)
    }


    println(s)
  }

}
