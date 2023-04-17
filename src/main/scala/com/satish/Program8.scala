package com.satish

object Program8 {
  def main(args: Array[String]) {
    for (w <- 250 until 550) {
      if(w%11==0) {
        println(w);
      }
    }
  }

}
