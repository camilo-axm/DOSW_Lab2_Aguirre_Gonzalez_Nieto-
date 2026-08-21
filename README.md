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

## 8. Challenge development
## Challenge 1 - Don Pepe's Store
Don Pepe owns a store, but his monthly accounts do not balance because sales and discount calculations are not properly organized.

### Mission

Build a simple and well-structured sales system that allows a customer to:

1. Add products to a shopping cart.
2. Receive a discount according to the customer type.
3. Obtain a receipt containing:
   - Purchased products.
   - Total price.
   - Applied discount.
   - Final amount to pay.

### Business Rules

- New customers receive a **5% discount**.
- Frequent customers receive a **10% discount**.
- Product unit prices must not change after the product is created.
- Class attributes must be encapsulated.
- Access to state must occur through appropriate methods.
- Java Streams must be used to process products and calculate totals.

### Streams
- map: retrieves product prices.
- reduce: calculates the subtotal.
- filter: identifies products based on a condition.
- forEach: displays the products in the shopping cart.

### Solid
Polymorphism
Encapsulation
Immutability

### Design Pattern Documentation

| Item | Team Explanation |
|------|------------------|
| **Design Pattern Category** | pattern of behavior |
| **Pattern Used** | Strategy |
| **Justification** | The Strategy pattern is used because the discount calculation changes when the customer type changes. This pattern allows for encapsulating the discount calculation method. |
| **How It Was Applied** | The Discount class was created to calculate the discount. NewCustomer uses a 5% discount, and FrequentCustomer uses a 10% discount. The Customer class uses the received discount to calculate the discount. The strategies are implemented using lambda functions. |

### Evidence 
<img width="1222" height="523" alt="WhatsApp Image 2026-08-19 at 10 32 09 AM" src="https://github.com/user-attachments/assets/d899edc6-fe51-4580-ac70-9aaf11a2586d" />


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

#### Maven Compilation
The project was successfully compiled using Maven.
<img width="926" height="540" alt="image" src="https://github.com/user-attachments/assets/249e4bdf-02b1-4bb5-8ef7-dce8a9fd3be8" />

**Figure 1. Successful project compilation using Maven.**  
The screenshot shows the execution of the `mvn clean compile` command. The `BUILD SUCCESS` message confirms that the project was successfully cleaned and compiled without compilation errors.


#### User Selections

<img width="952" height="585" alt="image" src="https://github.com/user-attachments/assets/af6aaab0-3d1c-4e33-a383-365fb23ff919" />

**Figure 2. User selections during the customized hamburger creation process.**  
The screenshot shows the interactive execution of Challenge 2, where the user selects the bread, meat, cheese, vegetables, sauce, and additional ingredients. This demonstrates that the hamburger can be customized step by step according to the user's choices.

#### Final Customized Hamburger

<img width="913" height="532" alt="image" src="https://github.com/user-attachments/assets/6ec3d00e-aa65-4cfc-b6f7-3eceb50b356c" />

**Figure 3. Final customized hamburger and calculated price.**  
The screenshot shows the final hamburger generated from the ingredients selected by the user. The system displays every selected ingredient and calculates the final price, which in this execution is COP $13,600. The successful Maven execution also confirms that the application completed without errors.

### Relevant Tests

<img width="951" height="536" alt="image" src="https://github.com/user-attachments/assets/7ff2f228-3dfc-4992-a4ba-dc535fffb27f" />

**Figure 4. Successful execution of the automated tests.**  
The screenshot shows the execution of `HamburgerBuilderTest`. A total of three tests were executed, with zero failures and zero errors. The `BUILD SUCCESS` message confirms that all tests were completed successfully.

## Challenge 3 — The Kingdom of Vehicles

A dealership called **The Kingdom of Vehicles** sells land, water, and air vehicles.

### Vehicle Families

#### Land Vehicles

- Cars.
- Bicycles.
- Motorcycles.

#### Water Vehicles

- Motorboats.
- Sailboats.
- Jet skis.

#### Air Vehicles

- Airplanes.
- Light aircraft.
- Helicopters.

### Categories

- Economy.
- Luxury.
- Used.

Each category affects characteristics such as:

- Maximum speed.
- Comfort.
- Price.
- Equipment.

