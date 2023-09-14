import java.util.Scanner;

public class MaxMinFinder {
    public static void main(String[] args) {
        boolean errorCheck = true; //aşağıdaki while'a girilmesi için ilk değeri true verildi
        int counter; //sayaç olarak kullanılacak.

        Scanner scan = new Scanner(System.in);

        while (errorCheck) { //burası true döndüğü sürece userdan girdiyi tekrar alıyorum

            System.out.print("how many numbers do you want to enter: ");
            counter = scan.nextInt();

            if (counter <= 1) { //karşılaştırmanın yapılabilmesi için en az iki sayı olmalı!
                System.out.println("You can enter at least two numbers!");
            } else {
                int maxNum = 0, minNum = 0;

                for (int i = 0; i < counter; i++) {
                    System.out.print("Enter " + (i + 1) + ". number ");
                    int tempNum = scan.nextInt();
                    if (i == 0) {
                        maxNum = tempNum;
                        minNum = tempNum;
                    } else if (tempNum > maxNum) {
                        maxNum = tempNum;
                    } else if (tempNum < minNum) {
                        minNum = tempNum;
                    }
                }

                errorCheck = false;

                System.out.println("max num is: " + maxNum);
                System.out.println("min num is: " + minNum);
            }
        }
    }
}