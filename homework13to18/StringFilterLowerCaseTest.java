package homework13to18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class StringFilterLowerCaseTest {

    @Test
    public void lowerCaseAndSortTest() {
        List<String> collection = new ArrayList<>();
        collection.add("noah");
        collection.add("ARTUR");
        collection.add("bogdan");
        collection.add("deni");
        collection.add("semen");
        collection.add("artem");
        //expected
        List<String> expectedList = new ArrayList<>();
        expectedList.add("noah");
        expectedList.add("deni");
        //actual
        collection = StringFilterLowerCase.lowerCaseAndSort(collection);
        Assertions.assertEquals(expectedList, collection);
    }

}