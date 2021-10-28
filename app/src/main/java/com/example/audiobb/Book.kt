package com.example.audiobb

import java.io.Serializable

data class Book (val resourceId: Int, val title: String, val author: String) : Serializable{

}