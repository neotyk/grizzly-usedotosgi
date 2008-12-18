package net.kungfoo.grizzly.sample.impl;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import net.kungfoo.grizzly.sample.App;

/**
 * Bundle activator.
 */
public class Activator implements BundleActivator {
  private App app;

  /**
   * {@inheritDoc}
   */
  public void start(BundleContext bundleContext) throws Exception {
    System.out.println("staring sample bundle");
    app = new App();
    app.start();
    System.out.println("stared sample bundle");
  }

  /**
   * {@inheritDoc}
   */
  public void stop(BundleContext bundleContext) throws Exception {
    System.out.println("stoping sample bundle");
    app.stop();
    System.out.println("stoped sample bundle");
  }
}
