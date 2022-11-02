package com.mrwhoknows.short_it.data.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ShortItEntity(
    @PrimaryKey(autoGenerate = true) val id: Long,
    @ColumnInfo val title: String? = null,
    @ColumnInfo val shortUrl: String,
    @ColumnInfo val longUrl: String,
    @ColumnInfo val tags: Set<String> = emptySet(),
    @ColumnInfo val viewCount: Int = 0,
    @ColumnInfo val createdAtEpoch: Long = System.currentTimeMillis()
)