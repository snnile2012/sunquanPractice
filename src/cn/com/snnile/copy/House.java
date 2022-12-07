package cn.com.snnile.copy;

public class House implements Cloneable {

    private String houseName;

    private Room room;


    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "House{" +
                "houseName='" + houseName + '\'' +
                ", room=" + room +
                '}';
    }

    @Override
    public House clone() {
        try {
            House clone = (House) super.clone();
            clone.room = (Room) clone.getRoom().clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
