package system.tasks;

import base.BasePage;
import freecrm_page_library.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTasks extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testCreateNewTaskDP")
    public void testCreateNewTask(String email, String password, String title, String assignedToIndex, String typeIndex, String dueDate, String contact, String deal,
                                  String caseName, String closeDate, String description, String completion, String priorityIndex,
                                  String statusIndex, String text) {

        InitialPage initialPage = new InitialPage();
        AuthenticationPage authenticationPage = initialPage.clickOnLoginButton();
        HomePage homePage = authenticationPage.doSignIn(email, password);
        TasksPage tasksPage = homePage.systemBar.navigateToTasksPage();
        CreateNewTaskPage createNewTaskPage = tasksPage.clickOnCreateNewTaskButton();
        createNewTaskPage.createNewTask(title, Integer.parseInt(assignedToIndex), Integer.parseInt(typeIndex), dueDate, contact, deal, caseName, closeDate, description, completion, Integer.parseInt(priorityIndex), Integer.parseInt(statusIndex));

        Assert.assertEquals(createNewTaskPage.getTaskTitleText(), text);
    }
}
