import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.TmsLink;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WikiSearchTest extends BaseTest {

    @Test
    @DisplayName("Поиск в википедии")
    @Severity(SeverityLevel.NORMAL)
    @TmsLink("www.Jira.com/TK-1")
    public void testSearch() {
        wikiHeadPage.openWiki();
        wikiHeadPage.inputFor("Марси");
        wikiHeadPage.clickSearch();
        wikiHeadPage.checkResult();
    }
}
