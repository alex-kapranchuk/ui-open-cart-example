package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.containers.ProductsContainer;

import java.util.List;
import java.util.stream.Collectors;

public class SearchPage extends BasePage {

    @FindBy(xpath = "//*[@id='content']/p[2]")
    private WebElement noSuchProductTitle;
    @FindBy(xpath = "//p[contains(@class, 'price')]/span")
    private List<WebElement> productPriceExTax;
    @FindBy(xpath = ".//div[contains(@class, 'product-thumb')]//h4/a")
    private List<WebElement> productBlock;
    /**
     * List of products
     */
    @FindBy(xpath = ".//*[contains(@class,'product-layout')]")
    private List<WebElement> products;

    public WebElement getNoSuchProduct() {
        return noSuchProductTitle;
    }

    public List<ProductsContainer> getProducts() {
        return products.stream().map(ProductsContainer::new).collect(Collectors.toList());
    }

    public List<WebElement> getProductFromList() {
        return productBlock;
    }

    public List<WebElement> getProductPrice() {
        return productPriceExTax;
    }
}
