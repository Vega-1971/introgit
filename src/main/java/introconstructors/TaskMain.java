package introconstructors;

public class TaskMain {

    public static void main(String[] args) {

        Task task_1 = new Task("Habverés", "3 tojásfehérje habbá verése");
        task_1.start();

        System.out.println(task_1.getTitle()+"-"+task_1.getDescription()+"-"+ task_1.getStartDateTime());
    }
}
