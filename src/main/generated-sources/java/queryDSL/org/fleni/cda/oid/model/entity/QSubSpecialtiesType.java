package org.fleni.cda.oid.model.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QSubSpecialtiesType is a Querydsl query type for SubSpecialtiesType
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QSubSpecialtiesType extends EntityPathBase<SubSpecialtiesType> {

    private static final long serialVersionUID = 683669132L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSubSpecialtiesType subSpecialtiesType = new QSubSpecialtiesType("subSpecialtiesType");

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

    public QSubSpecialtiesType(String variable) {
        this(SubSpecialtiesType.class, forVariable(variable), INITS);
    }

    public QSubSpecialtiesType(Path<? extends SubSpecialtiesType> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QSubSpecialtiesType(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QSubSpecialtiesType(PathMetadata<?> metadata, PathInits inits) {
        this(SubSpecialtiesType.class, metadata, inits);
    }

    public QSubSpecialtiesType(Class<? extends SubSpecialtiesType> type, PathMetadata<?> metadata, PathInits inits) {
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

