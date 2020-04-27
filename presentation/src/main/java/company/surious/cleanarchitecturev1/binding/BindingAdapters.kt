package company.surious.cleanarchitecturev1.binding

import android.view.View
import androidx.databinding.BindingAdapter
import androidx.databinding.BindingConversion

@BindingAdapter("dataState")
fun setDataState(view: View, uiState: UiState) {
    view.visibility = when (uiState) {
        HasData -> View.VISIBLE
        else -> View.INVISIBLE
    }
}

@BindingAdapter("loadingState")
fun setLoadingState(view: View, uiState: UiState) {
    view.visibility = when (uiState) {
        Loading -> View.VISIBLE
        else -> View.INVISIBLE
    }
}

@BindingAdapter("errorState")
fun setErrorState(view: View, uiState: UiState) {
    view.visibility = when (uiState) {
        Error -> View.VISIBLE
        else -> View.INVISIBLE
    }
}

@BindingAdapter("dataOrErrorState")
fun setDataOrErrorState(view: View, uiState: UiState) {
    view.visibility = when (uiState) {
        HasData, Error -> View.VISIBLE
        else -> View.INVISIBLE
    }
}

@BindingConversion
fun convertBooleanToVisibility(visible: Boolean) =
    if (visible) {
        View.VISIBLE
    } else {
        View.INVISIBLE
    }