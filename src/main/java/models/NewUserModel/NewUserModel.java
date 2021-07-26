package models.NewUserModel;


import lombok.*;


import static net.andreinc.mockneat.types.enums.PassStrengthType.MEDIUM;
import static net.andreinc.mockneat.types.enums.StringType.LETTERS;
import static net.andreinc.mockneat.types.enums.StringType.NUMBERS;
import static net.andreinc.mockneat.unit.address.Cities.cities;
import static net.andreinc.mockneat.unit.companies.Departments.departments;
import static net.andreinc.mockneat.unit.text.Strings.strings;
import static net.andreinc.mockneat.unit.types.Ints.ints;
import static net.andreinc.mockneat.unit.user.Emails.emails;
import static net.andreinc.mockneat.unit.user.Names.names;
import static net.andreinc.mockneat.unit.user.Passwords.passwords;


@Value
@Builder
@AllArgsConstructor
public class NewUserModel {

    @Builder.Default
    @NonNull
    public static String EmailAddress = emails().get();

    @Builder.Default
    public static String FirstName = names().first().get();

    @Builder.Default
    public static String LastName = names().last().get();

    @Builder.Default
    public static String Password = passwords().type(MEDIUM).get();

    @Builder.Default
    public static int BirthDay = ints().range(0, 30).get();

    @Builder.Default
    public static int BirthYear = ints().range(0, 120).get();

    @Builder.Default
    public static int BirthMonth = ints().range(0, 11).get();

    @Builder.Default
    public static String AddressFirstName = names().first().get();

    @Builder.Default
    public static String AddressLastName = names().last().get();

    @Builder.Default
    public static String Address = departments().get();

    @Builder.Default
    public static String City = cities().us().get();

    @Builder.Default
    public static int State = ints().range(0, 49).get();

    @Builder.Default
    public static String ZipCode = strings().size(5).type(NUMBERS).get();

    @Builder.Default
    public static int Country = ints().range(1,2).get();

    @Builder.Default
    public static String MobilePhone = strings().size(9).type(NUMBERS).get();

    @Builder.Default
    public static String HomePhone = strings().size(6).type(NUMBERS).get();

    @Builder.Default
    public static String AddressAlias = strings().size(7).type(LETTERS).get();

}



