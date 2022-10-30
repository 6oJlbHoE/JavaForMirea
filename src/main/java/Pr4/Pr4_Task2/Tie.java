package Pr4.Pr4_Task2;

public class Tie extends Clothes implements MenClothing{
    @Override
    public int dressMen(String clothes) {
        System.out.println("This is a tie to dress a men!");
        return 0;
    }
}
