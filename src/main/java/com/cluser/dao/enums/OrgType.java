package com.cluser.dao.enums;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

public enum OrgType {
    REAL, VIRTUAL, ROOT, DEFAULT;

    public static final Set<OrgType> UNCHANGEABLE; // all values, except UNKNOWN

    static {
        EnumSet<OrgType> kv = EnumSet.of(ROOT, DEFAULT);
        UNCHANGEABLE = Collections.unmodifiableSet(kv);
    }

    public boolean notDeletable() {
        return UNCHANGEABLE.contains(this);
    }
}
