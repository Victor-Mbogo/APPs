fun main(){
    whettyt()
}
fun whettyt(){
    var number = -57
    if (number>0 && number<10){
        println("number is single digit")
    }else if(number>10 && number<100){
        println("number has double digits")
    }else if(number<0){
        println("not a natural number")
    } else{
        println("number has multiple digits")
    }

}