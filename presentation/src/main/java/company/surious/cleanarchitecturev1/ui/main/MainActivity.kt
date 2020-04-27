package company.surious.cleanarchitecturev1.ui.main

import android.os.Bundle
import company.surious.cleanarchitecturev1.R
import company.surious.cleanarchitecturev1.ui.sample.SampleFragment
import dagger.android.support.DaggerAppCompatActivity

class MainActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displaySampleFragment()
    }

    private fun displaySampleFragment() {
        val tag = SampleFragment::class.simpleName
        var sampleFragment =
            supportFragmentManager.findFragmentByTag(tag)
        if (sampleFragment == null) {
            sampleFragment = SampleFragment()
            supportFragmentManager.beginTransaction().add(R.id.main_root, sampleFragment, tag)
                .commit()
        }
    }
}
