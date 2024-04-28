# Currency Conversion

This project is written in Java and allows users to convert a given amount from one currency to another. It utilizes the ExchangeRate-API available at [https://app.exchangerate-api.com/](https://app.exchangerate-api.com/).

## Project Structure

The project consists of two main packages:

- **Application:** Contains the `Main.java` and `UI.java` classes. `Main.java` is used to execute the program, while `UI.java` handles the user interface.
  
- **Models:** Includes the following classes:
  - `ConsultAPI`: Establishes an HTTP connection with the API and returns a String containing the JSON response.
  - `Converter`: Receives the target currency, the currency to convert to, the amount, and the record with JSON attributes. 
  - `ExchangeInfo` and `ExchangeValue`: Extract information from the initial JSON and get the converted values between the searched currency and the others.

## How to Use

1. Clone the repository.
2. Import the project into your preferred Java IDE.
3. Ensure you have the necessary dependencies installed.
4. Run the `Main.java` class to start the program.
5. Follow the on-screen instructions to convert currency values.

## API Usage

- This project uses the ExchangeRate-API to fetch and calculate currency conversion rates.
- Visit [https://app.exchangerate-api.com/](https://app.exchangerate-api.com/) to explore the API documentation and obtain your API key.
- Replace the placeholder API key in the `ConsultAPI.java` class with your own key to use the API.

## Dependencies

- Java JDK
- ExchangeRate-API
