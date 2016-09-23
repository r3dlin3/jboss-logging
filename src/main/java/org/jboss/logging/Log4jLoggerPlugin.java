package org.jboss.logging;

import org.apache.log4j.Category;
import org.apache.log4j.Level;
import org.apache.log4j.Priority;

public class Log4jLoggerPlugin
  implements LoggerPlugin
{
  private static final String FQCN = Logger.class.getName();
  private transient org.apache.log4j.Logger log;
  
  public void init(String name)
  {
    this.log = org.apache.log4j.Logger.getLogger(name);
  }
  
  public Category getCategory()
  {
    return this.log;
  }
  
  public org.apache.log4j.Logger getLogger()
  {
    return this.log;
  }
  
  public boolean isTraceEnabled()
  {
    Level l = Level.TRACE;
    if (!this.log.isEnabledFor(l)) {
      return false;
    }
    return l.isGreaterOrEqual(this.log.getEffectiveLevel());
  }
  
  public void trace(Object message)
  {
    this.log.log(FQCN, Level.TRACE, message, null);
  }
  
  public void trace(Object message, Throwable t)
  {
    this.log.log(FQCN, Level.TRACE, message, t);
  }
  
  public boolean isDebugEnabled()
  {
    Level l = Level.DEBUG;
    if (!this.log.isEnabledFor(l)) {
      return false;
    }
    return l.isGreaterOrEqual(this.log.getEffectiveLevel());
  }
  
  public void debug(Object message)
  {
    this.log.log(FQCN, Level.DEBUG, message, null);
  }
  
  public void debug(Object message, Throwable t)
  {
    this.log.log(FQCN, Level.DEBUG, message, t);
  }
  
  public boolean isInfoEnabled()
  {
    Level l = Level.INFO;
    if (!this.log.isEnabledFor(l)) {
      return false;
    }
    return l.isGreaterOrEqual(this.log.getEffectiveLevel());
  }
  
  public void info(Object message)
  {
    this.log.log(FQCN, Level.INFO, message, null);
  }
  
  public void info(Object message, Throwable t)
  {
    this.log.log(FQCN, Level.INFO, message, t);
  }
  
  public void warn(Object message)
  {
    this.log.log(FQCN, Level.WARN, message, null);
  }
  
  public void warn(Object message, Throwable t)
  {
    this.log.log(FQCN, Level.WARN, message, t);
  }
  
  public void error(Object message)
  {
    this.log.log(FQCN, Level.ERROR, message, null);
  }
  
  public void error(Object message, Throwable t)
  {
    this.log.log(FQCN, Level.ERROR, message, t);
  }
  
  public void fatal(Object message)
  {
    this.log.log(FQCN, Level.FATAL, message, null);
  }
  
  public void fatal(Object message, Throwable t)
  {
    this.log.log(FQCN, Level.FATAL, message, t);
  }
  
  /**
   * @deprecated
   */
  public void log(Priority p, Object message)
  {
    this.log.log(FQCN, p, message, null);
  }
  
  /**
   * @deprecated
   */
  public void log(Priority p, Object message, Throwable t)
  {
    this.log.log(FQCN, p, message, t);
  }
  
  public void log(Level l, Object message)
  {
    this.log.log(FQCN, l, message, null);
  }
  
  public void log(Level l, Object message, Throwable t)
  {
    this.log.log(FQCN, l, message, t);
  }
}
