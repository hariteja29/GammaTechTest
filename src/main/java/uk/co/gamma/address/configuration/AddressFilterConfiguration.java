package uk.co.gamma.address.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AddressFilterConfiguration {

    @Value("${address.filter.enabled:true}") // Default to true
    private boolean addressFilterEnabled;

    public boolean isAddressFilterEnabled() {
        return addressFilterEnabled;
    }
}
