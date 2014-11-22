object IntegerReference {
	def main(args: Array[String]) {
		val ptr = new Reference[Int]
		ptr.set(123)
		println("Reference does not contain the value " + (ptr.get + 1))
	}
}