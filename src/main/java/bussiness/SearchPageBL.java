package bussiness;

import models.CurrencyModel;
import models.SearchModel;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.assertj.core.api.Assertions;

import pages.SearchPage;
import pages.containers.ProductsContainer;

import java.util.List;


import java.util.stream.Collectors;


public class SearchPageBL {

    private final SearchPage searchPage;


    public SearchPageBL() {
        this.searchPage = new SearchPage();
    }

    public void verifyProductDoNotFound() {
        String expectedMessage = "There is no product that matches the search criteria.";
        Assert.assertEquals(searchPage.getNoSuchProduct().getText(), expectedMessage, "Some products are found");
    }

    public void verifyCreatedProduct(SearchModel model) {
        Assertions.assertThat(searchPage.getProductFromList())
                .extracting(WebElement::getText)
                .describedAs("None of elements contains sub-string %s!", model.getCreatedProduct())
                .anyMatch(text -> text.contains(model.getCreatedProduct()));
    }

    public void verifyProductFound(SearchModel model) {

        List<ProductsContainer> productList = searchPage.getProducts();

        for (ProductsContainer elements : productList) {
            Assert.assertTrue(elements.getProductName().contains(model.getValidProduct()),
                    "Product is not found");
        }
    }

    public List<String> getProductsTitles() {
        return searchPage.getProducts().stream().map(ProductsContainer::getProductName).collect(Collectors.toList());
    }

    public void verifyCurrency(String expected) {
        List<WebElement> productList = searchPage.getProductPrice();

        for (WebElement productListItem : productList) {
            Assert.assertEquals(productListItem.getText().replaceAll("[^$€£₴]", ""),
                    expected, "Currency does not match");
        }
    }
}