package bed30.Factory.entities;

public class ProcessControlFactory {
    public static ProcessControl createProbe(int id, double lat, double lon, int smokeLevel, String controlCentreUrl) {
        return new Probe(id, lat, lon, smokeLevel, controlCentreUrl);
    }
}
