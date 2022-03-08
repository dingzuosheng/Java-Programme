package App;

import Connection.MQTTServerConnector;
import Pojo.Sensor;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttSecurityException;

import java.util.ArrayList;
import java.util.List;
/*
 * MQTT-Server login und connect with Sensor
 */
public class Datenverarbeitung {

    private MQTTServerConnector clientMqttServer;
    private List<Sensor>  sensors;

    private static final String MQTT_SERVER_HOST = "tcp://compress.seelab.fh-dortmund.de:1883";
    private static final String MQTT_SERVER_USERNAME = "swt2";
    private static final String MQTT_SERVER_PASSWORD = "sose2021";

    public Datenverarbeitung(){
        sensors = new ArrayList<Sensor>();
    }

    public void addSensors(final Sensor sensor){
        sensors.add(sensor);
    }
    /*
     * all sensors connect with MQTT-Server
     */
    public void connectToMQTTServer(){
        if(sensors == null | sensors.isEmpty()){
            return;
        }
        for(Sensor sensor: sensors){
            clientMqttServer = new MQTTServerConnector(MQTT_SERVER_HOST,sensor.getId());
            try{
                clientMqttServer.connectToServer(MQTT_SERVER_USERNAME,MQTT_SERVER_PASSWORD);
            }catch(MqttSecurityException e){
                System.err.println("Connection could not be established due to : "+e.getClass().getName()+"-"+e.getMessage());
            }catch(MqttException e){
                System.err.println("Client has return an error due to : "+e.getClass().getName()+"-"+e.getMessage());
            }
        }
    }

    public void databaseAccess(){
        //TODO: MySQL database logic
    }

}
