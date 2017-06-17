package org.fleni.cda.oid.model.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QCodeSystem is a Querydsl query type for CodeSystem
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCodeSystem extends EntityPathBase<CodeSystem> {

    private static final long serialVersionUID = -568582670L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCodeSystem codeSystem1 = new QCodeSystem("codeSystem1");

    public final StringPath code = createString("code");

    public final StringPath codeSystem = createString("codeSystem");

    protected QCodeSystemGroup codeSystemGroup;

    public final StringPath displayName = createString("displayName");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QCodeSystem(String variable) {
        this(CodeSystem.class, forVariable(variable), INITS);
    }

    public QCodeSystem(Path<? extends CodeSystem> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCodeSystem(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCodeSystem(PathMetadata<?> metadata, PathInits inits) {
        this(CodeSystem.class, metadata, inits);
    }

    public QCodeSystem(Class<? extends CodeSystem> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.codeSystemGroup = inits.isInitialized("codeSystemGroup") ? new QCodeSystemGroup(forProperty("codeSystemGroup")) : null;
    }

    public QCodeSystemGroup codeSystemGroup() {
        if (codeSystemGroup == null) {
            codeSystemGroup = new QCodeSystemGroup(forProperty("codeSystemGroup"));
        }
        return codeSystemGroup;
    }

}

