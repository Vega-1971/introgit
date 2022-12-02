package meetingrooms;

import java.util.List;
import java.util.Scanner;

public class MeetingRoomController {

    private Office office = new Office();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MeetingRoomController controller = new MeetingRoomController();
        controller.runMenu();
    }

    private void runMenu() {
        System.out.println("Üdvözöllek!");
        System.out.println("Hány tárgyalót szeretnél rögzíteni?");
        int roomNumber = scanner.nextInt();
        scanner.nextLine();
        readMeetingRooms(roomNumber);

        printMenu();

        System.out.println("Válassz a fenti menüből!");

        int menuNumber = scanner.nextInt();
        scanner.nextLine();

        chooseMenuItem(menuNumber);
    }

    private void chooseMenuItem(int menuNumber) {
        if (menuNumber == 1) {
            System.out.println("A tárgyalók neve sorrendben:");
            printNames(office.getMeetingRooms());
        }

        if (menuNumber == 2) {
            System.out.println("A tárgyalók neve fordított sorrendben:");
            printNames(office.getMeetingRoomsInReverseOrder());
        }

        if (menuNumber == 3) {
            System.out.println("Páros (1-est írj) vagy páratlan (2-est írj) indexű tárgylókra vagy kíváncsi?");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("Íme, a páros számú tárgyalók nevei.");
                printNames(office.getEverySecondMeetingRoom(choice));
            }
            if (choice == 2) {
                System.out.println("Íme, a páratlan számú tárgyalók nevei.");
                printNames(office.getEverySecondMeetingRoom(choice));
            }
        }
        if (menuNumber == 4) {
            System.out.println("A rendszerben található tárgyalók adatai:");
            printMeetingRooms(office.getMeetingRooms());

        }

        if (menuNumber == 5) {
            System.out.println("Keresett tárgyaló neve: ");
            String name = scanner.nextLine();
            System.out.println("A kért tárgyaló adatai:");
            printMeetingRoom(office.getMeetingRoomWithGivenName(name));
        }

        if (menuNumber == 6) {
            System.out.println("Keresett karaktersor a tárgyalók neveiben: ");
            String namePart = scanner.nextLine();
            System.out.println("A kért tárgyalók adatai:");
            printMeetingRooms(office.getMeetingRoomWithGivenNamePart(namePart));
        }

        if (menuNumber == 7) {
            System.out.println("Mekkora területű (min m2) tárgyalót keresel?");
            int roomSize = scanner.nextInt();
            scanner.nextLine();
            System.out.println("A kért tárgyalók adatai:");
            printMeetingRooms(office.getMeetingRoomWithAreaLargerThan(roomSize));
        }

        if (menuNumber == 8) {
            System.out.println("Viszlát!");
        }

        if (menuNumber < 1 || menuNumber > 8) {
            System.out.println("Ismeretlen menüpont!");
        }
    }


    private void readMeetingRooms(int roomNumber) {
        for (int i = 1; i <= roomNumber; i++) {
            System.out.println("Add meg a(z) " + i + ". tárgyló paramétereit!");
            System.out.println("Tárgyaló neve: ");
            String name = scanner.nextLine();
            System.out.println("Tárgyaló szélessége: ");
            int width = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Tárgyaló hossza: ");
            int length = scanner.nextInt();
            scanner.nextLine();
            office.addMeetingRoom(name, width, length);
            System.out.println("A tárgyaló mentése sikeres volt");
        }
    }


    private void printMenu() {

        System.out.println("1. Tárgyalók sorrendben\n" +
                "2. Tárgyalók visszafele sorrendben\n" +
                "3. Minden második tárgyaló\n" +
                "4. Területek\n" +
                "5. Keresés pontos név alapján\n" +
                "6. Keresés névtöredék alapján\n" +
                "7. Keresés terület alapján\n" +
                "8. Kilépés");

    }
    private void printNames(List<MeetingRoom> meetingRooms){
        for (MeetingRoom itemToPrint: meetingRooms) {
            System.out.println(itemToPrint.getName());
        }
    }
    private void printMeetingRooms(List<MeetingRoom> meetingRooms){
        for (MeetingRoom itemToPrint: meetingRooms) {
            printMeetingRoom(itemToPrint);
        }
    }

    private static void printMeetingRoom(MeetingRoom itemToPrint) {
        System.out.println("Tárgyaló neve: " + itemToPrint.getName()
                            + "; Szélessége: " + itemToPrint.getWidth() + " m"
                            + "; Hosszúsága: " + itemToPrint.getLength() + " m"
                            + "; Területe: " + itemToPrint.getArea() + " m2");
    }

}
