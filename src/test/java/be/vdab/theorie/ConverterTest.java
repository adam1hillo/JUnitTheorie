package be.vdab.theorie;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void eenInchIs2Komma54Centimeters() {
        assertThat(new Converter().inchesNaarCentimeters(BigDecimal.ONE)).isEqualByComparingTo("2.54");
    }
    @Test
    void zeroInchIs0Centimeters() {
        assertThat(new Converter().inchesNaarCentimeters(BigDecimal.ZERO)).isZero();
    }
    @Test
    void driehonderdInchesIs762Centimeters() {
        assertThat(new Converter().inchesNaarCentimeters(BigDecimal.valueOf(300))).isEqualByComparingTo("762");
    }
}
