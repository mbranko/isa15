package isa15.pr01;

/**
 * Implementacija beana koja podatke za autentifikaciju cuva u bazi podataka.
 */
public class DbAuthStore implements AuthStore {
    public boolean check(String username, String password) {
        return false;
    }
}