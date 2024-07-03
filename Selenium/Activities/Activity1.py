# Import selenium from webdriver
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager

# Set up firefox driver with Webdriver manager
service = FirefoxService(GeckoDriverManager().install())
# Start the driver
with webdriver.Firefox(service=service) as driver:
    driver.get("https://v1.training-support.net/")
    # Page title
    print("Page title is: " + driver.title)
    # Find about us button and click
    driver.find_element(By.ID, "about-link").click()
    # New page title
    print("New page title is: " + driver.title)
