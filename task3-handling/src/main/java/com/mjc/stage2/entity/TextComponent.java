package com.mjc.stage2.entity;

import java.util.ArrayList;
import java.util.List;

public class TextComponent extends AbstractTextComponent{
    protected List<AbstractTextComponent> componentList = new ArrayList<>();
    private int size = 0;

    public TextComponent(TextComponentType componentType) {
        super(componentType);
    }

    @Override
    public String operation() {
        StringBuilder stringBuilder = new StringBuilder();
        componentList.forEach(component -> stringBuilder.append(component.operation()));
        return stringBuilder.toString();
    }

    @Override
    public void add(AbstractTextComponent textComponent) {
        this.componentList.add(textComponent);
        size = textComponent.getSize();

    }

    @Override
    public void remove(AbstractTextComponent textComponent) {
        this.componentList.remove(textComponent);
        size = textComponent.getSize();

    }

    @Override
    public int getSize() {
        return componentList.size();
    }
// Write your code here!
}
