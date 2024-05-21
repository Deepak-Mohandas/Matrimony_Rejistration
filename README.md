# Matrimony_Registration
This project automates the process of registering on a matrimony website using Selenium WebDriver, Maven, and Java. 


## Features

   - **Automated Form Filling** :  The script automates the entire process of filling out the registration form on a matrimony website.
   - **Element Interaction**: Demonstrates interaction with various web elements like text fields, buttons, dropdowns, and checkboxes.
   - **Wait Handling**: Uses Thread.sleep() for wait handling to ensure elements are loaded before interacting with them (can be improved using explicit waits).
   - **XPath and CSS Selectors**: Utilizes XPath and CSS Selectors to locate and interact with web elements.

### 1. Automated Form Filling
- **Description**: The script automates the entire process of filling out the registration form on a matrimony website, reducing manual effort and time.
- **Benefit**: Saves time and ensures consistency by automating repetitive tasks.

### 2. Element Interaction
- **Description**: Demonstrates interaction with various web elements such as text fields, buttons, dropdowns, and checkboxes.
- **Types of Elements**:
  - **Text Fields**: Inputs text into form fields.
  - **Buttons**: Clicks buttons to submit forms or navigate.
  - **Dropdowns**: Selects options from dropdown menus.
  - **Checkboxes**: Checks or unchecks boxes as required.
- **Benefit**: Provides a comprehensive example of how to interact with different types of web elements.

### 3. Wait Handling
- **Description**: Uses `Thread.sleep()` for wait handling to ensure elements are loaded before interacting with them.
- **Improvement Suggestions**:
  - **Explicit Waits**: Can be improved using explicit waits (like WebDriverWait in Selenium) to wait for specific conditions to be met before proceeding.
- **Benefit**: Ensures the script interacts with elements only after they are fully loaded, reducing errors.

### 4. XPath and CSS Selectors
- **Description**: Utilizes XPath and CSS Selectors to locate and interact with web elements.
- **Techniques**:
  - **XPath**: Provides flexible navigation through elements and attributes in an XML document.
  - **CSS Selectors**: Allows selection of elements based on id, class, type, attributes, etc.
- **Benefit**: Demonstrates effective ways to pinpoint and interact with web elements, ensuring accuracy and efficiency.


### Prerequisites
- Ensure you have [Java](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) installed.
- Install [Selenium WebDriver](https://www.selenium.dev/documentation/webdriver/).
- Install [Maven].

  ### Setup and Installation
  1. **Clone the Repository**:
     ```sh
     git clone https://github.com/yourusername/matrimony-registration.git
     cd matrimony-registration
     ```
  2. **Install Maven dependencies**:
    ```sh
    maven Install
    ```
    Ensure you have the necessary libraries for Selenium. If you're using Maven, your `pom.xml` should include:
    ```xml
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>3.141.59</version>
    </dependency>
    ```

## Examples of Use
- Automating repetitive form submissions.
- Testing the registration process on a website.

    
