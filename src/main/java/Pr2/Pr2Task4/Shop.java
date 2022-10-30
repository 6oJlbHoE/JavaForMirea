package Pr2.Pr2Task4;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop implements inputInterface{
    private ArrayList<Pc> storage = new ArrayList<Pc>();
    private int count = 0;

    public void addPc(String cpu, String gpu, int ram){
        Pc pc = new Pc(cpu, gpu, ram);
        storage.add(pc);
        count++;
    }

    public void deletePc(String cpu, String gpu, int ram){
        for (int i = 0; i < count; i++){
            if(storage.get(i).getCpu() == cpu && storage.get(i).getGpu() == gpu && storage.get(i).getRam() == ram){
                storage.remove(i);
                count --;
                return;
            }
        }
    }

    public int findPc(String cpu, String gpu, int ram){
        for (int i = 0; i < count; i++){
            if(storage.get(i).getCpu().equals(cpu) && storage.get(i).getGpu().equals(gpu) && storage.get(i).getRam() == ram){
                //System.out.println("There is a PC suitable for you in our store");
                return 0;
            }
        }
        return 1;
        //System.out.println("Sorry, we couldn't find the right PCs");
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void inputComputers(int n) {
        Scanner input = new Scanner(System.in);
        String gpu;
        String cpu;
        int ram;
        for (int i = 0; i < n; i ++){
            System.out.println("Enter the characteristics of pc: ");
            cpu = input.next();
            gpu = input.next();
            ram = input.nextInt();
            this.addPc(cpu, gpu, ram);
        }
    }
}
