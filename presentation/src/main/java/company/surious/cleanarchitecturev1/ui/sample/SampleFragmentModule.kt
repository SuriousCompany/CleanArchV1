package company.surious.cleanarchitecturev1.ui.sample

import company.surious.cleanarchitecturev1.core.di.ViewModelModule
import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent(modules = [ViewModelModule::class])
interface SampleFragmentModule : AndroidInjector<SampleFragment> {
    @Subcomponent.Factory
    interface Builder : AndroidInjector.Factory<SampleFragment>
}