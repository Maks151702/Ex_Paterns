package GeneratingPatterns.Builder;

public class EnterpriceWebsiteBuilder extends WebsiteBuilder{
    @Override
    void buildName() {
        website.setName("Enterprice web site");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        website.setPrice(8000);
    }
}
