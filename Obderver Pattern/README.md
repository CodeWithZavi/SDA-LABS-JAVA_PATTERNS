# Observer Design Pattern in Java

This project demonstrates the **Observer Design Pattern** in Java. It allows multiple observer objects to automatically be notified when the state of a subject changes. Observers can represent different data formats (Hexadecimal, Octal, Binary), and they can be activated or deactivated dynamically.

## Features
- **Subject-Observer Relationship**: The `Subject` class notifies all active observers when its state changes.
- **Multiple Observer Types**: Includes observers to display the state in Hexadecimal, Octal, and Binary formats.
- **Dynamic Activation/Deactivation**: Observers can be turned on or off based on need.

## Classes

1. **Subject**: Manages the state and notifies observers of changes.
2. **Observer (Abstract Class)**: Defines the update method for all observers.
3. **HexaObserver**: Converts and displays the subject's state in hexadecimal.
4. **OctalObserver**: Converts and displays the subject's state in octal.
5. **BinaryObserver**: Converts and displays the subject's state in binary.

## How to Run

1. Clone or download the project files.
2. Compile and run `Subject.java`, which contains the `main` method.
3. Observe the output as the `Subject` changes state, notifying observers dynamically.

## Example Output
```First state change: 15 Hex String: F Octal String: 17 Binary String: 1111 Second state change: 50 Hex String: 32 Binary String: 110010```
In this example, the `OctalObserver` is deactivated after the first state change and does not react to the second change.

## How to Use

You can:
- Add more observers for different formats.
- Dynamically change the state of the subject and activate/deactivate observers using the `changeState()` method.

## License
This project is licensed under the MIT License.
