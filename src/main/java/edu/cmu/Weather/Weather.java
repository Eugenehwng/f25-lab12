package edu.cmu.Weather;

/**
 * Represents the unit scale for length measurements.
 */
enum LengthScale {
    INCHES,
    MILLIMETERS
}

public class Weather {
    private WeatherService weatherService;
    private LengthScale lengthScale;

    /**
     * Sets the length scale for rainfall measurements.
     *
     * @param scale the length scale to use (INCHES or MILLIMETERS)
     */
    public void setLengthScale(LengthScale scale) {
        this.lengthScale = scale;
    }

    /**
     * Retrieves the rainfall measurement over the last 24 hours from the weather service in the preferred scale.
     * The weather service returns measurements in millimeters. This method converts to inches if needed.
     * 
     * @return the rainfall amount in the preferred scale (inches or millimeters)
     */
    public double getRainfall() {
        double wsRainfall = weatherService.getRainfall(); // Returns in millimeters
        if (lengthScale == LengthScale.INCHES) {
            return wsRainfall / 25.4; // Convert millimeters to inches
        } else {
            return wsRainfall; // Return in millimeters
        }
    }
}
