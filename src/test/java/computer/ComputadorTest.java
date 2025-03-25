package computer;

import org.junit.jupiter.api.Test;

public class ComputadorTest {
   
@Test
public void whenCreateComputador_thenPropertiesSetCorrectly() {
    Computador pc = new Computador("Dell", 16, "i7", "Windows", 1500.0);
    assertThat(pc.getMarca(), is("Dell")); // Fails: Class doesn't exist
}

}
