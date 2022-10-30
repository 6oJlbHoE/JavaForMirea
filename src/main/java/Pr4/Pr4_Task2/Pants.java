package Pr4.Pr4_Task2;

public class Pants extends Clothes implements MenClothing, WomenClothing{
    @Override
    public int dressMen(String clothes) {
        System.out.println("This is a pants to dress a man!");
        return 0;
    }

    @Override
    public int dressWoman(String clothes) {
        System.out.println("This is a pants to dress a woman!");
        return 0;
    }
}
