package edu.nju.icbm.vo;

import java.util.List;

/**
 * 检索后没有时间的轨迹集合，按相关度大小排列
 * @author Lester
 *
 */

public class NoTimeCheckTrackVO {
	private List<Double> relatedDegrees;
	private List<NoTimeTrackVO> tracks;
	public NoTimeCheckTrackVO(List<Double> relatedDegrees, List<NoTimeTrackVO> tracks) {
		super();
		this.relatedDegrees = relatedDegrees;
		this.tracks = tracks;
	}
	public List<Double> getRelatedDegrees() {
		return relatedDegrees;
	}
	public void setRelatedDegrees(List<Double> relatedDegrees) {
		this.relatedDegrees = relatedDegrees;
	}
	public List<NoTimeTrackVO> getTracks() {
		return tracks;
	}
	public void setTracks(List<NoTimeTrackVO> tracks) {
		this.tracks = tracks;
	}

}
