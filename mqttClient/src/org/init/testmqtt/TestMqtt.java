package org.init.testmqtt;

import org.junit.Test;

import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.services.iothub.IotHubClient;
import com.baidubce.services.iothub.model.ListResponse;
import com.baidubce.services.iothub.model.QueryEndpointResponse;
import com.baidubce.services.iothub.model.QueryThingResponse;

public class TestMqtt {
	
	public static void main(String[] args) {
		testConnection();
	}
	 
	private static void testConnection() {
		String AK = "9eae53f5781c4b5fb507576426cbf02d";
		String SK = "1961406c786540c986990442f7c90efc";
		String ENDPOINT = "tcp://initendpoint.mqtt.iot.gz.baidubce.com:1883";
		String TEST_ENDPOINT_NAME = "initendpoint";
		String TEST_THING_NAME = "initendpoint/thingclient002";
		String TEST_PRINCIPAL_NAME = "identity002";
		String TEST_POLICY_NAME = "policy003";
		String TEST_TOPIC = "PublicMessage";
		BceClientConfiguration config = new BceClientConfiguration()
		        .withCredentials(new DefaultBceCredentials(AK, SK))
		        .withEndpoint(ENDPOINT);
		IotHubClient iotHubClient = new IotHubClient(config);
		System.out.println("123");
		
//	//	QueryEndpointResponse responseQuery = iotHubClient.createEndpoint(TEST_ENDPOINT_NAME);
//		ListResponse responseList = iotHubClient.listEndpoints();
//		QueryEndpointResponse responseQuery = iotHubClient.queryEndpoint(TEST_ENDPOINT_NAME);
//		ListResponse responseThingList = iotHubClient.listThings(TEST_ENDPOINT_NAME);
//		
 		QueryThingResponse responseSingleThingQuery = iotHubClient.queryThing(TEST_ENDPOINT_NAME, TEST_THING_NAME);
		
	}

}
