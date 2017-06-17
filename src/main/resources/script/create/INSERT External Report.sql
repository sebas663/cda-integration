/* Formatted on 2016/03/23 10:38 (Formatter Plus v4.8.8) */
INSERT INTO cda.external_report_type
            (external_report_type_key, external_report_name,
             external_report_class_factory
            )
     VALUES (cda.external_report_type_seq.NEXTVAL, 'EPICRISIS',
             'org.fleni.cda.xml.mapper.factory.ReportDichargeFactory'
            );

INSERT INTO cda.external_report_type
            (external_report_type_key, external_report_name,
             external_report_class_factory
            )
     VALUES (cda.external_report_type_seq.NEXTVAL, 'PROTOCOLO QUIRURGICO',
             NULL
            );

INSERT INTO cda.external_report_type
            (external_report_type_key,
             external_report_name, external_report_class_factory
            )
     VALUES (cda.external_report_type_seq.NEXTVAL,
             'HISTORIA CLINICA INGRESO', NULL
            );

INSERT INTO cda.external_report_type
            (external_report_type_key, external_report_name,
             external_report_class_factory
            )
     VALUES (cda.external_report_type_seq.NEXTVAL, 'EVOLUCION INTERCONSULTA',
             NULL
            );

INSERT INTO cda.external_report_type
            (external_report_type_key, external_report_name,
             external_report_class_factory
            )
     VALUES (cda.external_report_type_seq.NEXTVAL, 'HOJA DE INDICACIONES',
             NULL
            );

INSERT INTO cda.external_report_type
            (external_report_type_key, external_report_name,
             external_report_class_factory
            )
     VALUES (cda.external_report_type_seq.NEXTVAL, 'HOJA DE ENFERMERIA',
             NULL
            );

INSERT INTO cda.external_report_type
            (external_report_type_key,
             external_report_name, external_report_class_factory
            )
     VALUES (cda.external_report_type_seq.NEXTVAL,
             'INFORME MEDICO DE PREADMISION', NULL
            );

INSERT INTO cda.external_report_type
            (external_report_type_key, external_report_name,
             external_report_class_factory
            )
     VALUES (cda.external_report_type_seq.NEXTVAL, 'INFORME DE ESTUDIO AP',
             NULL
            );

INSERT INTO cda.external_report_type
            (external_report_type_key, external_report_name,
             external_report_class_factory
            )
     VALUES (cda.external_report_type_seq.NEXTVAL, 'PROTOCOLO DE ANESTESIA',
             NULL
            );

INSERT INTO cda.external_report_type
            (external_report_type_key,
             external_report_name, external_report_class_factory
            )
     VALUES (cda.external_report_type_seq.NEXTVAL,
             'CONSENTIMIENTO INFORMADO', NULL
            );

INSERT INTO cda.external_report_type
            (external_report_type_key,
             external_report_name, external_report_class_factory
            )
     VALUES (cda.external_report_type_seq.NEXTVAL,
             'INFORME DE ESTUDIO LABORATORIO', NULL
            );

INSERT INTO cda.external_report_type
            (external_report_type_key,
             external_report_name, external_report_class_factory
            )
     VALUES (cda.external_report_type_seq.NEXTVAL,
             'PROTOCOLO DE PROCEDIMIENTO', NULL
            );

INSERT INTO cda.external_report_type
            (external_report_type_key,
             external_report_name, external_report_class_factory
            )
     VALUES (cda.external_report_type_seq.NEXTVAL,
             'INFORME DE ESTUDIO IMAGENES', NULL
            );

INSERT INTO cda.external_report_type
            (external_report_type_key,
             external_report_name, external_report_class_factory
            )
     VALUES (cda.external_report_type_seq.NEXTVAL,
             'INFORME DE ATENCION PREHOSPITALARIA', NULL
            );


COMMIT ;