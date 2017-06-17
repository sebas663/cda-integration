package org.fleni.cda.externalreport.model.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QExternalReportData is a Querydsl query type for ExternalReportData
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QExternalReportData extends EntityPathBase<ExternalReportData> {

    private static final long serialVersionUID = 1021357292L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QExternalReportData externalReportData = new QExternalReportData("externalReportData");

    public final DatePath<java.util.Date> creationDate = createDate("creationDate", java.util.Date.class);

    protected QExternalReportInfo externalReportInfo;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ArrayPath<byte[], Byte> messageCdaData = createArray("messageCdaData", byte[].class);

    public final ArrayPath<byte[], Byte> messageJsonData = createArray("messageJsonData", byte[].class);

    public QExternalReportData(String variable) {
        this(ExternalReportData.class, forVariable(variable), INITS);
    }

    public QExternalReportData(Path<? extends ExternalReportData> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QExternalReportData(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QExternalReportData(PathMetadata<?> metadata, PathInits inits) {
        this(ExternalReportData.class, metadata, inits);
    }

    public QExternalReportData(Class<? extends ExternalReportData> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.externalReportInfo = inits.isInitialized("externalReportInfo") ? new QExternalReportInfo(forProperty("externalReportInfo"), inits.get("externalReportInfo")) : null;
    }

    public QExternalReportInfo externalReportInfo() {
        if (externalReportInfo == null) {
            externalReportInfo = new QExternalReportInfo(forProperty("externalReportInfo"));
        }
        return externalReportInfo;
    }

}

