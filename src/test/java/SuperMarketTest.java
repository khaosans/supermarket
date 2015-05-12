import static org.junit.Assert.*;

public class SuperMarketTest {

    @org.junit.Test
    public void testCheckOut() throws Exception {
        assertEquals(SuperMarket.checkOut("ABBACBBAB"), 240);
        assertEquals(SuperMarket.checkOut(""), 0);
        assertEquals(SuperMarket.checkOut("ABBACBBABB"), 290);
        assertEquals(SuperMarket.checkOut("A"), SuperMarket.getPriceOfItemA());
        assertEquals(SuperMarket.checkOut("B"), SuperMarket.getPriceOfItemB());
        assertEquals(SuperMarket.checkOut("C"), SuperMarket.getPriceOfItemC());
        assertEquals(SuperMarket.checkOut("BBBBBB"),4 * SuperMarket.getPriceOfItemB());
    }

    @org.junit.Test
    public void testCheckOut1() throws Exception{
        new SuperMarket(1, 5, 3);
        assertEquals(SuperMarket.checkOut("ABBACBBAB"), 21);
        SuperMarket.setPriceOfItemA(2);
        assertEquals(SuperMarket.checkOut("ABBACBBAB"), 24);
        SuperMarket.setPriceOfItemB(10);
        assertEquals(SuperMarket.checkOut("ABBACBBAB"), 24 + 15);
    }

    @org.junit.Test
    public void testCountLetter() throws Exception {
        assertEquals(SuperMarket.countLetter("AAA", "A"), 3);
        assertEquals(SuperMarket.countLetter("BBBBBBB", "B"), 7);
        assertEquals(SuperMarket.countLetter("BBBBB", "A"), 0);
        assertEquals(SuperMarket.countLetter("CCCC", "C"), 4);
        assertEquals(SuperMarket.countLetter("", "C"), 0);
    }

    @org.junit.Test
    public void testPriceOfB() throws Exception {
        assertEquals(SuperMarket.priceOfB(0), 0);
        assertEquals(SuperMarket.priceOfB(1), SuperMarket.getPriceOfItemB());
        assertEquals(SuperMarket.priceOfB(2), 2 * SuperMarket.getPriceOfItemB());
        assertEquals(SuperMarket.priceOfB(5), 3 * SuperMarket.getPriceOfItemB());
        assertEquals(SuperMarket.priceOfB(6), 3 * SuperMarket.getPriceOfItemB() + SuperMarket.getPriceOfItemB());
        assertEquals(SuperMarket.priceOfB(11), 6 * SuperMarket.getPriceOfItemB() + SuperMarket.getPriceOfItemB());

    }


}