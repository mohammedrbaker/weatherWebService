package com.weatherWebService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by scheffs on 3/28/2016.
 */

// The Java class will be hosted at the URI path "/weather"
@Path("/weather")

public class Weather
{
//    The Java method will process HTTP GET requests

    @GET
    // The Java method will produce content identified by the MIME media type "text/plain"
    @Produces("text/plain")
    public String getClichedMessage()
    {
        // Return some cliched textual content
        return "Hello com.weatherWebService.Weather";
    }
}