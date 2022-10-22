package account;

import com.orcas.autoconfigure.AptosProperties;
import com.orcas.client.AccountClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author Orcas
 * @date 2022/10/22
 */
@SpringBootTest(classes = {AccountClient.class, AptosProperties.class})
@RunWith(SpringRunner.class)
public class AccountClientTests {
    private static final String ADDRESS = "0xebb677875cb8bdc5e047272a54d941baa67fd21972084397add3253404a0a2e4";
    @Resource
    private AccountClient accountClient;

    @Test
    public void testGetAccount() {
        System.out.println(accountClient.getAccount(ADDRESS));
    }

    @Test
    public void testGetAccountResources() {
        accountClient.getAccountResource(ADDRESS).forEach(System.out::println);
    }
}
