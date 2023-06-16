package bed30.Factory.entities;

public interface ProcessControl {
    double getLatitude();
    double getLongitude();
    int getSmokeLevel();
    void sendAlarm();
}
