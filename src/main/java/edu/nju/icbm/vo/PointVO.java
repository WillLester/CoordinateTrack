package edu.nju.icbm.vo;

import java.math.BigDecimal;
import java.util.Calendar;

/**
 * 有时间的点的VO
 * @author Lester
 *
 */
public class PointVO {
	private BigDecimal longitude;// 经度
	private BigDecimal latitude;// 纬度
	private Calendar time;// 时间
	public PointVO(BigDecimal longitude, BigDecimal latitude, Calendar time) {
		super();
		this.longitude = longitude;
		this.latitude = latitude;
		this.time = time;
	}
	public BigDecimal getLongitude() {
		return longitude;
	}

	public BigDecimal getLatitude() {
		return latitude;
	}

	public Calendar getTime() {
		return time;
	}

}
