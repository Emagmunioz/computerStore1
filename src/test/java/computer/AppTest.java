package computer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class AppTest {
    @Test
public void whenEjecutar_thenAddsTwoComputers() {
    TiendaService mockService = mock(TiendaService.class);
    TiendaApp app = new TiendaApp(mockService);
    
    app.ejecutar(); // Fails
    
    verify(mockService, times(2)).agregarComputador(
        argThat(c -> c.getMemoria() > 0)); // Hamcrest + Mockito
}
   
}
