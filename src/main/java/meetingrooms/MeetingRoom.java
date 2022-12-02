package meetingrooms;

public class MeetingRoom {
    private String name;
    private int width;
    private int length;

    public String getName() {
        return name;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public MeetingRoom(String name, int width, int length) {
        this.name = name;
        this.width = width;
        this.length = length;
    }
        public int getArea(){
            int area = width*length;
            return area;
        }

}
