package es.uniovi.eii.ds.main.Actions;

import es.uniovi.eii.ds.main.Action;

public class Delete implements Action{
    private StringBuilder text;

    public Delete(StringBuilder text) { 
        this.text = text; 
    }

    @Override
    public void execute(String[] args) {
        int indexOfLastWord = text.toString().trim().lastIndexOf(" ");
			if (indexOfLastWord == -1)
				text = new StringBuilder("");
			else
				text.setLength(indexOfLastWord);
    }

    @Override
    public String syntaxString() {
        return "delete";
    }

    @Override
    public int argsExpected() {
        return 0;
    }
}
