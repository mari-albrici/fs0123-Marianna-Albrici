package bed30.Proxy.entities;

import bed30.Proxy.entities.proxys.ProbeProxy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.naming.ldap.Control;

@Data
@NoArgsConstructor
public class Probe implements ProbeProxy {

    private int id;
    private double latitude;
    private double longitude;
    private int smokeLevel;

    public Probe(int id, double latitude, double longitude, int smokeLevel) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.smokeLevel = smokeLevel;
    }

    @Override
    public double getLatitude() {
        return latitude;
    }

    @Override
    public double getLongitude() {
        return longitude;
    }

    @Override
    public int getSmokeLevel() {
        return smokeLevel;
    }
}
