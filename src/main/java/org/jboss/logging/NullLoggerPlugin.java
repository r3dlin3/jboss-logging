package org.jboss.logging;

public class NullLoggerPlugin
  implements LoggerPlugin
{
  public void init(String name) {}
  
  public boolean isTraceEnabled()
  {
    return false;
  }
  
  public void trace(Object message) {}
  
  public void trace(Object message, Throwable t) {}
  
  public boolean isDebugEnabled()
  {
    return false;
  }
  
  public void debug(Object message) {}
  
  public void debug(Object message, Throwable t) {}
  
  public boolean isInfoEnabled()
  {
    return false;
  }
  
  public void info(Object message) {}
  
  public void info(Object message, Throwable t) {}
  
  public void error(Object message) {}
  
  public void error(Object message, Throwable t) {}
  
  public void fatal(Object message) {}
  
  public void fatal(Object message, Throwable t) {}
  
  public void warn(Object message) {}
  
  public void warn(Object message, Throwable t) {}
}
