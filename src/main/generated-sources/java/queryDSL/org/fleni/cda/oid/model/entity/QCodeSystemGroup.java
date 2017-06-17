package org.fleni.cda.oid.model.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QCodeSystemGroup is a Querydsl query type for CodeSystemGroup
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCodeSystemGroup extends EntityPathBase<CodeSystemGroup> {

    private static final long serialVersionUID = -1325346899L;

    public static final QCodeSystemGroup codeSystemGroup = new QCodeSystemGroup("codeSystemGroup");

    public final StringPath codeSystem = createString("codeSystem");

    public final ListPath<CodeSystem, QCodeSystem> codeSystems = this.<CodeSystem, QCodeSystem>createList("codeSystems", CodeSystem.class, QCodeSystem.class, PathInits.DIRECT2);

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QCodeSystemGroup(String variable) {
        super(CodeSystemGroup.class, forVariable(variable));
    }

    public QCodeSystemGroup(Path<? extends CodeSystemGroup> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCodeSystemGroup(PathMetadata<?> metadata) {
        super(CodeSystemGroup.class, metadata);
    }

}

