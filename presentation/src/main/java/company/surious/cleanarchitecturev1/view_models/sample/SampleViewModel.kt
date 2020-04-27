package company.surious.cleanarchitecturev1.view_models.sample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import company.surious.cleanarchitecturev1.binding.Error
import company.surious.cleanarchitecturev1.binding.HasData
import company.surious.cleanarchitecturev1.binding.Loading
import company.surious.cleanarchitecturev1.binding.UiState
import company.surious.domain.entities.SampleEntity
import company.surious.domain.use_cases.base.GetSampleEntityUseCase
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

class SampleViewModel @Inject constructor(private val getSampleEntityUseCase: GetSampleEntityUseCase) :
    ViewModel() {

    private val subscriptions = CompositeDisposable()

    val state: MutableLiveData<UiState> = MutableLiveData<UiState>().apply {
        value = Loading
    }

    val entity: MutableLiveData<SampleEntity> = MutableLiveData()
    val error: MutableLiveData<Throwable> = MutableLiveData()

    fun update() {
        subscriptions.add(getSampleEntityUseCase.execute(null).subscribe(
            { data ->
                state.value = HasData
                entity.value = data
            },
            { error ->
                state.value = Error
                this@SampleViewModel.error.value = error
            }
        ))
    }

    override fun onCleared() {
        super.onCleared()
        subscriptions.clear()
    }
}