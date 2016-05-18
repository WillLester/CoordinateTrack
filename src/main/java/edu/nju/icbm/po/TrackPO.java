package edu.nju.icbm.po;

import java.util.ArrayList;
import java.util.List;

/**
 * 含有时间的轨迹
 * @author Lester
 *
 */
public class TrackPO {
	private List<PointPO> points;// 点序列

	public TrackPO(List<PointPO> points) {
		super();
		this.points = points;
	}
	
	/**
	 * 获得轨迹中点序列的一个副本
	 * @return 点序列的副本
	 */
	public List<PointPO> getPoints() {
		List<PointPO> pos = new ArrayList<PointPO>();
		pos.addAll(points);
		return pos;
	}

	public void setPoints(List<PointPO> points) {
		this.points = points;
	}
	
}
