package de.flyndre.flompiler.typecheker.utils;

public class LocalVar {
    public String type;
    public int location;

    public LocalVar(String type, int location){
        this.type = type;
        this.location = location;
    }
}
