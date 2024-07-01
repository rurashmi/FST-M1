package activities;

import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;

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
}
