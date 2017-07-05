package solutions.lightprocessing.domain

import solutions.lightprocessing.common.documents.Document

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.SequenceGenerator
import javax.persistence.Table
import java.time.ZonedDateTime

@Entity
@Table(name = 'documents')
class DatabaseDocument implements Document {
    @Id
    @GeneratedValue(generator = 'doc_id_gen')
    @SequenceGenerator(name = 'doc_id_gen', sequenceName = 'doc_id_seq')
    Long id
    Long parentId

    ZonedDateTime creationDate
    ZonedDateTime lastUpdatedDate

    String type
    String name

    // TODO: Map it to JSONB Postgres type
    Map<String, Object> documentProperties
}
