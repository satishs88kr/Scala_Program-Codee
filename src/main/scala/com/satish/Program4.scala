package com.satish

import scala.math

object Program4 {
  def main(args: Array[String]) {
    print("Enter a three numbers ")
    var a = scala.io.StdIn.readInt()
    if(a<100 || a>1000)
    {
      println("Wrong Number")
    }
    else
    {
      if(a%2==0)
      {
        println(a%3)
      }
      else
      {
        println(a%2)
      }
    }

  }

}
