package Pr4.Pr4_Task1;

public enum Season {
    SUMMER(17.7), SPRING(6.3), WINTER(-6.1), AUTUMN(5.2);
    final Double averageTemperature;
    Season(Double averageTemperature){
        this.averageTemperature = averageTemperature;
    }

    String getDescription(){
        if(this.equals(this.SUMMER)) return "Warm season";
        else return "Cold season";
    }
}
