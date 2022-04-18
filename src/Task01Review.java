import java.util.Scanner;

public class Task01Review {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int v = 0;
        int f = 0;
        boolean dvm = false;


        do {
            System.out.println("Vize notu giriniz");
            dvm = false;

            try {

                v = scan.nextInt();

                if (v > 100 || v < 0) {
                    throw new ArithmeticException();
                }

            } catch (ArithmeticException e) {
                System.out.println("hatalı aralık");
                dvm = true;

            } catch (Exception e) {
                scan.next();
                System.out.println("lütfen sayı giriniz");
                dvm = true;
            }
        } while (dvm);


        do {
            System.out.println("Final notu giriniz");
            dvm = false;

            try {

                f = scan.nextInt();

                if (f > 100 || f < 0) {
                    throw new ArithmeticException();
                }

            } catch (ArithmeticException e) {
                System.out.println("hatalı aralık");
                dvm = true;

            } catch (Exception e) {
                scan.next();
                System.out.println("lütfen sayı giriniz");
                dvm = true;
            }
        } while (dvm);

        System.out.println("ortalama geçme notunuz " + (v * 0.40 + f * 0.60));


    }
}
