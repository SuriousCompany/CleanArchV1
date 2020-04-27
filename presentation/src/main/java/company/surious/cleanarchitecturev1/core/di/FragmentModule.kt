package company.surious.cleanarchitecturev1.core.di

import company.surious.cleanarchitecturev1.ui.sample.SampleFragment
import company.surious.cleanarchitecturev1.ui.sample.SampleFragmentModule
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module(subcomponents = [SampleFragmentModule::class])
interface FragmentModule {
    @Binds
    @IntoMap
    @ClassKey(SampleFragment::class)
    fun bindMainActivity(builder: SampleFragmentModule.Builder): AndroidInjector.Factory<*>
}