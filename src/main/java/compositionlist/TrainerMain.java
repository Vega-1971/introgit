package compositionlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrainerMain {

    public static void main(String[] args) {

        Trainer trainer = new compositionlist.Trainer("Dr. Bubó");
        System.out.println(trainer.getAddresses());

        List<Address> addresses = new ArrayList<>(Arrays.asList(
                new Address("Fót", "Lapulevél köz 10."),
                new Address("Őskü", "Kakukkfű mezsgye 4.")
        ));
        trainer.setAddresses(addresses);

        trainer.getAddresses().add(new Address("Zamárdi","Parti sétány 3."));

        //trainer.getAddresses().add(new Address("Monor", "Szőlőhegy 2."));
        trainer.addAddress(new Address("Budapest", "Váci utca"));

        System.out.println(trainer.getAddresses().size());
    }
}
