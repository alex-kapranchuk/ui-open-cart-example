import bussiness.HeaderPageBL;
import bussiness.HomePageBL;
import bussiness.ProductPageBL;
import bussiness.SearchPageBL;
import enums.URLs;
import navigation.Navigation;
import org.testng.annotations.Test;

public class AddToCartTests extends BaseTest{

    @Test
    public void addToCardFeatured(){
        new Navigation().navigateToUrl(URLs.BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.
                searchFoundProduct()
                .selectRandomProductForBuy();
        ProductPageBL productPageBL = new ProductPageBL();
        productPageBL.
                clickOnAddToCartButton();
        HeaderPageBL headerPageBL = new HeaderPageBL();
        headerPageBL.
                verifyItemsCounter1();
        productPageBL.
                deleteFromCart();
        headerPageBL.
                verifyItemsCounter0();
    }
}
