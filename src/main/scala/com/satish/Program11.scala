package com.satish

object Program11 {
  def main(args: Array[String]) {
    for (i <- 251 to 50 by -1) {
      if (i % 2 != 0) {
        println(i)
      }
    }
  }

}
