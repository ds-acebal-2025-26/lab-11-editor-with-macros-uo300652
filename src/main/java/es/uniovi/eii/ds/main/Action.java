package es.uniovi.eii.ds.main;

public interface Action {
    void execute(String[] args);
    String syntaxString();
    int argsExpected();
} 

