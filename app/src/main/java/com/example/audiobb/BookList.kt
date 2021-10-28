package com.example.audiobb

class BookList()
{

    var books : ArrayList<Book> = arrayListOf()

    fun add(book : Book)
    {
        books.add(book)
    }

    fun remove(book : Book)
    {
        books.remove(book)
    }

    fun get(index : Int) : Book
    {
        return books.get(index)
    }

    fun size() : Int
    {
        return books.size
    }

}