package be.contribute.exceptionhandling.model.exceptions;

public class CustomRuntimeException
	extends RuntimeException
{
	public CustomRuntimeException(String pString, Throwable pThrowable, boolean b, boolean pB1)
	{
		super(pString, pThrowable, b, pB1);
	}

	public CustomRuntimeException(Throwable pThrowable)
	{
		super(pThrowable);
	}

	public CustomRuntimeException(String pString, Throwable pThrowable)
	{
		super(pString, pThrowable);
	}

	public CustomRuntimeException(String pString)
	{
		super(pString);
	}

	public CustomRuntimeException()
	{
		super();
	}
}
