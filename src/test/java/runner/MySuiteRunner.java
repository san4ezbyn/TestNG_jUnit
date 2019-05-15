package runner;

import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.List;

public class MySuiteRunner {
    public static void main(String[] args) {
        TestNG tng = new TestNG();

        XmlSuite suite = new XmlSuite();
        suite.setName("My some suite tests");

        List<String> files = new ArrayList<>();
        files.addAll(new ArrayList<String>() {{
            add("./src/test/resources/myGroupRunner.xml");
            add("./src/test/resources/myParallel.xml");
            add("./src/test/resources/myClassXMLrunner.xml");

        }});
        suite.setSuiteFiles(files);

        List<XmlSuite> suites = new ArrayList<>();
        suites.add(suite);
        tng.setXmlSuites(suites);

        tng.run();
    }
}