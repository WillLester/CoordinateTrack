package edu.nju.icbm.vo;

import java.util.ArrayList;
import java.util.List;

public class NoTimeTrackVO {
	private List<NoTimePointVO> points;// 点序列

	public NoTimeTrackVO(List<NoTimePointVO> points) {
		super();
		this.points = points;
	}

	public List<NoTimePointVO> getPoints() {
		List<NoTimePointVO> pos = new ArrayList<>();
		pos.addAll(points);
		return pos;
	}
}
