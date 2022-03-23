package Maidul2;

import Maidul2.package1.ClassA;
import Maidul2.package2.*;

public class PackageTest2 {
    public static void main(String args[])
    {
        ClassA objectA = new ClassA();
        ClassB objectB = new ClassB();
        objectA.displayA();
        objectB.displayB();
    }
}
