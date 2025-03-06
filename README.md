# Travel Planner and Expense Manager (Console-Based Java Application)

## Overview
This console-based Java application is a **Travel Planner and Expense Manager** designed to help users organize their trips efficiently. Users can **add travel details, manage expenses, analyze budgets, and check weather information** for their destinations. The program allows users to **track their spending** and **compare it with their allocated budget**, ensuring better financial planning for trips.

## Features
- **Add Travel Details**: Store information such as destination, trip duration, purpose, and budget.
- **Update Expense Details**: Record expenses for transportation, accommodation, meals, and activities.
- **View Travel Summary**: Get an overview of total expenses, savings, and category-wise spending.
- **Weather Information**: Retrieve basic weather details for popular destinations.
- **Budget Analysis**: Check if you are overspending, saving, or perfectly utilizing your budget.
- **List All Travel Details**: View all stored travel records.
- **User-Friendly Console Menu**: Easy navigation through different features.

## How It Works
1. Run the application from the **Main.java** file.
2. The menu-driven interface allows users to select options for managing travel details.
3. Travel details are stored in a **HashMap**, indexed by destination name.
4. Expenses are calculated using the **ExpenseManager** class.
5. The **BudgetAnalyzer** evaluates the total spending against the budget.
6. The **WeatherInfo** class provides weather details for selected destinations.

## Technologies Used
- **Java** (Core Java, OOP concepts)
- **Collections Framework** (HashMap for data storage)
- **Console-based UI** (Scanner for user input)

## How to Run
1. **Compile and run** the `Main.java` file.
2. **Follow the on-screen prompts** to add and manage travel details.
3. Select **option 7** to exit the program.

## Future Enhancements
- **File storage support** for persistent data.
- **Live weather API** integration.
- **Expense breakdown by categories with graphs**.
