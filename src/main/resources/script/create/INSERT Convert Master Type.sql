/* Formatted on 2016/03/21 12:01 (Formatter Plus v4.8.8) */
-- PARAMETROS "SEX"
INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'SEX',
             'F', 'SIDCA',
             15, NULL
            );

INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'SEX',
             'M', 'SIDCA',
             15, NULL
            );

INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'SEX',
             'H', 'SIDCA',
             16, NULL
            );

COMMIT ;

-- PARAMETROS "DOCUMENT_TEMPLATE"
INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'DOCUMENT_TEMPLATE',
             'INF_ALTA', 'SIDCA',
             NULL, 1
            );

COMMIT ;

-- PARAMETROS "PROVIDERS"
INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'PROVIDERS',
             'FLENI', 'SIDCA',
             NULL, 36
            );

COMMIT ;

-- PARAMETROS "DOCUMENT_IDENTITY_TYPE"
INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'DOCUMENT_IDENTITY_TYPE',
             '96', 'SIDCA',
             NULL, 44
            );

INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'DOCUMENT_IDENTITY_TYPE',
             '94', 'SIDCA',
             NULL, 49
            );

INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'DOCUMENT_IDENTITY_TYPE',
             '89', 'SIDCA',
             NULL, 47
            );

INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'DOCUMENT_IDENTITY_TYPE',
             '90', 'SIDCA',
             NULL, 47
            );

INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'DOCUMENT_IDENTITY_TYPE',
             '1', 'SIDCA',
             NULL, 45
            );
COMMIT ;

-- PARAMETROS "CONFIDENTIALITY_LEVEL"
INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'CONFIDENTIALITY_LEVEL',
             'S', 'SIDCA',
             102, NULL
            );

INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'CONFIDENTIALITY_LEVEL',
             'N', 'SIDCA',
             103, NULL
            );

COMMIT ;

-- PARAMETROS "SECTION_TEMPLATE"
INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'SECTION_TEMPLATE',
             '2001', 'SIDCA',
             NULL, 16
            );

INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'SECTION_TEMPLATE',
             '2002', 'SIDCA',
             NULL, 17
            );

INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'SECTION_TEMPLATE',
             '2003', 'SIDCA',
             NULL, 19
            );

INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'SECTION_TEMPLATE',
             '2004', 'SIDCA',
             NULL, 18
            );

INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'SECTION_TEMPLATE',
             '2005', 'SIDCA',
             NULL, 20
            );

INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'SECTION_TEMPLATE',
             '2006', 'SIDCA',
             NULL, 21
            );

INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'SECTION_TEMPLATE',
             '2007', 'SIDCA',
             NULL, 22
            );

INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'SECTION_TEMPLATE',
             '2008', 'SIDCA',
             NULL, 23
            );

INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'SECTION_TEMPLATE',
             '2009', 'SIDCA',
             NULL, 24
            );

INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'SECTION_TEMPLATE',
             '2010', 'SIDCA',
             NULL, 25
            );

INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'SECTION_TEMPLATE',
             '2011', 'SIDCA',
             NULL, 26
            );

INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'SECTION_TEMPLATE',
             '2012', 'SIDCA',
             NULL, 27
            );

INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'SECTION_TEMPLATE',
             '2013', 'SIDCA',
             NULL, 28
            );

INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'SECTION_TEMPLATE',
             '2014', 'SIDCA',
             NULL, 29
            );

INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'SECTION_TEMPLATE',
             '2015', 'SIDCA',
             NULL, 30
            );

INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'SECTION_TEMPLATE',
             '2016', 'SIDCA',
             NULL, 31
            );

COMMIT ;

-- PARAMETROS "MEDICAL_MATRICULATION_TYPE"
INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'MEDICAL_MATRICULATION_TYPE',
             'Nacional', 'SIDCA',
             NULL, 50
            );

INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'MEDICAL_MATRICULATION_TYPE',
             'BsAs', 'SIDCA',
             NULL, 51
            );

COMMIT ;

-- PARAMETROS "EPISODE_SCOPE"
INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'EPISODE_SCOPE',
             'H', 'SIDCA',
             89, NULL
            );

INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'EPISODE_SCOPE',
             'M', 'SIDCA',
             93, NULL
            );
INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'EPISODE_SCOPE',
             'U', 'SIDCA',
             91, NULL
            );

INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'EPISODE_SCOPE',
             'C', 'SIDCA',
             93, NULL
            );

COMMIT ;

-- PARAMETROS "EPISODE_TYPE"
INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'EPISODE_TYPE',
             'H', 'SIDCA',
             95, NULL
            );

INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'EPISODE_TYPE',
             'M', 'SIDCA',
             95, NULL
            );
INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'EPISODE_TYPE',
             'U', 'SIDCA',
             96, NULL
            );

INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'EPISODE_TYPE',
             'C', 'SIDCA',
             101, NULL
            );

COMMIT ;

-- PARAMETROS "IDENTIFIER_DOCUMENT"
INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'IDENTIFIER_DOCUMENT',
             'DOCUMENTOS GENERADOS', 'SIDCA',
             NULL, 74
            );

INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'IDENTIFIER_DOCUMENT',
             'SET DE DOCUMENTOS', 'SIDCA',
             NULL, 75
            );
INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'IDENTIFIER_DOCUMENT',
             'NUMERO DE HISTORIA CLINICA INTERNA', 'SIDCA',
             NULL, 76
            );

INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'IDENTIFIER_DOCUMENT',
             'IDENTIFICADOR DE SERVICIO O DEPARTAMENTO', 'SIDCA',
             NULL, 77
            );

INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'IDENTIFIER_DOCUMENT',
             'IDENTIFICADOR DE SECCION', 'SIDCA',
             NULL, 78
            );

INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'IDENTIFIER_DOCUMENT',
             'IDENTIFICADOR DE PLANES', 'SIDCA',
             NULL, 79
            );
INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'IDENTIFIER_DOCUMENT',
             'NUMEROS DE CARNET DE AFILIADOS', 'SIDCA',
             NULL, 80
            );

INSERT INTO convert_master_type
            (convert_master_type_key, discriminator,
             type_master_system_external, name_system_external,
             code_system_key, object_identifier_key
            )
     VALUES (convert_master_type_seq.NEXTVAL, 'IDENTIFIER_DOCUMENT',
             'IDENTIFICADOR DE EPISODIOS', 'SIDCA',
             NULL, 81
            );

COMMIT ;