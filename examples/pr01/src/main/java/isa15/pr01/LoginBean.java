package isa15.pr01;

/**
 * Bean koji omogucava autentifikaciju u odnosu na dati AuthStore
 * i ispisuje pozdravnu poruku pomocu HelloWorldBeana ukoliko je
 * autentifikacija uspesna.
 */
public class LoginBean { 

    private HelloWorldBean hello;
    private AuthStore authStore;
    
    public void setHello(HelloWorldBean hello) {
        this.hello = hello;
    }

    public void setAuthStore(AuthStore authStore) {
        this.authStore = authStore;
    }

    public boolean login(String username, String password) {
        if (!authStore.check(username, password))
            return false;
        System.out.println(hello.sayHello(username));
        return true;
    }
}
