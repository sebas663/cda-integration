/* Formatted on 2016/03/21 11:28 (Formatter Plus v4.8.8) */
--CODE SYSTEM GROUP 
INSERT INTO cda.code_system_group
            (code_system_group_key,
             code_system, description
            )
     VALUES (cda.code_system_group_seq.NEXTVAL,
             '2.16.840.1.113883.2.10.24.3', 'TIPOS DE DOCUMENTO MAIS'
            );

INSERT INTO cda.code_system_group
            (code_system_group_key,
             code_system, description
            )
     VALUES (cda.code_system_group_seq.NEXTVAL,
             '2.16.840.1.113883.2.10.24.5', 'ESPECIALIDADES'
            );

INSERT INTO cda.code_system_group
            (code_system_group_key,
             code_system, description
            )
     VALUES (cda.code_system_group_seq.NEXTVAL,
             '2.16.840.1.113883.2.10.24.6', 'SUB-ESPECIALIDAD'
            );

INSERT INTO cda.code_system_group
            (code_system_group_key,
             code_system, description
            )
     VALUES (cda.code_system_group_seq.NEXTVAL,
             '2.16.840.1.113883.2.10.24.8', 'AMBITO DE EPISODIO'
            );

INSERT INTO cda.code_system_group
            (code_system_group_key,
             code_system, description
            )
     VALUES (cda.code_system_group_seq.NEXTVAL,
             '2.16.840.1.113883.2.10.24.9', 'TIPO DE EPISODIO'
            );

INSERT INTO cda.code_system_group
            (code_system_group_key,
             code_system, description
            )
     VALUES (cda.code_system_group_seq.NEXTVAL,
             '2.16.840.1.113883.2.10.24.10', 'TIPOS DE ESTUDIO AP'
            );

INSERT INTO cda.code_system_group
            (code_system_group_key,
             code_system, description
            )
     VALUES (cda.code_system_group_seq.NEXTVAL,
             '2.16.840.1.113883.2.10.24.11', 'TIPOS DE ESTUDIO LAB'
            );

INSERT INTO cda.code_system_group
            (code_system_group_key,
             code_system, description
            )
     VALUES (cda.code_system_group_seq.NEXTVAL,
             '2.16.840.1.113883.2.10.24.12', 'TIPOS DE ESTUDIO DPI'
            );

INSERT INTO cda.code_system_group
            (code_system_group_key, code_system,
             description
            )
     VALUES (cda.code_system_group_seq.NEXTVAL, '2.16.840.1.113883.5.1',
             'GENERO DE PACIENTE'
            );

INSERT INTO cda.code_system_group
            (code_system_group_key, code_system,
             description
            )
     VALUES (cda.code_system_group_seq.NEXTVAL, '2.16.840.1.113883.5.25',
             'NIVEL DE CONFIDENCIALIDAD'
            );

INSERT INTO cda.code_system_group
            (code_system_group_key,
             code_system, description
            )
     VALUES (cda.code_system_group_seq.NEXTVAL,
             '2.16.840.1.113883.11.20.9.32', 'TIPO DE REPORTE RADIOLOGICO'
            );

COMMIT ;

