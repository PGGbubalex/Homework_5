public class Main {
    public static void main(String[] args) {

    int year = 400;

    if (year % 4 == 0 && year%100!= 0 || year%400==0) {

        System.out.println(year + " год високосный");
    }
    else {
        System.out.println(year + " год не високосный");
    }

    }
}