### Requirements

- Apply design patterns to the solution.
- Allow the user to select any number of vehicles.
- Allow selection by:
  - Vehicle family.
  - Category.
  - Model.
- Generate each requested vehicle.
- Use Java Streams to calculate the total price.
- Display a purchase summary for all selected vehicles.

  
### Design Pattern Documentation

| Item | Team Explanation |
|------|------------------|
| **Design Pattern Category** | creational |
| **Pattern Used** | Abstract Factory (families) + Factory Method (categories) |
| **Justification** | You need to create families of related objects (vehicles through: land/water/air) without coupling the client to specific classes, and the categories are a product that through the factory method can be created and assigned only by interacting with the interface and maintaining low coupling |
| **How It Was Applied** | VehicleFactory es la interfaz abstracta; cada XxxVehicleFactory crea la familia completa; Categorizer decide la categoría vía createCategory() |

### Evidences

<img width="1450" height="595" alt="image" src="https://github.com/user-attachments/assets/e9e88c0f-f32d-4cfe-b310-17cc8640350a" />

**Figure 1.**
successful compilation

<img width="1452" height="594" alt="image" src="https://github.com/user-attachments/assets/140ab57f-57ca-4aaf-b19f-7049aa598839" />

**Figure 2.**
successful execution of automated tests.
It is evident how the four tests carried out for different aspects of challenge three, such as the creation of the correct chosen classes, the calculation of data, their obtaining, the interaction and creation between classes, have been completed successfully, without any failure or error.

<img width="437" height="196" alt="image" src="https://github.com/user-attachments/assets/4ef22a51-1c2a-4417-ba7e-a574998de0b0" />

**Figure 3.**
execution of the run method of challenge 3. it can be seen how a main menu is generated for the use of the application.

<img width="390" height="675" alt="image" src="https://github.com/user-attachments/assets/b1b7a336-215c-4153-8bcf-e65823a5c2aa" />

**Figure 4.**
It can be seen how you can choose a vehicle by its type, model and category.

<img width="384" height="656" alt="image" src="https://github.com/user-attachments/assets/4b9792db-467f-440f-ac8b-e451df9ff563" />

**Figure 5.**
Here the purchase summary is shown with the vehicles obtained, their specifications 
and at the end the subtotal, a possible discount that can be entered and the total to be paid.

## Challenge 4 — The Currency Exchange Scam

A former currency exchange owner used the same exchange rate for every currency. The new owner needs a service that converts currencies using the correct rate.

### Supported Example Currencies

- USD.
- EUR.
- JPY.
- COP.

### Requirements

- Accept any number of currencies supported by the solution.
- Allow the user to enter multiple transactions.
- Allow one source amount to be converted into one or more destination currencies.
- Display:
  - Original amount.
  - Source currency.
  - Converted amount.
  - Destination currency.
- Use Java Streams when totals from multiple transactions must be grouped or accumulated.

### Design Pattern Documentation

| Item | Team Explanation |
|------|------------------|
| **Design Pattern Category** | Creational |
| **Pattern Used** | Factory Method |
| **Justification** | Factory was used so that the code that performs the conversions does not need to know the concrete implementations directly, but rather that function is delegated so that if a change is required it does not corrupt the main class. |
| **How It Was Applied** | The Rates class receives the source and destination currencies and provides the corresponding converter with its specific rate. Each currency pair can have a different rate, thus avoiding the use of a single rate for all conversions. |

### Evidence of the tests
<img width="1342" height="517" alt="image" src="https://github.com/user-attachments/assets/46458854-dfe3-4f04-9bc6-19531fbc4e5f" />

### Evidence compilation
<img width="440" height="198" alt="image" src="https://github.com/user-attachments/assets/4df44c8e-d789-4510-961f-b28287ce2314" />


<img width="892" height="312" alt="image" src="https://github.com/user-attachments/assets/771de83c-6f2e-48ff-8486-a4319863028b" />


<img width="1411" height="631" alt="image" src="https://github.com/user-attachments/assets/54e31eec-663e-4554-afb9-1c094077b5b8" />



## Challenge 5 — Customized Coffee

