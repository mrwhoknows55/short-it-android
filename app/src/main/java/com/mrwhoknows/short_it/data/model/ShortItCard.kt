package com.mrwhoknows.short_it.data.model

data class ShortItCard(
    val id: Long,
    val title: String? = null,
    val shortUrl: String,
    val longUrl: String,
    val tags: Set<String>,
    val viewCount: Int = 0,
    val createdAtEpoch: Long
)