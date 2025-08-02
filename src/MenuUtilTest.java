import util.MenuUtil;
import java.io.ByteArrayInputStream;

public class MenuUtilTest {
    public static void main(String[] args) {
        String input = String.join(System.lineSeparator(),
                "2",       // Choose Terrestrial
                "1",       // Add terrestrial carnivorous
                "lion",
                "5",
                "4",
                "3"        // Exit
        ) + System.lineSeparator();
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        MenuUtil.menu();
    }
}
