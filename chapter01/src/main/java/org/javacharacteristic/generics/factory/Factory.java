package org.javacharacteristic.generics.factory;

import org.javacharacteristic.generics.entity.SourceEntity;
import org.javacharacteristic.generics.entity.TargetEntity;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class Factory<S extends SourceEntity, T extends TargetEntity> {

    public void accept() throws Exception {
        Type[] types = type();
        Class<SourceEntity> sourceEntityClass = (Class<SourceEntity>) types[0];
        System.out.println(sourceEntityClass.newInstance());
<<<<<<< HEAD

        Class<SourceEntity> targetEntityClass = (Class<SourceEntity>) types[1];
        System.out.println(targetEntityClass.newInstance());
=======
>>>>>>> a318308bde5c816358efa3efea77c0defa96a5ed
    }

    public Type[] type() {
        Type genType = getClass().getGenericSuperclass();
        ParameterizedType parameterizedType = (ParameterizedType) genType;
        return parameterizedType.getActualTypeArguments();
    }
}
