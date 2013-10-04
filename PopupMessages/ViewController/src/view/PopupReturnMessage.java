package view;

import java.util.ArrayList;

import java.util.Iterator;

import javax.faces.application.FacesMessage;

public class PopupReturnMessage
	implements Iterator<PopupReturnMessage.SingleMessage>
{
	
	private ArrayList<SingleMessage> fMessages;
	private int fIterIndex;

	public class SingleMessage
	{
		private final String fMessage;
		private final FacesMessage.Severity fSeverity;

		public SingleMessage(String pMessage, FacesMessage.Severity pSeverity, String[] pSubstitutions)
		{
			fMessage = pMessage;
			fSeverity = pSeverity;
		}

		public String getMessage()
		{
			return fMessage;
		}

		public FacesMessage.Severity getSeverity()
		{
			return fSeverity;
		}
	}
	
	public PopupReturnMessage()
	{
		super();
		fMessages = new ArrayList<SingleMessage>();
		fIterIndex = 0;
	}
	
	@Override
	public boolean hasNext()
	{
		return fMessages.size() > fIterIndex;
	}

	@Override
	public PopupReturnMessage.SingleMessage next()
	{
		return fMessages.get(fIterIndex++);
	}

	@Override
	public void remove()
	{
		fMessages.remove(fIterIndex);
	}
	
	public void addErrorMessage(String pMessage, String[] pSubstitutions)
	{
		addMessage(pMessage, pSubstitutions, FacesMessage.SEVERITY_ERROR);
	}
	
	public void addWarningMessage(String pMessage, String[] pSubstitutions)
	{
		addMessage(pMessage, pSubstitutions, FacesMessage.SEVERITY_WARN);
	}
	
	public void addInfoMessage(String pMessage, String[] pSubstitutions)
	{
		addMessage(pMessage, pSubstitutions, FacesMessage.SEVERITY_INFO);
	}
	
	private void addMessage(String pMessage, String[] pSubstitutions, FacesMessage.Severity pSeverity)
	{
		SingleMessage vMessage = new SingleMessage(pMessage, pSeverity, pSubstitutions);
		fMessages.add(vMessage);
	}
}
