package models.ProductModels;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class PrintedDressModel {

    @Builder.Default
    public static String Name = "Printed Dress";

    @Builder.Default
    public static String Categories = "Dresses";

    @Builder.Default
    public static String Color = "Orange";

    @Builder.Default
    public static String Composition = "Cotton";

    @Builder.Default
    public static String Style = "Girly";

    @Builder.Default
    public static String Availability = "In stock";

    @Builder.Default
    public static String Condition = "New";

}



