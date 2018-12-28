package runners;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import util.exceldata.BeforeSuite;
import util.exceldata.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.junit.runner.RunWith;
import java.io.IOException;

@RunWith(PersonalizedRunner.class)
@CucumberOptions(features = "src/test/resources/features/authentication.feature",
        tags = {"@TestCase1"},
        glue = {"stepdefinitions"},
        snippets = SnippetType.CAMELCASE)
public class Autenticacion {
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/authentication.feature");
    }
}
