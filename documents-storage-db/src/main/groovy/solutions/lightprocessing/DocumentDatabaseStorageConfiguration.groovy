package solutions.lightprocessing

import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@Configuration
@EnableJpaRepositories('solutions.lightprocessing.persistence')
@EntityScan('solutions.lightprocessing.domain')
class DocumentDatabaseStorageConfiguration {
}
