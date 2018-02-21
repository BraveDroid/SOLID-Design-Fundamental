package com.bravedroid.lsp.before;

public class SmartPhone implements Phone {
    @Override
    public void dial(int number) {
        if (isLocked()) {
            return;
        }
        //some logic
    }

    public boolean isLocked() {
        return false;
    }

    public void unlock() {

    }
}
