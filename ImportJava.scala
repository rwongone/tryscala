import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.DateFormat._ // using Scala, you can directly import Java class libraries

object FrenchDate {
	def main(args: Array[String]) {
		val now = new Date();
		val df = getDateInstance(LONG, Locale.FRANCE)
		println(df format now) // a shorthand equivalent to df.format(now)
	}
}