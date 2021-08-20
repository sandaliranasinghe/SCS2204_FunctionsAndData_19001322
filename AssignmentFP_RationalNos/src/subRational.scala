object subRational extends App{

  class Rational(x: Int, y: Int) {
    require(y>0)
    private def gcd(a: Int, b: Int): Int =
      if (b == 0) a else gcd(b, a % b)
    def numer = x / gcd(x, y)
    def denom = y / gcd(x, y)
    def this(x: Int) = this(x,1)

    def sub(r:Rational) = new Rational(this.numer * r.denom - r.numer * this.denom, this.denom * r.denom)

    override def toString = numer + "/" + denom
  }

  val x = new Rational(3,4)
  val y = new Rational(5,8)
  val z = new Rational(2,7)
  val ans = x.sub(y).sub(z)
  println(x+" - "+y+" - "+z+" = "+ans)
}
