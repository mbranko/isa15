package isa15.pr01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Rucno kreira Spring kontekst i instancira bean na osnovu XML konfiguracije.
 */
public class Primer01 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
            "META-INF/login.xml");
        LoginBean login = ctx.getBean(LoginBean.class);
        boolean status = login.login("pera", "qwerty123");
        System.out.println(status);
        ctx.close();
    }
}