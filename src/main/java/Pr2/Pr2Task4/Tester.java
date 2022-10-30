package Pr2.Pr2Task4;

import java.util.Scanner;

public class Tester{
//    @Override
//    public void inputComputers(Shop shop) {
//        Scanner input = new Scanner(System.in);
//        String gpu;
//        String cpu;
//        int ram;
//        for (int i = 0; i < shop.getCount(); i ++){
//            cpu = input.next();
//            gpu = input.next();
//            ram = input.nextInt();
//            shop.addPc(cpu, gpu, ram);
//        }
//    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n;
        int inT;
        System.out.println("Enter count of computers in the shop: ");
        n = cin.nextInt();
        Shop shop = new Shop();
        shop.inputComputers(n);
        String cpu;
        String gpu;
        int ram;
        System.out.print("Enter the count of computers: ");
        n = cin.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the characteristics of pc №" + (i + 1) + ": ");
            cpu = cin.next();
            gpu = cin.next();
            ram = cin.nextInt();
            if(shop.findPc(cpu, gpu, ram) == 0) {
                System.out.println("There is a PC suitable for you in our store");
                System.out.println("Will you take this pc (1 - yes, 0 - no)? ");
                inT = cin.nextInt();
                if(inT == 1){
                    shop.deletePc(cpu, gpu, ram);
                    System.out.printf("Take your new pc!");
                }else{
                    System.out.println("Okey, goof luck!");
                }
            }
            else System.out.println("Sorry, we couldn't find the right PCs");
        }
    }
}
