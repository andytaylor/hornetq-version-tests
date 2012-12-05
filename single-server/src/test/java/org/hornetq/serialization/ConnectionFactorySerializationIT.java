package org.hornetq.serialization;

import org.objectweb.jtests.jms.framework.JMSTestCase;

import javax.jms.ConnectionFactory;

public class ConnectionFactorySerializationIT extends JMSTestCase
{
   public ConnectionFactorySerializationIT(String name)
   {
      super(name);
   }

   public void testSerialize() throws Exception
   {
      ConnectionFactory cf = (ConnectionFactory) admin.createContext().lookup("DiscoveryFactory");
      System.out.println("cf = " + cf);
   }
}
