package es.uniovi.eii.ds.main.Actions;

import java.util.ArrayList;
import java.util.List;

import es.uniovi.eii.ds.main.Action;

public class Record implements Action{

    private List<Action> macros;

    public Record()
    {
        this.macros = new ArrayList<Action>();
    }

    private void addMacro(Action action)
    {
        macros.add(action);
    }

    @Override
    public void execute(String[] args) {
        for(Action action : macros)
        {
            action.execute(args);
        }
    }

    @Override
    public String syntaxString() {
        return "record <nameMacro>";
    }

    @Override
    public int argsExpected() {
        return 1;
    }
    
}
