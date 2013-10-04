package view;

import javax.faces.application.FacesMessage;
import javax.faces.event.ActionEvent;

public class PopupBean
{
	
	PopupReturnMessage fPopupMessage;
	
	public PopupBean()
	{
	}

	public void ok(ActionEvent actionEvent)
	{
		//This message will not show, or shows in the popup
		FacesHelper.addMessage("Ok message direct", FacesMessage.SEVERITY_INFO);
		//This message will show after the popup has closed
		getPopupMessage().addInfoMessage("Ok Message popup 1", new String[0]);
		getPopupMessage().addInfoMessage("Ok Message popup 2", new String[0]);
	}
	
	public void nok(ActionEvent actionEvent)
	{
		//This message will not show, or shows in the popup
		FacesHelper.addMessage("NOk message direct", FacesMessage.SEVERITY_INFO);
		//This message will show after the popup has closed
		getPopupMessage().addInfoMessage("NOk Message popup 1", new String[0]);
		getPopupMessage().addInfoMessage("NOk Message popup 2", new String[0]);
	}

	public PopupReturnMessage getPopupMessage()
	{
		if(fPopupMessage == null)
		{
			fPopupMessage = new PopupReturnMessage();
		}
		
		return fPopupMessage;
	}
}
