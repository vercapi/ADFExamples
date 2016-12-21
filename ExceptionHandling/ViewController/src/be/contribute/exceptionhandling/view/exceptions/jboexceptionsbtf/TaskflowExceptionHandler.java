package be.contribute.exceptionhandling.view.exceptions.jboexceptionsbtf;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import oracle.adf.controller.ControllerContext;


public class TaskflowExceptionHandler
{
	public TaskflowExceptionHandler()
	{
	}

	public void handleException()
	{
		ControllerContext vControllerContext = ControllerContext.getInstance();

		Exception vException = vControllerContext.getCurrentViewPort().getExceptionData();
		String vMessage = vException.getMessage();

		FacesContext vFacesContext = FacesContext.getCurrentInstance();
		FacesMessage vFacesMessage =
		   new FacesMessage(FacesMessage.SEVERITY_ERROR, vMessage, null);
		vFacesContext.addMessage(null, vFacesMessage);

		vControllerContext.getCurrentRootViewPort().clearException();
		vFacesContext.renderResponse();
	}
}
