package com.rcsit.zf;

/**
 * Created by Fun on 2018/4/8.
 */
public class TextEditor {

    private SpellChecker spellChecker;

    private String name;

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void spellCheck(){
        spellChecker.spellCheck();
    }
}
