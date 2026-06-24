package Oops.Relationships.HasARelationship.Composition.House;

public class Building {
    int houseno;
    int floor;
    Room r = new Room("Kids",2);

    Building(int houseno,int floor /*,String roomfor,int floorr*/){
        this.houseno = houseno;
        this.floor = floor;
//        this.r = new Room(roomfor,floorr);

    }


    void buildingDetails(){
        System.out.println("Building no: "+this.houseno);
        System.out.println("Building has: "+this.floor);
        r.roomDetails();
    }

}
