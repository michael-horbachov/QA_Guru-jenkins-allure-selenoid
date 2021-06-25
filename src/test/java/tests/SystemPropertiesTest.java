package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTest {

    @Test
    void readNullFromPropertyTest() {
        String value = System.getProperty("some_property");

        System.out.println(value);
    }
    // null

    @Test
    void setAndReadFromPropertyTest() {
        System.setProperty("some_property", "property_1");
        String value = System.getProperty("some_property");

        System.out.println(value);
    }
    // property_1

    @Test
    void readDefaultFromPropertyTest() {
        String value = System.getProperty("some_property", "default_property");

        System.out.println(value);
    }
    // default_property

    @Test
    void setAndReadDefaultFromPropertyTest() {
        System.setProperty("some_property", "property_1");
        String value = System.getProperty("some_property", "default_property");

        System.out.println(value);
    }
    // property_1

    @Test
    void readWithGradleFromPropertyTest() {
        String value = System.getProperty("browser", "chrome");

        System.out.println(value);
    }
    // safari

    @Test
    @Tag("terminal")
    void readWithTerminalFromPropertyTest() {
        String browser = System.getProperty("browser", "chrome");
        String version = System.getProperty("version", "91");

        System.out.println(browser);
        System.out.println(version);
    }
    // safari
    // 91

    // gradle clean some_run
    // gradle clean some_run -Dbrowser=firefox
    // gradle clean some_run -Dbrowser=firefox -Vversion=89

}