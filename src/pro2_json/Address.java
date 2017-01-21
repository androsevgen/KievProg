package pro2_json;

/**
 * Created by admin on 18.12.2016.
 */
public class Address {
    private Object address;

    @Override
    public String toString() {
        return "Address{" +
                "address=" + address +
                '}';
    }

    public Address() {
    }

    public Object getAddress() {
        return address;
    }

    public void setAddress(Object address) {
        this.address = address;
    }
}
