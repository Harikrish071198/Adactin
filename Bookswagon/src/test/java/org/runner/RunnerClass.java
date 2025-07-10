package org.runner;

import org.execution.TC01_BrowserLaunch;
import org.execution.TC02_LoginPage;
import org.execution.TC03_FictionBooksPage;
import org.execution.TC04_BiharDiariesPage;
import org.execution.TC05_AgainFictionBooksPage;
import org.execution.TC06_CartPage;
import org.execution.TC07_ShipingPage;
import org.execution.TC08_AgainLoginPage;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ TC01_BrowserLaunch.class, TC02_LoginPage.class, TC03_FictionBooksPage.class,
		TC04_BiharDiariesPage.class, TC05_AgainFictionBooksPage.class, TC06_CartPage.class, TC07_ShipingPage.class,
		TC08_AgainLoginPage.class

})
public class RunnerClass {

}
