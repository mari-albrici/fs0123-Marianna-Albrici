package bed30.Factory.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Probe implements ProcessControl{
    private int id;
    private double lat;
    private double lon;
    private int smokeLevel;
    private String controlCentreUrl;

    public Probe(int id, double lat, double lon, int smokeLevel, String controlCentreUrl) {
        this.id = id;
        this.lat = lat;
        this.lon = lon;
        this.smokeLevel = smokeLevel;
        this.controlCentreUrl = controlCentreUrl;
    }

    @Override
    public double getLatitude() {
        return lat;
    }

    @Override
    public double getLongitude() {
        return lon;
    }

    @Override
    public int getSmokeLevel() {
        return smokeLevel;
    }

    @Override
    public void sendAlarm() {
        if (smokeLevel > 5) {
            String url = controlCentreUrl + "?idsonda=" + id + "&lat=" + lat + "&lon=" + lon + "&smokelevel=" + smokeLevel;
            System.out.println("!!! ALARM !!! - PROBE ID: " + id + " LATITUDE: " + lat + "| LONGITUDE: " + lon + "| SMOKE LEVEL: " + smokeLevel + "|| URL: " + url);
        }
    }
}
