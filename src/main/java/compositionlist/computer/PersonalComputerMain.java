package compositionlist.computer;

public class PersonalComputerMain {

    public static void main(String[] args) {
        Cpu cpu = new Cpu("Intel NexGen5", 1.5);
        PersonalComputer pc = new PersonalComputer(cpu);

        Software office = new Software("office M365", 10.2 );
        Software opsys = new Software("win10", 2022.2);
        Software viruscleaner = new Software("Kaspersky", 1.4);
        pc.addSoftware(office);
        pc.addSoftware(opsys);
        pc.addSoftware(viruscleaner);

        Hardware mouse = new Hardware("Samsung", "micro" );
        Hardware monitor = new Hardware("LG", "USB");
        Hardware cdwriter = new Hardware("Asus", "Supra");
        pc.addHardware(mouse);
        pc.addHardware(monitor);
        pc.addHardware(cdwriter);

        System.out.println(office);
        System.out.println(opsys);
        System.out.println(viruscleaner);
        System.out.println(mouse);
        System.out.println(monitor);
        System.out.println(cdwriter);

        System.out.println(pc.getCpu());
        System.out.println(pc.getSoftwares());
        System.out.println(pc.getHardwares());

        System.out.println(pc);


    }
}
