package org.fleni.cda.oid.model.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QObjectIdentifierGroup is a Querydsl query type for ObjectIdentifierGroup
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QObjectIdentifierGroup extends EntityPathBase<ObjectIdentifierGroup> {

    private static final long serialVersionUID = 1349913825L;

    public static final QObjectIdentifierGroup objectIdentifierGroup = new QObjectIdentifierGroup("objectIdentifierGroup");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<ObjectIdentifier, QObjectIdentifier> objectIdentifiers = this.<ObjectIdentifier, QObjectIdentifier>createList("objectIdentifiers", ObjectIdentifier.class, QObjectIdentifier.class, PathInits.DIRECT2);

    public final StringPath oids = createString("oids");

    public QObjectIdentifierGroup(String variable) {
        super(ObjectIdentifierGroup.class, forVariable(variable));
    }

    public QObjectIdentifierGroup(Path<? extends ObjectIdentifierGroup> path) {
        super(path.getType(), path.getMetadata());
    }

    public QObjectIdentifierGroup(PathMetadata<?> metadata) {
        super(ObjectIdentifierGroup.class, metadata);
    }

}

