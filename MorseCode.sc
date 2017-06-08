def morseCode(message: String): Unit ={
  val words=message.split('/')

  val letters = words.foreach(item=>item.split(' '))
  letters.foreach(item=>println(message))

}

  println(morseCode(".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.—"))
 //println(morseMap(""))