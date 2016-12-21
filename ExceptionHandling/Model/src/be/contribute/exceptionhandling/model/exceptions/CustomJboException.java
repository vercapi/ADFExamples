package be.contribute.exceptionhandling.model.exceptions;

import oracle.jbo.JboException;
import oracle.jbo.common.ResourceBundleDef;

public class CustomJboException
	extends JboException
{
	public CustomJboException(Class pClass, String pString, Object[] pObjects, Exception[] pExceptions)
	{
		super(pClass, pString, pObjects, pExceptions);
	}

	public CustomJboException(Class pClass, String pString, Object[] pObjects, JboException[] pJboExceptions)
	{
		super(pClass, pString, pObjects, pJboExceptions);
	}

	public CustomJboException(ResourceBundleDef pResourceBundleDef, String pString, Object[] pObjects)
	{
		super(pResourceBundleDef, pString, pObjects);
	}

	public CustomJboException(Class pClass, String pString, Object[] pObjects)
	{
		super(pClass, pString, pObjects);
	}

	public CustomJboException(Throwable pThrowable)
	{
		super(pThrowable);
	}

	public CustomJboException(String pString)
	{
		super(pString);
	}

	public CustomJboException(String pString, String pString1, Object[] pObjects)
	{
		super(pString, pString1, pObjects);
	}
}
