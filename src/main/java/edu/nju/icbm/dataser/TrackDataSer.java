package edu.nju.icbm.dataser;

import edu.nju.icbm.po.NoTimeTrackPO;
import edu.nju.icbm.po.TrackPO;

/**
 * 获得轨迹的数据层接口
 * @author Lester
 *
 */
public interface TrackDataSer {
	/**
	 * 获得含有时间的轨迹
	 * @return 轨迹PO
	 */
	public TrackPO getTracks();
	
	/**
	 * 获得不含有时间的轨迹
	 * @return 不含有时间的轨迹PO
	 */
	public NoTimeTrackPO getNoTimeTracks();
}
