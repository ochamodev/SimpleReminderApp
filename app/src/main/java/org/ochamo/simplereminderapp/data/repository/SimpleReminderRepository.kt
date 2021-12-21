package org.ochamo.simplereminderapp.data.repository

import org.ochamo.simplereminderapp.data.Result
import org.ochamo.simplereminderapp.data.local.entity.SimpleReminderEntity

interface SimpleReminderRepository {

    suspend fun getAllReminders(): Result<ArrayList<SimpleReminderEntity>, Exception>

    suspend fun saveReminder(simpleReminderEntity: SimpleReminderEntity): Result<Long, Exception>

    suspend fun deleteReminder(simpleReminderEntity: SimpleReminderEntity): Result<Int, Exception>

}