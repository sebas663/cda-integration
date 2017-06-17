/* Formatted on 2016/03/21 10:27 (Formatter Plus v4.8.8) */
-- EXTERNAL_REPORT_TYPE
ALTER TABLE external_report_type DROP PRIMARY KEY CASCADE;
DROP TABLE external_report_type CASCADE CONSTRAINTS;
CREATE TABLE external_report_type
(
    external_report_type_key         INTEGER            NOT NULL,
    external_report_name             VARCHAR2(50 BYTE)  NOT NULL,
    external_report_class_factory    VARCHAR2(256 BYTE),
  CONSTRAINT external_report_type_pk PRIMARY KEY (external_report_type_key) USING INDEX TABLESPACE cda_idx
)
TABLESPACE cda_dat;

DROP SEQUENCE external_report_type_seq;
CREATE SEQUENCE external_report_type_seq
  START WITH 1
  MAXVALUE 999999999999999999999999999
  MINVALUE 1
  NOCACHE
  NOCYCLE
  NOORDER;

-- EXTERNAL_REPORT_INFO
ALTER TABLE external_report_info DROP PRIMARY KEY CASCADE;
DROP TABLE external_report_info CASCADE CONSTRAINTS;
CREATE TABLE external_report_info
(
    external_report_info_key         INTEGER        NOT NULL,
    external_report_type_key         INTEGER        NOT NULL,
    report_id                        VARCHAR(50)    NOT NULL,
    report_date                      DATE,
    report_version                   INTEGER,
    report_original_id               VARCHAR(50),
    nhc                              VARCHAR(50),
    episode_number                   VARCHAR(50),
    creation_date                    DATE,
    episode_type                     VARCHAR(32),
  CONSTRAINT external_report_info_pk PRIMARY KEY (external_report_info_key) USING INDEX TABLESPACE cda_idx,
  CONSTRAINT external_report_type_fk FOREIGN KEY (external_report_type_key) REFERENCES external_report_type(external_report_type_key)
)
TABLESPACE cda_dat;

DROP SEQUENCE external_report_info_seq;
CREATE SEQUENCE external_report_info_seq
  START WITH 1
  MAXVALUE 999999999999999999999999999
  MINVALUE 1
  NOCACHE
  NOCYCLE
  NOORDER;

-- EXTERNAL_REPORT_DATA
ALTER TABLE external_report_data DROP PRIMARY KEY CASCADE;
DROP TABLE external_report_data CASCADE CONSTRAINTS;
CREATE TABLE external_report_data
(
    external_report_data_key         INTEGER    NOT NULL,
    external_report_info_key         INTEGER    NOT NULL,
    message_jsondata                 BLOB       NOT NULL,
    message_cdadata                  BLOB,
    creation_date                    DATE,
  CONSTRAINT external_report_data_pk PRIMARY KEY (external_report_data_key) USING INDEX TABLESPACE cda_idx,
  CONSTRAINT external_report_info_fk FOREIGN KEY (external_report_info_key) REFERENCES external_report_info(external_report_info_key)
)
TABLESPACE cda_dat;

DROP SEQUENCE external_report_data_seq;
CREATE SEQUENCE external_report_data_seq
  START WITH 1
  MAXVALUE 999999999999999999999999999
  MINVALUE 1
  NOCACHE
  NOCYCLE
  NOORDER;