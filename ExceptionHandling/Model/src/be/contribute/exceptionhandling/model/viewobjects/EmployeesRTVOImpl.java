package be.contribute.exceptionhandling.model.viewobjects;

import be.contribute.exceptionhandling.model.exceptions.CustomRuntimeException;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Dec 21 12:17:19 CET 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class EmployeesRTVOImpl
	extends ViewObjectImpl
{
	/**
	 * This is the default constructor (do not remove).
	 */
	public EmployeesRTVOImpl()
	{
	}

	@Override
	protected void executeQueryForCollection(Object pObject, Object[] object2, int i)
	{
		throw new CustomRuntimeException("Runtime when executing query");
	}
}
