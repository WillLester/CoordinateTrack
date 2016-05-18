package edu.nju.icbm.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * 有时间的轨迹VO
 * @author Lester
 *
 */
public class TrackVO {
	private List<PointVO> points;// 点序列

	public TrackVO(List<PointVO> points) {
		super();
		this.points = points;
	}
	
	/**
	 * 获得轨迹中点序列的一个副本
	 * @return 点序列的副本
	 */
	public List<PointVO> getPoints() {
		List<PointVO> pos = new ArrayList<PointVO>();
		pos.addAll(points);
		return pos;
	}

}
