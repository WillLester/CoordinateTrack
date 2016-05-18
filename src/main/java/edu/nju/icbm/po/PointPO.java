package edu.nju.icbm.po;

import java.math.BigDecimal;
import java.util.Calendar;

/**
 * 含有时间的点
 * @author Lester
 *
 */
public class PointPO {
	private BigDecimal longitude;// 经度
	private BigDecimal latitude;// 纬度
	private Calendar time;// 时间
	public PointPO(BigDecimal longitude, BigDecimal latitude, Calendar time) {
		super();
		this.longitude = longitude;
		this.latitude = latitude;
		this.time = time;
	}
	public BigDecimal getLongitude() {
		return longitude;
	}
	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}
	public BigDecimal getLatitude() {
		return latitude;
	}
	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}
	public Calendar getTime() {
		return time;
	}
	public void setTime(Calendar time) {
		this.time = time;
	}
	
}
