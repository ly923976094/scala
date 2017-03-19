package demo1

import com.sun.glass.ui.MenuItem.Callback

/**
  * Created by yodo1 on 17/3/11.
  */
class scalaDemo2 {


}

object Timer {

  def oncePerSecod(callback: () => Unit): Unit = {
    while (true) {
      callback()
      Thread.sleep(1000)
    }
  }

  def timeFiles(): Unit = {
    println("time flies like an arrow...")
  }

  def main(args: Array[String]): Unit = {
    oncePerSecod(timeFiles)
  }
}


object TimerAnonymous {
  def oncePerSecond(callback: () => Unit): Unit = {
    while (true) {
      callback()
      Thread.sleep(1000)
    }
  }

  def main(args: Array[String]): Unit = {
    oncePerSecond(() => println("time flies like an arrow..."))
  }
}