A creative coffee shop allows customers to customize coffee by adding toppings, sauces, and complements. Each topping adds a price and may be combined with other toppings.

The system must allow new toppings to be added without modifying the coffee base.

### Requirements

- Allow the user to select any number of toppings for each coffee.
- Allow multiple coffees to be created in the same execution.
- Display the final description and price of each coffee.
- Use Java Streams to calculate:
  - The total for each coffee, when appropriate.
  - The total price of all coffees.
- Allow new toppings to be added without changing the base coffee implementation.

### Design Pattern Documentation

| Item | Team Explanation |
|------|------------------|
| **Design Pattern Category** | Structural |
| **Pattern Used** | Decorator |
| **Justification** | The Decorator pattern was used because the system should allow users to add any number of toppings to a coffee without modifying the base coffee, making it easier to add ingredients. |
| **How It Was Applied** | Coffee defines the common interface for coffees. NormalCoffee represents the base coffee. ToppingDecorator takes a Coffee object and adds a description and price. Additional toppings extend ToppingDecorator, allowing users to combine multiple toppings. Java Streams are used to calculate the total price of the coffees. |

<img width="1138" height="420" alt="image" src="https://github.com/user-attachments/assets/1d0424a6-687f-4ab3-8433-5175c48928df" />


## Challenge 6 — Talk to Technical Support

A technical support system receives tickets with different complexity levels:

- Basic.
- Intermediate.
- Advanced.

Each ticket also has a priority:

- Low.
- Medium.
- High.

Technicians have specialties and a maximum priority level that they can handle. When one technician cannot resolve a ticket, it must be passed to the next technician in the chain.

### Requirements

- Allow the user to enter any number of tickets.
- Each ticket must include:
  - Description.
  - Difficulty level.
  - Priority.
- Use a **Chain of Responsibility** to process each ticket.
- Display which technician resolved each ticket.
- Mark unresolved tickets as pending escalation.
- Use Java Streams to generate statistics, such as:
  - Tickets by level.
  - Resolved tickets.
  - Pending tickets.
  - Average priority of resolved tickets.

### Design Pattern Documentation

| Item | Team Explanation |
|---|---|
| Design Pattern Category | Behavioral (Comportamiento) |
| Pattern Used | Chain of Responsibility |
| Justification | Un ticket puede ser resuelto por distintos técnicos según su nivel de dificultad, sin que quien crea el ticket sepa cuál técnico lo atenderá. Chain of Responsibility permite desacoplar al emisor de la solicitud de quién finalmente la procesa, y facilita agregar o reordenar técnicos sin modificar el código existente (cumple Open/Closed). |
| How It Was Applied | Se creó la clase abstracta `Technician`, que define el método `attend(Ticket)`: si el técnico puede resolver el ticket según su `maximumManageableDifficulty`, lo resuelve; si no, lo delega a su `supervisor` (siguiente eslabón). Las subclases `NoviceTechnician`, `IntermediateTechnician` y `SeniorTechnician` solo definen su nivel máximo. Los técnicos se encadenan con `setSupervisor()` (novice → intermediate → senior), y cada ticket se envía al primer eslabón (`novice.attend(ticket)`), escalando automáticamente hasta ser resuelto o quedar pendiente si nadie en la cadena puede atenderlo. |

#### Evidence

<img width="1432" height="564" alt="Captura de pantalla 2026-08-20 184256" src="https://github.com/user-attachments/assets/68a62b65-8c04-47e0-a1f9-7864deec4282" />

**Figure 1. Successful project compilation using Maven.** 
This screenshot shows how the project compiles correctly in Maven.

<img width="1429" height="645" alt="Captura de pantalla 2026-08-20 190443" src="https://github.com/user-attachments/assets/5e48ecdc-c35f-4eb6-b4e0-2ffb8e7d0773" />

**Figure 2. Successful project compilation using Maven.**

successful unit testing with Maven

<img width="484" height="927" alt="Captura de pantalla 2026-08-20 190700" src="https://github.com/user-attachments/assets/14331022-a49a-4c24-99d1-98b1b9536cb3" />

**Figure 3. Successful project compilation using Maven.**

application execution and run method

<img width="873" height="338" alt="Captura de pantalla 2026-08-20 190709" src="https://github.com/user-attachments/assets/a0bbcce7-2f46-43ed-8531-de784b617dfc" />

