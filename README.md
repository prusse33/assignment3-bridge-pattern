# Assignment 3 — Bridge Pattern

## Software Design Patterns

This project demonstrates the implementation of the **Bridge Design Pattern** in Java.

### Project Topic

Movie Streaming System

The project separates movie types from streaming platform implementations. This allows movie types and streaming platforms to be developed and changed independently.

## Bridge Pattern Components

### Abstraction
`Movie`

The abstract `Movie` class represents the abstraction and stores a reference to a `StreamingPlatform`.

### Refined Abstractions
- `RegularMovie`
- `PremiumMovie`

These classes extend `Movie` and define different types of movies.

### Implementor
`StreamingPlatform`

The `StreamingPlatform` interface defines the operations that every streaming platform must provide.

### Concrete Implementors
- `NetflixPlatform`
- `AmazonPrimePlatform`

These classes implement the `StreamingPlatform` interface and provide platform-specific behavior.

### Client
`Main`

The `Main` class creates movies with different streaming platforms and demonstrates that the platform can be changed at runtime without changing the movie abstraction.

## Project Structure

```text
src/
└── bridge/
    ├── StreamingPlatform.java
    ├── NetflixPlatform.java
    ├── AmazonPrimePlatform.java
    ├── Movie.java
    ├── RegularMovie.java
    ├── PremiumMovie.java
    └── Main.java
```

## Clean Code Principles

1. **Separation of Responsibilities**  
   Movie classes handle movie-related behavior, while streaming platform classes handle platform-specific operations.

2. **Meaningful Names**  
   Classes and methods have clear names that describe their responsibilities, such as `Movie`, `StreamingPlatform`, `play()` and `stop()`.

3. **Small and Focused Classes**  
   Each class has a specific responsibility and contains only the functionality required for that role.

4. **No Duplicated Logic**  
   Platform-specific behavior is placed inside concrete platform classes instead of being duplicated in movie classes.

5. **Open for Extension**  
   New streaming platforms can be added by implementing the `StreamingPlatform` interface without modifying the existing `Movie` classes.

## Runtime Implementation Switching

The project demonstrates the main advantage of the Bridge pattern by allowing the implementation to be changed at runtime.

For example:

```java
premiumMovie.setPlatform(netflix);
```

The `PremiumMovie` object remains the same, while its streaming platform implementation changes.

## How to Run

1. Open the project in IntelliJ IDEA.
2. Make sure a Java JDK is configured.
3. Open `Main.java`.
4. Run the `main()` method.
5. Check the program output in the console.