package company.surious.cleanarchitecturev1.core

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object AppModule {
    @Provides
    @Singleton
    @JvmStatic
    fun provideApplicationContext(app: Application) = app as Context
}