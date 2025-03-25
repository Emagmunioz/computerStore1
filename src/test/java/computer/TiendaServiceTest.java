package computer;

import org.junit.jupiter.api.Test;

public class TiendaServiceTest {
    
@Test
public void whenAddComputador_thenListContainsIt() {
    TiendaService service = new TiendaService();
    service.agregarComputador(new Computador("HP", 8, "Ryzen", "Linux", 1000.0));
    assertThat(service.listarComputadores(), hasItem(hasProperty("marca", is("HP")))); // Fails
}

}
