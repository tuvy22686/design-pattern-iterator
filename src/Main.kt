fun main() {
    val 美女と野獣 = Book("美女と野獣")
    val シンデレラ = Book("シンデレラ")
    val bookSelf = BookSelf()
    bookSelf.appendBook(美女と野獣)
    bookSelf.appendBook(シンデレラ)
    val iterator = bookSelf.iterator()
    while (iterator.hasNext()) {
        iterator.next().show()
    }
}