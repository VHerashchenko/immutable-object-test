package com.kpi.fict.vh.immutable;

import com.kpi.fict.vh.DefaultObject;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableObject {
    private final String immutableString;
    private final Integer immutableInteger;
    private final DefaultObject immutableObjectType;

    public ImmutableObject(String str, Integer integer, DefaultObject defaultObject){
        immutableString = str;
        immutableInteger = integer;
        immutableObjectType = new DefaultObject(List.copyOf(defaultObject.getNumbers()));
    }

    public ImmutableObject setString(String str){
        return new ImmutableObject(str, this.immutableInteger, this.immutableObjectType);
    }

    public ImmutableObject setInteger(Integer integer){
        return new ImmutableObject(this.immutableString, integer, this.immutableObjectType);
    }

    public ImmutableObject setObject(DefaultObject immutableObjectType){
        return new ImmutableObject(this.immutableString, this.immutableInteger, immutableObjectType);
    }

    public String getImmutableString(){
        return immutableString;
    }

    public Integer getImmutableInteger(){
        return immutableInteger;
    }

    public DefaultObject getImmutableObjectType() {
        return new DefaultObject(new ArrayList<>(immutableObjectType.getNumbers()));
    }
}