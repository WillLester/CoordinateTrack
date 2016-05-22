package edu.nju.icbm.logic;

import java.util.ArrayList;
import java.util.List;

import edu.nju.icbm.data.TrackData;
import edu.nju.icbm.dataser.TrackDataSer;
import edu.nju.icbm.logicser.TrackLogicSer;
import edu.nju.icbm.po.NoTimePointPO;
import edu.nju.icbm.po.NoTimeTrackPO;
import edu.nju.icbm.po.PointPO;
import edu.nju.icbm.po.TrackPO;
import edu.nju.icbm.vo.CheckTrackVO;
import edu.nju.icbm.vo.NoTimeCheckTrackVO;
import edu.nju.icbm.vo.NoTimePointVO;
import edu.nju.icbm.vo.NoTimeTrackVO;
import edu.nju.icbm.vo.PointVO;
import edu.nju.icbm.vo.TrackVO;

public class TrackLogic implements TrackLogicSer{
	
	private TrackDataSer dataSer;
	
	public TrackLogic() {
		dataSer = new TrackData();
	}

	@Override
	public TrackVO getTracks() {
		TrackPO po = dataSer.getTracks();// 简单的PO转VO而已
		List<PointPO> pointPOs = po.getPoints();
		List<PointVO> pointVOs = new ArrayList<>();
		for (PointPO pointPO : pointPOs) {
			PointVO pointVO = new PointVO(pointPO.getLongitude(), pointPO.getLatitude(), pointPO.getTime());
			pointVOs.add(pointVO);
		}
		TrackVO vo = new TrackVO(pointVOs);
		return vo;
	}

	@Override
	public NoTimeTrackVO getNoTimeTracks() {
		NoTimeTrackPO po = dataSer.getNoTimeTracks();// 简单的PO转VO而已
		List<NoTimePointPO> pointPOs = po.getPoints();
		List<NoTimePointVO> pointVOs = new ArrayList<>();
		for (NoTimePointPO pointPO : pointPOs) {
			NoTimePointVO pointVO = new NoTimePointVO(pointPO.getLongitude(), pointPO.getLatitude());
			pointVOs.add(pointVO);
		}
		NoTimeTrackVO vo = new NoTimeTrackVO(pointVOs);
		return vo;
	}

	@Override
	public double getRelatedDegree(TrackVO vo1, TrackVO vo2) {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public double getRelatedDegree(NoTimeTrackVO vo1, NoTimeTrackVO vo2) {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public CheckTrackVO getCheckTrackVO(TrackVO vo) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public NoTimeCheckTrackVO getNoTimeCheckTrackVO(NoTimeTrackVO vo) {
		// TODO 自动生成的方法存根
		return null;
	}

}
