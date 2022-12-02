package realestate;

public class RealEstateDotCom {

    public static void main(String[] args) {

        RealEstate ad1 = new RealEstate("Vecsési faház", 2_300_000,
                new Details("Szép, rendes, takaros",
                        new Address("Vecsés","2220", "Szondi utca", 68),42,2));
        System.out.println(ad1);

        Address newAddress = new Address("Pécs","6000", "Tettye utca", 11);
        Details newDetails = new Details("Ócsak, lelalkott, büdös",newAddress, 12,1);

        ad1.setDetails(newDetails);
        System.out.println(ad1);
    }
}
