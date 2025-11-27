package es.uniovi.eii.ds.main.Actions;

import es.uniovi.eii.ds.main.Action;

public class Replace implements Action{

    private StringBuilder text;

    public Replace(StringBuilder text) { 
        this.text = text; 
    }

    @Override
    public void execute(String[] args) {
        String find = args[0];
		String replace = args[1];
		text = new StringBuilder(text.toString().replace(find, replace));
    }

    @Override
    public String syntaxString() {
        return "replace <oldWord> <newWord>";
    }

    @Override
    public int argsExpected() {
        return 2;
    }
    
}
