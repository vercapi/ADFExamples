package be.contribute.exceptionhandling.model.viewobjects;

import be.contribute.exceptionhandling.model.entities.LocationsImpl;
import be.contribute.exceptionhandling.model.exceptions.CustomRuntimeException;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Dec 21 13:31:45 CET 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class LocationsVORowImpl
	extends ViewRowImpl
{
	public static final int ENTITY_LOCATIONS = 0;

	/**
	 * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
	 */
	public enum AttributesEnum
	{
		City,
		CountryId,
		LocationId,
		PostalCode,
		StateProvince,
		StreetAddress;
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
	public static final int CITY = AttributesEnum.City.index();
	public static final int COUNTRYID = AttributesEnum.CountryId.index();
	public static final int LOCATIONID = AttributesEnum.LocationId.index();
	public static final int POSTALCODE = AttributesEnum.PostalCode.index();
	public static final int STATEPROVINCE = AttributesEnum.StateProvince.index();
	public static final int STREETADDRESS = AttributesEnum.StreetAddress.index();

	/**
	 * This is the default constructor (do not remove).
	 */
	public LocationsVORowImpl()
	{
	}

	/**
	 * Gets Locations entity object.
	 * @return the Locations
	 */
	public LocationsImpl getLocations()
	{
		return (LocationsImpl)getEntity(ENTITY_LOCATIONS);
	}

	/**
	 * Gets the attribute value for CITY using the alias name City.
	 * @return the CITY
	 */
	public String getCity()
	{
		return (String)getAttributeInternal(CITY);
	}

	/**
	 * Sets <code>value</code> as attribute value for CITY using the alias name City.
	 * @param value value to set the CITY
	 */
	public void setCity(String value)
	{
		setAttributeInternal(CITY, value);
	}

	/**
	 * Gets the attribute value for COUNTRY_ID using the alias name CountryId.
	 * @return the COUNTRY_ID
	 */
	public String getCountryId()
	{
		return (String)getAttributeInternal(COUNTRYID);
	}

	/**
	 * Sets <code>value</code> as attribute value for COUNTRY_ID using the alias name CountryId.
	 * @param value value to set the COUNTRY_ID
	 */
	public void setCountryId(String value)
	{
		setAttributeInternal(COUNTRYID, value);
	}

	/**
	 * Gets the attribute value for LOCATION_ID using the alias name LocationId.
	 * @return the LOCATION_ID
	 */
	public Integer getLocationId()
	{
		return (Integer)getAttributeInternal(LOCATIONID);
	}

	/**
	 * Sets <code>value</code> as attribute value for LOCATION_ID using the alias name LocationId.
	 * @param value value to set the LOCATION_ID
	 */
	public void setLocationId(Integer value)
	{
		setAttributeInternal(LOCATIONID, value);
	}

	/**
	 * Gets the attribute value for POSTAL_CODE using the alias name PostalCode.
	 * @return the POSTAL_CODE
	 */
	public String getPostalCode()
	{
	   throw new CustomRuntimeException("runtime while getting postal code");
		//return (String)getAttributeInternal(POSTALCODE);
	}

	/**
	 * Sets <code>value</code> as attribute value for POSTAL_CODE using the alias name PostalCode.
	 * @param value value to set the POSTAL_CODE
	 */
	public void setPostalCode(String value)
	{
	   throw new CustomRuntimeException("runtime while setting postal code");
		//setAttributeInternal(POSTALCODE, value);
	}

	/**
	 * Gets the attribute value for STATE_PROVINCE using the alias name StateProvince.
	 * @return the STATE_PROVINCE
	 */
	public String getStateProvince()
	{
		return (String)getAttributeInternal(STATEPROVINCE);
	}

	/**
	 * Sets <code>value</code> as attribute value for STATE_PROVINCE using the alias name StateProvince.
	 * @param value value to set the STATE_PROVINCE
	 */
	public void setStateProvince(String value)
	{
		setAttributeInternal(STATEPROVINCE, value);
	}

	/**
	 * Gets the attribute value for STREET_ADDRESS using the alias name StreetAddress.
	 * @return the STREET_ADDRESS
	 */
	public String getStreetAddress()
	{
		return (String)getAttributeInternal(STREETADDRESS);
	}

	/**
	 * Sets <code>value</code> as attribute value for STREET_ADDRESS using the alias name StreetAddress.
	 * @param value value to set the STREET_ADDRESS
	 */
	public void setStreetAddress(String value)
	{
		setAttributeInternal(STREETADDRESS, value);
	}
}
