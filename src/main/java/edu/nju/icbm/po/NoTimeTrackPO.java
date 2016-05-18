package edu.nju.icbm.po;

import java.util.ArrayList;
import java.util.List;

/**
 * 不含时间的轨迹
 * @author Lester
 *
 */
public class NoTimeTrackPO {
	private List<NoTimePointPO> points;// 点序列

	public NoTimeTrackPO(List<NoTimePointPO> points) {
		super();
		this.points = points;
	}

	public List<NoTimePointPO> getPoints() {
		List<NoTimePointPO> pos = new ArrayList<>();
		pos.addAll(points);
		return pos;
	}

	public void setPoints(List<NoTimePointPO> points) {
		this.points = points;
	}
	
}
