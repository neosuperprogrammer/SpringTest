package flowgrammer.knight;

import org.apache.log4j.Logger;

public class Minstrel {
	static Logger log = Logger.getLogger(Minstrel.class);
	
	public void singBeforeQuest() {
//		System.out.println("singBeforeQuest");
		log.info("singBeforeQuest");
	}
	
	public void singAfterQuest() {
		log.info("singAfterQuest");
	}

}
