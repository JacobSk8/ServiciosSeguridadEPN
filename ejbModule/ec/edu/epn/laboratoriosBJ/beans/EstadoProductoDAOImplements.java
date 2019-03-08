package ec.edu.epn.laboratoriosBJ.beans;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import ec.edu.epn.generic.DAO.DaoGenericoImplement;
import ec.edu.epn.laboratorioBJ.entities.Estadoproducto;


/**
 * Session Bean implementation class EstadoProductoDAOImplements
 */
@Stateless
@LocalBean
public class EstadoProductoDAOImplements extends DaoGenericoImplement<Estadoproducto> implements EstadoProductoDAO {

  
    public EstadoProductoDAOImplements() {
       
    }

}
