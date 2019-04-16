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
		//chrome  ��һ�ַ�ʽֻ�ܴ������
		
		//1:System.setProperty("webdriver.chrome.driver", "C:\\Users\\gxt\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.driver", "src/chromedriver.exe");
		WebDriver  webDriver=new ChromeDriver();  
		webDriver.get("https://www.baidu.com/");
		/*//��ȡԪ�صķ�ʽ1:����id��ȡԪ��
		WebElement webElement=webDriver.findElement(By.id("kw"));
		String maxlenth=webElement.getAttribute("maxlength");
		System.out.println(maxlenth);
		webElement.sendKeys("��ά�����");
		WebElement webElement2=webDriver.findElement(By.id("su"));
		webElement2.click();
		//��ȡԪ�صķ�ʽ2�����ݱ�ǩ����ȡԪ��
		List<WebElement>  list=webDriver.findElements(By.tagName("input"));
		System.out.println(list.size());
		//��ȡԪ�صķ�ʽ3������name��ȡԪ��
		WebElement  webElement3 = webDriver.findElement(By.name("wd"));
		System.out.println(webElement3.getAttribute("maxlength"));
		
		//��ȡԪ�صķ�ʽ4:����className��ʽ����λԪ��
		WebElement  webElement4 = webDriver.findElement(By.className("s_ipt"));
		System.out.println(webElement4.getAttribute("maxlength"));
		
		
		//��ȡԪ�صķ�ʽ5:���ݳ����Ӷ�λԪ��
		WebElement  webElement5 = webDriver.findElement(By.linkText("����"));
		webElement5.click();
				
		//��ȡԪ�صķ�ʽ6:���ݲ��ֳ����Ӷ�λԪ��
		WebElement  webElement6 = webDriver.findElement(By.partialLinkText("�ƹ�"));
		webElement6.click();
		
		//��ȡԪ�صķ�ʽ7:���ݶ�λcss��ʽѡ����,���Ը��ݶ����ǩ��ѯ
		WebElement  webElement6 = webDriver.findElement(By.cssSelector("input[maxlength='255'][autocomplete='off']"));
		webElement6.sendKeys("����");*/
		
		
		//��ȡԪ�صķ�ʽ8:����xpath
		WebElement  webElement7 = webDriver.findElement(By.xpath("//*[@id='kw']"));
		webElement7.sendKeys("����");
		
		
		
		DesiredCapabilities  desiredCapabilities= 	new  DesiredCapabilities();
		//����������İ�ȫ���ú���������
		desiredCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, false);
		desiredCapabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, false);
		InternetExplorerDriver  internetExplorerDriver=new  InternetExplorerDriver(desiredCapabilities);
		
		
		
		
		//firefOX��ע��2.53.1��selenuim���ܼ���42���ϵĻ�������
	
		/*System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver  webDriver2=new FirefoxDriver();  
		webDriver2.get("https://www.baidu.com/");
		WebElement webElement=webDriver2.findElement(By.id("kw"));
		String maxlenth=webElement.getAttribute("maxlength");
		System.out.println(maxlenth);
		webElement.sendKeys("���������");
		WebElement webElement2=webDriver2.findElement(By.id("su"));
		webElement2.click();*/
		
		//IE
		/*System.setProperty("webdriver.ie.driver", "src/IEDriverServer.exe");
		WebDriver  webDriver3=new InternetExplorerDriver();  
		webDriver3.get("https://www.baidu.com/");
		//��������
		Window  window=webDriver3.manage().window();
		window.maximize();
		//���´��벻���ã���
		WebElement webElement3=webDriver3.findElement(By.id("kw"));
		String maxlenth3=webElement3.getAttribute("maxlength");
		System.out.println(maxlenth3);
		webElement3.sendKeys("��ά�����");*/
		
		
	
	
	}

}
