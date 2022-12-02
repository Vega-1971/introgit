package introconstructors;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CyclingTour {

    private String description;
    private LocalDate startTime;
    private int numberOfPeople;
    private double kms;

    public String getDescription() {
        return description;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public CyclingTour(String description, LocalDate startTime) {
        this.description = description;
        this.startTime = startTime;
    }

    public void registerPerson(int person) {
         numberOfPeople = numberOfPeople+person;
        }
    public void ride(double km) {
        kms = kms+km;
    }

    public static void main(String[] args) {

        double v = .2022;
        CyclingTour tour_1 = new CyclingTour("Balaton-kör",LocalDate.of(2022,11,30));
        System.out.println(tour_1.getDescription());
        System.out.println(tour_1.getStartTime());
        System.out.println(tour_1.numberOfPeople);
        System.out.println(tour_1.kms);

        tour_1.registerPerson(5);
        tour_1.ride(120);

        System.out.println(tour_1.getDescription());
        System.out.println(tour_1.getStartTime());
        System.out.println(tour_1.numberOfPeople);
        System.out.println(tour_1.kms);
    }
}
