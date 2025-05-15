# 🚗 Car Dealership Inventory App

## A CLI application that manages vehicle inventory, allows searching, editing, and saving of dealership records.

This dealership management system gives the user the power to search, add, and remove vehicles from a digital car lot.  
It loads from and saves to a CSV file — so all changes persist between sessions.  
The app allows powerful filters, like searching by price, year, mileage, type, or even make & model.

Eventually, I’d love to expand this into a full GUI app, maybe connect it to a database, and allow real-world dealership teams to use it.  
But... let’s make sure this console version is street legal first 🏁.

---

## User Stories

These are the user-focused goals that shaped my design decisions and priorities while developing the app:

- **Menu Simplicity**: As a user, I want a simple and readable menu with numbered options to access exactly what I need: Search, Add, Remove, or Exit — fast and frustration-free.

- **Search by Attribute**: As a user, I want to search the inventory by various details like price, year, type, and color — so I can narrow down my list and make faster decisions.

- **Add Vehicle**: As a dealership employee, I want to add new vehicles with key info (VIN, year, type, odometer, etc.) — so that new inventory is always up to date.

- **Remove Vehicle**: As a user, I want to remove vehicles by VIN — so I can quickly delete inventory that’s been sold or entered incorrectly.

- **Save Changes**: As a user, I want the system to save all my edits to a CSV file — so my work isn’t lost when I close the program.

---

## Setup

### Prerequisites

- IntelliJ IDEA  
- Java SDK (17 or compatible)  
- Git (optional, for cloning repo)

### Running the App in IntelliJ

1. Open IntelliJ
2. Select **Open** and load the project directory.
3. Let IntelliJ index and build the project.
4. Find the `Program.java` file inside the `com.pluralsight` package.
5. Right-click `Program.java` and choose `Run 'Program.main()'`
6. Follow the menu prompts!

---

## 📂 File Structure


---

## 📦 Features

- Search inventory by:
  - Price range
  - Year range
  - Make & model
  - Mileage range
  - Type
  - Color
- Add new vehicles with all attributes
- Remove vehicles by VIN
- Save all changes to `inventory.csv`
- Load from `inventory.csv` on program start

---

## 📄 CSV Format

**First line = dealership info:**  
`Dealership Name|Address|Phone`

**Each line after = vehicle:**  
`VIN|Year|Make|Model|Type|Color|Odometer|Price`

---

## 🔧 Technologies Used

- Java 17
- BufferedReader & BufferedWriter
- ArrayList & Collection filtering
- IntelliJ IDEA
- CLI user input (Scanner)

---

## 🎯 Future Work

- VIN duplication validation
- Odometer and price input validation (non-negative values)
- Confirmation messages for each add/remove/save
- Role-based login (e.g. Sales vs Admin)
- Optional CSV backup or version history
- GUI version (JavaFX or Swing)

---

## 🙌 Team & Credits

- **Jacob Nealy** – Developer & French fry enthusiast 🥔  
- Special thanks to:
  - **Raymond Maroun** – Potato Sensei & Workshop Wizard
  - **Walter Donnellan** – Dedicated Tutor & Debug Partner
  - **Adam Jessie** – Debug King & Clean Code Crusader

> Thanks to all classmates for their support and teamwork  
> #FullStackFryers 🥔🔥  
> #SigmaData

---

## 📸 Screenshots (Optional)

*(Add screenshots of your terminal UI in action here)*

---

## License

Project is for educational purposes only. Not intended for commercial deployment.

