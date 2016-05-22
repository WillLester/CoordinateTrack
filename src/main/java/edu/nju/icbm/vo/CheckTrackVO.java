package edu.nju.icbm.vo;

import java.util.List;

/**
 * 通过轨迹检索相关轨迹后获得的VO
 * @author Lester
 *
 */
public class CheckTrackVO {
	private List<Double> relatedDegrees;// 相关度
	private List<TrackVO> tracks;// 轨迹
	public CheckTrackVO(List<Double> relatedDegrees, List<TrackVO> tracks) {
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
	public List<TrackVO> getTracks() {
		return tracks;
	}
	public void setTracks(List<TrackVO> tracks) {
		this.tracks = tracks;
	}
	

}
