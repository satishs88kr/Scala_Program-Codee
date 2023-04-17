package com.satish

object Program5 {
  def main(args: Array[String]): Unit = {

    print("Enter a number ")
    var a = scala.io.StdIn.readInt()
    if (a <0  || a >100) {
      println("Invalid Input")
    }
    else {
      if (90 to 100 contains a) {
        println("Super Smart")
      }
      else if(80 to 90 contains a){
        println("Smart")
      }
      else if (70 to 80 contains a) {
        println("Smart Enough")
      }
      else if (60 to 70 contains a) {
        println("Just Smart")
      }
      else if (35 to 60 contains a) {
        println("no Smart")
      }
      else if (0 to 35 contains a) {
        println("dump")
      }
    }


  }

}
