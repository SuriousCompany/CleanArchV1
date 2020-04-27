package company.surious.cleanarchitecturev1.core.di

import android.app.Application
import company.surious.cleanarchitecturev1.core.App
import company.surious.cleanarchitecturev1.core.AppModule
import company.surious.data.RepositoriesModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AndroidInjectionModule::class, AppModule::class, RepositoriesModule::class,
        ActivityModule::class, FragmentModule::class]
)
interface AppComponent {
    fun inject(app: App)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}