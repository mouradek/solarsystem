/**
 * In dieser Klasse werden die physikalischen Objekte beschrieben. 
 * Ein DynamicBody hat folgende Kenngrößen:
 * Masse, Ort, Geschwindigkeit.
 * In der ersten Version sind DynamicBody Kugeln und dementsprechend wird auch der Radius benötigt.
 * Rotationen werden durch einen Vektor beschrieben, deren Richtunhg die Rotationsachse
 * und deren Betrag die Rotationsgeschwindigkeit beschreibt.
 */ 
package solarsystem;

import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

/**
 * @author mourad
 *
 */
public class DynamicBody {
	
	double mmass;
	double mR;
	double mvel[];
	double mpos[];
	double mrot[];
	
	public DynamicBody() {
		//Standard Konstruktor initialisiert mit masse=1 und alle anderen Größen = 0
		DynamicBody(1, new double[] {0,0,0},new double[] {0,0,0}, new double[] {0,0,0});

	}
	
	public DynamicBody(double mass) {
		DynamicBody(mass, new double[] {0,0,0},new double[] {0,0,0}, new double[] {0,0,0});
		
	}

	public DynamicBody(double mass, double[] pos) {
		DynamicBody(mass, pos ,new double[] {0,0,0}, new double[] {0,0,0});

	}

	public DynamicBody(double mass, double[] pos, double[] vel) {
		DynamicBody(mass, pos ,vel, new double[] {0,0,0});
	}

	private void DynamicBody(double mass, double[] pos, double[] vel, double[] rot) {
		mmass = mass;
		mpos = pos;
		mvel = vel;
		mrot = rot;

	}
	
	public void showInfo() {
		System.out.println("Masse: " + mmass + " Radius: " + mR );
		System.out.println("Position: " + Arrays.toString(mpos));
		System.out.println("Geschwindigkeit: " + Arrays.toString(mvel));
		System.out.println("Rotation: " + Arrays.toString(mrot));
	}


}
