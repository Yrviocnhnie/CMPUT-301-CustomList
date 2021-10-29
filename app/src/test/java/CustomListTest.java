import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private static CustomList list;
    @BeforeAll
    public static void createList(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        City c = new City("Edmonton", "AB");

        int size = list.getCount();
        list.addCity(c);
        assertEquals(list.getCount(),size+1);
    }

    @Test
    public void hasCityTest(){
        City c = new City("Edmonton", "AB");
        list.addCity(c);
        assertTrue(list.hasCity(c));
    }

    @Test
    public void testDelete(){
        City c1 = new City("Edmonton", "AB");
        list.addCity(c1);

        list.delete(c1);
        assertFalse(list.hasCity(c1));

    }

}
