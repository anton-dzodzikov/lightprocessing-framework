create sequence doc_id_seq;

create table documents (
  id                  integer primary key not null default nextval('doc_id_seq'),
  parent_id           integer references documents(id),

  creation_date       timestamp not null,
  last_updated_date   timestamp not null,

  type                varchar not null,
  name                varchar not null,

  document_properties jsonb not null
);