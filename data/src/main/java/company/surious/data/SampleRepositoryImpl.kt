package company.surious.data

import company.surious.domain.entities.SampleEntity
import company.surious.domain.repositories.SampleRepository
import io.reactivex.Single
import java.util.concurrent.TimeUnit
import kotlin.random.Random

class SampleRepositoryImpl : SampleRepository {
    private val random = Random(System.currentTimeMillis())
    override fun getSampleEntity(): Single<SampleEntity> =
        Single.create<SampleEntity> { emitter ->
            with(emitter) {
                if (!isDisposed) {
                    if (random.nextBoolean()) {
                        onSuccess(SampleEntity("Sample name"))
                    } else {
                        onError(IllegalStateException("Sample exception"))
                    }
                }
            }
        }.delay(5, TimeUnit.SECONDS, true)
}