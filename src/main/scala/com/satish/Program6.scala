package com.satish

object Program6 {
  def main(args: Array[String]) {
    print("Enter value of first number: ")
    var num1 = scala.io.StdIn.readInt()
    print("Enter value of second number: ")
    var num2 = scala.io.StdIn.readInt()
    print("Enter operation you want to perfrom (+,-,/,*) ")
    var op = scala.io.StdIn.readChar()
    var result:Int=0

    op match {
      case '+' => result = num1 + num2
      case '-' => result = num1 - num2
      case '*' => result = num1 * num2
      case '/' => result = num1 / num2
      case '%' => result = num1 % num2
      case _ => printf("Invalid operation.\n")
    }
    println("Result: " + result);

  }

}
