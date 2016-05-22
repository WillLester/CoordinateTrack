package edu.nju.icbm.dataser;

import java.awt.Point;
import java.io.InputStream;

/**
 * 地图相关的接口
 * @author Lester
 *
 */
public interface MapDataSer {
	/**
	 * 获得地图图片的输入流
	 * @param location 中心位置
	 * @return 输入流
	 */
	public InputStream getMapImage(Point location);
}
