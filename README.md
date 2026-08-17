# DOSW_Lab2_Aguirre_Gonzalez_Nieto-

## SOLID Principles, Design Patterns, UML Class Diagrams, and Advanced Object-Oriented Programming

**Course:** DOSW — Software Development and Operations  
**Institution:** Escuela Colombiana de Ingeniería Julio Garavito  
**Activity:** Express Hackathon 2026-2  
 
---

## 1. Introduction

This laboratory aims to apply fundamental and advanced software development concepts through the implementation of different practical challenges using the Java programming language.

The laboratory focuses on object-oriented software design, emphasizing principles such as **SOLID, encapsulation, polymorphism, and immutability**, as well as the appropriate use of **design patterns**.

The challenges represent different real-world scenarios that require flexible, maintainable, and reusable software solutions. To address these problems, the laboratory incorporates creational, structural, and behavioral design patterns, together with Java features such as **Streams** and project management tools such as **Maven**.

Additionally, the laboratory includes the creation of **UML class diagrams**, automated testing, and the use of **Git** for collaborative development and version control.

Through these activities, the laboratory connects theoretical concepts of software design and object-oriented programming with practical problems, encouraging the development of organized, understandable, maintainable, and extensible software solutions.

---

## 2. General Objective

To apply software design principles, object-oriented programming concepts, and design patterns through the implementation of different solutions in Java, using tools such as Maven, Java Streams, UML, automated testing, and Git to develop organized, maintainable, and collaborative software.

---

## 3. Specific Objectives

- Apply **SOLID principles** to the design of different software solutions.
- Implement and justify appropriate **design patterns** according to the requirements of each challenge.
- Apply advanced object-oriented programming concepts, including **encapsulation, polymorphism, and immutability**.
- Use **Java Streams** to process collections, filter information, transform data, and calculate results.
- Design **UML class diagrams** to represent classes, attributes, methods, and relationships.
- Develop **automated tests** to verify business rules and expected behavior.
- Organize the project using **Apache Maven** with a clear source code and test structure.
- Use **Git** to support collaborative development and document team contributions.
- Develop solutions that are **readable, reusable, extensible, and maintainable**.

---

## 4. Scope

This laboratory includes the implementation of different challenges related to business situations and everyday systems. Each challenge focuses on one or more software design concepts, including SOLID principles, design patterns, object-oriented programming, Java Streams, testing, and UML.

The challenges cover the following scenarios:

1. **Don Pepe's Store** — Product management, customer discounts, SOLID principles, polymorphism, encapsulation, immutability, and Java Streams.
2. **The Five-Star Chef** — Customized hamburger construction using the Builder design pattern.
3. **The Kingdom of Vehicles** — Vehicle families, categories, object creation, design patterns, and Java Streams.
4. **The Currency Exchange Scam** — Currency conversion using different exchange rates and appropriate software design.
5. **Customized Coffee** — Coffee customization using the Decorator design pattern.
6. **Talk to Technical Support** — Ticket processing using the Chain of Responsibility pattern.
7. **The Magic Remote Control** — Device actions, action history, and undo functionality using an appropriate design pattern.
8. **The UML Zoo** — Object-oriented system design represented through a UML class diagram.

Each implemented challenge includes executable code, documentation of the design decisions, relevant tests, and evidence of its correct execution.

---

## 5. Methodology

The laboratory was developed using a practical and collaborative approach.

First, the requirements of each challenge were analyzed to identify the necessary entities, responsibilities, relationships, and behaviors. Then, the software design principles and patterns that best suited each problem were selected.

The solutions were implemented using **Java and Maven**, with each challenge organized into its corresponding package. Object-oriented programming principles were applied throughout the development process to maintain clear responsibilities and reduce unnecessary coupling.

**Java Streams** were used for collection processing and calculations whenever required. Automated tests were also developed to verify the main business rules and expected behavior of the solutions.

Finally, **Git** was used as the version control system, allowing each team member to contribute through meaningful commits. The solutions were documented together with their corresponding design patterns, tests, UML diagrams when applicable, and execution evidence.

---

## 6. Technologies and Tools

The following technologies and tools were used during the development of the laboratory:

- **Java**
- **Apache Maven**
- **Java Streams**
- **JUnit**
- **Git**
- **GitHub**
- **UML**
- **IntelliJ IDEA / Visual Studio Code**

---

## 7. Project Structure

```text
dosw-lab-02/
├── pom.xml
├── README.md
├── diagrams/
│   └── reto8-zoo-class-diagram.png
└── src/
    ├── main/
    │   └── java/
    │       └── edu/
    │           └── eci/
    │               └── dosw/
    │                   ├── Application.java
    │                   ├── reto1/
    │                   ├── reto2/
    │                   ├── reto3/
    │                   ├── reto4/
    │                   ├── reto5/
    │                   ├── reto6/
    │                   ├── reto7/
    │                   └── reto8/
    └── test/
        └── java/
            └── edu/
                └── eci/
                    └── dosw/
```

## Challenge development
## Challenge 1 - Don Pepe's Store


## Challenge 2 — The Five-Star Chef

A chef prepares customized hamburgers. A hamburger may include bread, meat, cheese, vegetables, sauces, and other optional ingredients.

### Requirements

- Build each hamburger step by step.
- Allow the user to select custom ingredients.
- Generate the final hamburger from the selected ingredients.
- Use Java Streams to calculate the total price.
- Display:
  - Every selected ingredient.
  - The final price.
  - A final summary of the customized hamburger.

### Design Pattern Documentation

| Item | Team Explanation |
|------|------------------|
| **Design Pattern Category** | **Creational** |
| **Pattern Used** | **Builder** |
| **Justification** | We chose the Builder pattern because a hamburger can be created with different combinations of ingredients. Some ingredients are optional, and the user can decide which ones to include. Using a builder allows us to create the hamburger step by step instead of having a constructor with many parameters. It also makes the code easier to read and modify when we want to add new ingredients. |
| **How It Was Applied** | We created the `HamburgerBuilder` interface with the methods needed to build the hamburger, such as adding bread, meat, cheese, vegetables, sauces, and other ingredients. `ConcreteHamburgerBuilder` implements those methods and keeps the selected ingredients while the hamburger is being built. When the user finishes selecting the ingredients, the `build()` method creates the final `Hamburger` object. The `Reto2ChefHamburguesa` class is responsible for interacting with the user and sending their selections to the builder. Finally, the `Hamburger` calculates the total price using Java Streams and displays the selected ingredients and the final price. |

### Evidence








