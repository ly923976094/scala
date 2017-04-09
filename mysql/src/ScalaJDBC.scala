/**
  * Created by yodo1 on 17/4/8.
  */
import java.sql.DriverManager
import java.sql.Connection

object ScalaJDBC {

  def main(args: Array[String]) {
    // connect to the database named "mysql" on the localhost
    val driver = "com.mysql.jdbc.Driver"
    val url = "jdbc:mysql://172.16.200.87:3306/test"
    val username = "root"
    val password = ""

    var connection:Connection = null

    try {

      Class.forName(driver)
      connection = DriverManager.getConnection(url, username, password)

      val statement = connection.createStatement()
      val resultSet = statement.executeQuery("select * from solution")
      while ( resultSet.next() ) {
        val clide = resultSet.getString("clide")
        val orderid = resultSet.getString("orderid")
        val item_code = resultSet.getString("item_code")
        println("clide, orderid, item_code= " + clide + ", " + orderid + ", " + item_code)
      }

      println("ok")
    } catch {
      case e => e.printStackTrace
      //case _: Throwable => println("ERROR")
    }
    connection.close()
  }

}

