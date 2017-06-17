package org.fleni.cda.externalreport.model.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QCdaErrorBackup is a Querydsl query type for CdaErrorBackup
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCdaErrorBackup extends EntityPathBase<CdaErrorBackup> {

    private static final long serialVersionUID = -360437011L;

    public static final QCdaErrorBackup cdaErrorBackup = new QCdaErrorBackup("cdaErrorBackup");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ArrayPath<byte[], Byte> messageCdaData = createArray("messageCdaData", byte[].class);

    public final NumberPath<Long> status = createNumber("status", Long.class);

    public QCdaErrorBackup(String variable) {
        super(CdaErrorBackup.class, forVariable(variable));
    }

    public QCdaErrorBackup(Path<? extends CdaErrorBackup> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCdaErrorBackup(PathMetadata<?> metadata) {
        super(CdaErrorBackup.class, metadata);
    }

}

