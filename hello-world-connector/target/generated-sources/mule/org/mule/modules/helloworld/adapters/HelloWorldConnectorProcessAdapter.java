
package org.mule.modules.helloworld.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.helloworld.HelloWorldConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>HelloWorldConnectorProcessAdapter</code> is a wrapper around {@link HelloWorldConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.6.1", date = "2015-05-21T03:04:18+02:00", comments = "Build UNNAMED.2405.44720b7")
public class HelloWorldConnectorProcessAdapter
    extends HelloWorldConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<HelloWorldConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, HelloWorldConnectorCapabilitiesAdapter> getProcessTemplate() {
        final HelloWorldConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,HelloWorldConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, HelloWorldConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, HelloWorldConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
