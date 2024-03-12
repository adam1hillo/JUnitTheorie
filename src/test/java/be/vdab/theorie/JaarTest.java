package be.vdab.theorie;

import static org.assertj.core.api.Assertions.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JaarTest {

    @Test
    @DisplayName("Een jaar deelbaar door 400 is een schrikkeljaar.")
    void eenJaarDeelbaarDoor400IsEenSchrikkelJaar() {
        Jaar jaar = new Jaar(2000);
        assertThat(jaar.isSchrikkelJaar()).isTrue();
    }
    @Test
    void eenJaarDeelbaarDoor100IsGeenSchrikkelJaar() {
        assertThat(new Jaar(1900).isSchrikkelJaar()).isFalse();
    }
    @Test
    void eenJaarDeelbaarDoor4isEenSchrikkeljaar() {
        assertThat(new Jaar(2012).isSchrikkelJaar()).isTrue();
    }
    @Test
    void eenJaarNietDeelbaarDoor4IsGeenSchrikkelJaar() {
        assertThat(new Jaar(2015).isSchrikkelJaar()).isFalse();
    }
    @Test
    void toStringgeeftHetJaarAlsTekst() {
        assertThat(new Jaar(2015)).hasToString("2015");
    }
    @Test
    void jarenMetHetzelfdeJaartalZijnGelijk() {
        assertThat(new Jaar(2015)).isEqualTo(new Jaar(2015));
    }
    @Test
    void jarenMetEenVerschillendJaartalZijnVerschillend() {
        assertThat(new Jaar(2015)).isNotEqualTo(new Jaar(2016));
    }
    @Test
    void deHashCodeVanGelijkeJarenIsGelijk() {
        assertThat(new Jaar(2015)).hasSameHashCodeAs(new Jaar(2015));
    }

}
