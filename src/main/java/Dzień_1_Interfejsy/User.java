package Dzień_1_Interfejsy;

public interface User {
    int getId();
    default int getAdminId() {
        return 2;
    }
}