package flowgrammer.knight;

import org.apache.log4j.Logger;

public class DragonSlayerQuest implements Quest {
	
	private static Logger logger = Logger.getLogger(DragonSlayerQuest.class);

	@Override
	public void emark() {
		logger.info("DragonSlayerQuest");

	}

}
