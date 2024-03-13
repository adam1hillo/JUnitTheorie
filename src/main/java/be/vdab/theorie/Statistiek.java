package be.vdab.theorie;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

class Statistiek {
    static BigDecimal getGemiddelde(BigDecimal[] getallen) {
        if (getallen.length == 0) {
            throw new IllegalArgumentException("Lege array");
        }
        return Arrays.stream(getallen)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .divide(BigDecimal.valueOf(getallen.length), 2, RoundingMode.HALF_UP);
    }
}
