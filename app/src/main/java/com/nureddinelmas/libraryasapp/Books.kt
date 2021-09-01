package com.nureddinelmas.libraryasapp

import java.io.Serializable

class Books(val id: Int,
            val name : String,
            val author: String,
            val year :Int): Serializable {
}