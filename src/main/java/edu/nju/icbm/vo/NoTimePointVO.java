package edu.nju.icbm.vo;

import java.math.BigDecimal;

/**
 * 没有时间的点的VO
 * @author Lester
 *
 */
public class NoTimePointVO {
	private BigDecimal longitude;// 经度
	private BigDecimal latitude;// 纬度
	public NoTimePointVO(BigDecimal longitude, BigDecimal latitude) {
		super();
		this.longitude = longitude;
		this.latitude = latitude;
	}
	public BigDecimal getLongitude() {
		return longitude;
	}
	public BigDecimal getLatitude() {
		return latitude;
	}
}
