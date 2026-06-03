package day30.practice;

import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {

    @Test
    public void givenDistanceAndTime_ShouldReturnFare() {

        CabInvoiceGenerator invoice =
                new CabInvoiceGenerator();

        double fare =
                invoice.calculateFare(2.0, 5);

        Assert.assertEquals(25.0, fare, 0.0);
    }
}
