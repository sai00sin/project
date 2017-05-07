/**
  * Created by inouesaishin on 2017/05/08.
  */
trait Subject {
  var observerCollection = List[Observer]()
  def addObserver(o: Observer)
  def notifyObservers
}
