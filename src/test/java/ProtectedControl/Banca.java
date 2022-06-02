package ProtectedControl;

import AccessControl.AccessControl;

public class Banca extends AccessControl {
    public void protectedC(){
        metodaProtected();
        metodaPublica();
    }
}
