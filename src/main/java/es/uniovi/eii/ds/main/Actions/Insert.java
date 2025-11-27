package es.uniovi.eii.ds.main.Actions;

import es.uniovi.eii.ds.main.Action;

public class Insert implements Action{

    private StringBuilder text;

    public Insert(StringBuilder text) { 
        this.text = text; 
    }

    @Override
    public void execute(String[] args) {
        for (String word : args) {
			text.append(" ").append(word);
		}
    }

    @Override
    public String syntaxString() {
        return "insert <wordToInsert>";
    }

    @Override
    public int argsExpected() {
        return 1;
    }
    
}
