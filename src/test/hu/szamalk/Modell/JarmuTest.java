package hu.szamalk.Modell;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//VÉGE

public class JarmuTest {

    @Test
    public void autoTest() {

        Assertions.assertThrows(NemLetezoAutoException.class, () -> {new Auto("2456777",4,500);});
//        Assertions.assertThrows(NemLetezoAutoException.class, ()-> new Auto("2456777",4,500));
    }

    @Test
    public void autoTestRendszam(){
        Auto a1 = new Auto("12345",4,500);

        Assertions.assertThrows(NemLetezoAutoException.class, () -> {new Auto("12345",4,500);});
    }
}