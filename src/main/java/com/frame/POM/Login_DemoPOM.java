package com.frame.POM;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_DemoPOM {
		//WebDriver driver;
		@FindBy (id="username") private WebElement un;
		@FindBy (name="pwd") private WebElement pwd;
		@FindBy (xpath = "//div[text()='Login ']") private WebElement login;
		@FindBy (css = "a[class='content tasks']") private WebElement task;
		@FindBy (xpath = "//div[text()='Add New']") private WebElement Add;
		@FindBy (css = "div[class='item createNewCustomer']") private WebElement customer;
		@FindBy (css ="input[class='inputFieldWithPlaceholder newNameField inputNameField']") private WebElement name;
		@FindBy (css = "textarea[placeholder='Enter Customer Description']") private WebElement Descr;
		@FindBy (xpath = "//div[text()='Create Customer']") private WebElement create;
		@FindBy (xpath = "//a[text()='View Time-Track']") private WebElement view;
		@FindBy (xpath = "//a[text()='Lock Time-Track']") private WebElement lock;
		@FindBy (xpath = "//a[text()='Approve Time-Track']") private WebElement Approve;
		@FindBy (xpath = "Add Tasks from the List") private WebElement list;
		@FindBy (xpath ="//a[@id='logoutLink']")  private WebElement logout;
		//@FindBy (xpath = "//a[text()='View Time-Track']") private WebElement view;
		
	Login_DemoPOM(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}


	public WebElement getUn() {
		return un;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLogin() {
		return login;
	}


	public WebElement getTask() {
		return task;
	}


	public WebElement getAdd() {
		return Add;
	}


	public WebElement getCustomer() {
		return customer;
	}


	public WebElement getName() {
		return name;
	}


	public WebElement getDescr() {
		return Descr;
	}


	

	public WebElement getCreate() {
		return create;
	}



	public WebElement getView() {
		return view;
	}



	public WebElement getLock() {
		return lock;
	}


	

	public WebElement getApprove() {
		return Approve;
	}


	public WebElement getList() {
		return list;
	}

	public WebElement getLogout() {
		return logout;
	}


	
	
	
	
	

	}


		



