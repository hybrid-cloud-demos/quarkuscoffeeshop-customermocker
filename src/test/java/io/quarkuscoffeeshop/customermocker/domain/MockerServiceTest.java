package io.quarkuscoffeeshop.customermocker.domain;

import io.quarkuscoffeeshop.domain.OrderInCommand;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkuscoffeeshop.customermocker.domain.CustomerMocker;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
public class MockerServiceTest {


    @Inject
    CustomerMocker customerMocker;

    Jsonb jsonb = JsonbBuilder.create();

    @Test
    public void testCustomerMocker() {

        List<OrderInCommand> createOrderCommands = customerMocker.mockCustomerOrders(15);
        assertEquals(15, createOrderCommands.size());

        createOrderCommands.forEach(createOrderCommand -> {
            System.out.println(jsonb.toJson(createOrderCommand));
        });
    }
}
