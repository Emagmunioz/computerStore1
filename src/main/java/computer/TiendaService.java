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
}


