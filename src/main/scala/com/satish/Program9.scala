package com.satish

object Program9 {
  def main(args: Array[String]): Unit = {
    var result: Int = 0
    for (w <- 56 until 153) {
      result = result + w
    }
    print("Sum " + result)

  }
}
