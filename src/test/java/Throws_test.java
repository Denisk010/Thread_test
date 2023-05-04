import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Main;

public class Throws_test {
    @Test
    public void inputSameLengtth() throws Exception {
        String comparableTexts="Ivanov Ivan22";
        Boolean expect = true;
        Boolean result = Main.sameLength(comparableTexts);
        Assertions.assertEquals(expect, result);
    }

    @Test
    public void inputNotSameLength() throws Exception {
        String comparableTexts="Ivanov Ivan";
        Boolean expect = false;
        Boolean result = Main.sameLength(comparableTexts);
        Assertions.assertEquals(expect, result);
    }
    @Test
    public void inputDifferWords() {
        String comparableTexts="Ivanov Ivan Petrovich";
        Assertions.assertThrows(Exception.class,() -> {
            Main.sameLength(comparableTexts);
        });
    }

}
