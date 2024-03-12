package be.vdab.theorie;

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
}
