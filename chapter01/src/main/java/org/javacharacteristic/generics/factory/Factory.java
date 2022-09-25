package org.javacharacteristic.generics.factory;

import org.javacharacteristic.generics.entity.SourceEntity;
import org.javacharacteristic.generics.entity.TargetEntity;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class Factory<S extends SourceEntity, T extends TargetEntity> {

    public void accept() throws Exception {
        Type[] types = type();
        Class<S> sourceEntityClass = (Class<S>) types[0];
        System.out.println(sourceEntityClass.newInstance());

        Class<T> targetEntityClass = (Class<T>) types[1];
        System.out.println(targetEntityClass.newInstance());
    }

    public Type[] type() {
        Type genType = getClass().getGenericSuperclass();
        ParameterizedType parameterizedType = (ParameterizedType) genType;
        return parameterizedType.getActualTypeArguments();
    }
}
