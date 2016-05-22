package edu.nju.icbm.logicser;

import java.awt.Point;
import java.io.InputStream;

/**
 * 地图逻辑层接口
 * @author Lester
 *
 */
public interface MapLogicSer {
	/**
	 * 获得地图图片的输入流
	 * @param location 中心位置
	 * @return 输入流
	 */
	public InputStream getMapImage(Point location);
}
