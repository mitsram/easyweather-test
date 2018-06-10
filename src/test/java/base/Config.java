package base;

public interface Config {

    final String devicePlatform = System.getProperty("device", "android");
    final String grid = System.getProperty("grid", "false");
    final String gridHub = System.getProperty("hub", "http://" + "localhost" + ":4444/wd/hub");
}