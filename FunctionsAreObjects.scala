object Timer {
	def onceASecond(callback: () => Unit) { // that is to say, callback is a function that returns a Unit (i.e. it is void)
		while (true) {
			callback()
			Thread sleep 1000 // again, this is shorthand. same as Thread.sleep(1000);
		}
	}
	def someAction() {
		println("this is a thing you do every second")
	}

	def main(args: Array[String]) {
		onceASecond(someAction)
	}
}