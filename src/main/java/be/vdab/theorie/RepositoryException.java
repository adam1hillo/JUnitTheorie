package be.vdab.theorie;

class RepositoryException extends RuntimeException {
    RepositoryException(Exception oorzaak) {
        super(oorzaak);
    }
}
