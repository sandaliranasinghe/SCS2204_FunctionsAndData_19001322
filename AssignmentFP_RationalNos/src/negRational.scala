object negRational extends App{

  val x = new Rational(1,3)
  val y = x.neg

  println(x)
  println(y)
}

class Rational(x: Int, y: Int) {
  require(y>0)
  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
  def numer = x / gcd(x, y)
  def denom = y / gcd(x, y)
  def this(x: Int) = this(x,1)

  def neg = new Rational(-this.numer,this.denom)
  override def toString = numer + "/" + denom
}
