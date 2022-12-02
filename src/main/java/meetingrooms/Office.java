package meetingrooms;

import java.util.ArrayList;
import java.util.List;

public class Office {

    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(String name, int width, int length) {
        MeetingRoom meetingRoom = new MeetingRoom(name, width, length);
        meetingRooms.add(meetingRoom);
    }

    public List<MeetingRoom> getMeetingRooms() {
        return meetingRooms;
    }

    public List<MeetingRoom> getMeetingRoomsInReverseOrder() {
        List<MeetingRoom> result = new ArrayList<>();
        for (int i = (meetingRooms.size()-1); i >=0 ; i--) {
            result.add(meetingRooms.get(i));
        }
        return result;
    }

    public List<MeetingRoom> getEverySecondMeetingRoom(int inputNumber) {
        List<MeetingRoom> result = new ArrayList<>();
        if (inputNumber == 1) {
            for (int i = 0; i < meetingRooms.size(); i = i + 2) {
                result.add(meetingRooms.get(i));
            }
        }
        if (inputNumber == 2) {
            for (int i = 1; i < meetingRooms.size(); i = i + 2) {
                result.add(meetingRooms.get(i));
            }
        }
        return result;
    }

    public MeetingRoom getMeetingRoomWithGivenName(String inputName) {

        for (MeetingRoom result : meetingRooms) {
            if (result.getName().equals(inputName)) {
                return result;
            }
        }
            return null;
    }

    public List<MeetingRoom> getMeetingRoomWithGivenNamePart(String inputString) {
            List<MeetingRoom> resultList = new ArrayList<>();
        for (MeetingRoom result : meetingRooms) {
            if (result.getName().indexOf(inputString) >=0) {
                resultList.add(result);
            }
        }
        return resultList;
    }
    public List<MeetingRoom> getMeetingRoomWithAreaLargerThan(int sizeRoom) {
        List<MeetingRoom> resultList = new ArrayList<>();
        for (MeetingRoom result : meetingRooms) {
            if (result.getArea()>=sizeRoom) {
                resultList.add(result);
            }
        }
        return resultList;
    }

}