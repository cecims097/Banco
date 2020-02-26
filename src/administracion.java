/*ADMINISTRACIÓN (Apartado para crear usuario)
	Crear usuario
		Nombre completo
		Nip
		Numero de tarjeta
		Fondos iniciales

CAJERO ()
	Validacion de tajeta con NIP
	Visualizacion de fondos
	Retiro de fondos
		Validación de fondos (Verificar que los fondos sean suficientes)
	Deposito de dinero (Sumar dinero a la cantidad actualidad)
	¿Deseas realizar otra transacción?		
	Cerrar sesión */

import com.db4o.Db4o;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

public class administracion {
    
    private ObjectContainer db = null;
    
    private void abrirRegistro(){
        db = Db4oEmbedded.openFile("registrousuarios");
    }
    
    private void cerrarRegistro(){
        db.close();
    }
    
    public void insertarRegistro(persona p){
        abrirRegistro();
        db.store(p);
        cerrarRegistro();
    }
    
    public persona seleccionarPersona(persona p){
        abrirRegistro();
        ObjectSet resultado = db.queryByExample(p);
        persona persona = (persona) resultado.next();
        cerrarRegistro();
        return persona;
    }
    
    public void actualizacionPersona(int tarjeta, float fondo){
        abrirRegistro();
        persona p = new persona();
        p.setNumTarjeta(tarjeta);
        ObjectSet resultado = db.queryByExample(p);
        persona preresultado = (persona) resultado.next();
        preresultado.setFondos(fondo);
        db.store(preresultado);
        cerrarRegistro();
    }
}
