/**
  * Created by user on 2017/06/01.
  */
class BankAcount {
  private var bal: Int = 0
  def balance: Int = bal
  def deposite(amount: Int): Unit = {
    require(amount > 0)
    bal += amount
  }
  def withdraw(amount: Int): Boolean =
    if(amount > bal) false
    else {
      bal -= amount
      true
    }
}
