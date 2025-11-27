package es.uniovi.eii.ds.main.Actions;

import es.uniovi.eii.ds.main.Action;

public class CommandFactory{   
   private StringBuilder text;

    public CommandFactory(StringBuilder text) {
        this.text = text;
    }



    public Action getCommand(String name) {
        return switch (name) {
            case "open" -> new Open(text);
            case "insert" -> new Insert(text);
            case "delete" -> new Delete(text);
            case "replace" -> new Replace(text);
            case "record" -> new Record();
            default -> null;
        };
    }
}

