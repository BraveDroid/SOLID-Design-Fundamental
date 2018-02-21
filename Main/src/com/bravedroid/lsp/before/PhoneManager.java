package com.bravedroid.lsp.before;

//the problem is our phone has the type SmartPhone and it is unlocked then we won't dial
public class PhoneManager {
    private int phoneNumber;

    public void dial(Phone phone) {
        phone.dial(phoneNumber);
    }

    // The PhoneManager2 will try to resolve the problem
    // but by broking the OCP principle as if we want to add a new sub Phone
    // we have to modify the PhoneManger2 class
    // The developer that will use the PhoneManger2 should not guess what SubType of phone should he use, all Phone and their sub types should behave the same.
    public static class PhoneManager2 {
        private int phoneNumber;

        public void dial(Phone phone) {
            if (phone instanceof SmartPhone) {
                final SmartPhone smartPhone = (SmartPhone) phone;
                if (smartPhone.isLocked()) {
                    smartPhone.unlock();
                }
            }
            phone.dial(phoneNumber);
        }
    }
}
