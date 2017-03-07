package org.init.po;

import java.sql.Timestamp;

public class T_Meter_Log {
	private int id;
	private String mqtt_data;
	private Timestamp create_time;
	private int is_analysis;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMqtt_data() {
		return mqtt_data;
	}
	public void setMqtt_data(String mqtt_data) {
		this.mqtt_data = mqtt_data;
	}
	public Timestamp getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Timestamp create_time) {
		this.create_time = create_time;
	}
	public int getIs_analysis() {
		return is_analysis;
	}
	public void setIs_analysis(int is_analysis) {
		this.is_analysis = is_analysis;
	}
}
