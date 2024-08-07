fun main(){
    var computerchoice=" "
    var playerchoice=" "
println("option are: rock,paper,scissors.enter your choice")
    playerchoice= readln()
    val randomNumber=(1..3).random()
    if (randomNumber==1) {
        computerchoice = "rock"
    }
    else if (randomNumber==2){
        computerchoice="paper"
    }
    else if (randomNumber==3){
        computerchoice="scissors"
    }
    println(computerchoice)
}