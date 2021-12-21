package org.ochamo.simplereminderapp.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import org.ochamo.simplereminderapp.data.local.entity.SimpleReminderEntity

@Dao
interface SimpleReminderDao {

    @Query("SELECT * FROM SimpleReminderEntity")
    suspend fun getAll(): ArrayList<SimpleReminderEntity>

    @Query("SELECT * FROM SimpleReminderEntity WHERE id = :reminderId")
    suspend fun getReminder(reminderId: Int): SimpleReminderEntity

    @Insert
    suspend fun insertReminder(reminder: SimpleReminderEntity): Long

    @Delete
    suspend fun deleteReminder(reminder: SimpleReminderEntity): Int

}