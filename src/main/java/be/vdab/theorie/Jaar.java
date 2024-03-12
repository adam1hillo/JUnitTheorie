package be.vdab.theorie;

import java.util.Objects;

class Jaar {

    private final int jaar;

    Jaar(int jaar) {
        this.jaar = jaar;
    }

    boolean isSchrikkelJaar() {
        return jaar % 4 == 0 && jaar % 100 != 0 || jaar % 400 == 0;
    }

    @Override
    public String toString() {
        return String.valueOf(jaar);
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof Jaar anderJaar && jaar == anderJaar.jaar;
    }

    @Override
    public int hashCode() {
        return jaar;
    }
}
