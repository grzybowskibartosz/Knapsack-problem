package Problem;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProblemTest {

    @Test
    public void testGenerateItems() {
        Problem problem = new Problem(5, 12345L, 10, 1);
        List<Item> items = problem.getItemList();

        assertEquals(5, items.size(), "Should generate 5 items");

        for (Item item : items) {
            assertTrue(item.getWeight() >= 1 && item.getWeight() <= 10, "Weight should be within bounds");
            assertTrue(item.getValue() >= 1 && item.getValue() <= 10, "Value should be within bounds");
        }
    }

    @Test
    public void testSolveKnapsackProblem() {
        Problem problem = new Problem(5, 12345L, 10, 1);
        Wynik wynik = problem.Solve(15);

        assertTrue(wynik.getTotalWeight() <= 15, "Total weight should not exceed capacity");
        assertEquals(4, wynik.getItemCount(), "Number of selected items should be 4");
    }

    @Test
    public void testSolveWithExactFit() {
        Problem problem = new Problem(3, 12345, 10, 10);
        Wynik wynik = problem.Solve(30); // Assuming total weight of all items is <= 30

        assertEquals(3, wynik.getItemCount(), "Should select all items");
        assertEquals(30, wynik.getTotalWeight(), "Total weight should be exactly 30");
    }

    @Test
    public void testSolveWithZeroCapacity() {
        Problem problem = new Problem(5, 12345L, 10, 1);
        Wynik wynik = problem.Solve(0);

        assertEquals(0, wynik.getItemCount(), "No items should be selected");
        assertEquals(0, wynik.getTotalValue(), "Total value should be 0");
        assertEquals(0, wynik.getTotalWeight(), "Total weight should be 0");
    }
}
