package org.fleni.cda.oid.model.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QConvertMasterType is a Querydsl query type for ConvertMasterType
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QConvertMasterType extends EntityPathBase<ConvertMasterType> {

    private static final long serialVersionUID = 939637401L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QConvertMasterType convertMasterType = new QConvertMasterType("convertMasterType");

    protected QCodeSystem codeSystem;

    public final StringPath discriminator = createString("discriminator");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath nameSystemExternal = createString("nameSystemExternal");

    protected QObjectIdentifier objectIdentifier;

    public final StringPath typeMasterSystemExternal = createString("typeMasterSystemExternal");

    public QConvertMasterType(String variable) {
        this(ConvertMasterType.class, forVariable(variable), INITS);
    }

    public QConvertMasterType(Path<? extends ConvertMasterType> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QConvertMasterType(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QConvertMasterType(PathMetadata<?> metadata, PathInits inits) {
        this(ConvertMasterType.class, metadata, inits);
    }

    public QConvertMasterType(Class<? extends ConvertMasterType> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.codeSystem = inits.isInitialized("codeSystem") ? new QCodeSystem(forProperty("codeSystem"), inits.get("codeSystem")) : null;
        this.objectIdentifier = inits.isInitialized("objectIdentifier") ? new QObjectIdentifier(forProperty("objectIdentifier"), inits.get("objectIdentifier")) : null;
    }

    public QCodeSystem codeSystem() {
        if (codeSystem == null) {
            codeSystem = new QCodeSystem(forProperty("codeSystem"));
        }
        return codeSystem;
    }

    public QObjectIdentifier objectIdentifier() {
        if (objectIdentifier == null) {
            objectIdentifier = new QObjectIdentifier(forProperty("objectIdentifier"));
        }
        return objectIdentifier;
    }

}

