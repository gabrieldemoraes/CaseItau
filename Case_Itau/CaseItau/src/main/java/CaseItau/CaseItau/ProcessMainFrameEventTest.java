package CaseItau.CaseItau;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class ProcessMainFrameEventTest {

	ProcessMainFrameEvent processMainFrameEvent = new ProcessMainFrameEvent();
	
	
	@Test
	public void testReceiveMainFrameEvent() {
		String jsonData = "{\n" + 
				"    \"Event\": {\n" + 
				"            \"id\": 1,\n" + 
				"            \"clientId\":\"10\",\n" + 
				"            \"data\":\"abcXpto\"               \n" + 
				"     }\n" + 
				"}";
		
		MainFrameEventInfo mainFrameInfo = new MainFrameEventInfo();
		mainFrameInfo.setEventId(1);
		mainFrameInfo.setClientId(10);
		mainFrameInfo.setData("abcXpto");
		
		MainFrameEventInfo result = processMainFrameEvent.receiveMainFrameEvent(jsonData);
		
		assertEquals(result.getEventId(),mainFrameInfo.getEventId());
		assertEquals(result.getClientId(),mainFrameInfo.getClientId());
		assertEquals(result.getData(),mainFrameInfo.getData());
	}	
}
