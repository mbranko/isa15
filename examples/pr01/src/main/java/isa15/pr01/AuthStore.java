package isa15.pr01;

/**
 * Interfejs koji predstavlja bean sa razlicitim implementacijama.
 */
public interface AuthStore {
    public boolean check(String username, String password);
}