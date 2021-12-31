package homework13to18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class StringFilterUpperCaseTest {
    @Test
    public void upperCaseAndSortTest() {
        List<String> collection = new ArrayList<>();
        collection.add("andrew");
        collection.add("Iryna");
        collection.add("Artem");
        collection.add("KATYA");
        collection.add("YULIA");
        //expected
        List<String> expectedList = new ArrayList<>();
        expectedList.add("ANDREW");
        expectedList.add("IRYNA");
        expectedList.add("ARTEM");
        //actual
        collection = StringFilterUpperCase.upperCaseAndSort(collection);
        Assertions.assertEquals(collection, expectedList);
    }
}