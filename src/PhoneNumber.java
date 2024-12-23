public class PhoneNumber {
    private String number;
    private String countryCode;
    public PhoneNumber() {
        this.number = "";
        this.countryCode = "";
    }
    public PhoneNumber(String number, String countryCode) {
        setNumber(number);
        this.countryCode = countryCode;
    }
    public String getNumber() {
        return number;
    }
    public String getCountryCode() {
        return countryCode;
    }
    public void setNumber(String number) {
        if (number.length() == 12){
            this.number = number;
        }

    }
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "number='" + number + '\'' +
                ", countryCode='" + countryCode + '\'' +
                '}';
    }
}
