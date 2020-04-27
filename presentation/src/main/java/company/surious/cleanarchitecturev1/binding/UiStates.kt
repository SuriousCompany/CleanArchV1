package company.surious.cleanarchitecturev1.binding

sealed class UiState

object Loading : UiState()
object HasData : UiState()
object Empty : UiState()
object Error : UiState()