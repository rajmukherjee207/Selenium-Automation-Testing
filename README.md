# SauceDemo Test Automation

This project contains automated test cases for the [SauceDemo](https://www.saucedemo.com/) website using Selenium WebDriver and TestNG. The tests are written in Java and manage dependencies using Maven.

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Running Tests](#running-tests)
- [Project Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)

## Installation

To set up this project on your local machine, follow these steps:

1. **Clone the Repository**:
    ```bash
    git clone https://github.com/your-username/saucedemo-automation.git
    cd saucedemo-automation
    ```

2. **Install Maven Dependencies**:
    ```bash
    mvn clean install
    ```

3. **Download WebDriver**:
   - This project uses [WebDriverManager](https://github.com/bonigarcia/webdrivermanager) to automatically download the correct WebDriver version for your browser.

## Usage

Ensure you have the following installed on your machine:

- [Java JDK 8 or higher](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org/install.html)
- [Google Chrome](https://www.google.com/chrome/)

### Running Tests

To run the tests, use the following Maven command:

```bash
mvn test
saucedemo-automation/
│
├── src/
│   ├── main/
│   └── test/
│       ├── java/
│       │   └── automationTesting/
│       │       └── SauceDemoTest.java
│       └── resources/
│           └── testng.xml
│
├── pom.xml
└── README.md

