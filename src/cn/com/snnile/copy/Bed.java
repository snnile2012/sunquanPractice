package cn.com.snnile.copy;

public class Bed implements Cloneable {

    private String bedName;

    public String getBedName() {
        return bedName;
    }

    public void setBedName(String bedName) {
        this.bedName = bedName;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "bedName='" + bedName + '\'' +
                '}';
    }

    @Override
    public Bed clone() {
        try {
            Bed clone = (Bed) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
