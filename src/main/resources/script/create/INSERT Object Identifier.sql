/* Formatted on 2016/03/21 11:38 (Formatter Plus v4.8.8) */
-- OBJECT IDENTIFIER GROUP
INSERT INTO cda.object_identifier_group
            (object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_group_seq.NEXTVAL,
             '2.16.840.1.113883.2.10.24.1.1', 'PLANTILLAS DE DOCUMENTOS'
            );

INSERT INTO cda.object_identifier_group
            (object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_group_seq.NEXTVAL,
             '2.16.840.1.113883.2.10.24.1.2', 'PLANTILLAS DE SECCIONES'
            );

INSERT INTO cda.object_identifier_group
            (object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_group_seq.NEXTVAL,
             '2.16.840.1.113883.2.10.24.2.1', 'PRESTADORES'
            );

INSERT INTO cda.object_identifier_group
            (object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_group_seq.NEXTVAL,
             '2.16.840.1.113883.2.10.24.2.2', 'FINANCIADORES'
            );

INSERT INTO cda.object_identifier_group
            (object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_group_seq.NEXTVAL,
             '2.16.840.1.113883.2.10.24.4', 'TIPOS DE DOCUMENTO DE IDENTIDAD'
            );

INSERT INTO cda.object_identifier_group
            (object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_group_seq.NEXTVAL,
             '2.16.840.1.113883.2.10.24.7', 'TIPOS DE MATRICULA MEDICA'
            );

INSERT INTO cda.object_identifier_group
            (object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_group_seq.NEXTVAL,
             '2.16.840.1.113883.2.10.24.2.1.4', 'FLENI'
            );

COMMIT ;

