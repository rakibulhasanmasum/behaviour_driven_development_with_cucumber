package com.trucklagbe.cucumber;

import com.trucklagbe.managers.DatabaseManager;
import com.trucklagbe.managers.PageObjectManager;
import com.trucklagbe.managers.WebDriverManager;

public class TestContext {
    private final WebDriverManager webDriverManager;
    private final PageObjectManager pageObjectManager;
    public final ScenarioContext scenarioContext;
    public final DatabaseManager databaseManager;

    public TestContext(){
        webDriverManager = new WebDriverManager();
        pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
        scenarioContext = new ScenarioContext();
        databaseManager = new DatabaseManager();
    }

    public WebDriverManager getWebDriverManager() {
        return webDriverManager;
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }

    public ScenarioContext getScenarioContext() {
        return scenarioContext;
    }

    public DatabaseManager getDatabaseManager() {
        return databaseManager;
    }
}
