package review.equals.address;

public class Address {
    private String Value;

    public Address(String value) {
        Value = value;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        Value = value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "Value='" + Value + '\'' +
                '}';
    }
}
