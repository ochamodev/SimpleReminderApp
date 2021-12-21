package org.ochamo.simplereminderapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import org.ochamo.simplereminderapp.data.local.entity.SimpleReminderEntity
import org.ochamo.simplereminderapp.shared.AppTokens

@Database(
    entities = [
        SimpleReminderEntity::class
    ],
    version = AppTokens.ROOM_DATABASE_VERSION
)
abstract class SimpleReminderAppDB : RoomDatabase() {

    abstract fun simpleReminderDao(): SimpleReminderDao

}