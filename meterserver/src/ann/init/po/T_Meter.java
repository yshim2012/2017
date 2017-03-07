package ann.init.po;

import java.sql.Timestamp;

public class T_Meter {
	private int id;
	private String host_number;
	private String meter_number;
	private int is_disable;
	private int create_id;
	private Timestamp create_time;
	private int update_id;
	private Timestamp update_time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHost_number() {
		return host_number;
	}
	public void setHost_number(String host_number) {
		this.host_number = host_number;
	}
	public String getMeter_number() {
		return meter_number;
	}
	public void setMeter_number(String meter_number) {
		this.meter_number = meter_number;
	}
	public int getIs_disable() {
		return is_disable;
	}
	public void setIs_disable(int is_disable) {
		this.is_disable = is_disable;
	}
	public int getCreate_id() {
		return create_id;
	}
	public void setCreate_id(int create_id) {
		this.create_id = create_id;
	}
	public Timestamp getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Timestamp create_time) {
		this.create_time = create_time;
	}
	public int getUpdate_id() {
		return update_id;
	}
	public void setUpdate_id(int update_id) {
		this.update_id = update_id;
	}
	public Timestamp getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Timestamp update_time) {
		this.update_time = update_time;
	}

}
