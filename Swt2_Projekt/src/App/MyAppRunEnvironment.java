package App;

import Pojo.Sensor;

public class MyAppRunEnvironment {

    // {"sensorId":"dd9655f2-d896-47e5-9a0c-4f75b88e1acd","timestamp":1622996508579,"value":11.005581}
    // {"sensorId":"1238e8e3-11d3-42e1-ade7-329b44964c78","timestamp":1622996748579,"value":1.3027453}
    // {"sensorId":"d9b9625a-d8f2-4b1e-a346-3285f56fbcbd","timestamp":1622996778579,"value":58.429115}
	
    public static void main(String[] args) {
    	
        Sensor sensor_1 = new Sensor("dd9655f2-d896-47e5-9a0c-4f75b88e1acd", "Sensor_1");
        Sensor sensor_2 = new Sensor("1238e8e3-11d3-42e1-ade7-329b44964c78", "Sensor_2");
        Sensor sensor_3 = new Sensor("d9b9625a-d8f2-4b1e-a346-3285f56fbcbd", "Sensor_3");

        Datenverarbeitung d = new Datenverarbeitung();
        d.addSensors(sensor_1);
        d.addSensors(sensor_2);
        d.addSensors(sensor_3);

        d.connectToMQTTServer();
        
    }

}
