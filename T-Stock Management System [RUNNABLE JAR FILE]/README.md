T-Stock Management System Java project.
Project author: https://github.com/TonaTony
--
This project is a simple Java project for a stock management system. This system includes a smooth 
GUI for users to perform different operations such as sign-up, login, stock item creation, stock item update,
stock item deletion, user account update, item search, displaying stock data and a database to store user 
credentials and stock information. The system boasts features such as SQL injection prevention, 
user account security (a user cannot temper with another user account or user details, only their own) 
and more. SQL injection prevention is achieved by use of Prepared Statements while the user account 
security is achieved by using a tracker to detect logged-in user and ensure they can only use the user 
update option to update their own account only. The search option allows user not only to search for 
a specific item by entering its full name or full item code but also to search for a category of products 
with similar keywords or segments of their name or item code. Due to time limitation some options in 
the system namely: Purchases, Clients and Analytics & Reports are unavailable in this initial version 
because they haven’t been added yet but will be added and available in subsequent versions. There is 
also a preview system as guest option to show a quick view of what the system looks like but without 
any functionality because login is required to access the system functionalities.
--
Instructions:
- Open and run XAMPP and start the Apache and SQL modules.
- Import the " tsms_projectdb.sql " database into XAMPP.
- Run the JAR file.
- Read the " Documentation(& manual).pdf " for more information.
