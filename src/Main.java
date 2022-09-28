public class Main {
    public static void main(String[] args) {

        int clientOS = 3;
        int releaseDate = 2011;

        if (clientOS == 0) {

            if (releaseDate<=2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }

        else if (clientOS == 1) {

            if (releaseDate<=2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
            else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        else {
            System.out.println("Неизвестный тип устройства");
        }
    }
}

