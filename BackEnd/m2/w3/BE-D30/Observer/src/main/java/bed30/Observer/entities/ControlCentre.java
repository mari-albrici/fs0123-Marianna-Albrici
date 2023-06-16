package bed30.Observer.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ControlCentre implements ProcessControl{ //LISTENER

    private List<Probe> probes = new ArrayList<>();

    public void addProbe(Probe probe){
        probes.add(probe);
    }

    public void removeProbe(Probe probe){
        probes.remove(probe);
    }

    @Override
    public void receiveAlarm(String alarm) {
            System.out.println(alarm);
    }
}
