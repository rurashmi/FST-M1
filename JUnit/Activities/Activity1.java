package activities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Activity1 {
    //Test fixtures
    static ArrayList<String> list;
    //Initialize test fixtures before each test method
    @BeforeEach
    void setUp() throws Exception {
      list = new ArrayList<String>();
      list.add("alpha");
      list.add("beta");
    }
    //Test method for insert operation
    @Test
    public void insertTest(){
        assertEquals(2, list.size(), "Wrong size, expected is 2");
        //Add new element
        list.add(2, "charlie");
        assertEquals(3, list.size(), "Wrong size, expected is 3 after addition");
        //Assert each element
        assertEquals("alpha", list.get(0), "Wrong Element");
        assertEquals("beta", list.get(1), "Wrong Element");
        assertEquals("charlie", list.get(2), "Wrong Element");
    }
    @Test
    public void replaceTest(){
        //Replace an element
        list.set(1, "Charlie");
        assertEquals(2, list.size(), "Wrong size, expected is 3 after addition");
        //Assert each element
        assertEquals("alpha", list.get(0), "Wrong Element");
        assertEquals("Charlie", list.get(1), "Wrong Element");
    }
}