**Figure 4. successful execution and result.**

## Challenge 7 — The Magic Remote Control

A magic remote control executes actions on home devices such as:

- Lights.
- Doors.
- Music systems.
- Window blinds.

Each action may have parameters and may be undone after execution.

### Requirements

- Support actions with parameters, such as:
  - Setting volume.
  - Adjusting a blind position.
- Allow the user to execute any number of actions.
- Register the user who executed each action.
- Maintain a complete action history.
- Allow any individual action to be undone.
- Display a final summary containing:
  - Executed actions.
  - Users responsible for the actions.
  - Undone actions.
  - The final state or audit information required to identify who changed each device.

### Design Pattern Documentation

| Item | Team Explanation |
|------|------------------|
| **Design Pattern Category** | **Behavioral** |
| **Pattern Used** | **Command** |
| **Justification** | We chose the Command pattern because each action performed on a device can be represented as an independent object that knows how to execute and undo itself. This allows us to decouple the invoker (RemoteControl) from the internal logic of each device (Light, Door, MusicSystem, and WindowBlinds). It also makes it easier to maintain a complete action history and undo individual actions by their ID. |
| **How It Was Applied** | We created the Command interface with the methods execute(), undo(), getDescription(), and getUser(). Each concrete command implements the specific logic for its device, such as TurnOnLightCommand, SetVolumeCommand, AdjustBlindCommand, and OpenDoorCommand. Commands that modify a value, such as the volume or blind position, store the previous state (previousVolume, previousPosition) so it can be restored when undo() is called. The RemoteControl class acts as the invoker, executes the commands, maintains the action history, and allows individual actions to be undone by ID. The ActionRecord class stores the executed command together with its device, parameters, and status, allowing the complete execution history to be displayed. |


## Audit Evidence

The final output should make it possible to answer:

- **Who executed each action?**
  - Action #1 was executed by **Camilo**.
  - Action #2 was executed by **Camilo**.
  - Action #3 was executed by **Sara**.
  - Action #4 was executed by **Sara**.

- **Which actions were undone?**
  - **Action #2** was undone.
  - This action set the music system volume to **70**, and the undo operation restored the volume to **30**.

- **Which user changed each device?**
  - **Lights:** Camilo turned the lights ON.
  - **Music System:** Camilo set the volume to 70.
  - **Window Blinds:** Sara adjusted the blinds to 80%.
  - **Door:** Sara opened the door.

- **What is the complete execution history?**

  | Action | User | Description | Status |
  |--------|------|-------------|--------|
  | #1 | Camilo | Turn ON lights | EXECUTED |
  | #2 | Camilo | Set volume to 70 | UNDONE |
  | #3 | Sara | Adjust blinds to 80% | EXECUTED |
  | #4 | Sara | Open door | EXECUTED |

### Final Device State

```text
Lights: ON
Music volume: 30
Window blinds: 80%
Door: OPEN
```

### Evidence
#### Maven Compilation
The project was successfully compiled using Maven.

<img width="646" height="460" alt="image" src="https://github.com/user-attachments/assets/3461b447-f500-4ecc-bd3a-068fbd54f3fe" />

**Figure 1. Successful project compilation using Maven.**  
The screenshot shows the execution of the `mvn clean compile` command. The `BUILD SUCCESS` message confirms that the project was successfully cleaned and compiled without compilation errors.

### Final Challenge 7 Execution
<img width="662" height="293" alt="image" src="https://github.com/user-attachments/assets/c193214f-1f86-4785-a170-196a6c15a6b7" />

**Figure 2. Successful execution of the Magic Remote Control.**  
The screenshot shows the execution of Challenge 7 using the Command pattern. The system executes four actions on different home devices: turning on the lights, setting the music volume to 70, adjusting the window blinds to 80%, and opening the door. Each action is associated with the user who executed it. The screenshot also shows that action #2 was successfully undone, restoring the music volume to 30.

### Action History and Final Device State

<img width="684" height="346" alt="image" src="https://github.com/user-attachments/assets/6a2c475a-e2b9-4717-9876-25c4dbd9cab7" />

