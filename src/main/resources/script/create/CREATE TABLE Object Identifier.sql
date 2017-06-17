/* Formatted on 2016/03/21 11:29 (Formatter Plus v4.8.8) */
-- OBJECT_IDENTIFIER_GROUP
ALTER TABLE object_identifier_group DROP PRIMARY KEY CASCADE;
DROP TABLE object_identifier_group CASCADE CONSTRAINTS;
CREATE TABLE object_identifier_group
(
    object_identifier_group_key         INTEGER    NOT NULL,
    oids                                VARCHAR2(50 BYTE),
    description                         VARCHAR2(256 BYTE),
  CONSTRAINT object_identifier_group_pk PRIMARY KEY (object_identifier_group_key) USING INDEX TABLESPACE cda_idx
)
TABLESPACE cda_dat;

DROP SEQUENCE object_identifier_group_seq;
CREATE SEQUENCE object_identifier_group_seq
  START WITH 1
  MAXVALUE 999999999999999999999999999
  MINVALUE 1
  NOCACHE
  NOCYCLE
  NOORDER;

-- OBJECT_IDENTIFIER
ALTER TABLE object_identifier DROP PRIMARY KEY CASCADE;
DROP TABLE object_identifier CASCADE CONSTRAINTS;
CREATE TABLE object_identifier
(
    object_identifier_key                 INTEGER    NOT NULL,
    object_identifier_group_key           INTEGER    NOT NULL,
    oids                                  VARCHAR2(50 BYTE),
    description                           VARCHAR2(256 BYTE),
  CONSTRAINT object_identifier_pk PRIMARY KEY (object_identifier_key) USING INDEX TABLESPACE cda_idx,
  CONSTRAINT object_identifier_fk FOREIGN KEY (object_identifier_group_key) REFERENCES object_identifier_group(object_identifier_group_key)
)
TABLESPACE cda_dat;

DROP SEQUENCE object_identifier_seq;
CREATE SEQUENCE object_identifier_seq
    START WITH 1
  MAXVALUE 999999999999999999999999999
  MINVALUE 1
  NOCACHE
  NOCYCLE
  NOORDER;