package com.satish

object Program16 {
  def main(args: Array[String]) {
    var result:Int=0
    for (i <- 382 to 582 by 2) {
      result=result+i
    }
    println(result)
  }

}
