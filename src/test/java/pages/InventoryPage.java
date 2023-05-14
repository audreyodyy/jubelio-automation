package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage {
    @FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[2]/div/div/div/div/div/div[1]/div[2]/div/button[2]")
    public WebElement editInventory;
    @FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div/div/div[1]/div/div/span/div/span")
    public WebElement itemName;
    @FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div/div/div[2]/div")
    public WebElement quantity;
    @FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div/div/div[3]/div")
    public WebElement onHand;
    @FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div/div/div[4]/div/div/span/div/div")
    public WebElement qtyTotal;
    @FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div/div/div[6]/div")
    public WebElement price;
    @FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div/div/div[7]/div/div/span/div/div")
    public WebElement total;
    @FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div/div/div[12]/div")
    public WebElement information;
    @FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[2]/div/div/div/div/div[3]/div/button")
    public WebElement saveButton;

}
