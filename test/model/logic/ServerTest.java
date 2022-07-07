package model.logic;

import by.itstep.nemarskayaanastasiya.examstage.model.entity.Cake;
import by.itstep.nemarskayaanastasiya.examstage.model.entity.Drink;
import by.itstep.nemarskayaanastasiya.examstage.model.entity.PuffPastry;
import by.itstep.nemarskayaanastasiya.examstage.model.entity.container.Order;
import by.itstep.nemarskayaanastasiya.examstage.model.logic.Server;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ServerTest {
    @Test
    public void testCalculateTotalPrice() {
        Cake cake = new Cake("Ellipse", "Poppy & cherry", 9.0, 390.0);
        Drink drink = new Drink("Coffee","Milk",5.0,58.0);
        PuffPastry puffpastry = new PuffPastry("Escargot","Caramel & hazelnuts",6.0, 354.0);
        Order order = new Order();
        order.add(cake);
        order.add(drink);
        order.add(puffpastry);
        System.out.println(order);

        double expected = 20.0;
        double actual = Server.calculateTotalPrice(order);
        assertEquals(expected, actual, 0.001);
    }
}
