
printH("H", 4)
def printH(myHi: String, intHi: Int) = {
  var printer = "" //let you know it is a string
  var a = 0
  for (a <- 1 to intHi) {
    printer = ""
    var b = 0
    for (b <- 1 to intHi) {
      printer += myHi
    }
    println(printer)
  }
}