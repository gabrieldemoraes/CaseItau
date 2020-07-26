package CaseItau.CaseItau;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProcessMainFrameEvent {
	private static final Logger logger = LoggerFactory.getLogger(ProcessMainFrameEvent.class);
	public MainFrameEventInfo receiveMainFrameEvent(String event) {
		JSONObject obj = new JSONObject(event); 
		
		MainFrameEventInfo mainFrameInfo = new MainFrameEventInfo();
		mainFrameInfo.setEventId(obj.getJSONObject("Event").getInt("id"));
		mainFrameInfo.setClientId(obj.getJSONObject("Event").getInt("clientId"));
		mainFrameInfo.setData(obj.getJSONObject("Event").getString("data"));
		
		
		logger.info("Event successfully processed ! Event ID is: " + mainFrameInfo.getEventId());
		
		return mainFrameInfo;
	}
}
