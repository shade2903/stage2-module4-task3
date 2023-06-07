package com.mjc.stage2.parser;

import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.TextComponentType;
import com.mjc.stage2.entity.SymbolLeaf;

public class LexemeParser extends AbstractTextParser {
    private static final String LEXEME_REGEX = "\\s+";
    private static final String WORD_REGEX = "\\w[\\w!=?():]+";

    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        char[] arr = string.toCharArray();
        for (char elem : arr) {
            abstractTextComponent.add(new SymbolLeaf(elem, TextComponentType.WORD));
        }
    }


    // Write your code here!

}
