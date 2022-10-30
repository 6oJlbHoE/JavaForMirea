package Pr4.Pr4_Task2;

public enum Size{
    XXS(32), XS(34), S(36), M(38), L(40);

    final int euroSize;

    Size(int euroSize){
        this.euroSize = euroSize;
    }

    public String getDescription(){
        if(this.equals(this.XXS)) return "Детский размер";
        else return "Взрослый размер";
    }
}