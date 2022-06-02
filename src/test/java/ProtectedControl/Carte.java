package ProtectedControl;

import AccessControl.AccessControl;

public class Carte {
    public void bbb(){
        AccessControl carticica = new AccessControl();
        carticica.metodaPublica();
        //metoda protected nu mai e vizibila in afara pachetului
    }
}
