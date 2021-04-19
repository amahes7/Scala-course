abstract class Nat {
  def isZero: Boolean

  def predecessor: Nat

  def successor = new Succ(this)

  def +(that: Nat): Nat

  def -(that: Nat): Nat
}

object Zero extends Nat {
  def isZero = true

  def predecessor = throw new Error("Error")

  def +(that: Nat) = that

  def -(that: Nat) = that
}

class Succ(n: Nat) extends Nat {
  def isZero = false

  def predecessor: Nat = n

  def +(that: Nat): Nat = new Succ(n + that)

  def -(that: Nat): Nat = new Succ(n - that)
}
