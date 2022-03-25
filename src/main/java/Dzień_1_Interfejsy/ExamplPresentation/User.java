package Dzień_1_Interfejsy.ExamplPresentation;

public interface User {
    default int getAdminId() {
        return 0;
    }

    static void printMsg(String msg) {
        System.out.println(msg);
    }
}
