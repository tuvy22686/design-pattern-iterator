class BookSelfIterator(private val bookSelf: BookSelf) : Iterator<Book> {

    private var index: Int = 0

    override fun hasNext(): Boolean {
        return index < bookSelf.getLength()
    }

    override fun next(): Book {
        val nextBook = bookSelf.getBookAt(index)
        index++
        return nextBook
    }
}