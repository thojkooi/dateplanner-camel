
package nl.han.dateplanner;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.han.dateplanner package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.han.dateplanner
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DatePlannerResponse }
     * 
     */
    public DatePlannerResponse createDatePlannerResponse() {
        return new DatePlannerResponse();
    }

    /**
     * Create an instance of {@link PlaceType }
     * 
     */
    public PlaceType createPlaceType() {
        return new PlaceType();
    }

    /**
     * Create an instance of {@link DateOptions }
     * 
     */
    public DateOptions createDateOptions() {
        return new DateOptions();
    }

    /**
     * Create an instance of {@link DatePlannerRequest }
     * 
     */
    public DatePlannerRequest createDatePlannerRequest() {
        return new DatePlannerRequest();
    }

    /**
     * Create an instance of {@link ForecastType }
     * 
     */
    public ForecastType createForecastType() {
        return new ForecastType();
    }

}
