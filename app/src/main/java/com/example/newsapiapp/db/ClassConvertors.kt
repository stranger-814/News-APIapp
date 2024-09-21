package com.example.newsapiapp.db

import androidx.room.TypeConverter

class ClassConvertors {
    @TypeConverter
    fun fromSource(source: Source): String{
        return source.name!!
    }

    @TypeConverter
    fun toSource(name: String): Source{
        return Source(name, name)
    }
}