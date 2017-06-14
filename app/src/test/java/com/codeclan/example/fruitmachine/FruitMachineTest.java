package com.codeclan.example.fruitmachine;

import org.junit.Before;
import org.junit.Test;
import org.mockito.*;
import static org.junit.Assert.*;

public class FruitMachineTest {
    FruitMachine fruitMachine;
    FruitMachine spyFruitMachine;

    @Before
    public void before(){
        fruitMachine = new FruitMachine();
        spyFruitMachine = Mockito.spy(fruitMachine);
    }

    @Test
    public void testSpin() {
        // Whenever the fruit machine gets a random symbol, return Symbol.JACKPOT instead
        Mockito.when(spyFruitMachine.getRandomSymbol()).thenReturn(Symbol.JACKPOT);

        // Now our spyFruitMachine should always roll a jackpot!
        assertEquals(10, spyFruitMachine.spin());
    }
}