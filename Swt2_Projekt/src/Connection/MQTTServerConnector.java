package Connection;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttSecurityException;


/*
 *  MQTT-Server login
 */
public class MQTTServerConnector {
    private MqttClient client;

    /*
     * MQTT-Server connect with Sensor
     */
    public MQTTServerConnector(final String HOST, final String sensorID ) {
        try {
            client = new MqttClient(HOST,sensorID);
        } catch (MqttException e) {
            System.err.println("Client has return an error due to : "+ e.getClass().getName()+"-"+e.getMessage());
        }
    }
    /*
     * MQTT-Server login
     */
    public void connectToServer(final String username, final String password) throws MqttException, MqttSecurityException {
        MqttConnectOptions connOptions = new MqttConnectOptions();

        connOptions.setUserName(username);
        connOptions.setPassword(password.toCharArray());
        connOptions.setCleanSession(true);
        connOptions.setAutomaticReconnect(true);
        connOptions.setConnectionTimeout(10);

        if(!client.isConnected()){
            client.connect(connOptions);
        }
    }
    /*
     * check if MQTT-Server connects with Client
     */
    public boolean isConnectedClient(){
        return client.isConnected();
    }
    /*
     * MQTT-Server tries to disconnect with Client
     */
    public void disConnectClient(){

        if(client == null) { return; }
        if(!client.isConnected()) {return;}

        try{
            client.disconnect();
        }catch(MqttException e){
            System.err.println("Client could not be disconnected due to : "+e.getClass().getName()+"-"+e.getMessage());
        }
    }

    public void reconnectClient(){
        if(client.isConnected()) return;
        try {
            client.reconnect();
        } catch (MqttException e) {
            System.err.println("Client could not be reconnected due to : "+e.getClass().getName()+"-"+e.getMessage());
        }
    }

    public MqttClient getClient() {
        return client;
    }
}
