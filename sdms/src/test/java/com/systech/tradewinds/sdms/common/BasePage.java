package com.systech.tradewinds.sdms.common;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

/**
 * @author Systech
 *
 */
/**
 * @author Systech
 *
 */
public class BasePage {
	public static ChromeOptions options;
	public static WebDriver driver;
	public static Select select;
	public static org.openqa.selenium.Dimension dimension;
	public static Actions act;
	public static Robot robot;
	public static JavascriptExecutor js;
	public static Alert alert;
	public static Boolean boo;
	public static File file;
	public static File srcfile;
	public static File desfile;
	public static Dimension screenSize;
	public static Rectangle rectangle;
	public static BufferedImage img;
	public static FileInputStream fileInput;
	public static FileOutputStream fileOutput;
	public static Properties prop;
	public static Workbook workbook;
	public static WritableWorkbook wb;
	public static Sheet sheet;
	public static WritableSheet sh;
	public static ResultSetMetaData meta;
	public static WebDriverWait wait;
	public static Connection connection;
	public static StringSelection selection;
	public static Statement statement;
	public static TakesScreenshot takescreenshot;
	public static WebElement element;
	public static Point point;

	/**
	 * Get Excel Method
	 */
	public Object[][] getExcel(String filepath, int index) {
		Object[][] excelData = null;
		try {
			fileInput = new FileInputStream(filepath);
			workbook = Workbook.getWorkbook(fileInput);
			sheet = workbook.getSheet(index);
			int totalNoofCols = sheet.getColumns();
			int totalNoofRows = sheet.getRows();

			excelData = new String[totalNoofRows - 1][totalNoofCols];
			for (int i = 1; i <= totalNoofRows; i++) {
				for (int j = 0; j < totalNoofCols; j++) {
					excelData[i - 1][j] = sheet.getCell(j, i).getContents();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return excelData;

	}

	/**
	 * Write Excel Method
	 */
	public static Object[][] writeExcel(String filepath, int index, String Sheetname, ResultSet res) {
		Object[][] addexcelDaata = null;
		try {

			fileOutput = new FileOutputStream(filepath);
			wb = Workbook.createWorkbook(fileOutput);
			sh = wb.createSheet(Sheetname, index);

			if (res != null) {
				int position = 1;
				meta = res.getMetaData();
				for (int j = 0; j < meta.getColumnCount(); j++) {
					Label lb = new Label(j, 0, meta.getColumnLabel(j + 1));
					sh.addCell(lb);
				}
				while (res.next()) {
					for (int i = 0; i < meta.getColumnCount(); i++) {
						Label lb = new Label(i, position, res.getString(i + 1));
						sh.addCell(lb);
					}
					position++;
				}
				wb.write();
				wb.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return addexcelDaata;

	}

	/**
	 * Get Query from Database Method
	 */
	public static ResultSet getQuery(String DB_Name,String Qry) {
		ResultSet res = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+DB_Name+"","systech","systech");

			statement = connection.createStatement();

			res = statement.executeQuery(Qry);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	/**
	 * Get Browser Method
	 */
	public WebDriver invokeBrowser(String browser) {
String project = System.getProperty("user.dir");
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", project+"\\src\\Chrome\\chromedriver.exe");
			options = new ChromeOptions();
			options.addArguments("--start-maximized");
			options.setAcceptInsecureCerts(true);
			driver = new ChromeDriver(options);
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",project+ "\\src\\Browser\\geckodriver.exe");
		}
		return driver;
	}

	/**
	 * Get Property Method
	 */
	public static void getProp(String location) throws IOException {
		file = new File(location);
		fileInput = new FileInputStream(file);
		prop = new Properties();
		prop.load(fileInput);
	}

	/**
	 * Set Property Method
	 */
	public static void setProp(String location, String fName, String key, String value) throws IOException {
		file = new File(location);
		file.createNewFile();
		fileOutput = new FileOutputStream(file);
		prop = new Properties();
		prop.setProperty(key, value);
		prop.store(fileOutput, fName);
	}

	/**
	 * Take ScreenShot Method
	 */
	public static void screenshot(String filename) {
		try {
			takescreenshot = (TakesScreenshot) driver;
			srcfile = takescreenshot.getScreenshotAs(OutputType.FILE);
			desfile = new File("D:\\ScreenShots\\" + filename + ".png");
			FileHandler.copy(srcfile, desfile);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Selenium Commands
	 */
	public static void loadUrl(String pUrl) {
		driver.get(pUrl);
	}

	public static String currntUrl() {

		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public static void txtData(WebElement e, String value) {
		e.sendKeys(value);
	}

	public static void PropData(WebElement e, String value) {
		e.sendKeys(prop.getProperty(value));
	}

	public static void maxmize() {
		driver.manage().window().maximize();
	}

	public static void deleteAllCookies() {
		driver.manage().deleteAllCookies();
	}

	public static void setSize(int width, int height) {
		dimension = new org.openqa.selenium.Dimension(width, height);
		driver.manage().window().setSize(dimension);
	}

	public static void fulscreen() {
		driver.manage().window().fullscreen();
	}

	public static void NavigateUrl(String pUrl) {
		driver.navigate().to(pUrl);
	}

	public static void Title() {
		driver.getTitle();
	}

	public static void clearData(WebElement e) {
		e.clear();
	}

	public static void closeBrowser() {
		driver.close();
	}

	public static void quitBrowser() {
		driver.quit();
	}

	public static void windowPopup() {

		driver.get("http://username:password@url");
	}

	public static void activeElements(String txt) {
		driver.switchTo().activeElement().sendKeys(txt);

	}

	/**
	 * Robot Class for keyboard
	 */
	public static void minimize() {
		try {
			robot = new Robot();
		} catch (AWTException e) {

			e.printStackTrace();
		}
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_SPACE);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_ALT);
		robot.keyRelease(KeyEvent.VK_SPACE);
		robot.keyRelease(KeyEvent.VK_N);
	}

	public static void Print(String filename) {
		try {
			robot = new Robot();
			screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			rectangle = new Rectangle(screenSize);
			img = robot.createScreenCapture(rectangle);
			desfile = new File("D:\\ScreenShots\\" + filename + ".png");
			ImageIO.write(img, "png", desfile);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void imageUplaod(String location) {

		try {
			selection = new StringSelection(location);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
			robot = new Robot();

			robot.setAutoDelay(1000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);

			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			e.printStackTrace();

		}
	}
	
	public static void Downloaad(String locations,String extension) {
		file = new File(locations);
		File [] totalFiles = file.listFiles();
		for (File file : totalFiles) {
			if (file.getName().contains(extension)) {
				System.out.println("The file is downloded");
				break;
				
			}
			
		}
		
	}
	public static void F5() {
		try {
			robot = new Robot();

			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	/**
	 * Alert Commands
	 */
	public static void alrtkeys(String txt) {
		alert = driver.switchTo().alert();
		alert.sendKeys(txt);
	}

	public static void alrtacpt() {
		alert = driver.switchTo().alert();
		alert.accept();
	}

	public static void alrtDismis() {
		alert = driver.switchTo().alert();
		alert.dismiss();
	}

	/**
	 * wait Commends
	 */
	public static void impWait(long t) {
		driver.manage().timeouts().implicitlyWait(t, TimeUnit.SECONDS);
	}

	public static void expWait(WebElement e, long t) {
		wait = new WebDriverWait(driver, t);
		wait.until(ExpectedConditions.visibilityOf(e)).click();
	}

	public static void eleClickable(WebElement e, long t) {
		wait = new WebDriverWait(driver, t);
		element = wait.until(ExpectedConditions.elementToBeClickable(e));
		element.click();
	}

	public static void eleSelectable(WebElement e, long t) {
		wait = new WebDriverWait(driver, t);
		wait.until(ExpectedConditions.elementToBeSelected(e));

	}

	public static void fluentWait(String text) {
		Wait<WebDriver> waits = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(30)).ignoring(NoSuchElementException.class);

		WebElement ele = wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {

				return driver.findElement(By.xpath(text));
			}
		});
	}

	public static void sleep() throws InterruptedException {
		Thread.sleep(5000);
	}

	/**
	 * Autosuggestion Commmends
	 */
	public static void autosuggest(List<WebElement> e, String text) {
		for (WebElement ele : e) {
			String values = ele.getAttribute("innerHTML");
			System.out.println("The Values are "  + values ) ;
			if (values.equalsIgnoreCase(text)) {
				ele.click();
				
				break;
			}
		}
	}

	/**
	 * Calendar Commmends
	 */
	public static void selectYear(List<WebElement> e, String text) {
		for (WebElement ele : e) {
			String Year = ele.getText();
			if (Year.equalsIgnoreCase(text)) {
				ele.click();
				break;
			}
		}
	}

	public static void selectMonth(List<WebElement> e, String text) {
		for (WebElement ele : e) {
			String Month = ele.getText();
			if (Month.equalsIgnoreCase(text)) {
				ele.click();
				break;
			}
		}
	}

	public static void selectDay(List<WebElement> e, String text) {
		for (WebElement ele : e) {
			String Date = ele.getText();
			if (Date.equalsIgnoreCase(text)) {
				ele.click();
				break;
			}
		}
	}

	/**
	 * UI interactions Commands
	 */
	public static void clkElement(WebElement e) {
		if (e.isEnabled())
			e.click();
	}

	public static void chkBox(WebElement e) {
		e.click();
	}

	public static void btnClick(WebElement e) {
		if (e.isDisplayed())
			e.click();
	}

	public static void isEnabled(WebElement e) {

		if (e.isEnabled())
			System.out.println("The element is Enabled ");
		else {
			System.out.println("the Element is not Enabled ");
		}
	}

	public static void isDisplayed(WebElement e) {
		if (e.isDisplayed())
			System.out.println("The element is Displayed ");
		else {
			System.out.println("the Element is not Displayed ");
		}
	}

	public static void isSelected(WebElement e) {
		if (e.isSelected())
			System.out.println("The element is Selected ");
		else {
			System.out.println("the Element is not Selected ");
		}

	}

	public static void tooltip(WebElement e) {
		String text = e.getAttribute("Title");
		System.out.println("The tooltip text is " + text);

	}

	public static String getAttributes(WebElement eleXpath) {
		String value = eleXpath.getAttribute("innerHTML");
		return value;
	}

	/**
	 * select Commands
	 */
	public static void selectBytext(WebElement e, String text) {
		select = new Select(e);
		select.selectByVisibleText(text);
	}

	public static void selectByindex(WebElement e, int index) {
		select = new Select(e);
		select.selectByIndex(index);
	}

	public static void selectByvalue(WebElement e, String value) {
		select = new Select(e);

		select.selectByValue(value);
	}

	public static void Options(WebElement e) {
		select = new Select(e);
		List<WebElement> options = select.getOptions();
		System.out.println("The available options are" + options);
	}

	public static void deSelectAll(WebElement e) {
		select = new Select(e);
		select.deselectAll();
	}

	public static void deSelectBytext(WebElement e, String text) {
		select = new Select(e);
		select.deselectByVisibleText(text);
	}

	public static void deSelectByIndex(WebElement e, int index) {
		select = new Select(e);
		select.deselectByIndex(index);
	}

	public static void multiSelect(WebElement e, int index) {
		select = new Select(e);
		select.selectByIndex(index);
		select.selectByIndex(index);
		select.selectByIndex(index);

	}

	/**
	 * Action class
	 */
	public static void dragAndDrop(WebElement e1, WebElement e2) {

		WebElement from = e1;
		WebElement to = e2;
		act = new Actions(driver);
		act.dragAndDrop(from, to).build().perform();

	}

	public static void clickAndHold(WebElement e1, WebElement e2) {

		WebElement from = e1;
		WebElement to = e2;
		act = new Actions(driver);
		act.clickAndHold(from).moveToElement(to).release(to).build().perform();

	}

	public static void moveToEle(WebElement e) {
		act = new Actions(driver);
		act.moveToElement(e).click().perform();
	}

	public static void rightClick(WebElement e) {

		WebElement target = e;
		act = new Actions(driver);
		act.contextClick(target).perform();
	}

	public static void doubleClick(WebElement e) {

		WebElement target = e;
		act = new Actions(driver);
		act.doubleClick(target).perform();
	}

	public static void selectable(List<WebElement> e) {

		int listsize = e.size();
		act = new Actions(driver);
		act.keyDown(Keys.CONTROL).click(e.get(0)).click(e.get(1)).click(e.get(2)).click(e.get(3)).build().perform();
	}

	/**
	 * Keybord Commands
	 */
	public static void filters(WebElement e, String text) {
		e.sendKeys(text);
		e.sendKeys(Keys.RETURN);
	}

	public static void enter(WebElement e) {
		e.sendKeys(Keys.RETURN);
	}
	public static void keyDown_Enter(WebElement e) {
		e.sendKeys(Keys.ARROW_DOWN,Keys.RETURN);
	}

	public static void tab(WebElement e) {
		e.sendKeys(Keys.TAB);
	}

	public static void downArow(WebElement e) {
		e.sendKeys(Keys.ARROW_DOWN);
	}

	public static void upArow(WebElement e) {
		e.sendKeys(Keys.ARROW_UP);
	}

	public static void leftArow(WebElement e) {
		e.sendKeys(Keys.ARROW_LEFT);
	}

	public static void rightArow(WebElement e) {
		e.sendKeys(Keys.ARROW_RIGHT);
	}

	/**
	 * Navigation commands
	 */
	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void back() {
		driver.navigate().back();
	}

	public static void forward() {
		driver.navigate().forward();
	}

	public static void currentUrl() {
		driver.getCurrentUrl();
	}

	public static void navigateTo(String pUrl) {
		driver.navigate().to(pUrl);
	}

	public static void getPosition(WebElement e) {
		point = e.getLocation();
		int x = point.getX();
		int y = point.getY();
		System.out.println("The point location X " + x + "The Point Locationy y" + y);
	}

	public static void getColour(WebElement e) {
		String colour = e.getCssValue("background-colour");
		System.out.println("The Element colour " + colour);

	}

	public static void getHeight(WebElement e) {
		int height = e.getSize().getHeight();
		System.out.println("The Element height " + height);

	}

	public static void getWidth(WebElement e) {
		int width = e.getSize().getWidth();
		System.out.println("The Element height " + width);

	}

	/**
	 * JavaScirpt command
	 */
	public static void highlightEle(WebElement e) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", e);

	}

	public static void Reload() {
		js = (JavascriptExecutor) driver;
		js.executeScript("location.reload()");
	}

	// Scroll Down random Position
	public static void scrollDown() {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5000)");// history.go(0);
	}

	// ScrollUP random Position
	public static void scrollUp() {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(5000,0)");
	}

	// Scroll to Bottom Page
	public static void scrollottom() {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		// if again Scroll backTo Top
		// js.executeScript("window.scrollTo(0,0)","");

	}

	// Scroll to Specific Element
	public static void scrollSpecificEle(WebElement e) {
		js = (JavascriptExecutor) driver;
		js.executeScript("aruguments[0],scrollIntovveriew(true)", e);
	}

	// other way to click a element
	public static void jsClkEle(WebElement e) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", e);
	}

	// others ways to enter text
	public static void jsTxtData() {
		js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementByname('q')[0],value='text'", "");
	}

	public static void windowHandle(WebElement e1) {
		String parentWindow = driver.getWindowHandle();
		e1.click();
		Set<String> ChildWindows = driver.getWindowHandles();
		for (String newwindow : ChildWindows) {
			driver.switchTo().window(newwindow);
		}
	}

	public static void closewindowHandle(WebElement e1) {
		String parentWindow = driver.getWindowHandle();
		e1.click();
		Set<String> ChildWindows = driver.getWindowHandles();
		for (String allwindow : ChildWindows) {
			if (!allwindow.equals(parentWindow)) {
				driver.switchTo().window(allwindow);
			}

		}
	}

	public static void frameByindex(WebElement e) {
		driver.switchTo().frame(0);
	}

	public static void defaultContent() {
		driver.switchTo().defaultContent();
	}

	public static void frameBy(String text) {
		driver.switchTo().frame(text);
	}
   
}
