/* Formatted on 2016/03/21 10:36 (Formatter Plus v4.8.8) */
-- CODE_SYSTEM_GROUP
ALTER TABLE code_system_group DROP PRIMARY KEY CASCADE;
DROP TABLE code_system_group CASCADE CONSTRAINTS;
CREATE TABLE code_system_group
(
    code_system_group_key           INTEGER    NOT NULL,
    code_system                     VARCHAR2(50 BYTE),
    description                     VARCHAR2(256 BYTE),
  CONSTRAINT code_system_group_pk PRIMARY KEY (code_system_group_key) USING INDEX TABLESPACE cda_idx
)
TABLESPACE cda_dat;

DROP SEQUENCE code_system_group_seq;
CREATE SEQUENCE code_system_group_seq
  START WITH 1
  MAXVALUE 999999999999999999999999999
  MINVALUE 1
  NOCACHE
  NOCYCLE
  NOORDER;

-- CODE_SYSTEM
ALTER TABLE code_system DROP PRIMARY KEY CASCADE;
DROP TABLE code_system CASCADE CONSTRAINTS;
CREATE TABLE code_system
(
    code_system_key                 INTEGER    NOT NULL,
    code_system_group_key           INTEGER    NOT NULL,
    code                            VARCHAR2(50 BYTE),
    display_name                    VARCHAR2(256 BYTE),
    code_system                     VARCHAR2(50 BYTE),
  CONSTRAINT code_system_pk PRIMARY KEY (code_system_key) USING INDEX TABLESPACE cda_idx,
  CONSTRAINT code_system_fk FOREIGN KEY (code_system_group_key) REFERENCES code_system_group(code_system_group_key)
)
TABLESPACE cda_dat;

DROP SEQUENCE code_system_seq;
CREATE SEQUENCE code_system_seq
  START WITH 1
  MAXVALUE 999999999999999999999999999
  MINVALUE 1
  NOCACHE
  NOCYCLE
  NOORDER;