object transferMoney extends App{

  class Account(id:String,n: Int, b: Double) {
    val nic:String=id
    val acnumber: Int = n
    var balance: Double = b
    override def toString =
      "["+nic+":"+acnumber +":"+ balance+"]"

    def transfer(a:Account,b:Double)={
      a.balance += b
      this.balance -= b
    }
  }

  val x = new Account("00123v",456,3000)
  val y = new Account("00451v",321,1500)
  println("_______________Before the money transfer_______________")
  println("Balance of account no "+x.acnumber+" of owner Id "+x.nic+" was "+x.balance)
  println("Balance of account no "+y.acnumber+" of owner Id "+y.nic+" was "+y.balance)
  x.transfer(y,500)
  println("\n_______________After the money transfer_______________")
  println("Balance of account no "+x.acnumber+" of owner Id "+x.nic+" is "+x.balance)
  println("Balance of account no "+y.acnumber+" of owner Id "+y.nic+" is "+y.balance)
}
