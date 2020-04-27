package company.surious.cleanarchitecturev1.core.di

import androidx.lifecycle.ViewModel
import company.surious.cleanarchitecturev1.view_models.sample.SampleViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(SampleViewModel::class)
    fun bindStatusViewModel(viewModel: SampleViewModel): ViewModel
}