package actions;

import org.openqa.selenium.support.PageFactory;
import pages.InventoryPage;
import utils.HelperClass;
import org.openqa.selenium.support.ui.Select;


public class InventoryPageAction {
    InventoryPage inventoryPage = null;
    Select items = new Select(inventoryPage.itemName);
    public InventoryPageAction() {
        this.inventoryPage = new InventoryPage();
        PageFactory.initElements(HelperClass.getDriver(), inventoryPage);
    }

    // Select an item
    public void clickEditInventory() {
        inventoryPage.editInventory.click();
    }
    public void selectedItem(String itemName) {
        items.selectByVisibleText(itemName);
    }

    public void setQuantity(String qty) {
        inventoryPage.quantity.sendKeys(qty);
    }

    public void setPrice(String price) {
        inventoryPage.price.sendKeys(price);
    }

    public void clickSaveButton() {
        inventoryPage.saveButton.click();
    }

    public void editInventory(String itemName, String qty, String price) {
        this.selectedItem(itemName);
        this.setQuantity(qty);
        this.setPrice(price);
        this.clickSaveButton();
    }

}
