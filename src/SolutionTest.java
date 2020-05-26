import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    Solution solution;

    @Before
    public void setup(){
        solution = new Solution();
    }
    
    @Test
    public void expandNumber() {
        assertEquals("70000 + 300 + 4", solution.expandedForm("70304"));
        assertEquals("40 + 2", solution.expandedForm("42"));
    }
}