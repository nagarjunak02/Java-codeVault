package Oops.Relationships.HasARelationship.Composition.House;

public class Room {
    String roomfor;
    int floor;

    Room(String roomfor,int floor){
        this.roomfor = roomfor;
        this.floor = floor;
    }

    void roomDetails(){
        System.out.println("Room is in "+floor+" floor");
        System.out.println("Room is for "+roomfor);
    }
}
