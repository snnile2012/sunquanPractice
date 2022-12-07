package cn.com.snnile.copy;

public class Main {

    public static void main(String[] args) {
        House houseA = new House();
        houseA.setHouseName("houseA");

        Room roomA = new Room();
        roomA.setRoomName("roomA");

        Bed bedA = new Bed();
        bedA.setBedName("bedA");

        roomA.setBed(bedA);
        houseA.setRoom(roomA);

        System.out.println(houseA);

        House houseB = houseA.clone();
        System.out.println(houseB);

        houseA.setHouseName("houseA--");
        roomA.setRoomName("roomA--");
        bedA.setBedName("bedA--");
        System.out.println(houseA);
        System.out.println(houseB);
    }

}
