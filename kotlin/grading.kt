fun main(){
    grading()
}
fun grading() {
    var Maths = 78
    var eng = 69
    var phyc = 79
    var bio = 59
    var hist = 67




    var total = Maths + eng + phyc + bio + hist
    var mean = total/5
    println("average: $mean")
    if (mean<40 ){
        println("E")
    }else if (mean<40 ){
        println("D")
    }else if (mean<50){
        println("C")
    }else if (mean<60){
        println("B")
    }else if (mean>=70){
        println("A")
    }else{
        println("invalid input")
    }

}