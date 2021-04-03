import java.util.*

fun main() {
    var c = Banker("Omondi",26)
    c.eat()
    c.countMoney(listOf(100,200,300))
    c.introduction()

    var me=Farmer("Jane",30)
    me.eat()
    me.cultivate()

    var m=Doctor("PSYCOLOGIST",10)
    m.introduction()

    var amore=Imali("Avril",20)
    amore.coolThing("singing","dancing","BEING GOOFY","loving on strangers")
    amore.sleep()

}
    open class person( var name: String, var age:Int) {
        fun talk(speak: String) {
            println(speak)

        }

        open fun eat() {
            println("yuum")
        }

        open fun sleep() {
            println("zzzzzzzz")
        }
        open fun introduction(){
            println("hello I am $name")
        }


}
class Banker (name:String, age:Int):person(name,age) {

    fun countMoney(notes:List<Int>):Int {
        var sum = 0
        for(note in notes){
            sum=sum+note
            }
        return sum

}}

class Doctor( name:String, age:Int):person(name,age){
    override fun introduction() {
        super.introduction()
        println("Dr")
    }
}




class Farmer(name:String, age:Int) :person(name,age){
fun cultivate(){
    println("dig dig dig")
}

    override fun eat() {
            super.eat()
        println("i love bananas")

    }

}
class Imali(name:String,age: Int):person(name,age){
    fun coolThing(a:String,b:String,c:String,d:String){
        var x= arrayOf(a,b,c,d)
        println(Arrays.toString(x))
    }

    override fun sleep() {
        super.sleep()
        println("ngo ngo ngo")
    }
}
