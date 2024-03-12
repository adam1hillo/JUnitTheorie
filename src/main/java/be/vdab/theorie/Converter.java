package be.vdab.theorie;

import java.math.BigDecimal;

class Converter {
    private static final BigDecimal AANTAL_CENTIMETER_IN_EEN_INCH = BigDecimal.valueOf(2.54);

    BigDecimal inchesNaarCentimeters (BigDecimal inches) {
        return inches.multiply(AANTAL_CENTIMETER_IN_EEN_INCH);
    }
}
