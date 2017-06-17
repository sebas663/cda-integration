package org.fleni.cda.oid.model.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QDocumentIdentityType is a Querydsl query type for DocumentIdentityType
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QDocumentIdentityType extends EntityPathBase<DocumentIdentityType> {

    private static final long serialVersionUID = -810232375L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDocumentIdentityType documentIdentityType = new QDocumentIdentityType("documentIdentityType");

    public final QConvertMasterType _super;

    // inherited
    protected QCodeSystem codeSystem;

    //inherited
    public final StringPath discriminator;

    //inherited
    public final NumberPath<Long> id;

    //inherited
    public final StringPath nameSystemExternal;

    // inherited
    protected QObjectIdentifier objectIdentifier;

    //inherited
    public final StringPath typeMasterSystemExternal;

    public QDocumentIdentityType(String variable) {
        this(DocumentIdentityType.class, forVariable(variable), INITS);
    }

    public QDocumentIdentityType(Path<? extends DocumentIdentityType> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QDocumentIdentityType(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QDocumentIdentityType(PathMetadata<?> metadata, PathInits inits) {
        this(DocumentIdentityType.class, metadata, inits);
    }

    public QDocumentIdentityType(Class<? extends DocumentIdentityType> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QConvertMasterType(type, metadata, inits);
        this.discriminator = _super.discriminator;
        this.id = _super.id;
        this.nameSystemExternal = _super.nameSystemExternal;
        this.typeMasterSystemExternal = _super.typeMasterSystemExternal;
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

