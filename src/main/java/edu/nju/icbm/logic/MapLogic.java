package edu.nju.icbm.logic;

import java.awt.Point;
import java.io.InputStream;

import edu.nju.icbm.data.MapData;
import edu.nju.icbm.dataser.MapDataSer;
import edu.nju.icbm.logicser.MapLogicSer;

public class MapLogic implements MapLogicSer{
	private MapDataSer dataSer;
	
	public MapLogic() {
		dataSer = new MapData();
	}
	@Override
	public InputStream getMapImage(Point location) {
		return dataSer.getMapImage(location);
	}

}
