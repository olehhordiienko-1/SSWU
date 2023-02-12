package Enums;

public enum Season {
    WINTER(90, 0.2){
        @Override
        void resort() {
            super.resort();
            System.out.println("Ski");
        }
    },
    SPRING(92, 14.7),
    SUMMER(92, 23.6){
        @Override
        void resort() {
            super.resort();
            System.out.println("Swim");
        }
    },
    AUTUMN(91, 13.8); // public static final
    int days;
    double temperature;

    Season(int days, double temperature) {
        this.days = days;
        this.temperature = temperature;
    }

    void resort(){
        System.out.println("Walk");
    }
}
