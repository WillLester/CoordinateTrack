package edu.nju.icbm.logicser;

import edu.nju.icbm.vo.CheckTrackVO;
import edu.nju.icbm.vo.NoTimeCheckTrackVO;
import edu.nju.icbm.vo.NoTimeTrackVO;
import edu.nju.icbm.vo.TrackVO;

/**
 * 轨迹逻辑层接口
 * @author Lester
 *
 */
public interface TrackLogicSer {
	/**
	 * 获得有时间的轨迹
	 * @return 轨迹VO
	 */
	public TrackVO getTracks();
	
	/**
	 * 获得没有时间的轨迹
	 * @return 轨迹VO
	 */
	public NoTimeTrackVO getNoTimeTracks();
	
	/**
	 * 获得两个有时间轨迹的相关度
	 * @param vo1 有时间轨迹1的VO
	 * @param vo2 有时间轨迹2的VO
	 * @return 相关度
	 */
	public double getRelatedDegree(TrackVO vo1, TrackVO vo2);
	
	/**
	 * 获得两个无时间轨迹的相关度
	 * @param vo1 无时间轨迹1的VO
	 * @param vo2 无时间轨迹2的VO
	 * @return 相关度
	 */
	public double getRelatedDegree(NoTimeTrackVO vo1, NoTimeTrackVO vo2);
	
	/**
	 * 根据有时间的轨迹获得相似轨迹
	 * @param vo 时间轨迹VO
	 * @return 相似轨迹，按照相关度排列，内有相关度大小
	 */
	public CheckTrackVO getCheckTrackVO(TrackVO vo);
	
	/**
	 * 根据无时间的轨迹获得相似轨迹
	 * @param vo 时间轨迹VO
	 * @return 相似轨迹，按照相关度排列，内有相关度大小
	 */
	public NoTimeCheckTrackVO getNoTimeCheckTrackVO(NoTimeTrackVO vo);
}
