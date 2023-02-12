package Lambda.lambda3;

@FunctionalInterface // annotation - metadata
public interface I1 {
    void m1();
//    void m2();
    default void m3() {}
    default void m4() {}
    static void m5() {}
    static void m6() {}
}
