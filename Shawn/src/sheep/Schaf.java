package sheep;
/**
 * Class represent the parts of bodyshape.
 * @author sr/12.12.2014 creation
 */
public class Schaf {		

	// Die Koerperteile werden durch diverse Ellipsen repraesentiert
    private Ellipse Rumpf;			
    private Ellipse Schwanz;		
    private Ellipse Bein1;
    private Ellipse Bein2;
    private Ellipse Bein3;
    private Ellipse Bein4;
    private Ellipse Kopf;
    private Ellipse Ohr1;
    private Ellipse Ohr2;
    private Ellipse Auge1;
    private Ellipse Auge2;
    private Ellipse Pupille1;
    private Ellipse Pupille2;
    private Ellipse Nasenloch1;
    private Ellipse Nasenloch2;

    /*
     * Der Konstruktor erzeugt alle Ellipsen(siehe class Ellipsen), die zur Darstellung des Schafes erforderlich sind.
     * Bezugspunkt ist der Rumpf.
     * @param x X-Koordinate der Position des Schafes
     * @param y Y-Koordinate der Position des Schafes
     */
    Schaf(int x, int y) {	
 
        Rumpf	 	= new Ellipse(180, 120, x, y, "blue");
        Schwanz 	= new Ellipse(20, 50, 344, 160, "red"); 
        Bein1	 	= new Ellipse(20, 80, 200, 190, "red");
        Bein2	 	= new Ellipse(20, 80, 175, 180, "red");
        Bein3	 	= new Ellipse(20, 80, 320, 190, "red");
        Bein4	 	= new Ellipse(20, 80, 295, 180, "red");
        Kopf	 	= new Ellipse(80, 120, 110, 60, "red");
        Ohr1	    = new Ellipse(50, 20, 75, 70, "black");
        Ohr2	    = new Ellipse(50, 20, 176, 70, "black");
        Auge1	    = new Ellipse(20, 20, 120, 91, "white");
        Auge2	    = new Ellipse(20, 20, 160, 91, "white");
        Pupille1	= new Ellipse(8, 8, 126, 98, "black");
        Pupille2	= new Ellipse(8, 8, 166, 98, "black");
        Nasenloch1	= new Ellipse(10, 10, 130, 144, "black");
        Nasenloch2	= new Ellipse(10, 10, 160, 144, "black");
    } // Schaf

    /**
     * method to draw the sheep.
     */
    void draw() {			
        Schwanz.draw();
        Bein2.draw();
        Bein4.draw();
        Rumpf.draw(); 
        Bein1.draw();
        Bein3.draw();
        Kopf.draw();
        Ohr1.draw();
        Ohr2.draw();
        Auge1.draw();
        Auge2.draw();
        Pupille1.draw();
        Pupille2.draw();
        Nasenloch1.draw();
        Nasenloch2.draw();
    } // draw
} // class Schaf
