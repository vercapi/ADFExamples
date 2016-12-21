package be.contribute.exceptionhandling.model.am;

import be.contribute.exceptionhandling.model.am.common.ExceptionAM;
import be.contribute.exceptionhandling.model.exceptions.CustomJboException;
import be.contribute.exceptionhandling.model.exceptions.CustomRuntimeException;
import be.contribute.exceptionhandling.model.viewobjects.EmployeesJboVOImpl;
import be.contribute.exceptionhandling.model.viewobjects.EmployeesRTVOImpl;
import be.contribute.exceptionhandling.model.viewobjects.JobHistoryVOImpl;
import be.contribute.exceptionhandling.model.viewobjects.JobsVOImpl;
import be.contribute.exceptionhandling.model.viewobjects.RegionsVOImpl;

import oracle.jbo.server.ApplicationModuleImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Dec 21 09:56:17 CET 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ExceptionAMImpl
	extends ApplicationModuleImpl
	implements ExceptionAM
{
	/**
	 * This is the default constructor (do not remove).
	 */
	public ExceptionAMImpl()
	{
	}
	
	public void throwCustomJboException()
	{
		throw new CustomJboException("Custom JBO exception by AM");
	}
	
	public void throwCustomRuntimeException()
	{
		throw new CustomRuntimeException("Custom runtime exception by AM");
	}

	/**
	 * Container's getter for JobsVOVI.
	 * @return JobsVOVI
	 */
	public JobsVOImpl getJobsVOVI()
	{
		return (JobsVOImpl)findViewObject("JobsVOVI");
	}

	/**
	 * Container's getter for RegionsVO1.
	 * @return RegionsVO1
	 */
	public RegionsVOImpl getRegionsVOVI()
	{
		return (RegionsVOImpl)findViewObject("RegionsVOVI");
	}

	/**
	 * Container's getter for JobHistoryVO1.
	 * @return JobHistoryVO1
	 */
	public JobHistoryVOImpl getJobHistoryVOVI()
	{
		return (JobHistoryVOImpl)findViewObject("JobHistoryVOVI");
	}

	/**
	 * Container's getter for EmployeesJboVO1.
	 * @return EmployeesJboVO1
	 */
	public EmployeesJboVOImpl getEmployeesJboVOVI()
	{
		return (EmployeesJboVOImpl)findViewObject("EmployeesJboVOVI");
	}

	/**
	 * Container's getter for EmployeesRTVO1.
	 * @return EmployeesRTVO1
	 */
	public EmployeesRTVOImpl getEmployeesRTVOVI()
	{
		return (EmployeesRTVOImpl)findViewObject("EmployeesRTVOVI");
	}
}

