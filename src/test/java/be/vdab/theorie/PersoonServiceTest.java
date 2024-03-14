package be.vdab.theorie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PersoonServiceTest {
    private PersoonService service;

    @BeforeEach
    void beforeEach() {
        service = new PersoonService(new PersoonRepositoryStub());
    }
    @Test
    void deWeddeStandaardAfwijkingIs2() {
        assertThat(service.standaardAfwijkingWeddes()).isEqualByComparingTo("2");
    }
}