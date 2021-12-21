package org.ochamo.simplereminderapp.data.local

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import org.ochamo.simplereminderapp.data.Result
import org.ochamo.simplereminderapp.data.local.entity.SimpleReminderEntity
import org.ochamo.simplereminderapp.data.repository.SimpleReminderRepository

class SimpleReminderLocalRepository(
    private val simpleReminderDao: SimpleReminderDao,
    private val ioDispatcher: CoroutineDispatcher
) : SimpleReminderRepository {
    override suspend fun getAllReminders(): Result<ArrayList<SimpleReminderEntity>, Exception> = withContext(ioDispatcher) {
        try {
            val allReminders = simpleReminderDao.getAll()
            return@withContext Result.Success(allReminders)
        } catch (e: Exception) {
            return@withContext Result.Failure(e)
        }
    }

    override suspend fun saveReminder(simpleReminderEntity: SimpleReminderEntity):
            Result<Long, Exception> = withContext(ioDispatcher) {
                try {
                    val insertResult = simpleReminderDao.insertReminder(simpleReminderEntity)
                    return@withContext Result.Success(insertResult)
                } catch (e: Exception) {
                    return@withContext Result.Failure(e)
                }
    }

    override suspend fun deleteReminder(simpleReminderEntity: SimpleReminderEntity):
            Result<Int, Exception> = withContext(ioDispatcher) {
                try {
                    val deletionResult = simpleReminderDao.deleteReminder(simpleReminderEntity)
                    return@withContext Result.Success(deletionResult)
                } catch (e: Exception) {
                    return@withContext Result.Failure(e)
                }
    }

}