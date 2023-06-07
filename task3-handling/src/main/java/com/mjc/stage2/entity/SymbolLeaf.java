package com.mjc.stage2.entity;

public class SymbolLeaf extends AbstractTextComponent {

    private final char value;

    public SymbolLeaf(char value, TextComponentType componentType) {
        super(componentType);
        this.value = value;
    }


    @Override
    public String operation() {
        return String.valueOf(value);
    }

    @Override
    public void add(AbstractTextComponent textComponent) {
        throw new UnsupportedOperationException();

    }

    @Override
    public void remove(AbstractTextComponent textComponent) {
        throw new UnsupportedOperationException();

    }

    @Override
    public int getSize() {
        return 0;
    }

    // Write your code here!
}
