package com.mrwhoknows.short_it.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.mrwhoknows.short_it.data.db.entity.ShortItEntity

@Database(entities = [ShortItEntity::class], version = 1, exportSchema = false)
@TypeConverters(RoomTypeConverters::class)
abstract class ShortItRoomDb : RoomDatabase() {
    abstract fun shortItDao(): ShortItDao
}