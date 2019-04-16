package com.bawei.auto;

import java.util.List;

import org.omg.CORBA.INTERNAL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.internal.NewProfileExtensionConnection;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FireAuto {
	public static void main(String[] args) {
		//chrome  第一种方式只能打开浏览器
		
		//1:System.setProperty("webdriver.chrome.driver", "C:\\Users\\gxt\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.driver", "src/chromedriver.exe");
		WebDriver  webDriver=new ChromeDriver();  
		webDriver.get("https://www.baidu.com/");
		/*//获取元素的方式1:根据id获取元素
		WebElement webElement=webDriver.findElement(By.id("kw"));
		String maxlenth=webElement.getAttribute("maxlength");
		System.out.println(maxlenth);
		webElement.sendKeys("八维，你好");
		WebElement webElement2=webDriver.findElement(By.id("su"));
		webElement2.click();
		//获取元素的方式2：根据标签名获取元素
		List<WebElement>  list=webDriver.findElements(By.tagName("input"));
		System.out.println(list.size());
		//获取元素的方式3：根据name获取元素
		WebElement  webElement3 = webDriver.findElement(By.name("wd"));
		System.out.println(webElement3.getAttribute("maxlength"));
		
		//获取元素的方式4:根据className样式名定位元素
		WebElement  webElement4 = webDriver.findElement(By.className("s_ipt"));
		System.out.println(webElement4.getAttribute("maxlength"));
		
		
		//获取元素的方式5:根据超链接定位元素
		WebElement  webElement5 = webDriver.findElement(By.linkText("新闻"));
		webElement5.click();
				
		//获取元素的方式6:根据部分超链接定位元素
		WebElement  webElement6 = webDriver.findElement(By.partialLinkText("推广"));
		webElement6.click();
		
		//获取元素的方式7:根据定位css樣式选择器,可以根据多个标签查询
		WebElement  webElement6 = webDriver.findElement(By.cssSelector("input[maxlength='255'][autocomplete='off']"));
		webElement6.sendKeys("北京");*/
		
		
		//获取元素的方式8:根据xpath
		WebElement  webElement7 = webDriver.findElement(By.xpath("//*[@id='kw']"));
		webElement7.sendKeys("北京");
		
		
		
		DesiredCapabilities  desiredCapabilities= 	new  DesiredCapabilities();
		//忽略浏览器的安全设置和缩放设置
		desiredCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, false);
		desiredCapabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, false);
		InternetExplorerDriver  internetExplorerDriver=new  InternetExplorerDriver(desiredCapabilities);
		
		
		
		
		//firefOX：注意2.53.1的selenuim不能兼容42以上的火狐浏览器
	
		/*System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver  webDriver2=new FirefoxDriver();  
		webDriver2.get("https://www.baidu.com/");
		WebElement webElement=webDriver2.findElement(By.id("kw"));
		String maxlenth=webElement.getAttribute("maxlength");
		System.out.println(maxlenth);
		webElement.sendKeys("北京，你好");
		WebElement webElement2=webDriver2.findElement(By.id("su"));
		webElement2.click();*/
		
		//IE
		/*System.setProperty("webdriver.ie.driver", "src/IEDriverServer.exe");
		WebDriver  webDriver3=new InternetExplorerDriver();  
		webDriver3.get("https://www.baidu.com/");
		//浏览器最大化
		Window  window=webDriver3.manage().window();
		window.maximize();
		//以下代码不管用？？
		WebElement webElement3=webDriver3.findElement(By.id("kw"));
		String maxlenth3=webElement3.getAttribute("maxlength");
		System.out.println(maxlenth3);
		webElement3.sendKeys("八维，你好");*/
		
		
	
	
	}

}
