package org.javacharacteristic.generics;

import org.javacharacteristic.generics.entity.*;
import org.javacharacteristic.generics.factory.Factory;

public class Test02 {

    public static void main(String[] args) throws Exception {
        Factory factory1 = new Factory$1();
        Factory factory2 = new Factory$2();
        factory1.accept();
        factory2.accept();
    }

    public static final class Factory$1 extends Factory<SourceEntity1, TargetEntity1> {
    }

    public static final class Factory$2 extends Factory<SourceEntity2, TargetEntity2> {
    }

}
