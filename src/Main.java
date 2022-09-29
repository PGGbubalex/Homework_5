public class Main {
    public static void main(String[] args) {

        int month = 13;

        if (month == 12 || month<=2) {
            System.out.println("Зима");
        }
        if (month>=3 && month<=5){
                System.out.println("Весна");
        }
        if (month>=6 && month <=8){
                System.out.println("Лето");
        }
        if (month>=9 && month <=11){
                System.out.println("Осень");
            }
        else {
            System.out.println("Некорректный номер месяца");
        }
    }
}