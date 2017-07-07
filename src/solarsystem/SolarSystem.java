/**
 * SolarSystem ist die Anwendungsklasse, welche die Methode run() implementiert.
 * Zwei Konstruktoren werden implementiert, um PlanetConfiguration (R0,x0,v0,m0,XYZ0, ...)
 * und Default zu wählen.
 * 
 */
package solarsystem;


/**
 * @author mourad
 * 
 */
public class SolarSystem {
	

	private DynamicBody sonne, erde;
	private RenderEngine render;
	private PhysicsEngine physics;
	
	
	public SolarSystem() {
		sonne = new DynamicBody();
		erde = new DynamicBody(20, new double[] {1,0,0}, new double[] {0,0,1});
	}

	void run() {
		System.out.println("Sonne");
		sonne.showInfo();
		System.out.println("Erde");
		erde.showInfo();
		while(true) {
			
		}
	}

}
