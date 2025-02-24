package hu.szamalk.Modell;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class JarmuTest {

    @Test
    public void autoTest() {
        Auto a1 = new Auto("2456777",4,500);

        Assertions.assertThrows(new NemLetezoAutoException("A jármű nem jött létre"), a1);
    }

    @Test
    public void autoTestRendszam(){
        Auto a1 = new Auto("12345",4,500);

        Assertions.assertThrows(new NemLetezoAutoException("A rendszámnak minimum 6 betűből kell állnia"), a1);
    }
}