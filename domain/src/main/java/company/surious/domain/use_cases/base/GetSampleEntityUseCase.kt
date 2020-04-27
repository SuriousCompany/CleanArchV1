package company.surious.domain.use_cases.base

import company.surious.domain.entities.SampleEntity
import company.surious.domain.repositories.SampleRepository
import io.reactivex.Single
import javax.inject.Inject

class GetSampleEntityUseCase @Inject constructor(private val sampleRepository: SampleRepository) :
    SingleUseCase<Void?, SampleEntity>() {

    override fun createSingle(params: Void?): Single<SampleEntity> =
        sampleRepository.getSampleEntity()
}