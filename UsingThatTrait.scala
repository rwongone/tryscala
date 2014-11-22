object UsingDate {
	class MyDate(y: Int, m: Int, d: Int) extends Ordered {
		def year = y
		def month = m
		def day = d

		override def toString(): String = month + "/" + day + "/" + year
		override def equals(that: Any): Boolean =
			that.isInstanceOf[MyDate] && { // isInstanceOf does what you think it does
				val o = that.asInstanceOf[MyDate] // asInstanceOf gives you an actual instance, like casting the object, might give ClassCastException
				o.day == day && o.month == month && o.year == year
			}
		def <(that: Any): Boolean = {
			if (!that.isInstanceOf[MyDate]) 
				sys.error("Cannot compare " + that + " and a MyDate")

			val o = that.asInstanceOf[MyDate]
			(year < o.year) ||
			(year == o.year && (month < o.month ||
								(month == o.month && day < o.day)))
		}
	}

	def main(args: Array[String]) {
		val aDate: MyDate = new MyDate(1995, 02, 14)
		val anotherDate: MyDate = new MyDate(2014, 11, 20)

		println(aDate < anotherDate)
		println(aDate <= anotherDate)
		println(aDate == anotherDate)
		println(aDate != anotherDate)
		println(aDate > anotherDate)
		println(aDate >= anotherDate)
	}
}