package com.satish

object Program18 {
  def main(args: Array[String]) {
    var s:Int=0
    var c:Int=0
    for (i <- 24 to 100 by 2) {
      s=s+i
      c=c+1

    }
    println(s/c)
  }

}
