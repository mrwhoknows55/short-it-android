package com.mrwhoknows.short_it.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.mrwhoknows.short_it.data.db.entity.ShortItEntity

@Dao
interface ShortItDao {
    @Query("SELECT * FROM shortitentity")
    suspend fun getAll(): List<ShortItEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(vararg shortItEntities: ShortItEntity)
}