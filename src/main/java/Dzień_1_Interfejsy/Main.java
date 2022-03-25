package Dzień_1_Interfejsy;

import Dzień_1_Interfejsy.ExamplPresentation.Manager;

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin();
        int adminId = admin.getAdminId();
        int id = admin.getId();

        System.out.println("admin id: " + adminId);
        System.out.println("id: " + id);

        Manager manager = new Manager();

        int i = manager.getAdminId();
        System.out.println(i);


    }
}
