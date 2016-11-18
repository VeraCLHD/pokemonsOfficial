package pokemon.ui;
 
import java.util.ArrayList;
import java.util.List;
 
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
 
import pokemon.Pokemon;
import pokemon.Swap;
import pokemon.Trainer;
import pokemon.Type;
import pokemon.Competition;
import pokemon.ui.TrainerUI;
 
/**
 * @author paul
 *
 */
public class PokemonTrainerManager {
    /***/
    private static List<Trainer> trainers = new ArrayList<Trainer>();
    /**
     * @param args
     */
    public static void main(String[] args) {
        // create  a SWT window
        Display display = new Display();
        Shell shell = new Shell(display);
        TrainerUI  pui = new TrainerUI(shell, createTrainers());
        pui.open();
       }
     
    private static List<Trainer> createTrainers(){
    	Trainer t0 = new Trainer("Peter", "Lustig");
    	Trainer t1 = new Trainer("Alisa", "Traurig");
		//Trainer trainer3 = new Trainer("Ian", "G.");
		//Trainer trainer4 = new Trainer("James", "H.");
		
		
    	Pokemon p0 = new Pokemon("Pikachu", Type.Poison);
    	Pokemon p1 = new Pokemon("Carapuce", Type.Water);
    	Pokemon p2 = new Pokemon("Raupy", Type.Fire);
    	
    	
    	trainers.add(t0);
        trainers.add(t1);
        
        p0.setTrainer(t0);
        p1.setTrainer(t1);
        p2.setTrainer(t1);
    	
        Swap swap1 = new Swap();
        p0.getSwaps().add(swap1);
        try {
			swap1.execute(p0, p1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        Swap swap2 = new Swap();
        p1.getSwaps().add(swap2);
        try {
			swap2.execute(p1, p0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        Swap swap3 = new Swap();
        p0.getSwaps().add(swap3);
        try {
			swap3.execute(p0, p1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        Swap swap4 = new Swap();
        p1.getSwaps().add(swap4);
        try {
			swap4.execute(p1, p0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
      
        Competition competition1 = new Competition();
        try {
			competition1.execute(p0, p1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        
        return trainers;
    }
}