--CODE SYSTEM
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 1, '18842-5', 'EPICRISIS',
             '2.16.840.1.113883.6.1'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name, code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 1, '34874-8',
             'PROTOCOLO QUIRURGICO', '2.16.840.1.113883.6.1'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name, code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 1, '67582-4',
             'HISTORIA_CLINICA_INGRESO', '2.16.840.1.113883.6.1'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name, code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 1, '34112-3',
             'EVOLUCION_INTERCONSULTA', '2.16.840.1.113883.6.1'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name, code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 1, '56447-6',
             'HOJA_DE_INDICACIONES', '2.16.840.1.113883.6.1'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 1, '34746-8', 'HOJA_DE_ENFERMERIA',
             '2.16.840.1.113883.6.1'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name, code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 1, '57830-2',
             'INFORME_MEDICO_PREADMISION', '2.16.840.1.113883.6.1'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 1, '11526-1', 'INFORME_ESTUDIO_AP',
             '2.16.840.1.113883.6.1'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name, code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 1, '34750-0',
             'PROTOCOLO_DE_ANESTESIA', '2.16.840.1.113883.6.1'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name, code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 1, '59284-0',
             'CONSENTIMIENTO INFORMADO', '2.16.840.1.113883.6.1'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name, code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 1, '11502-2',
             'INFORME_DE_ESTUDIO_LABORATORIO', '2.16.840.1.113883.6.1'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name, code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 1, '28570-0',
             'PROTOCOLO_DE_PROCEDIMIENTO', '2.16.840.1.113883.6.1'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name, code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 1, '18748-4',
             'INFORME DE DIAGNOSTICO POR IMAGENES', '2.16.840.1.113883.6.1'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name, code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 1, '52019-7',
             'INFORME DE ATENCION PREHOSPITALARIA', '2.16.840.1.113883.6.1'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 9, 'F', 'FEMENINO',
             '2.16.840.1.113883.5.1'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 9, 'M', 'MASCULINO',
             '2.16.840.1.113883.5.1'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 9, 'N', 'NO ESPECIFICADO',
             '2.16.840.1.113883.5.1'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '3', 'ALERGIA E INMUNOLOGIA',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name, code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '69',
             'ALERGIA E INMUNOLOGIA PEDIATRICA', '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '53', 'ANATOMIA PATOLOGICA',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '54', 'ANESTESIOLOGIA',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name, code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '5',
             'ANGIOLOGIA GENERAL Y HEMODINAMIA', '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '4', 'CARDIOLOGIA',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '39', 'CARDIOLOGO INFANTIL',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '23', 'CIRUGIA CARDIOVASCULAR',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '70',
             'CIRUGIA CARDIOVASCULAR PEDIATRICA',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name, code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '24',
             'CIRUGIA DE CABEZA Y CUELLO', '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '25',
             'CIRUGIA DE TORAX (CIRUGIA TORACICA)',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '22', 'CIRUGIA GENERAL',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '26',
             'CIRUGIA INFANTIL (CIRUGIA PEDIATRICA)',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name, code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '27',
             'CIRUGIA PLASTICA Y REPARADORA', '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name, code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '28',
             'CIRUGIA VASCULAR PERIFERICA', '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '1', 'CLINICA MEDICA',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '29', 'COLOPROCTOLOGIA',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '6', 'DERMATOLOGIA',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '63', 'DERMATOLOGIA PEDIATRICA',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name, code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '55',
             'DIAGNOSTICO POR IMAGENES', '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name, code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '65',
             'ELECTRO FISIOLOGIA CARDIACA', '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '64', 'EMERGENTOLOGIA',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '7', 'ENDOCRINOLOGIA',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '40', 'ENDOCRINOLOGO INFANTIL',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '8', 'FARMACOLOGIA CLINICA',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '9',
             'FISIATRIA (MEDICINA FISICA Y REHABILITACION)',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '10', 'GASTROENTEROLOGIA',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name, code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '41',
             'GASTROENTEROLOGO INFANTIL', '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '11', 'GENETICA MEDICA',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '12', 'GERIATRIA',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '30', 'GINECOLOGIA',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '13', 'HEMATOLOGIA',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '42', 'HEMATOLOGO INFANTIL',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name, code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '56',
             'HEMOTERAPIA E INMUNOHEMATOLOGIA', '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '67', 'HEPATOLOGIA',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '68', 'HEPATOLOGIA PEDIATRICA',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '14', 'INFECTOLOGIA',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '43', 'INFECTOLOGO INFANTIL',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '57', 'MEDICINA DEL DEPORTE',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '58', 'MEDICINA DEL TRABAJO',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '2',
             'MEDICINA GENERAL y/o MEDICINA DE FAMILIA',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '59', 'MEDICINA LEGAL',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '60', 'MEDICINA NUCLEAR',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '15', 'NEFROLOGIA',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '44', 'NEFROLOGO INFANTIL',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '45', 'NEONATOLOGIA',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '16', 'NEUMONOLOGIA',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '46', 'NEUMONOLOGO INFANTIL',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '31', 'NEUROCIRUGIA',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '17', 'NEUROLOGIA',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '47', 'NEUROLOGO INFANTIL',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '18', 'NUTRICION',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '32', 'OBSTETRICIA',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '33', 'OFTALMOLOGIA',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '19', 'ONCOLOGIA',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '48', 'ONCOLOGO INFANTIL',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name, code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '34',
             'ORTOPEDIA Y TRAUMATOLOGIA', '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '66',
             'ORTOPEDIA Y TRAUMATOLOGIA INFANTIL',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '35', 'OTORRINOLARINGOLOGIA',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '38', 'PEDIATRIA',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '51', 'PSIQUIATRIA',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name, code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '52',
             'PSIQUIATRIA INFANTO JUVENIL', '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name, code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '61',
             'RADIOTERAPIA O TERAPIA RADIANTE', '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '20', 'REUMATOLOGIA',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '49', 'REUMATOLOGO INFANTIL',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '21', 'TERAPIA INTENSIVA',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name, code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '50',
             'TERAPISTA INTENSIVO INFANTIL', '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '36', 'TOCOGINECOLOGIA',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '62', 'TOXICOLOGIA',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 2, '37', 'UROLOGIA',
             '2.16.840.1.113883.2.10.24.5'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 3, '37.1', 'UROLOGIA PEDIATRICA',
             '2.16.840.1.113883.2.10.24.6'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 4, 'I', 'INTERNACION',
             '2.16.840.1.113883.2.10.24.7'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name, code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 4, 'DO',
             'INTERNACION DOMICILIARIA', '2.16.840.1.113883.2.10.24.7'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 4, 'E', 'EMERGENCIA',
             '2.16.840.1.113883.2.10.24.7'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 4, 'LP', 'LARGO PLAZO',
             '2.16.840.1.113883.2.10.24.7'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 4, 'A', 'AMBULATORIO',
             '2.16.840.1.113883.2.10.24.7'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 5, 'N', 'NURSERY',
             '2.16.840.1.113883.2.10.24.9'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 5, 'C', 'CLINICA',
             '2.16.840.1.113883.2.10.24.9'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 5, 'E', 'EMERGENCIA',
             '2.16.840.1.113883.2.10.24.9'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 5, 'G', 'CIRUGIA DE DIA',
             '2.16.840.1.113883.2.10.24.9'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 5, 'H', 'OBSERVACION',
             '2.16.840.1.113883.2.10.24.9'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 5, 'I', 'CUIDADO INTENSIVO',
             '2.16.840.1.113883.2.10.24.9'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 5, 'N', 'CUIDADO NEONATAL',
             '2.16.840.1.113883.2.10.24.9'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 5, 'C', 'CONSULTORIO',
             '2.16.840.1.113883.2.10.24.9'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code, display_name,
             code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 10, 'N', 'NORMAL',
             '2.16.840.1.113883.5.25'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name, code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 10, 'R',
             'RESTRINGIDA (SOLO PRESTADORES)', '2.16.840.1.113883.5.25'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name, code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 10, 'V',
             'MUY RESTRINGIDA (SOLO AUTORIZADOS)', '2.16.840.1.113883.5.25'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name, code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 11, '18748-4',
             'Reporte de Diagnostico por Imagenes', '2.16.840.1.113883.6.1'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name, code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 11, '18747-6',
             'Reporte de Tomografia Computada', '2.16.840.1.113883.6.1'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name, code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 11, '18755-9',
             'Reporte de Resonancia Magnetica', '2.16.840.1.113883.6.1'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name, code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 11, '18760-9',
             'Reporte de Ecografia', '2.16.840.1.113883.6.1'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name, code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 11, '18757-5',
             'Reporte de Medicina Nuclear', '2.16.840.1.113883.6.1'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name, code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 11, '18758-3',
             'Reporte de Escaneado PET', '2.16.840.1.113883.6.1'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name, code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 11, '18745-0',
             'Reporte de Cateterizacion Cardiaca', '2.16.840.1.113883.6.1'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name, code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 11, '11522-0',
             'Reporte de Ecocardiografia', '2.16.840.1.113883.6.1'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name, code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 11, '18746-8',
             'Reporte de Colonoscopia', '2.16.840.1.113883.6.1'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name, code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 11, '18751-8',
             'Reporte de Endoscopia', '2.16.840.1.113883.6.1'
            );
INSERT INTO cda.code_system
            (code_system_key, code_system_group_key, code,
             display_name, code_system
            )
     VALUES (cda.code_system_seq.NEXTVAL, 11, '11525-3',
             'Reporte de Ecografia Obstetrica', '2.16.840.1.113883.6.1'
            );

COMMIT ;