package org.example;

import static org.mockito.Mockito.*;

import org.example.customer.Customer;
import org.example.forSale.ForSale;
import org.example.house.House;
import org.example.producer.Producer;
import org.junit.Test;

public class AppTest 
{
    @Test
    public void testProducerWithNullForSale()
    {
        //given
        ForSale forSale = null;
        Producer producer = mock(Producer.class);
        House house = Client.buildHouse("small", "Kitchen", "small", "Bedroom",
                "small", "Bathroom", "small", "LivingRoom");
        //when

        producer.testProducer(house);

        //then
        verify(producer, times(1)).testProducer(house);
    }

    @Test
    public void testCustomerWithNoWantedItemInForSale()
    {
        //given
        ForSale forSale = null;
        Customer customer = mock(Customer.class);
        House house = Client.buildHouse("medium", "Kitchen", "small", "Bedroom",
                "small", "Bathroom", "small", "LivingRoom");
        //when

        customer.testCustomer(house);

        //then
        verify(customer, times(1)).testCustomer(house);
    }
}
