package org.init.testmqtt;
import java.security.KeyStore;

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
import org.init.db.DatabaseThread;
import org.init.utils.Stringutils;

class SubscribeThread extends Thread{
	
//  final String topic;
 
  @Override
  public void run(){

          try {
        	  DatabaseThread databaseThread = new DatabaseThread();
       	  Thread dbthread =  new Thread(databaseThread);
      //  	  dbthread.setDaemon(true);
       	  dbthread.start();
			String endpoint = "ssl://initendpoint.mqtt.iot.gz.baidubce.com:1884";   
			  String username = "initendpoint/thingclient002"; 
			  String password = "vywWu0gtUh+T7jYg7cD3gb5L+cnjcHhrtV5Gg4zuOuQ=";  
			  String topic = "PublicMessage"; 
	//		  MemoryPersistence persistence = new MemoryPersistence();
			  
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
				 int a=options.getKeepAliveInterval();
				int b= options.getConnectionTimeout();
				 System.out.println(a+","+b);
				
				MqttClient sampleClient = new MqttClient(endpoint, "thingclient002"); 
				
			
			  System.out.println("Connecting to broker: ");
			  sampleClient.setCallback(new MqttCallback() {
			      @Override
			      public void connectionLost(Throwable throwable) {
			          System.out.println("connectionLost+1234");
			          try {
			              sampleClient.connect(options);
			              
			              sampleClient.subscribe(topic,1);
			          }catch (MqttException e){
			              e.printStackTrace();
			          }
			      }

			      @Override
			      public void messageArrived(String topic, MqttMessage mqttMessage) throws Exception {
			         // System.out.println("messageArrived:"+mqttMessage.toString());
			        //  System.out.println(topic);
			      //   System.out.println(mqttMessage.toString());
			         System.out.println(mqttMessage.toString().length());
			          String s = mqttMessage.toString();
			          
			          Stringutils.is_process=true;
			    //      String s1=StringEscapeUtils.escapeJava(mqttMessage.toString());
			          if (s.length()>19) {
			        	  System.out.println(mqttMessage.toString().length()+"ys001");
			        	  
//			        	  System.out.println("主机："+Stringutils.getHost(s));
//			        	  System.out.println("记录时间："+Stringutils.getRecordTime(s));
//			        	  System.out.println("功能代码 ："+Stringutils.getFunctionCode(s));
//			        	  System.out.println("数据起始地址 ："+Stringutils.getStartAddress(s));
//			        	  System.out.println("数据长度 ："+Stringutils.getDataLength(s));
//			        	  System.out.println("数据集合："+Stringutils.getData(s).get(0)+"  "+Stringutils.getData(s).get(1));
			        	  synchronized("1"){
			        		 
			        		  Stringutils.linkedList.add(mqttMessage.toString());
			     //   		  System.out.println(Stringutils.linkedList.removeFirst());
			        		  databaseThread.is_canceld();
			        		  "1".notifyAll();
			        		  "1".wait();
			        	  }
			        	  System.out.println();
			        	 // Stringutils.databaseThread.start();
			          }
			      }
			      @Override
			      public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {
			          System.out.println("deliveryComplete");
			      }
			  });
			 sampleClient.connect(options);
			
			 sampleClient.setTimeToWait(0);
			 sampleClient.subscribe(topic,1);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("mqtt服务端错误");
		}
      
  }
}