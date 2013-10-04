package view;

import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

import oracle.adf.share.ADFContext;

public class FacesHelper
{
	public FacesHelper()
	{
		super();
	}
	
	public static void addMessage(String pMessage, Severity pSeverity)
	{
		FacesMessage msg = new FacesMessage(pMessage);
		msg.setSeverity(pSeverity);
		FacesContext fctx = FacesContext.getCurrentInstance();
		fctx.addMessage(null, msg);
	}
	
	public static void setPageflowScopeParam(String pKey, Object pValue)
	{
		Map vParamMap = ADFContext.getCurrent().getPageFlowScope();
		vParamMap.put(pKey, pValue); 
	}
	
	public static Object getPageFlowScopeParam(String pKey)
	{
		Object vParam;
		Map vParamMap = ADFContext.getCurrent().getPageFlowScope();
		vParam = vParamMap.get(pKey);
		
		return vParam;
	}
	
	public static void addMessagesFromPopupReturn(PopupReturnMessage pPopupReturnMessage)
	{
		while(pPopupReturnMessage.hasNext())
		{
			PopupReturnMessage.SingleMessage vMessage = pPopupReturnMessage.next();
			addMessage(vMessage.getMessage(), vMessage.getSeverity());
		}
	}
}