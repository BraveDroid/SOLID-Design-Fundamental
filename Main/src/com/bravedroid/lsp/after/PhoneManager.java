package com.bravedroid.lsp.after;

// Now every client of the PhoneManager will use it to dial() without giving unnecessary additional attention to the type/subType of Phone.
// Respecting the LSP will ensure the respect of the OCP, as if anyone wants to add new extension to the program
// he have only to add a new type implementing the Phone interface and doing the needed job using the one of the most powerful feature of polymorphism.

public class PhoneManager {
    private int phoneNumber;

    public void dial(Phone phone) {
        phone.dial(phoneNumber);
    }
}
