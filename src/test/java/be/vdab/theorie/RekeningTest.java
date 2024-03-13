package be.vdab.theorie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import static org.assertj.core.api.Assertions.assertThatNullPointerException;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;


class RekeningTest {
    private Rekening rekening;
    private static final BigDecimal TWEE = BigDecimal.valueOf(2);

    @BeforeEach
    void beforeEach() {
        rekening = new Rekening();
    }
    @Test
    void hetSaldoVanEenNieuwRekeningIs0€() {
        assertThat(rekening.getSaldo()).isZero();
    }
    @Test
    void nadatJe10€StortIsHetSaldo10€() {
        rekening.stort(BigDecimal.valueOf(10));
        assertThat(rekening.getSaldo()).isEqualByComparingTo("10");
    }
    @Test
    void nadatJe10€En1€StortIsHetSaldo11€() {
        rekening.stort(BigDecimal.TEN);
        rekening.stort(BigDecimal.ONE);
        assertThat(rekening.getSaldo()).isEqualByComparingTo("11");
    }

    @Test
    void hetGestorteBedragMagNietNullZijn() {
        assertThatIllegalArgumentException().isThrownBy(
                () -> rekening.stort(BigDecimal.ZERO)
        );
    }
    @Test
    void hetGestorteBedragMagNietNegatiefZijn() {
        assertThatIllegalArgumentException().isThrownBy(
                () -> rekening.stort(BigDecimal.valueOf(-1))
        );
    }
    @Test
    void stortMetNullKanNiet() {
        assertThatNullPointerException().isThrownBy(
                () -> rekening.stort(null)
        );
    }
    @Test
    void eenNieuweRekeningGeeftGeenStortingen() {
        assertThat(rekening.getStortingen()).isEmpty();
    }
    @Test
    void nadatJe10€StortIsErEenStortingVan10€() {
        rekening.stort(BigDecimal.TEN);
        assertThat(rekening.getStortingen()).containsOnly(BigDecimal.TEN);
    }
    @Test
    void nadatJe10€En1€StortZijnErStortingen10€En1€() {
        rekening.stort(BigDecimal.TEN);
        rekening.stort(BigDecimal.ONE);
        assertThat(rekening.getStortingen()).containsExactly(BigDecimal.TEN, BigDecimal.ONE);
    }
    @Test
    void nadatJe10€En1€En2€StortZijnDeStortingenGesorteerd1€2€10€() {
        rekening.stort(BigDecimal.TEN);
        rekening.stort(BigDecimal.ONE);
        rekening.stort(TWEE);
        assertThat(rekening.getStortingnenGesorteerd()).isSorted().containsExactly(
                BigDecimal.ONE, TWEE, BigDecimal.TEN
        );
    }
}