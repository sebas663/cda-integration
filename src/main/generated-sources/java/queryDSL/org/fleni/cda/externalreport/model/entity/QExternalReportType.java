package org.fleni.cda.externalreport.model.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QExternalReportType is a Querydsl query type for ExternalReportType
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QExternalReportType extends EntityPathBase<ExternalReportType> {

    private static final long serialVersionUID = 1021856892L;

    public static final QExternalReportType externalReportType = new QExternalReportType("externalReportType");

    public final StringPath externalReportClassFactory = createString("externalReportClassFactory");

    public final StringPath externalReportName = createString("externalReportName");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QExternalReportType(String variable) {
        super(ExternalReportType.class, forVariable(variable));
    }

    public QExternalReportType(Path<? extends ExternalReportType> path) {
        super(path.getType(), path.getMetadata());
    }

    public QExternalReportType(PathMetadata<?> metadata) {
        super(ExternalReportType.class, metadata);
    }

}

