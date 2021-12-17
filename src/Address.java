public class Address {
    private State state;
    private String city;
    private String streetAddress;
    private int zipcode;

    public Address(State state, String city, String streetAddress, int zipcode) {
        this.state = state;
        this.city = city;
        this.streetAddress = streetAddress;
        this.zipcode = zipcode;
    }

    public State getState() {
        return state;
    }
}
