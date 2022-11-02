package com.mrwhoknows.short_it.data.util

import com.mrwhoknows.short_it.data.db.entity.ShortItEntity
import com.mrwhoknows.short_it.data.model.ShortItCard


fun ShortItEntity.toModel() = ShortItCard(
    id = id,
    title = title,
    tags = tags,
    shortUrl = shortUrl,
    longUrl = longUrl,
    viewCount = viewCount,
    createdAtEpoch = createdAtEpoch
)