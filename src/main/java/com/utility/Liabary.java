package com.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Liabary {

	public static void custom_Sendkeys(WebElement element ,String value) {
		element.sendKeys("");
	}
	public static void custom_Click(WebElement element) {
		element.click();
	}
	public static void custom_HandleDropdown(WebElement element ,String text) {
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	
}
