package company.surious.data

import company.surious.domain.repositories.SampleRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object RepositoriesModule {
    @Provides
    @Singleton
    @JvmStatic
    fun provideSampleRepository(): SampleRepository = SampleRepositoryImpl()
}