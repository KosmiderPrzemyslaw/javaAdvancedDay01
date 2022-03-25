package Dzień_1_Interfejsy.ExamplPresentation;

public interface SuperUser {
    default int getAdminId(){
        return 1;
    }
}
