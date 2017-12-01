package sprint2;

public class MainSprint2 {

	/*args[0] = fichier d'entrée args[1] = fichier de sortie*/
	public static void main(String args[]){
		
		GeneratorSymbolTable genTs = GeneratorSymbolTable.getInstance();
		if(args.length == 0){
			genTs.init("input.wh", "output.go");
		}
		else{
			genTs.init(args[0], args[1]);
		}
	}
	
}
