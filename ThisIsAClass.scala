class Complex(real: Double, imaginary: Double) {
	def re() = real // this is a getter method which simply returns the real component of the complex number
	// the compiler infers that the return type of this function is Double, but it will not always be able to do this
	def im() = imaginary
	// later, if you want to use these methods, they have to have the open and close parentheses
}