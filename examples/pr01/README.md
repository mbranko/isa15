ISA 2015 primer 01
==================

Potreban softver
----------------

### JDK 1.8 ###

Za projekat koristimo JDK minimalno u verziji 1.8.

### Gradle ###

[Gradle](http://www.gradle.org) je novi build sistem koji bi trebalo da nasledi
Ant i Maven, a da pri tome bude jednostavniji za korišćenje. Gradle se
instalira prema uputstvu sa svog sajta.

### Eclipse ili IntelliJ IDEA ###

Možemo koristiti Eclipse (napunjen pluginovima za Subversion, Gradle, TestNG i
još 100 drugih stvari) ili IntelliJ IDEA (koji sve pakuje sa sobom).

Layout projekta
---------------

Raspored fajlova u projektu se oslanja na default raspored koji koristi Gradle,
a koji je najvećim delom preuzet od Mavena. Na taj način build skript ostaje
jednostavan.

Bildovanje projekta
-------------------

U konzoli se treba pozicionirati u root direktorijum projekta. Čišćenje
direktorijuma od svih nusproizvoda dobija se pomoću:

    $ gradle clean

Pokretanje svih testova:

    $ gradle test

Pravljenje jar fajla:

    $ gradle jar

Pokretanje programa:

    $ gradle jar

Gradle će povući sve potrebne biblioteke preko weba i upakovati ih tamo gde
treba.
