object TimerAnon {
	def onceASecond(callback: () => Unit) {
		while (true) {
			callback()
			Thread sleep 1000
		}
	}
	def main(args: Array[String]) {
		onceASecond(() => println("this is a thing you do every second")) // This is a anonymous void function taking no arguments
	}
}