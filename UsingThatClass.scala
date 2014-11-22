object ComplexNumbers {
	def main(args: Array[String]) {
		val c = new Complex(1.2, 3.4) // when we execute ComplexNumbers, the thing automatically checks the classpath for a Complex.class
		// so as long as you compile the Complex class at some point, you're good
		println("the number is " + c.re() + " " + c.im() + "i")
	}
}