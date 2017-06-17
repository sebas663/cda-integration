/* Formatted on 2016/03/21 11:49 (Formatter Plus v4.8.8) */
-- CONVERT_MASTER_TYPE
ALTER TABLE convert_master_type DROP PRIMARY KEY CASCADE;
DROP TABLE convert_master_type CASCADE CONSTRAINTS;
CREATE TABLE convert_master_type
(
    convert_master_type_key                 INTEGER              NOT NULL,
    discriminator                           VARCHAR2(50 BYTE)    NOT NULL,
    type_master_system_external             VARCHAR2(50 BYTE)    NOT NULL,
    name_system_external                    VARCHAR2(50 BYTE)    NOT NULL,
    code_system_key                         INTEGER,
    object_identifier_key                   INTEGER,
  CONSTRAINT convert_master_type_pk PRIMARY KEY (convert_master_type_key) USING INDEX TABLESPACE cda_idx,
  CONSTRAINT convert_master_type_fk FOREIGN KEY (code_system_key) REFERENCES code_system(code_system_key),
  CONSTRAINT convert_master_type_fk2 FOREIGN KEY (object_identifier_key) REFERENCES object_identifier(object_identifier_key)
)
TABLESPACE cda_dat;

DROP SEQUENCE convert_master_type_seq;
CREATE SEQUENCE convert_master_type_seq
  START WITH 1
  MAXVALUE 999999999999999999999999999
  MINVALUE 1
  NOCACHE
  NOCYCLE
  NOORDER;

CREATE INDEX convert_master_type_idx1
 ON convert_master_type(discriminator) TABLESPACE cda_idx;

CREATE  INDEX convert_master_type_idx2
 ON convert_master_type(type_master_system_external) TABLESPACE cda_idx;

CREATE  INDEX convert_master_type_idx3
 ON convert_master_type(name_system_external) TABLESPACE cda_idx;