**Figure 3. Complete action history and final device state.**  
The screenshot shows the complete execution history of the Magic Remote Control. Each record includes the action ID, user, action, device, parameters, and execution status. Action #2 is marked as `UNDONE`, while the other actions remain `EXECUTED`. The final device state shows the lights as ON, the music volume at 30, the window blinds at 80%, and the door as OPEN. The `BUILD SUCCESS` message confirms that the application completed successfully without compilation or execution errors.

## Revelant Tests

<img width="673" height="591" alt="image" src="https://github.com/user-attachments/assets/10427f14-4d41-4061-b91f-da3549d89b01" />

**Figure 4. Successful execution of the automated tests.**  
The screenshot shows the execution of `Reto7Test` for Challenge 7. A total of 19 tests were executed, with zero failures, zero errors, and zero skipped tests. The tests verify command execution, individual action undo, device state changes, action history, and the behavior of the Magic Remote Control. The `BUILD SUCCESS` message confirms that all tests were completed successfully.




## Challenge 8 — The UML Zoo

ECI Zoo needs a class design for a zoo management application.

### Animals

The zoo contains:

- Mammals.
- Reptiles.
- Birds.

Each animal has:

- Name.
- Age.
- Characteristic sound.
- Diet.
- Preferred food.
- Weight.
- Height.
- Health status:
  - Healthy.
  - Sick.
  - Quarantine.
- Habitat.

### Caretakers

Each caretaker has:

- Name.
- Age.
- Specialty.
- Associations with one or more animals.

Caretakers may:

- Feed animals.
- Bathe animals.
- Clean habitats.

### Visitors

Visitors may:

- Register their name and age.
- Select favorite animals.
- Feed animals.
- Give tips to caretakers.
- Upload photographs of observed animals.

### Dynamic Animal Attributes

The design must support dynamic attributes such as:

- Fur color.
- Origin.
- Rarity.
- Medical history.
### Required Deliverable

Create a UML class diagram that applies:

- SOLID principles.
- Design patterns, when used.
- Advanced object-oriented design.

The UML diagram must include:

- Inheritance.
- Polymorphism.
- Associations between caretakers and animals.
- Associations between visitors, animals, and caretakers.
- Relevant interaction methods.
- Encapsulated attributes.
- Getters and setters where required by the design.

### UML Documentation

#### Main Classes and Responsibilities

| Class or Interface | Responsibility |
|---|---|
| Animal | She is responsible for managing general data and everything related to an animal, regardless of its specific class. it servers as template for specific type of Animals.|
| AnimalDecorator | It is responsible for creating and managing a given animal, taking into account new factors added when it is enveloped within this decorator; it serves as a template for specific decorators that, in this case, add attributes to make attributes dynamic. |
| HealthSatatus | It is an interface that functions as a template to generate health states, and each concrete class defines the behaviors for its state; it is assigned to animals to give them a specific health state. |
| Caretaker | He is the caretaker of the animals, he has behaviors to interact with them, in addition to knowing which ones are in his care. |
| Visitor | This class represents zoo visitors. It has behaviors for interacting with keepers and animals, and can also define and save animals that the visitor likes. |

#### Relationships

