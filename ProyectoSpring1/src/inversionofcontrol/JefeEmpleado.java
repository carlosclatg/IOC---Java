package inversionofcontrol;

public class JefeEmpleado implements Empleados {
	
	private CreacionInformes informeNuevo;
	private String email;
	private String nombreEmpresa;
	public JefeEmpleado(CreacionInformes informeNuevo) {
		super();
		this.informeNuevo = informeNuevo;
	}

	public void metodoInicial () {
		//tareas que se ejecutan antes de que el bean est� disponible, abrir sockets...etc.
		System.out.println("Dentro del metodo init, aqui irian las tareas a ejecutar antes de que el bean est� listo");
	}
	
	
	public void metodoFinal () {
		//tareas que se ejecutan antes de que el bean est� disponible, abrir sockets...etc.	
		System.out.println("Dentro del metodo destroy, tareas despues de utilizar el bean");			
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	
	
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestiono tareas relativas a mis empleados";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return "Informe por el jefe con arreglos" + informeNuevo.getInformes();
	}
	
}
