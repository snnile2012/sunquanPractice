package cn.com.snnile.copy;

public class Room implements Cloneable {

    private String roomName;

    private Bed bed;


    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomName='" + roomName + '\'' +
                ", bed=" + bed +
                '}';
    }

    @Override
    public Room clone() {
        try {
            Room clone = (Room) super.clone();
            clone.bed = (Bed) clone.getBed().clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
