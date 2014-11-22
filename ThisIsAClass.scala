class Complex(real: Double, imaginary: Double) {
	def re = real // this is a getter method which simply returns the real component of the complex number
	// the compiler infers that the return type of this function is Double, but it will not always be able to do this
	def im = imaginary
	// later, if you want to use these methods, they have to have the open and close parentheses
	// update 1: making these into methods without arguments (different from zero arguments) allows them to be accessed like fields of an object

	// every Scala class inherits from a super-class. if no super-class is specified, an object inherits from scala.AnyRef implicitly.

	// the override modifier allows a method to override a method with the same name inherited from the super-class.
	// for instance, toString.
	override def toString() = 
		"" + re + (if (im < 0) "" else "+") + im + "i"
}