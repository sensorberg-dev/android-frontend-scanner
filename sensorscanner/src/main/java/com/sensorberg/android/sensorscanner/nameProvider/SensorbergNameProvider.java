package com.sensorberg.android.sensorscanner.nameProvider;

import com.sensorberg.android.sensorscanner.BeaconName;
import com.sensorberg.sdk.cluster.BeaconId;

public class SensorbergNameProvider implements NameProvider{
    @Override
    public boolean provideName(BeaconId beaconId, BeaconName beaconName) {
        if (beaconId.getNormalizedUUIDString().contains("7367672374000000FFFF0000FFFF000")){
            if (beaconName.name == null) {
                beaconName.name = "Sensorberg-Beacon (ID" + beaconId.getUuid().toString().charAt(35) + ")";
            }
            beaconName.manufacturer = "Sensorberg";
            return true;
        }
        return true;
    }
}
