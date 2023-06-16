package bed30.Observer.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Probe { //PUBLISHER

    private ControlCentre controlCentre;
    private String alarm;

    private int id;
    private double lat;
    private double lon;
    private int smokeLevel;

    public Probe(ControlCentre controlCentre, int id) {
        this.controlCentre = controlCentre;
        this.id = id;
    }

    public void alarmControl(int id, double lat, double lon, int smokeLevel){
        if(smokeLevel >= 5) {
            this.alarm = "!!! ALARM !!! - PROBE ID: " + id + " LATITUDE: " + lat + "| LONGITUDE: " + lon + "| SMOKE LEVEL: " + smokeLevel + "|| URL: http://host/alarm?=idsonda=" + id + "&lat=" + lat + "&lon=" + lon + "&smokelevel=" + smokeLevel;
            controlCentre.receiveAlarm(alarm);
        }
    }

}
