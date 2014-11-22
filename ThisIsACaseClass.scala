// the idea here is to implement a simple addition calculator with a tree structure.
// in Java this tree would be implemented as an abstract super-class for the tree, and one concrete sub-class for each node or leaf type.
// for this example, we let the operators be nodes, and operands be leaves.
// we use case classes to represent each node and leaf type.

object Evaluator {
	abstract class Tree
	case class Sum(l: Tree, r: Tree) extends Tree
	case class Var(n: String) extends Tree
	case class Const(v: Int) extends Tree

	// case classes differ from standard classes in several aspects:
	//	* the new keyword is not needed to instantiate these classes
	//	* getter functions are automatically generated for the constructor parameters
	//	* by default, "equals" and "hashCode" are defined; these functions "physically" compare objects
	//      so they compare by value and not by address.
	//	* by default, "toString" is defined; this function prints the value in "source form"
	//	* instances of case classes can be decomposed with pattern matching

	// we may want some environment in which to evaluate arithmetic expressions.
	// for instance we could want some environment which assigns values to some variables.
	// {"x" -> 5} would represent a function, which when it takes "x" as an argument returns 5.
	type Environment = String => Int
	// for this reason, we make Environment into an alias for functions mapping strings to ints.

	// we use pattern matching to do the actual evaluation.
	def eval(t: Tree, env: Environment): Int = t match {
		// if the Tree is a Sum, bind its left and right subtrees to "l" and "r" respectively
		// then we evaluate the expression following "=>", which could make use of these bound variables
		case Sum(l, r) => eval(l, env) + eval(r, env) 
		// similar stuff happens for these other cases
		case Var(n) => env(n)
		case Const(v) => v

		// if our tree does not match any of the above case classes, an exception is raised to show that the pattern matching failed
	}

	def main(args: Array[String]) {
		val exp: Tree = Sum(Sum(Const(5), Var("x")), Var("y"));
		val env: Environment = { 
			case "x" => 1 
			case "y" => 2
		}
		println("Expression: " + exp)
		println("Environment: x is " + env("x") + ", y is " + env("y"))
		println(eval(exp, env))
	}
}