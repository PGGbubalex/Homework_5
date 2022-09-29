public class Main {
    public static void main(String[] args) {

    int deliveryDistance = 95;
    int daysToDeliver = 1;

        if(deliveryDistance>20){
            daysToDeliver++;
        }
        if(deliveryDistance>60){
            daysToDeliver++;
        }
        System.out.println("Доставка займет " + daysToDeliver + " дней");
    }
}

