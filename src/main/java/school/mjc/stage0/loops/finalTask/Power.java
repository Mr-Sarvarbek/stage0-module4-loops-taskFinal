package school.mjc.stage0.loops.finalTask;

public class Power {
   
    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
    
     public void printPower(int numberToPrint, int power) {
        int son =1;
        for (int i = 0; i < power; i++) {
            son*=numberToPrint;
        }
        System.out.println(son);
    }
}
