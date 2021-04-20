fun main() {
println(isEven(350))
    println(isEven(333))

println(product("hygiene"))
   println(product("groceries"))
    println(product("other"))

    var a=person("Katanambaitsa")
    println(a[0])
    println(a[2])



}

fun isEven(num: Int):Boolean{
if(num%2==0){
    return true
}else{
    return false
}
}

data class product(var name: String, var weight: Int, var price: Int, var category: String, )
fun product(product:String){
    when(product){
        "groceries"->println("I like meat")
        "hygiene"->println("Wash your vegetables")
        "others"->println("I dont like")
    }
}

fun person(name:String):String{
    var a=name
    return a

}

