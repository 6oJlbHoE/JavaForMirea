package Pr4.Pr4_Task1;

public class Main {
    public static void main(String[] args) {
        Season favoriteSeason = Season.SUMMER;
        System.out.println("Task 1");
        System.out.println("My favorite season is " + favoriteSeason + ".\n");

        System.out.println("Task 2");
        iLike(favoriteSeason);
        System.out.println();

        System.out.println("Task 3\nThe average temperature is " + favoriteSeason.averageTemperature + ".\n");

        System.out.println("Task 6");
        int i = 1;
        for(Season season: Season.values()){
            System.out.println("Season " + i + " - " + season + ". The average temperature of this season is " + season.averageTemperature + ". " + season.getDescription());
            i++;
        }
    }
    public static void iLike(Season season){
        switch (season){
            case AUTUMN:
                System.out.println("I like autumn!");
                break;
            case WINTER:
                System.out.println("I like autumn!");
                break;
            case SPRING:
                System.out.println("I like autumn!");
                break;
            case SUMMER:
                System.out.println("I like autumn!");
                break;
        }
    }
}
