import java.awt.SystemTray
import java.util.*

fun getGameChoice(optionParam: Array<String>) =
    optionParam[(Math.random()*optionParam.size).toInt()]
fun getPlayerChoice(optionParam: Array<String>) :String{
    val sc = Scanner(System.`in`)
    var playerInput: Int
    var playerChoice: String =""
    var isvalidChoice = false
    while (!isvalidChoice){
        for(i in 1..3){
            println("$i. ${optionParam.get(i-1)}")
        }
        print("Please chose one:")
        playerInput= sc.nextInt()
        if (playerInput!=null && playerInput <= optionParam.size){
            isvalidChoice = true
            playerChoice = optionParam.get(playerInput-1)
        }
        else println("Please enter valid choice")
    }
    return playerChoice
}
fun printResult(gameChoice:String , playerChoice:String){
    if(gameChoice==playerChoice)
        println("Tie")
    else{
        if ((gameChoice=="Rock" && playerChoice=="Scissor") ||
            (gameChoice=="Scissor" && playerChoice=="Paper")||
            (gameChoice=="Paper" && playerChoice=="Rock"))
            println("You lose")
        else
            println("You win")
    }
}
fun playAgain() : Boolean{
    println("Play again?(Y/N)")
    val sc = Scanner(System.`in`)
    var playerAnswer:Char = sc.next().single()
    if(playerAnswer.toLowerCase()=='y')
        return true
    else return false
}
fun main(args: Array<String>){
    do{
        val option = arrayOf("Rock","Paper","Scissor")
        val gameChoice = getGameChoice(option)
        val playerChoice = getPlayerChoice(option)
        println("Game choose $gameChoice")
        println("You choose $playerChoice")
        printResult(gameChoice,playerChoice)
    }while (playAgain())

}