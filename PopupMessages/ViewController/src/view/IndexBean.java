package view;

import org.apache.myfaces.trinidad.event.ReturnEvent;

public class IndexBean
{
	
	PopupReturnMessage fPopupMessage;
	
	public IndexBean()
	{
	}

	public void messageHelper(ReturnEvent returnEvent)
	{
		PopupReturnMessage vPopupMessage =  getPopupMessage();
		FacesHelper.addMessagesFromPopupReturn(vPopupMessage);
	}

	public void setPopupMessage(PopupReturnMessage pPopupMessage)
	{
		this.fPopupMessage = pPopupMessage;
	}

	public PopupReturnMessage getPopupMessage()
	{
		return fPopupMessage;
	}
}
