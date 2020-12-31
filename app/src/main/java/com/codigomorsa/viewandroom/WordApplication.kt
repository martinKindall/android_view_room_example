package com.codigomorsa.viewandroom

import android.app.Application
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class WordApplication: Application() {

    private val applicationScope = CoroutineScope(SupervisorJob())

    private val database by lazy {
        WordRoomDatabase.getDatabase(this, applicationScope)
    }
    val repository by lazy { WordRepository(database.wordDao()) }
}