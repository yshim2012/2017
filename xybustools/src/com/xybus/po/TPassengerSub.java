package com.xybus.po;

import java.util.List;

public class TPassengerSub extends TPassenger{


	private static final long serialVersionUID = 1L;
	private List<TAccountRecord> tAccountRecords;
	private List<TCard> tcards;
	private List<TRideData> trides;
	private List<TMonthSummary> tMonthSummarys;
 

	
	public List<TAccountRecord> gettAccountRecords() {
		return tAccountRecords;
	}
	
	public void settAccountRecords(List<TAccountRecord> tAccountRecords) {
		this.tAccountRecords = tAccountRecords;
	}
	public List<TCard> getTcards() {
		return tcards;
	}
	public void setTcards(List<TCard> tcards) {
		this.tcards = tcards;
	}
	public List<TRideData> getTrides() {
		return trides;
	}
	public void setTrides(List<TRideData> trides) {
		this.trides = trides;
	}
	public List<TMonthSummary> gettMonthSummarys() {
		return tMonthSummarys;
	}
	public void settMonthSummarys(List<TMonthSummary> tMonthSummarys) {
		this.tMonthSummarys = tMonthSummarys;
	}
}
