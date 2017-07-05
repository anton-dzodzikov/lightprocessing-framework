package solutions.lightprocessing.common.documents

import java.time.ZonedDateTime

interface Document {
    Long getId()
    Long getParentId()

    ZonedDateTime getCreationDate()
    ZonedDateTime getLastUpdatedDate()

    String getType()
    String getName()

    Map<String, Object> getDocumentProperties()
}