package company.surious.cleanarchitecturev1.core.di

import company.surious.cleanarchitecturev1.ui.main.MainActivity
import company.surious.cleanarchitecturev1.ui.main.MainActivityComponent
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module(subcomponents = [MainActivityComponent::class])
interface ActivityModule {
    @Binds
    @IntoMap
    @ClassKey(MainActivity::class)
    fun bindMainActivity(builder: MainActivityComponent.Builder): AndroidInjector.Factory<*>

}