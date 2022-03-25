package Dzień_1_Interfejsy;
//Metody domyślne mogą ale nie muszą być definiowane w klasach implementujących dany interfejs;
public class Admin implements User {

    @Override
    public int getId() {
        return 0;
    }

//    @Override
//    public int getAdminId() {
//        return 0;
//    }
}
