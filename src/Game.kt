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
        println("Please chose one:")
        playerInput= sc.nextInt()
        if (playerInput!=null && playerInput <= optionParam.size){
            isvalidChoice = true
            playerChoice = optionParam.get(playerInput-1)
        }
    }
    return playerChoice
}
fun main(args: Array<String>){
    val option = arrayOf("Rock","Paper","Scissor")
    val gameChoice = getGameChoice(option)
    val playerChoice = getPlayerChoice(option)
    println("$gameChoice")
    println("$playerChoice")
}