fun main(){
    operators()
    if_statements()
}
fun operators(){
var Phyc = 69
var Geog = 60
var sum = Phyc+Geog
var total = Phyc*Geog
var diff = Phyc-Geog
var mod = Phyc%Geog
var div = Phyc/Geog
println(sum)
println(total)
println(diff)
println(mod)
println(div)
}
fun if_statements(){
    var grade = 100
    var score = 129
    if (grade > score){
        println("grade is greater than score")
    }else if (grade < score){
        println("grade < score")
    } else{
        println("grade == score")
    }

}