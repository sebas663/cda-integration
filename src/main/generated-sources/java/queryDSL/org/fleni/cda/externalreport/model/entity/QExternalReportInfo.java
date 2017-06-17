package org.fleni.cda.externalreport.model.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QExternalReportInfo is a Querydsl query type for ExternalReportInfo
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QExternalReportInfo extends EntityPathBase<ExternalReportInfo> {

    private static final long serialVersionUID = 1021518320L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QExternalReportInfo externalReportInfo = new QExternalReportInfo("externalReportInfo");

    public final DatePath<java.util.Date> creationDate = createDate("creationDate", java.util.Date.class);

    public final StringPath episodeNumber = createString("episodeNumber");

    public final ListPath<ExternalReportData, QExternalReportData> externalReportDatas = this.<ExternalReportData, QExternalReportData>createList("externalReportDatas", ExternalReportData.class, QExternalReportData.class, PathInits.DIRECT2);

    protected QExternalReportType externalReportType;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath nhc = createString("nhc");

    public final DatePath<java.util.Date> reportDate = createDate("reportDate", java.util.Date.class);

    public final StringPath reportId = createString("reportId");

    public final StringPath reportOriginalId = createString("reportOriginalId");

    public final NumberPath<Long> reportVersion = createNumber("reportVersion", Long.class);

    public final StringPath typeEpisode = createString("typeEpisode");

    public QExternalReportInfo(String variable) {
        this(ExternalReportInfo.class, forVariable(variable), INITS);
    }

    public QExternalReportInfo(Path<? extends ExternalReportInfo> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QExternalReportInfo(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QExternalReportInfo(PathMetadata<?> metadata, PathInits inits) {
        this(ExternalReportInfo.class, metadata, inits);
    }

    public QExternalReportInfo(Class<? extends ExternalReportInfo> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.externalReportType = inits.isInitialized("externalReportType") ? new QExternalReportType(forProperty("externalReportType")) : null;
    }

    public QExternalReportType externalReportType() {
        if (externalReportType == null) {
            externalReportType = new QExternalReportType(forProperty("externalReportType"));
        }
        return externalReportType;
    }

}

