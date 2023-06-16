package bed30.Proxy.entities;

import bed30.Proxy.entities.proxys.ControlCentreProxy;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ControlCentre implements ControlCentreProxy {

    private Probe probe;
    private String controlCentreUrl;

    public ControlCentre(Probe probe, String controlCentreUrl) {
        this.probe = probe;
        this.controlCentreUrl = controlCentreUrl;
    }

    @Override
    public void sendAlarm() {
        double lat = probe.getLatitude();
        double lon = probe.getLongitude();
        int smokeLevel = probe.getSmokeLevel();
        int id = probe.getId();

        String url = controlCentreUrl + "?idsonda=" + id + "&lat=" + lat + "&lon=" + lon + "&smokelevel=" + smokeLevel;

        System.out.println("!!! ALARM !!!  - PROBE ID: " + id + " LATITUDE: " + lat + "| LONGITUDE: " + lon + "| SMOKE LEVEL: " + smokeLevel + "| URL: " + url);
    }

    @Override
    public double getLatitude() {
        return probe.getLatitude();
    }

    @Override
    public double getLongitude() {
        return probe.getLongitude();
    }

    @Override
    public int getSmokeLevel() {
        return probe.getSmokeLevel();
    }
}
