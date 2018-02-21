package com.bravedroid.lsp.after;

public class SmartPhone implements Phone {
    @Override
    public void dial(int number) {
        if (isLocked()) {
            unlock();
        }
        //some logic and make the needed job to dial the number
    }

    private boolean isLocked() {
        return false;
    }

    private void unlock() {

    }
}
