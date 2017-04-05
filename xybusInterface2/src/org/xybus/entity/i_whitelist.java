package org.xybus.entity;

import java.sql.Date;
import java.sql.Timestamp;

public class i_whitelist  extends Employee{
	private int id;
	private String version;
	private String card_pin;
	private String status;
	private Timestamp update_time;
	private int created_id;
	private Timestamp created_time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getCard_pin() {
		return card_pin;
	}
	public void setCard_pin(String card_pin) {
		this.card_pin = card_pin;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Timestamp getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Timestamp update_time) {
		this.update_time = update_time;
	}
	public int getCreated_id() {
		return created_id;
	}
	public void setCreated_id(int created_id) {
		this.created_id = created_id;
	}
	public Timestamp getCreated_time() {
		return created_time;
	}
	public void setCreated_time(Timestamp created_time) {
		this.created_time = created_time;
	}

}
