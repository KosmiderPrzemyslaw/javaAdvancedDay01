package Dzień_1_Interfejsy.ExamplPresentation;

public class Manager implements  User, SuperUser {
    @Override
    public int getAdminId() {
        return 55;
    }
}
