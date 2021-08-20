object bankAccounts extends App{

  class Account(id:String,n: Int, b: Double) {
    val nic:String=id
    val acnumber: Int = n
    var balance: Double = b
    override def toString =
      "["+nic+":"+acnumber +":"+ balance+"]"

    def findNeg = {
      if(this.balance<0){
        println(this)
      }
    }

    def interest = {
      if(this.balance>0){
        this.balance = this.balance+this.balance*0.05
        println(this)
      }
      else{
        this.balance = this.balance+this.balance*0.1
        println(this)
      }
    }
  }

  def addBalance(x:List[Account]) = {
    var s: Double = 0
    var count = 0
    for(z <- x){
      count += 1
      s = s + z.balance
      if(count<x.length)
        print(z.balance+" + ")
      else
        print(z.balance)
    }
    print(" = "+s)
  }

  val a = new Account("00123v",111,3000)
  val b = new Account("00451v",112,1500)
  val c = new Account("00563v",113,-500)
  val d = new Account("00246v",114,-1000)

  var bank:List[Account]=List(a,b,c,d)

  println("_________All account details of the bank_________")
  for(x <- bank) println(x)
  println("\n_________Accounts with negative balances__________")
  for(y <- bank) y.findNeg
  println("\n__________Total of all accounts balances__________\n")
  addBalance(bank)
  println("\n\n____Changed balances of accounts with interest____")
  for(m <- bank) m.interest

}
