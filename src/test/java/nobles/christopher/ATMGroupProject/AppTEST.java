package nobles.christopher.ATMGroupProject;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by christophernobles on 9/17/16.
 */
public class AppTEST {
     App app = new App();

    @Test
    public void startTEST () {
        boolean expectedValue = true;
        boolean actualValue = app.start();
        assertEquals("The value should be true" , expectedValue , actualValue);

    }
}
