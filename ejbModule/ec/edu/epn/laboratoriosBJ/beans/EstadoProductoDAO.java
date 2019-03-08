package ec.edu.epn.laboratoriosBJ.beans;

import java.util.List;
import javax.ejb.Local;
import ec.edu.epn.laboratorioBJ.entities.Estadoproducto;


@Local
public interface EstadoProductoDAO {

	List<Estadoproducto> listaProducto(String nombreEstp);

}
