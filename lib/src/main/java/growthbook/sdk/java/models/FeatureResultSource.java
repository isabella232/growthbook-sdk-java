package growthbook.sdk.java.models;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Nullable;

/**
 * An enum of the possible sources for the feature result
 */
public enum FeatureResultSource {
    /**
     * When the feature is unknown
     */
    @SerializedName("unknownFeature") UNKNOWN_FEATURE("unknownFeature"),

    /**
     * When the value is assigned due to a default value condition
     */
    @SerializedName("defaultValue") DEFAULT_VALUE("defaultValue"),

    /**
     * When the value is assigned due to a forced condition
     */
    @SerializedName("force") FORCE("force"),

    /**
     * When the value is assigned due to an experiment condition
     */
    @SerializedName("experiment") EXPERIMENT("experiment"),
    ;
    private final String rawValue;

    FeatureResultSource(String rawValue) {
        this.rawValue = rawValue;
    }

    @Override
    public String toString() {
        return this.rawValue;
    }


    /**
     * Get a nullable enum Operator from the string value. Use this instead of valueOf()
     * @param stringValue string to try to parse as an operator
     * @return nullable Operator
     */
    public static @Nullable FeatureResultSource fromString(String stringValue) {
        for (FeatureResultSource o : values()) {
            if (o.rawValue.equals(stringValue)) {
                return o;
            }
        }

        return null;
    }
}