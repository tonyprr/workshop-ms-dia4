package com.cacti.workshop.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by desarrollo on 27/08/16.
 */
public class CalculadoraServiceTests {
    @Test
    public  void test_sum() {
        CalculadoraService service = new CalculadoraService();
        assertEquals("La suma de 1 y 2 tiene que ser 3", Integer.valueOf(3), service.sum(1, 2));
    }

    @Test
    public  void test_subs() {
        CalculadoraService service = new CalculadoraService();
        assertEquals("La resta de 2 y 1tiene que ser 1", Integer.valueOf(1), service.subs(2, 1));
    }

}
