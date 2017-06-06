import sun.font.TrueTypeFont

println("Hello World!")

var myString : String = "Hello World"

println(myString)

def returnMethod() : String = {
  "Hello World"
}

returnMethod

val a = 5

val b = "Hello Jack"

val c = 30.10

val d = true
val t = 3

val str = "hello"
println(str.substring((str.length - t),str.length))

def test2(str: String, letter: Int) = {

}




def test3(str1: String, str2: String, let1: Char, let2: Char): String = {
  val str5: String = str1 + str2
  str5.replace(let1, let2)

}
test3("Hallo ", "World!", 'a', 'e')



def mathAdd(math1: Int, math2: Int) = {
  if (math1 == 0 && math2 == 0)
    println(0)

  else if (math1 != 0 && math2 == 0){
    println(math1)
  }


}

mathAdd(0,7)


printH("Hi", 4)
def printH(myHi: String, intHi: Int) =
{
  var printer =  "" //let you know it is a string
  var a = 0
  for (a <- 1 to intHi)
    {
      printer = ""
      var b = 0
      for (b <- 1 to intHi)
        {
          printer += myHi
        }
      println(printer)

    }

}

