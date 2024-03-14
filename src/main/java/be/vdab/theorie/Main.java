package be.vdab.theorie;

import java.math.BigDecimal;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PersoonRepository persoonRepository = new PersoonRepository();
        List<BigDecimal> weddes = persoonRepository.findAllWeddes();
        System.out.println(weddes.stream().min(BigDecimal::compareTo).orElse(BigDecimal.ZERO));
    }
}
