package isa15.pr01;

/**
 * Implementacija beana koja podatke za autentifikaciju cuva u fajlu.
 */
public class FileAuthStore implements AuthStore {
    public boolean check(String username, String password) {
        if ("pera".equals(username) && password.equals("qwerty123"))
        	return true;
        return false;
    }
}