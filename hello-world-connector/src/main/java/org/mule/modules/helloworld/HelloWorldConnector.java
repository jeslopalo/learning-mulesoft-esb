/**
 * (c) 2003-2015 MuleSoft, Inc. The software in this package is published under the terms of the CPAL v1.0 license,
 * a copy of which has been included with this distribution in the LICENSE.md file.
 */

package org.mule.modules.helloworld;

import org.mule.api.annotations.ConnectionStrategy;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Configurable;

import org.mule.api.annotations.Processor;

import org.mule.api.annotations.param.Default;

import org.mule.modules.helloworld.strategy.ConnectorConnectionStrategy;

/**
 * Anypoint Connector
 *
 * @author MuleSoft, Inc.
 */
@Connector(name="hello-world", friendlyName="HelloWorld")
public class HelloWorldConnector {
    
    /**
     * Configurable
     */
    @Configurable
    @Default("Hello")
    private String greeting;

    @ConnectionStrategy
    ConnectorConnectionStrategy connectionStrategy;

    /**
     * Custom processor
     *
     * {@sample.xml ../../../doc/hello-world-connector.xml.sample hello-world:greet}
     *
     * @param friend Content to be processed
     * @return Some string
     */
    @Processor
    public String greet(String friend) {
        /*
         * MESSAGE PROCESSOR CODE GOES HERE
         */
        return greeting + " " + friend + ". " + connectionStrategy.getReply();
    }

    /**
     * Set property
     *
     * @param greeting My property
     */
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    /**
     * Get property
     */
    public String getGreeting() {
        return this.greeting;
    }

    public ConnectorConnectionStrategy getConnectionStrategy() {
        return connectionStrategy;
    }

    public void setConnectionStrategy(ConnectorConnectionStrategy connectionStrategy) {
        this.connectionStrategy = connectionStrategy;
    }

}