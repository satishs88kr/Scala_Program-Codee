package com.satish

object Program12 {
  def main(args: Array[String]) {
    var result:Int=0
    print("Enter a first value  ")
    var a = scala.io.StdIn.readInt()
    print("Enter a second value ")
    var b = scala.io.StdIn.readInt()
    for (w <- a until b) {
      if (w % 2 == 0) {
        result=result+1
      }

    }
    print(result)
  }

}
