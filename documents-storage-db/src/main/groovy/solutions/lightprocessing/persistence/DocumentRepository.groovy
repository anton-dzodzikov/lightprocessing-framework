package solutions.lightprocessing.persistence

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import solutions.lightprocessing.domain.DatabaseDocument

// TODO: Is it better to use concrete document class or interface?
@Repository
interface DocumentRepository extends JpaRepository<DatabaseDocument, Long> {

}