-- OBJECT IDENTIFIER
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 1,
             '2.16.840.1.113883.2.10.24.1.1.1 ', 'EPICRISIS'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids,
             description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 1,
             '2.16.840.1.113883.2.10.24.1.1.99',
             'GENERAL- COM?N A TODOS LOS DOC'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 1,
             '2.16.840.1.113883.2.10.24.1.1.2 ', 'PROTOCOLO QUIRURGICO'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 1,
             '2.16.840.1.113883.2.10.24.1.1.3 ', 'HISTORIA_CLINICA_INGRESO'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 1,
             '2.16.840.1.113883.2.10.24.1.1.4 ', 'EVOLUCION_INTERCONSULTA'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 1,
             '2.16.840.1.113883.2.10.24.1.1.5 ', 'HOJA_DE_INDICACIONES'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 1,
             '2.16.840.1.113883.2.10.24.1.1.6 ', 'HOJA_DE_ENFERMERIA'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 1,
             '2.16.840.1.113883.2.10.24.1.1.7 ', 'INFORME_MEDICO_PREADMISION'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 1,
             '2.16.840.1.113883.2.10.24.1.1.8 ', 'INFORME_ESTUDIO_AP'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 1,
             '2.16.840.1.113883.2.10.24.1.1.9 ', 'PROTOCOLO_DE_ANESTESIA'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 1,
             '2.16.840.1.113883.2.10.24.1.1.10', 'CONSENTIMIENTO INFORMADO'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids,
             description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 1,
             '2.16.840.1.113883.2.10.24.1.1.11',
             'INFORME_DE_ESTUDIO_LABORATORIO'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 1,
             '2.16.840.1.113883.2.10.24.1.1.12', 'PROTOCOLO_DE_PROCEDIMIENTO'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 1,
             '2.16.840.1.113883.2.10.24.1.1.13', 'CARTA_DE_COBERTURA'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 1,
             '2.16.840.1.113883.2.10.24.1.1.14', 'ORDEN MEDICA'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 2,
             '2.16.840.1.113883.2.10.24.1.2.1', 'MOTIVO DE INGRESO'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids,
             description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 2,
             '2.16.840.1.113883.2.10.24.1.2.2',
             'DIAGNOSTICO PRESUNTIVO DE INGRESO'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 2,
             '2.16.840.1.113883.2.10.24.1.2.3', 'ANTECEDENTES FAMILIARES'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 2,
             '2.16.840.1.113883.2.10.24.1.2.4', 'ANTECEDENTES PERSONALES'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids,
             description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 2,
             '2.16.840.1.113883.2.10.24.1.2.5',
             'HISTORIA DE LA ENFERMEDAD ACTUAL'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 2,
             '2.16.840.1.113883.2.10.24.1.2.6', 'EXAMEN FISICO'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 2,
             '2.16.840.1.113883.2.10.24.1.2.7', 'CURSO CLINICO'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 2,
             '2.16.840.1.113883.2.10.24.1.2.8', 'DIAGNOSTICO DE EGRESO'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 2,
             '2.16.840.1.113883.2.10.24.1.2.9', 'MEDICACION AL ALTA'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 2,
             '2.16.840.1.113883.2.10.24.1.2.10', 'INDICACIONES AL ALTA'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 2,
             '2.16.840.1.113883.2.10.24.1.2.11', 'ESTUDIOS COMPLEMENTARIOS'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 2,
             '2.16.840.1.113883.2.10.24.1.2.12', 'PLAN DE SEGUIMIENTO'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids,
             description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 2,
             '2.16.840.1.113883.2.10.24.1.2.13',
             'PROCEDIMIENTOS/INTERVENCIONES'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 2,
             '2.16.840.1.113883.2.10.24.1.2.14', 'COMPLICACIONES'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 2,
             '2.16.840.1.113883.2.10.24.1.2.15', 'DETALLE DE UBICACIONES'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 2,
             '2.16.840.1.113883.2.10.24.1.2.16', 'INFORMACION DEMOGRAFICA'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids,
             description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 3,
             '2.16.840.1.113883.2.10.24.2.1.9999',
             'ORGANIZACION PRESTADORA EJEMPLO'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 3,
             '2.16.840.1.113883.2.10.24.2.1.1', 'HOSPITAL ALEMAN'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 3,
             '2.16.840.1.113883.2.10.24.2.1.2', 'HOSPITAL ITALIANO'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids,
             description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 3,
             '2.16.840.1.113883.2.10.24.2.1.3',
             'CLINICA Y MATERNIDAD SUIZO ARGENTINA'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 3,
             '2.16.840.1.113883.2.10.24.2.1.4', 'FLENI'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 3,
             '2.16.840.1.113883.2.10.24.2.1.5', 'SANATORIO OTAMENDI'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids,
             description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 4,
             '2.16.840.1.113883.2.10.24.2.2.9999',
             'ORGANIZACION FINANCIADORA EJEMPLO'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 4,
             '2.16.840.1.113883.2.10.24.2.2.1', 'HOSPITAL ALEMAN'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 4,
             '2.16.840.1.113883.2.10.24.2.2.2', 'HOSPITAL ITALIANO'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 4,
             '2.16.840.1.113883.2.10.24.2.2.3', 'MEDICUS'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 4,
             '2.16.840.1.113883.2.10.24.2.2.4', 'OMINT'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 4,
             '2.16.840.1.113883.2.10.24.2.2.5', 'SWISS MEDICAL GROUP'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids,
             description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 5,
             '2.16.840.1.113883.2.10.24.4.1',
             'DOCUMENTO NACIONAL DE IDENTIDAD'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 5,
             '2.16.840.1.113883.2.10.24.4.2', 'CEDULA DE IDENTIDAD'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 5,
             '2.16.840.1.113883.2.10.24.4.3', 'LIBRETA CIVICA'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 5,
             '2.16.840.1.113883.2.10.24.4.4', 'LIBRETA DE ENROLAMIENTO'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 5,
             '2.16.840.1.113883.4.330.2', 'NUMERO DE PASAPORTE, ARGENTINA'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 5,
             '2.16.840.1.113883.4.330.x', 'NUMERO DE PASAPORTE, OTROS PAISES'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 6,
             '2.16.840.1.113883.2.10.24.7.1', 'MATRICULA NACIONAL'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 6,
             '2.16.840.1.113883.2.10.24.7.2', 'Buenos Aires'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 6,
             '2.16.840.1.113883.2.10.24.7.3', 'Catamarca'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 6,
             '2.16.840.1.113883.2.10.24.7.4', 'Chaco'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 6,
             '2.16.840.1.113883.2.10.24.7.5', 'Chubut'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 6,
             '2.16.840.1.113883.2.10.24.7.6', 'Cordoba'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 6,
             '2.16.840.1.113883.2.10.24.7.7', 'Corrientes'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 6,
             '2.16.840.1.113883.2.10.24.7.8', 'Entre Rios'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 6,
             '2.16.840.1.113883.2.10.24.7.9', 'Formosa'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 6,
             '2.16.840.1.113883.2.10.24.7.10', 'Jujuy'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 6,
             '2.16.840.1.113883.2.10.24.7.11', 'La Pampa'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 6,
             '2.16.840.1.113883.2.10.24.7.12', 'La Rioja'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 6,
             '2.16.840.1.113883.2.10.24.7.13', 'Mendoza'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 6,
             '2.16.840.1.113883.2.10.24.7.14', 'Misiones'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 6,
             '2.16.840.1.113883.2.10.24.7.15', 'Neuguen'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 6,
             '2.16.840.1.113883.2.10.24.7.16', 'Rio Negro'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 6,
             '2.16.840.1.113883.2.10.24.7.17', 'Salta'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 6,
             '2.16.840.1.113883.2.10.24.7.18', 'San Juan'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 6,
             '2.16.840.1.113883.2.10.24.7.19', 'San Luis'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 6,
             '2.16.840.1.113883.2.10.24.7.20', 'Santa Cruz'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 6,
             '2.16.840.1.113883.2.10.24.7.21', 'Santa Fe'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 6,
             '2.16.840.1.113883.2.10.24.7.21', 'Santiago del Estero'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids,
             description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 6,
             '2.16.840.1.113883.2.10.24.7.21',
             'Tierra del Fuego, Antartida e Isla del Atlantico Sur'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 6,
             '2.16.840.1.113883.2.10.24.7.21', 'Tucumun'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 7,
             '2.16.840.1.113883.2.10.24.2.1.4.1', 'DOCUMENTOS GENERADOS'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 7,
             '2.16.840.1.113883.2.10.24.2.1.4.2', 'SET DE DOCUMENTOS'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids,
             description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 7,
             '2.16.840.1.113883.2.10.24.2.1.4.3',
             'NUMERO DE HISTORIA CLINICA INTERNA'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids,
             description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 7,
             '2.16.840.1.113883.2.10.24.2.1.4.4',
             'IDENTIFICADOR DE SERVICIO O DEPARTAMENTO'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 7,
             '2.16.840.1.113883.2.10.24.2.1.4.5', 'IDENTIFICADOR DE SECCION'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 7,
             '2.16.840.1.113883.2.10.24.2.1.4.6', 'IDENTIFICADOR DE PLANES'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids,
             description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 7,
             '2.16.840.1.113883.2.10.24.2.1.4.7',
             'NUMEROS DE CARNET DE AFILIADOS'
            );
INSERT INTO cda.object_identifier
            (object_identifier_key, object_identifier_group_key,
             oids, description
            )
     VALUES (cda.object_identifier_seq.NEXTVAL, 7,
             '2.16.840.1.113883.2.10.24.2.1.4.8', 'IDENTIFICADOR DE EPISODIOS'
            );
COMMIT ;