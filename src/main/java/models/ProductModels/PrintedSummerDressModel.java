package models.ProductModels;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class PrintedSummerDressModel {

    @Builder.Default
    public static String Name = "Printed Summer Dress";

    @Builder.Default
    public static String Categories = "Dresses";

    @Builder.Default
    public static String Color = "Yellow";

    @Builder.Default
    public static String Composition = "Polyester";

    @Builder.Default
    public static String Style = "Girly";

    @Builder.Default
    public static String Availability = "In stock";

    @Builder.Default
    public static String Condition = "New";

}


