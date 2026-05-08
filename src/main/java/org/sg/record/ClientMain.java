package org.sg.record;

public class ClientMain {

    static void main() {
        PMRecord pmRecord = new PMRecord("node1",System.currentTimeMillis(),"BER", 3.4);
        System.out.println(pmRecord.metricName());
    }
}
