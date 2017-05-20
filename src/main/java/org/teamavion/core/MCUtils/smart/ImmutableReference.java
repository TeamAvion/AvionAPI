package org.teamavion.core.MCUtils.smart;

public final class ImmutableReference<T> implements ObjectReference<T>{
    private final T t;
    public ImmutableReference(T t){ this.t = t; }
    @Override public T get() { return t; }
}