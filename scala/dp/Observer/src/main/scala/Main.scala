/**
  * Created by inouesaishin on 2017/05/07.
  */
object Main {
  def main(args: Array[String]): Unit = {





    val concreteSubject = new Subject {
      var i = 0
      def addObserver(o: Observer) = observerCollection :+= o
      def notifyObservers =
        observerCollection.foreach({ i = i + 1; _.notify(i)})
    }

    val observerA = new Observer {
      def notify(value: Int) = println("ObserverA "+ value)
    }
    val observerB = new Observer {
      def notify(value: Int) = println("ObserverB "+ value)
    }

    concreteSubject.addObserver(observerA)
    concreteSubject.addObserver(observerB)

    concreteSubject.notifyObservers
    concreteSubject.notifyObservers

  }
}
