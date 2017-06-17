package org.fleni.cda.oid.model.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QObjectIdentifier is a Querydsl query type for ObjectIdentifier
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QObjectIdentifier extends EntityPathBase<ObjectIdentifier> {

    private static final long serialVersionUID = 2021290046L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QObjectIdentifier objectIdentifier = new QObjectIdentifier("objectIdentifier");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    protected QObjectIdentifierGroup objectIdentifierGroup;

    public final StringPath oids = createString("oids");

    public QObjectIdentifier(String variable) {
        this(ObjectIdentifier.class, forVariable(variable), INITS);
    }

    public QObjectIdentifier(Path<? extends ObjectIdentifier> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QObjectIdentifier(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QObjectIdentifier(PathMetadata<?> metadata, PathInits inits) {
        this(ObjectIdentifier.class, metadata, inits);
    }

    public QObjectIdentifier(Class<? extends ObjectIdentifier> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.objectIdentifierGroup = inits.isInitialized("objectIdentifierGroup") ? new QObjectIdentifierGroup(forProperty("objectIdentifierGroup")) : null;
    }

    public QObjectIdentifierGroup objectIdentifierGroup() {
        if (objectIdentifierGroup == null) {
            objectIdentifierGroup = new QObjectIdentifierGroup(forProperty("objectIdentifierGroup"));
        }
        return objectIdentifierGroup;
    }

}

