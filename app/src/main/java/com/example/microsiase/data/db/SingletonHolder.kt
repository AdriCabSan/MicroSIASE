package com.example.microsiase.data.db
/**
 * We can encapsulate the logic to lazily create and initialize
 *  a singleton with argument inside a SingletonHolder class.
 *  In order to make that logic thread-safe, we need to implement a
 *  synchronized algorithm and the most efficient one —
 *  the double-checked locking algorithm.*/
open class SingletonHolder<T, A>(creator: (A) -> T) {
    private var creator: ((A) -> T)? = creator
    @Volatile private var instance: T? = null

    fun getInstance(arg: A): T {
        val i = instance
        if (i != null) {
            return i
        }

        return synchronized(this) {
            val i2 = instance
            if (i2 != null) {
                i2
            } else {
                val created = creator!!(arg)
                instance = created
                creator = null
                created
            }
        }
    }
}