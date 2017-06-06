def fizzBuzz(divisor:Int) = {
  if (divisor % 15 == 0)
    "FizzBuzz"
  else if (divisor % 3 == 0)
    "Fizz"
  else if (divisor % 5 == 0)
    "Buzz"
  else
    divisor
}
(1 until 16).map(fizzBuzz _ andThen println)
println((1 until 16).map(fizzBuzz).mkString(", "))