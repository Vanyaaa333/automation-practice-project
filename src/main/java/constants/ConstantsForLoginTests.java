package constants;

import utils.PropertiesUtil;

public class ConstantsForLoginTests {

    //Valid credentials
    //-----------------------------------------------------------------------------------------------------------------
    public static final String VALID_EMAIL = PropertiesUtil.getSystemProperty("valid_email");
    public static final String VALID_PASSWORD = PropertiesUtil.getSystemProperty("valid_password");

    //Invalid credentials
    //-----------------------------------------------------------------------------------------------------------------
    public static final String INVALID_EMAIL = "invalidEmail@gmail.com";
    public static final String INVALID_PASSWORD = "invalidPassword";
    public static final String EMPTY_EMAIL_FIELD = "";
    public static final String EMPTY_PASSWORD_FIELD = "";
    public static final String INVALID_EMAIL_SCRIPT = "<script>alert(123)</script>";
    public static final String INVALID_EMAIL_HTML_TAG = "<form action=«http://live.hh.ru»><input type=»submit»></form>";
    public static final String INVALID_EMAIL_DIFFERENT_SYMBOLS = "«♣☺♂» , «»‘~!@#$%^&*()?>,./<][ /*<!—«», «${code}»;—>";
    public static final String EMAIL_WITH_WHITESPACES_TEXT = "       ";

}
