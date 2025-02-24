from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.select import Select
with webdriver.Firefox() as driver:
    wait=WebDriverWait(driver,timeout=10)
    driver.get("https://training-support.net/webelements/alerts")
    print("the title of the page is: " ,driver.title)
    simpleAlert = driver.find_element(By.XPATH,"//*[@id=\"simple\"]")
    simpleAlert.click()

    alert=wait.until(EC.alert_is_present())
    print("Alert message: ",alert.text)
    alert.accept()

    result = driver.find_element(By.XPATH,"//*[@id=\"result\"]")
    print("The result after clicking on alert: ",result.text)
    driver.quit()