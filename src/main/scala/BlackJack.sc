def checkhand(handtot: Int) : Boolean = handtot match{
  case x if handtot > 21 => false
  case x if handtot <= 21 => true
  case _ => printf("Error, "+handtot+" is invalid")
    false

}
    def comphand(hand1:Int, hand2:Int) : Int = {

      val difference: Int = hand1 - hand2

      difference match{
      case x if difference < 0 => hand2
      case x if difference > 0 => hand1
      case x if difference == 0 => 0
      case _ => printf("Error");0

        }
      }
    def checkwin(hand1: Int, hand2: Int) : Int = {

      val checkhand121 : Boolean = checkhand(hand1)
      val checkhand221 : Boolean = checkhand(hand2)

      val x : Int = 0
      x match
      {
      case x if checkhand121 && checkhand221 => comphand(hand1, hand2)
      case x if !checkhand121 && checkhand221 => hand2
      case x if checkhand121 && !checkhand221 => hand1
      case x if !checkhand121 && !checkhand221 => 0
      case _=> println("oops, something went wrong!");0
      }
    }

println("hand 1 :21, hand 2 :18, winning hand: " +checkwin(21,18))
println("hand 1 :18, hand 2 :21, winning hand: " +checkwin(18,21))
println("hand 1 :18, hand 2 :18, winning hand: " +checkwin(18,18))