package org.runner;

import org.execution.TC01_SauceLoginPage;
import org.execution.TC02_ProductPage;
import org.execution.TC03_CheckoutPage;
import org.execution.TC04_InformationPage;
import org.execution.TC05_OverviewPage;
import org.execution.TC06_FinishPage;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TC01_SauceLoginPage.class, TC02_ProductPage.class, TC03_CheckoutPage.class, TC04_InformationPage.class,
		TC05_OverviewPage.class,TC06_FinishPage.class

})
public class RunnerClass {

}
