
  package designPatterns;
  
  import java.security.PublicKey;
  
  import org.basePage.com.BasePage; import org.openqa.selenium.By; import
  org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement; import
  org.openqa.selenium.interactions.Actions; import
  org.pageObject.com.ListingPage; import org.project.enums.WaitStrategy;
  
  import com.project.report.Logger;
  
  public class BAEhomePage2_Search extends BasePage {
  
  
  private By newsRoom =
  By.xpath("(//a[@class='top-level-navigation-link'])[5]");
  
  
  
  public BAEhomePage2_Search waitForHomePageLoad() throws Exception 
  {
  waitForPageLoad(); Thread.sleep(1500);
  
  return this; }
  
  
  // Test Case - 14 search logic
  
  // News and Events Search
  
  public ListingPage NewsEvents() {
  
  WebDriver driver = null; Actions objActions = new Actions (driver);
  
  objActions.moveToElement((WebElement) newsRoom);
  
  clickOn(newsRoom, "News Room search", WaitStrategy.VISIBLE);
  	
  Logger.info(newsRoom + " News Room item is clicked.");
  
  return new ListingPage(); }
  

  
  }
  
  
  
 