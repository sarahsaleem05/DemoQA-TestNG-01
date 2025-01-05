Test Automation with TestNG
• This Java program automates UI testing of the DemoQA website using Selenium WebDriver and TestNG. It contains two test suites:

Test Suite 1: 
Radio Buttons
• The website will open in a browser.
• The test will navigate to the "Elements" section.
• It will click on the "Radio Button" tab.
• The test will select one of the radio button options (e.g., "Impressive").
• The selection will be verified to ensure the action was successful.

Test Suite 2: 
Buttons
• The website will open in a browser.
• The test will navigate to the "Elements" section.
• It will click on the "Buttons" tab.
• The test will interact with all the available button options:
  i) Double Click: Simulates a double-click action.
  ii) Right Click: Simulates a right-click action.
  iii) Single Click: Simulates a single-click action on the button labeled "Click Me."

Notes
• The program uses Selenium's Actions class for mouse actions like double-click and right-click.
• The JavaScriptExecutor is used for certain scenarios where the element might not be directly clickable.
