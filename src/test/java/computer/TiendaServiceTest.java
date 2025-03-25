package computer;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasProperty;
import org.junit.jupiter.api.Test;

public class TiendaServiceTest {
    
@Test
public void whenAddComputador_thenListContainsIt() {
    TiendaService service = new TiendaService();
    service.agregarComputador(new Computador("HP", 8, "Ryzen", "Linux", 1000.0));
    assertThat(service.listarComputadores(), hasItem(hasProperty("marca", is("HP")))); 
}
@Test
public void whenDeleteComputador_thenListIsEmpty() {
    TiendaService service = new TiendaService();
    service.agregarComputador(new Computador("Dell", 16, "i7", "Windows", 1500.0));
    assertThat(service.eliminarComputador("Dell"), is(true)); 
    assertThat(service.listarComputadores(), empty());
}

}
