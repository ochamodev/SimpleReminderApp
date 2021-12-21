package org.ochamo.simplereminderapp.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class SimpleReminderEntity(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "notes") val notes: String,
    @ColumnInfo(name = "url") val url: String,
    @ColumnInfo(name = "reminderDateTime") val date: Date,
)