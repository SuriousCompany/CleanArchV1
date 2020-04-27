package company.surious.cleanarchitecturev1.ui.main

import company.surious.cleanarchitecturev1.core.di.ViewModelModule
import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent(modules = [ViewModelModule::class])
interface MainActivityComponent : AndroidInjector<MainActivity> {
    @Subcomponent.Factory
    interface Builder : AndroidInjector.Factory<MainActivity>
}