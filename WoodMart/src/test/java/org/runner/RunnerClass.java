package org.runner;

import org.execution.TC01_LoginPage;
import org.execution.TC02_MyAccountPage;
import org.execution.TC03_ShopPage;
import org.execution.TC04_SmartWatchPage;
import org.execution.TC05_AgainShopPage;
import org.execution.TC06_CheckoutPage;
import org.execution.TC07_OrderConfirmationPage;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TC01_LoginPage.class, TC02_MyAccountPage.class, TC03_ShopPage.class, TC04_SmartWatchPage.class,
		TC05_AgainShopPage.class, TC06_CheckoutPage.class, TC07_OrderConfirmationPage.class

})
public class RunnerClass {

}
