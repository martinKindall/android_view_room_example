package com.codigomorsa.viewandroom

import android.app.Application

class WordApplication: Application() {

    private val database by lazy { WordRoomDatabase.getDatabase(this) }
    val repository by lazy { WordRepository(database.wordDao()) }
}