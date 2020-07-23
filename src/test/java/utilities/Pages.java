package utilities;

import PageObject.*;


public class Pages {

    public CSHomePage csHomePage;
    public CSSignUp csSignUp;
    public  CSProfile csProfile;

    public Pages() {

        csHomePage=new  CSHomePage();
        csSignUp=new CSSignUp();
        csProfile=new CSProfile();

    }
}
