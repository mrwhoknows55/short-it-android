package com.mrwhoknows.short_it.data.db

import androidx.room.TypeConverter

class RoomTypeConverters {
    companion object {
        @TypeConverter
        @JvmStatic
        fun fromCommaSeperatedString(value: String): Set<String> = value.split(",").toSet()

        @TypeConverter
        @JvmStatic
        fun toCommaSeperatedString(values: Set<String>): String = values.joinToString(",")
    }
}