package com.epam.rd.autotasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class QuadraticEquationTwoRootsCasesTesting {
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();
    private double a;
    private double b;
    private double c;
    private String expected;

    public QuadraticEquationTwoRootsCasesTesting(double a, double b, double c, String expected) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, -8, 15, "5.0 3.0"},
                {1, -8, 12, "6.0 2.0"},
                {1, -5, 6, "3.0 2.0"},
                {1, 7, 10, "-2.0 -5.0"}
        });
    }
    @Test
    public void testTwoRootsCase() {
        double x1 = Double.parseDouble(expected.split(" ")[0]);
        double x2 = Double.parseDouble(expected.split(" ")[1]);
        String result = quadraticEquation.solve(a, b, c);
        assertTrue(result.equals(x1 + " " + x2) || result.equals(x2 + " " + x1));
    }
}

