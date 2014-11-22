// This is a generic class, parameterized by a type we call T.
class Reference[T] {
	private var contents: T = _ // "_" represents a default value.
	// Default Values:
	// numeric => 0
	// Boolean => false
	// Unit => ()
	// all object types => null

	def set(value: T) { contents = value }
	def get: T = contents
}