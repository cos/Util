package sppa.util

object inspect {
	def apply[T](x: T): T = {
	  println(x)
	  x
	}
}