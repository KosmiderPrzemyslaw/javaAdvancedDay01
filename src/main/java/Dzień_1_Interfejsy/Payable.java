package Dzień_1_Interfejsy;

//WSZYSTKIE STAŁE I METODY W INTERFEJSACH SĄ DOMYŚLNIE PUBLICZNE więc można pominąć słowo kluczowe public - zostanie dodane automatycznie
//Wszystkie atrybuty interfejsu sa statyczne i finalne
interface Payable {
    double PI = Math.PI;
    String name = new String("Przemek");
    String name2 = "Jurek";

    double getPaymentAmount();

    String showPaymentMethod();

}
