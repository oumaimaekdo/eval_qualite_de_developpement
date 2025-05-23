package com.example.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestStatistique {
    private Statistique stat;

    @BeforeEach
    public void init() {
        this.stat = new Statistique();
    }

    @Test
    public void whenCalculatingAverageOfSeventyAndNinety_ShouldReturnEighty() {
        assertEquals(80, stat.moyenne(70, 90));
    }
}