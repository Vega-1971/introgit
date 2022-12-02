package references.parameters;

public class ReferencesMain {

    public static void main(String[] args) {

        int number1 = 24;
        int number2 = number1+1;

        Person person1 = new Person("Gábor", 1971);
        Person person2 = person1;

        person2.setAge(1981);

        System.out.println(person1.getName() + " " + person1.getAge());
        System.out.println(person2.getName() + " " + person2.getAge());

        System.out.println(number1);
        System.out.println(number2);

        person2 = new Person("Jancsi", 2000);

        System.out.println(person1.getName() + " " + person1.getAge());
        System.out.println(person2.getName() + " " + person2.getAge());
    }
}
