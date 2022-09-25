package org.javacharacteristic.generics;

import org.javacharacteristic.generics.entity.*;
import org.javacharacteristic.generics.factory.Factory;

public class Test02 {

    public static void main(String[] args) throws Exception {
        Factory factory1 = new Factory<SourceEntity1, TargetEntity1>() {
        };
        Factory factory2 = new Factory<SourceEntity2, TargetEntity2>() {
        };
        factory1.accept();
        factory2.accept();
    }
}
