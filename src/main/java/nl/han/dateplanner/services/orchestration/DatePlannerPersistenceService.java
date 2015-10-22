/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nl.han.dateplanner.services.orchestration;

import nl.han.dateplanner.DatePlannerResponse;
import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.LoggingLevel;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;

/**DatePlannerPersistenceService
 * When you run this route, messages can be obtained from two sources:
 * - inbox-folder (located in the bin-directory of your Tomcat/Jetty instance (don't run this example with mvn tomcat:run,
 * instead use a separate server. In src/main/webapp/WEB-INF/applyregistrationservice an example messages is included which
 * you can copy to your inbox folder in case your webservice is not available.
 * - a webservice with its wsdl served at http://localhost:8080/Dare2DateCamel/applyregistration.wsdl
 * (otherwise: http://localhost:8080/applyregistration.wsdl)
 */
public class DatePlannerPersistenceService extends RouteBuilder {

    public DatePlannerPersistenceService() {

    }

    @Override
    public void configure() throws Exception {
        JaxbDataFormat jaxb = new JaxbDataFormat(DatePlannerResponse.class.getPackage().getName());

        System.out.println("CONFIGURE ROUTE DatePlannerPersistenceService");
        from("activemq:datePlannerMessages")
            .unmarshal(jaxb)
                .process(new HandleNewMessage())
            .marshal(jaxb)
            .setExchangePattern(ExchangePattern.InOnly)
                .log(LoggingLevel.DEBUG, "nl.han.dateplanner.DatePlannerPersistenceService", "Processing ${body}")
                .to("file:C:\\camel_route_storage")
            .end();
    }


    private static final class HandleNewMessage implements Processor {
        @Override
        public void process(Exchange exchange) throws Exception {
            DatePlannerResponse datePlannerResponse = exchange.getIn().getBody(DatePlannerResponse.class);
            System.out.println("datePlannerResults process: " + datePlannerResponse.getRequest().getLocation());
        }
    }

}