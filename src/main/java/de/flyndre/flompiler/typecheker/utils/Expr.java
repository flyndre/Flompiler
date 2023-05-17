package de.flyndre.flompiler.typecheker.utils;

public class Expr {
    public String name;
    public ExprType type;

    public Expr(String name, ExprType type){
        this.name = name;
        this.type = type;
    }
}
