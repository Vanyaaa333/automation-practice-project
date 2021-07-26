package models.ProductModels;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class FadedShortSleeveTShirtsModel {

    @Builder.Default
    public static String Name = "Faded Short Sleeve T-shirts";

    @Builder.Default
    public static String Categories = "Tops";

    @Builder.Default
    public static String Color = "Orange";

    @Builder.Default
    public static String Composition = "Cotton";

    @Builder.Default
    public static String Style = "Casual";

    @Builder.Default
    public static String Availability = "In stock";

    @Builder.Default
    public static String Condition = "New";

}

