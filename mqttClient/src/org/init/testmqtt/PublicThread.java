package org.init.testmqtt;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttSecurityException;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

class PublicThread extends Thread{
	
//  final String topic;
 
  @Override
  public void run(){

          try {
			String endpoint = "ssl://initendpoint.mqtt.iot.gz.baidubce.com:1884"; 
			  String username = "initendpoint/thingclient002"; 
			  String password = "vywWu0gtUh+T7jYg7cD3gb5L+cnjcHhrtV5Gg4zuOuQ=";
			  String topic = "PublicMessage"; 
			
			  
				TrustManagerFactory tmf = TrustManagerFactory.getInstance("X509");
				tmf.init((KeyStore)null);
				TrustManager[] trustManagers = tmf.getTrustManagers();

				SSLContext ctx = SSLContext.getInstance("TLS");
				ctx.init(null, trustManagers, null);

				MqttConnectOptions options = new MqttConnectOptions();
				options.setCleanSession(false);
				options.setUserName(username);
				options.setPassword(password.toCharArray());
				options.setSocketFactory(ctx.getSocketFactory());
				
				options.setKeepAliveInterval(5);
//				options.setKeepAliveInterval(1);
				 int a=options.getKeepAliveInterval();
				int b= options.getConnectionTimeout();
				 System.out.println(a+","+b);
				
				MqttClient sampleClient = new MqttClient(endpoint, "thingclient002-2"); 
				
				sampleClient.connect(options);
			  System.out.println("Connecting to broker: ");
			  //connOpts.setKeepAliveInterval(5);
			  for (int i = 0; i <10; i++) {
				try {
					  sampleClient.publish(topic, "返回成功".getBytes(),1,true);
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			  sampleClient.disconnect();
		} catch (KeyManagementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (KeyStoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MqttSecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MqttException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      
  }
}