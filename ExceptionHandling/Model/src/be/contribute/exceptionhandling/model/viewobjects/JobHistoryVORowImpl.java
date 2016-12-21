package be.contribute.exceptionhandling.model.viewobjects;

import be.contribute.exceptionhandling.model.entities.JobHistoryImpl;

import java.sql.Timestamp;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Dec 21 10:59:06 CET 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class JobHistoryVORowImpl
	extends ViewRowImpl
{
	public static final int ENTITY_JOBHISTORY = 0;

	/**
	 * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
	 */
	public enum AttributesEnum
	{
		DepartmentId,
		EmployeeId,
		EndDate,
		JobId,
		StartDate;
		private static AttributesEnum[] vals = null;
		private static final int firstIndex = 0;

		public int index()
		{
			return AttributesEnum.firstIndex() + ordinal();
		}

		public static final int firstIndex()
		{
			return firstIndex;
		}

		public static int count()
		{
			return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
		}

		public static final AttributesEnum[] staticValues()
		{
			if (vals == null)
			{
				vals = AttributesEnum.values();
			}
			return vals;
		}
	}
	public static final int DEPARTMENTID = AttributesEnum.DepartmentId.index();
	public static final int EMPLOYEEID = AttributesEnum.EmployeeId.index();
	public static final int ENDDATE = AttributesEnum.EndDate.index();
	public static final int JOBID = AttributesEnum.JobId.index();
	public static final int STARTDATE = AttributesEnum.StartDate.index();

	/**
	 * This is the default constructor (do not remove).
	 */
	public JobHistoryVORowImpl()
	{
	}

	/**
	 * Gets JobHistory entity object.
	 * @return the JobHistory
	 */
	public JobHistoryImpl getJobHistory()
	{
		return (JobHistoryImpl)getEntity(ENTITY_JOBHISTORY);
	}

	/**
	 * Gets the attribute value for DEPARTMENT_ID using the alias name DepartmentId.
	 * @return the DEPARTMENT_ID
	 */
	public Integer getDepartmentId()
	{
		return (Integer)getAttributeInternal(DEPARTMENTID);
	}

	/**
	 * Sets <code>value</code> as attribute value for DEPARTMENT_ID using the alias name DepartmentId.
	 * @param value value to set the DEPARTMENT_ID
	 */
	public void setDepartmentId(Integer value)
	{
		setAttributeInternal(DEPARTMENTID, value);
	}

	/**
	 * Gets the attribute value for EMPLOYEE_ID using the alias name EmployeeId.
	 * @return the EMPLOYEE_ID
	 */
	public Integer getEmployeeId()
	{
		return (Integer)getAttributeInternal(EMPLOYEEID);
	}

	/**
	 * Sets <code>value</code> as attribute value for EMPLOYEE_ID using the alias name EmployeeId.
	 * @param value value to set the EMPLOYEE_ID
	 */
	public void setEmployeeId(Integer value)
	{
		setAttributeInternal(EMPLOYEEID, value);
	}

	/**
	 * Gets the attribute value for END_DATE using the alias name EndDate.
	 * @return the END_DATE
	 */
	public Timestamp getEndDate()
	{
		return (Timestamp)getAttributeInternal(ENDDATE);
	}

	/**
	 * Sets <code>value</code> as attribute value for END_DATE using the alias name EndDate.
	 * @param value value to set the END_DATE
	 */
	public void setEndDate(Timestamp value)
	{
		setAttributeInternal(ENDDATE, value);
	}

	/**
	 * Gets the attribute value for JOB_ID using the alias name JobId.
	 * @return the JOB_ID
	 */
	public String getJobId()
	{
		return (String)getAttributeInternal(JOBID);
	}

	/**
	 * Sets <code>value</code> as attribute value for JOB_ID using the alias name JobId.
	 * @param value value to set the JOB_ID
	 */
	public void setJobId(String value)
	{
		setAttributeInternal(JOBID, value);
	}

	/**
	 * Gets the attribute value for START_DATE using the alias name StartDate.
	 * @return the START_DATE
	 */
	public Timestamp getStartDate()
	{
		return (Timestamp)getAttributeInternal(STARTDATE);
	}

	/**
	 * Sets <code>value</code> as attribute value for START_DATE using the alias name StartDate.
	 * @param value value to set the START_DATE
	 */
	public void setStartDate(Timestamp value)
	{
		setAttributeInternal(STARTDATE, value);
	}
}
