package company.surious.cleanarchitecturev1.ui.sample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import company.surious.cleanarchitecturev1.R
import company.surious.cleanarchitecturev1.core.di.ViewModelFactory
import company.surious.cleanarchitecturev1.databinding.FragmentSampleBinding
import company.surious.cleanarchitecturev1.view_models.sample.SampleViewModel
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class SampleFragment : DaggerFragment() {
    @Inject
    lateinit var viewModelFactory: ViewModelFactory
    private lateinit var sampleViewModel: SampleViewModel
    private lateinit var binding: FragmentSampleBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_sample,
            container,
            false
        )
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sampleViewModel = ViewModelProvider(this, viewModelFactory)[SampleViewModel::class.java]
        binding.sampleViewModel = sampleViewModel
        binding.eventHandler = SampleEventHandler()
    }

    inner class SampleEventHandler {
        fun onUpdateButtonClicked() {
            sampleViewModel.update()
        }
    }
}
