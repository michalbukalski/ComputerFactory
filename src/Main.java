public class Main {

    public static void main(String[] args) throws InterruptedException {

        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        Monitor theMonitor = new Monitor("27' beast", "Acer", 27, "2540 x 1440");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4,6,"v2.44");

        PersonalComputer thePC = new PersonalComputer("2208", "Dell", theCase,theMonitor,theMotherboard);

//        thePC.getMonitor().drawPixelAt(10,10,"red");
//        thePC.getMotherboard().loadProgram("Windows 11");
//        System.out.println(" ");
//        thePC.getComputerCase().pressPowerButton();

        thePC.powerUp();
    }
}
