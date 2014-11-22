// Scala classes do not only inherit from super-classes but also import code from one or more "traits".
// These are basically interfaces which are allowed to contain code. When a Scala class inherits a trait,
// it implements the interface and also inherits all of the code contained in the trait.
trait Ordered {
	// This trait takes advantage of the default definition of equality "==" and an abstracted definition of less than "<" to implement
	// the rest of the comparisons.
	def < (that: Any): Boolean // The type "Any" is a super-type of all other types in Scala, including what Java would consider to be "primitive" 
	def <= (that: Any): Boolean = (this < that) || (this == that)
	def > (that: Any): Boolean = !(this <= that)
	def >= (that: Any): Boolean = !(this < that)
}

