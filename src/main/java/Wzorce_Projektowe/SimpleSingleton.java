package Wzorce_Projektowe;

public class SimpleSingleton {
    private static SimpleSingleton INSTANCE;

    public SimpleSingleton() {
    }

    public static SimpleSingleton getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new SimpleSingleton();
        }
        return INSTANCE;
    }
}
