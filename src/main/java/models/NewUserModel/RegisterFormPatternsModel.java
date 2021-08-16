package models.NewUserModel;

import lombok.Builder;

import static net.andreinc.mockneat.unit.user.Emails.emails;

public class RegisterFormPatternsModel {

    @Builder.Default
    public static String FirstName = "customer_firstname";;

    @Builder.Default
    public static String LastName = "customer_lastname";

    @Builder.Default
    public static String Password = "passwd";

    @Builder.Default
    public static String AddressFirstName = "firstname";

    @Builder.Default
    public static String AddressLastName = "lastname";

    @Builder.Default
    public static String Address = "address1";

    @Builder.Default
    public static String City = "city";

    @Builder.Default
    public static String State = "id_state";

    @Builder.Default
    public static String PostCode = "postcode";

    @Builder.Default
    public static String Country = "id_country";

    @Builder.Default
    public static String MobilePhone = "phone_mobile";

    @Builder.Default
    public static String HomePhone = "phone";

    @Builder.Default
    public static String Alias = "alias";

    @Builder.Default
    public static String BirthDay = "days";

    @Builder.Default
    public static String BirthMonth = "months";

    @Builder.Default
    public static String BirthYear = "years";

    @Builder.Default
    public static String TitleMr = "id_gender1";

    @Builder.Default
    public static String TitleMs = "id_gender2";

    @Builder.Default
    public static String NewsLetterSignUp = "newsletter";

    @Builder.Default
    public static String ReceiveOffers = "optin";


}
