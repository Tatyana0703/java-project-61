package hexlet.code;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        var input = "Tanya";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        InputStream inputStream = System.in;
        System.setIn(in);
        Cli.greet();
        System.setIn(inputStream);

        var actualOutput = out.toString().trim();
        assertThat(actualOutput).isEqualTo("""
            Hello, world!
            What is your name?\s
            Hello, Tanya!""");
    }
}
