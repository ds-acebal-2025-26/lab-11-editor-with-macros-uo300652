package es.uniovi.eii.ds.main;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }
	
	// Main program loop.
    public void run() {
		new Editor().execute();
	}
	

	//$-- Auxiliary methods ---------------------------------------------------

	// YOU DON'T NEED TO UNDERSTAND OR MODIFY THE CODE BELOW THIS LINE



    // Prompts the user and reads a line of input and returns it as a record with
	// the command and its arguments. If EOF is reached (i.e., there are nothing to
	// read), an error occurs or the user types "exit", the program exits. If there
	// are no arguments, the args array is empty.
	//
	// Example:
	//
	//   > insert "no quiero acordarme" --> returns UserInput("insert", ["no", "quiero", "acordarme"])
	//	 > delete                       --> returns UserInput("delete", [])
	//
	
}
