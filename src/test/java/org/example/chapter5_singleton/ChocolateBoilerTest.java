package org.example.chapter5_singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChocolateBoilerTest {

    @Test
    public void testBoiler() {
        ChocolateBoiler instance = ChocolateBoiler.getInstance();

        instance.fill();
        instance.boil();
        instance.drain();
    }
}