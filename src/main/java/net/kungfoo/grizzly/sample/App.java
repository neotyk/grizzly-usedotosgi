package net.kungfoo.grizzly.sample;

import com.sun.grizzly.http.embed.GrizzlyWebServer;

import java.io.IOException;

/**
 * Sample grizzly usage.
 */
public class App {
  private GrizzlyWebServer webServer;

  public App() {
    webServer = new GrizzlyWebServer(8282, ".");
  }

  public void start() throws IOException {
    webServer.start();
  }

  public void stop() {
    webServer.stop();
  }
}
