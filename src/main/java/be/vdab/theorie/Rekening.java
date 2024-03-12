package be.vdab.theorie;

import java.math.BigDecimal;

class Rekening {

    private BigDecimal saldo = BigDecimal.ZERO;
    void stort(BigDecimal bedrag) {
        if (bedrag.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Bedrag moet positief zijn");
        }
        saldo = saldo.add(bedrag);
    }
    BigDecimal getSaldo() {
        return saldo;
    }
}
