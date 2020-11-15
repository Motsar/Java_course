import java.util.Objects;

public class RegistrationPlate {
    private final String regCode;
    private final String country;

    public RegistrationPlate(String regCode, String country) {
        this.regCode = regCode;
        this.country = country;
    }

    public String toString(){
        return country+ " "+regCode;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        RegistrationPlate compared = (RegistrationPlate) object;
        return regCode.equals(compared.regCode) && country.equals(compared.country);

    }

    public int hashCode() {
        return Objects.hash(regCode, country);
    }
}
