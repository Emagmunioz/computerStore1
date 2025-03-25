package computer;
import computer.TiendaService;
import computer.Computador;
public final class App {
    // TiendaApp.java
public void ejecutar() {
    
    tiendaService.agregarComputador(new Computador("Dell", 16, "i7", "Windows", 1500.0));
    tiendaService.agregarComputador(new Computador("HP", 8, "Ryzen", "Linux", 1000.0));
}
   
}
