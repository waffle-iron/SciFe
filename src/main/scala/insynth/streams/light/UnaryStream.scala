package insynth.streams.light

/**
 * A Enumerable that maps values of a given Enumerable with the given function 
 * NOTE: modifyVal should be a monotonic function, otherwise your computer will blow up!
 * @param <T> @see Enumerable
 */
class UnaryStream[T, U](val streamable: Enumerable[T], modify: T=>U)
	extends Enumerable[U] {
  
  override def size = streamable.size
  
  override def apply(ind: Int) =
    modify( streamable(ind) )
  
}