| Source | Relationship | Target | Multiplicity | Explanation |
|---|---|---|---|---|
| FurColorDecorator | Generalization | AnimalDecorator | N/A | FurColorDecorator extends AnimalDecorator to add fur color information to a decorated animal. |
| OriginDecorator | Generalization | AnimalDecorator | N/A | OriginDecorator extends AnimalDecorator to add origin information to a decorated animal. |
| RarityDecorator | Generalization | AnimalDecorator | N/A | RarityDecorator extends AnimalDecorator to add rarity information to a decorated animal. |
| MedicalHistoryDecorator | Generalization | AnimalDecorator | N/A | MedicalHistoryDecorator extends AnimalDecorator to add medical history information to a decorated animal. |
| AnimalDecorator | Generalization | Animal | N/A | AnimalDecorator inherits from Animal so decorators can be used polymorphically as if they were the Animal they wrap (Decorator pattern). |
| AnimalDecorator | Composition (wrappedAnimal) | Animal | 0 - 1 | Each AnimalDecorator holds and wraps exactly one Animal instance that it decorates. |
| Mammal | Generalization | Animal | N/A | Mammal is a concrete subclass of the abstract class Animal. |
| Reptile | Generalization | Animal | N/A | Reptile is a concrete subclass of the abstract class Animal. |
| Bird | Generalization | Animal | N/A | Bird is a concrete subclass of the abstract class Animal. |
| Animal | Composition (healthStatus) | HealthStatus | 0 - 1 | Each Animal owns exactly one HealthStatus object representing its current health condition. |
| Healthy | Realization | HealthStatus | N/A | Healthy implements the HealthStatus interface, defining behavior for a healthy animal state. |
| Sick | Realization | HealthStatus | N/A | Sick implements the HealthStatus interface, defining behavior for a sick animal state. |
| Quarantine | Realization | HealthStatus | N/A | Quarantine implements the HealthStatus interface, defining behavior for an animal in quarantine. |
| Caretaker | Association (animalsInCharge) | Animal | 0 - * | A Caretaker can be responsible for multiple animals (feeding, bathing, cleaning habitat). |
| Visitor | Association (favoriteAnimals) | Animal | 0 - * | A Visitor can mark multiple animals as favorites and interact with them (feed, upload photograph). |
| Visitor | Dependency | Caretaker | N/A | Visitor depends on Caretaker because its tipCaretaker() method uses Caretaker as a parameter. |

#### SOLID Application

| Principle | Application in the UML Design |
|---|---|
| Single Responsibility | Each class has one clear responsibility: `Animal` manages core animal data and behavior, `Caretaker` handles feeding/bathing/habitat cleaning, `Visitor` handles visiting-related actions, and each concrete decorator (`FurColorDecorator`, `OriginDecorator`, `RarityDecorator`, `MedicalHistoryDecorator`) is responsible for adding exactly one piece of extra information to an animal. |
| Open/Closed | The `AnimalDecorator` abstract class allows new decorators (e.g., a future `SizeDecorator`) to be added without modifying the existing `Animal` class or other decorators. Likewise, new `HealthStatus` implementations (like `Healthy`, `Sick`, `Quarantine`) can be added without changing the `HealthStatus` interface or classes that depend on it. |
| Liskov Substitution | Subclasses `Mammal`, `Reptile`, and `Bird` can be used wherever an `Animal` is expected without breaking behavior, since they override `getSound()` and `getDiet()` while preserving the base contract. Similarly, `AnimalDecorator` (and its subclasses) can be used anywhere an `Animal` is expected, and any `HealthStatus` implementation (`Healthy`, `Sick`, `Quarantine`) can replace another without breaking the `Animal` class that uses it. |
| Interface Segregation | The `HealthStatus` interface only exposes the methods relevant to health state (`canBeVisited()`, `requiresSpecialCare()`, `describe()`), so implementing classes are not forced to depend on unrelated methods outside their concern. |
| Dependency Inversion | `Animal` depends on the `HealthStatus` abstraction (interface) rather than on concrete classes like `Healthy` or `Sick`, allowing the health status implementation to vary independently. Similarly, `AnimalDecorator` depends on the abstract `Animal` type rather than a specific concrete animal subclass, enabling decorators to wrap any kind of animal. |

#### Design Patterns DOCUMENTATION

| Item | Team Explanation |
|------|------------------|
| **Design Pattern Category** | Structural Pattern |
| **Pattern Used** | Decorator |
| **Justification** | The zoo needs to add optional, combinable characteristics to an animal (fur color, origin, rarity, medical history) without modifying the `Animal` class or creating an explosion of subclasses for every possible combination of attributes. |
| **How It Was Applied** | The abstract class `AnimalDecorator` implements/extends `Animal` and holds a `wrappedAnimal` reference (composition). Concrete decorators (`FurColorDecorator`, `OriginDecorator`, `RarityDecorator`, `MedicalHistoryDecorator`) extend `AnimalDecorator`, each adding one new attribute and its corresponding behavior, while still being usable as an `Animal` and allowing decorators to be stacked on top of one another. |

