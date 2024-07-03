from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager

service = FirefoxService(GeckoDriverManager().install())
with webdriver.Firefox(service=service) as driver:
    driver.get("https://v1.training-support.net/selenium/login-form")
    print("Page title is: " + driver.title)

    # Find username and pwd fields
    username = driver.find_element(By.XPATH, "//input[@id='username']")
    password = driver.find_element(By.XPATH, "//input[@id= 'password']")
    #Send credentials
    username.send_keys("admin")
    password.send_keys("password")
    # click on the login button
    driver.find_element(By.XPATH, "//button[@class = 'ui button']").click()
    #Wait and find the message
    message = driver.find_element(By.XPATH, "//div[@id = 'action-confirmation']")
    print("Success Login message: " + message.text)

    #Close the browser
    driver.close()
