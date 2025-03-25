package computer;
import java.util.ArrayList;
import java.util.List;

public class TiendaService {
    
    private final List<Computador> computadores = new ArrayList<>();
    public void agregarComputador(Computador pc) {
        computadores.add(pc);
    }
    public List<Computador> listarComputadores() {
        return computadores;
    }
    public boolean eliminarComputador(String marca) {
        return computadores.removeIf(c -> c.getMarca().equals(marca));
    }
    public Computador buscarComputador(String marca) {
        return computadores.stream()
                .filter(c -> c.getMarca().equals(marca))
                .findFirst()
                .orElse(null);
    }
}


