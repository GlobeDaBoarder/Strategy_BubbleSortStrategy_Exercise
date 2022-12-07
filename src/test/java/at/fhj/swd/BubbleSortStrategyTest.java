package at.fhj.swd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BubbleSortStrategyTest {
    protected SorterFactory factory;

    @BeforeEach
    public void setup() {
        factory = new SorterFactoryStrategyImpl();
    }


    @Test
    public void testFactoryWithNullDirection() {
        assertThrows(IllegalArgumentException.class, () ->
                factory.createSorter(null));
    }

    @Test
    public void testAscending() {
        Sorter bubble = factory.createSorter(SortDirection.ASCENDING);

        int[] result = bubble.sort(7, 3, 19, 123, 2, 13, 3);

        assertEquals("[2, 3, 3, 7, 13, 19, 123]", Arrays.toString(result));
    }

    @Test
    public void testDescending() {
        Sorter bubble = factory.createSorter(SortDirection.DESCENDING);

        int[] result = bubble.sort(7, 3, 19, 123, 2, 13, 3);

        assertEquals("[123, 19, 13, 7, 3, 3, 2]", Arrays.toString(result));
    }
}
