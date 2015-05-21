
package org.mule.modules.helloworld.adapters;

import javax.annotation.Generated;
import org.mule.api.devkit.capability.Capabilities;
import org.mule.api.devkit.capability.ModuleCapability;
import org.mule.modules.helloworld.HelloWorldConnector;


/**
 * A <code>HelloWorldConnectorCapabilitiesAdapter</code> is a wrapper around {@link HelloWorldConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.6.1", date = "2015-05-21T03:04:18+02:00", comments = "Build UNNAMED.2405.44720b7")
public class HelloWorldConnectorCapabilitiesAdapter
    extends HelloWorldConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(ModuleCapability capability) {
        if (capability == ModuleCapability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
