package flowgrammer.knight;

import org.apache.log4j.Logger;

public class BraveKnight implements Knight {
	
	Logger log = Logger.getLogger(BraveKnight.class);
	
	private Quest quest;

	public BraveKnight(Quest quest) {
		this.quest = quest;
	}

	@Override
	public void embarkOnQuest() {
		this.quest.emark();
		
	}

}
