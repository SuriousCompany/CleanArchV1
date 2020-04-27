package company.surious.domain.repositories

import company.surious.domain.entities.SampleEntity
import io.reactivex.Single

interface SampleRepository {
    fun getSampleEntity(): Single<SampleEntity>
}