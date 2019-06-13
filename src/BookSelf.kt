class BookSelf : Aggregate {

    private var bookList = listOf<Book>()
    private var last: Int = 0

    fun getBookAt(index: Int): Book {
        return bookList[index]
    }

    fun appendBook(book: Book) {
        val mutableList = this.bookList.toMutableList()
        mutableList.add(book)
        bookList = mutableList.toList()
        last++
    }

    fun getLength(): Int {
        return last
    }

    override fun iterator(): Iterator<Book> {
        return BookSelfIterator(this)
    }
}