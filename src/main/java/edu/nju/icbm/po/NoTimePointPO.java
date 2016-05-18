package edu.nju.icbm.po;

import java.math.BigDecimal;

/**
 * 不含时间的点
 * @author Lester
 *
 */
public class NoTimePointPO {
	private BigDecimal longitude;// 经度
	private BigDecimal latitude;// 纬度
	public NoTimePointPO(BigDecimal longitude, BigDecimal latitude) {
		super();
		this.longitude = longitude;
		this.latitude = latitude;
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
	
	
}
