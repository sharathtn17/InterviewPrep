package com.framework.pages;

import org.openqa.selenium.WebElement;

import com.framework.utility.DriverAction;

import funtionalcomponents.Page;

public class CartPage extends Page{
    public static String numOfItemsInCart="//div[@class='productInformation']/div[@class='productDescriptionAndPrice']/div/h4";
    public String ItemsInCart="(//div[@class='productInformation']/div[@class='productDescriptionAndPrice']/div/h4)[$]";
    public static String[] description;
	public static String Des;
	public String removeItemFromCart="(//li[@class='productPreview horizontal']/div[@class='controls']/div/div[@class='subtotalAndRemoveContainer']/button)[$]";
	
	public static String checkoutButton="//div[@class='orderSummaryCheckoutBtn']";
	public CartPage removeItemFromCart(int itemNum) {
		// TODO Auto-generated method stub
		System.out.println(itemNum+"#############");
		ItemsInCart=ItemsInCart.replace("$", Integer.toString(itemNum));
		Des=getText(ItemsInCart);
		System.out.println(Des+"@@@@@@@@@@@@@@");
		removeItemFromCart=removeItemFromCart.replace("$", Integer.toString(itemNum));
		System.out.println(removeItemFromCart+"@@@@@@@@@@@@@@");
		click(removeItemFromCart);
		return new CartPage();
		
		
		
	}
	
	
	@Override
	protected String pageName() {
		// TODO Auto-generated method stub
		return null;
	}


	public void proceedToCheckout() {
		// TODO Auto-generated method stub
		click(checkoutButton);
		
		
	}


	

}