| Item | Team Explanation |
|------|------------------|
| **Design Pattern Category** | Behavioral Pattern |
| **Pattern Used** | Strategy |
| **Justification** | An animal's health condition determines different behaviors (whether it can be visited, whether it requires special care), and this condition can change over time (healthy → sick → quarantine). Instead of using conditional logic inside `Animal`, each health state is encapsulated as an interchangeable algorithm/strategy. |
| **How It Was Applied** | The `HealthStatus` interface defines the common operations (`canBeVisited()`, `requiresSpecialCare()`, `describe()`), and the concrete classes `Healthy`, `Sick`, and `Quarantine` provide their own implementation of these operations. `Animal` holds a reference to a `HealthStatus` object (composition) and delegates health-related behavior to it through `getHealthStatus()` and `setHealthStatus()`, allowing the strategy to be swapped at runtime. |

| Item | Team Explanation |
|------|------------------|
| **Design Pattern Category** | Object-Oriented Principle (Class Hierarchy) |
| **Pattern Used** | Inheritance |
| **Justification** | Different types of animals (mammals, reptiles, birds) share common attributes and behaviors (name, age, habitat, health status) but differ in specific behaviors such as the sound they make and their diet, so a common base class with specialized subclasses avoids code duplication. |
| **How It Was Applied** | The abstract class `Animal` defines shared attributes (`name`, `age`, `weight`, `height`, `habitat`) and shared/abstract methods (`getSound()`, `getDiet()`), while `Mammal`, `Reptile`, and `Bird` extend `Animal` and override `getSound()` and `getDiet()` with their own specific implementations. |

#### Diagram

<img width="1905" height="1304" alt="reto8-zoo-class-diagram" src="https://github.com/user-attachments/assets/f2371fa6-7495-4f37-ae92-30941f677b9f" />

# 9. Team Members

| Name | GitHub Username | Main Contributions |
|---|---|---|
| Camilo Aguirre | camilo-axm | Implemented Challenge 2 (Five-Star Chef) using the Builder pattern: BuilderBurger interface, BuilderBurgerImpl, Burger and Topping classes, plus ChefDirector for predefined recipes. Implemented Challenge 7 (Magic Remote Control) using the Command pattern: Command interface, RemoteControl invoker with action history and undo support, ActionRecord, and concrete commands (TurnOnLightCommand, SetVolumeCommand, AdjustBlindCommand, OpenDoorCommand). |
| Sara Gonzalez | soffgnzlz11 | Challenge 1 (Don Pepe's Store) was implemented using the Strategy pattern, with the classes Customer, Discount, Product, NewCustomer, FrequentCustomer, Shoppingcart, and Reto1TiendaDonPepe. Challenge 4 (The Currency Exchange Scam) was implemented using the Factory Method pattern, with the classes Reto4, ConversionTransaction, Converter, ConverterCurrency, Currency, ExchangeRate, and Rates, where the Factory was applied. Challenge 5 (Customized Coffee) was implemented using the Decorator pattern, with the classes Reto5, Coffee, NormalCoffe, Topping, ToppingDecorator and CoffeDecorator where the Decorator pattern was applied.|
| Juan Nieto | TODO | TODO |


# 10. Repository Evidence

## Branching Strategy

The team used a Git branching strategy to organize the development process and keep the `main` branch stable.

- **`main`**: Contains the stable and final version of the project. Only completed and tested changes are merged into this branch.

- **`develop`**: Used to integrate and test the work developed by the team before merging it into `main`.

- **`feature/`**: Used for individual development tasks and challenges. Each team member can create a specific feature branch to work independently without affecting the stable code.

### Team Feature Branches

- **`/feature/CamiloAguirre_2026-2`**: Used by Camilo Aguirre to develop his assigned work for the semester.

- **`/feature/Camilo_Aguirre_reto2`**: Used to develop and implement Challenge 2.

- **`/feature/Camilo_Aguirre_reto7`**: Used to develop and implement Challenge 7
- 
- **`/feature/Sara_Gonzalez_reto1`**: Used to develop and implement Challenge 1
  
- **`/feature/Sara_Gonzalez_reto4`**: Used to develop and implement Challenge 4
  
- **`/feature/Sara_Gonzalez_reto5`**: Used to develop and implement Challenge 5
  
The general workflow was to develop and test changes in feature branches, integrate them into `develop`, and finally merge the stable version into `main`.



