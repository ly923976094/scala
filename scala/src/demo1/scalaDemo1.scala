package demo1

/**
  * Created by yodo1 on 17/3/11.
  */
trait Friendly {
  def greet() = "Hi"
}

class Dog extends Friendly {
  override def greet(): String = "Woof"
}

class HuangryDog extends Dog {
  override def greet(): String = "I'd like to eat my own dog food"

}

trait ExclamatoryGreeter extends Friendly {
  override def greet(): String = super.greet() + "!"
}

/**
  * scala 接口的使用
  */

object scalaDemo1 extends App {

  var pet: Friendly = new Dog
  println(pet.greet())

  pet = new HuangryDog
  println(pet.greet())


  pet = new Dog with ExclamatoryGreeter
  println(pet.greet())

  pet=new HuangryDog with ExclamatoryGreeter
  println(pet.greet())
}



