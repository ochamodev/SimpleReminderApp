package org.ochamo.simplereminderapp.di.module

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import org.ochamo.simplereminderapp.data.local.SimpleReminderAppDB
import org.ochamo.simplereminderapp.shared.AppTokens
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object SimpleReminderAppModule {

    @Singleton
    @Provides
    fun provideSimpleReminderDB(@ApplicationContext context: Context): SimpleReminderAppDB {
        return Room.databaseBuilder(
            context.applicationContext,
            SimpleReminderAppDB::class.java,
            AppTokens.ROOM_DATABASE_NAME
        ).build()
    }

    @Singleton
    @Provides
    fun provideIoDispatcher(): CoroutineDispatcher {
        return Dispatchers.IO
    }

}