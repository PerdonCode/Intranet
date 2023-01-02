
CREATE TABLE Employee(
EmployeeId INT PRIMARY KEY,
	FirstName VARCHAR(100) ,
	LastName VARCHAR(100) ,
	Address VARCHAR(100) ,
	Age INT ,
	Work_Email VARCHAR(55)
	PhoneNumber VARCHAR(100) ,
	DepartmentName VARCHAR(50) ,
	User_Role VARCHAR(100),
	HireDate date ,
	EndDate date,
	Salary DECIMAL(8,2) ,
	PASSWORD VARCHAR(255)
)
INSERT INTO Employee(FirstName, LastName, Address, Age, Work_Email, PhoneNumber, DepartmentName, User_Role, HireDate, EndDate, PASSWORD)
VALUES
('Niels', 'Perdon', 'Dirkboutslaan 18', 21, 'niels.perdon@PerdonCode.com', '06-33349194', 'CEO', 'CEO', '18-06-2022', '15-04-2300', 123456789 ),
('Jan', 'Willem', 'looydijk 187', 42, 'jan.willem-magazijn@PerdonCode.com', '06-38573615', 'MAGAZIJN', 'MANAGER_MAGAZIJN', '18-06-2022', '15-04-2030',123456789),
('Peter', 'Hendrik', 'utrechtseweg 68', 53, 'Peter.Hendrik-magazijn@PerdonCode.com', '06-563739571', 'MAGAZIJN', 'MAGAZIJN', '18-06-2022', '15-04-2030',123456789),
('Klare', 'Van Bruggen', 'paltzerweg 964', 34, 'Klara.VanBruggen-finance@PerdonCode.com', '06-84618563', 'FINANCE', 'MANAGER_FINANCE',' 18-06-2022', '15-04-2030',123456789),
('John', 'Doe', 'julianaweg 98', 54, 'John.Doe-finance@PerdonCode.com', '06-87664827', 'FINANCE', 'FINANCE', '18-06-2022', '15-04-2030',123456789),
('Laurens', 'Van Den Berg', 'nicolaistraat 168', 34, 'Laurens.VanDenBerg-IT@PerdonCode.com', '06-12349194', 'IT', 'MANAGER_IT', '18-06-2022', '15-04-2030',123456789),
('Jesse', 'Borgers', 'van vulpenlaan 18', 54, 'Jesse.Borgers-it@PerdonCode.com', '06-9756471', 'IT', 'IT', '18-06-2022',' 15-04-2030',123456789),
('Lisa', 'Brinkhorst', 'eikenlaan 7 ', 63, 'Lisa.BrinkHorst-marketing@PerdonCode.com', '06-67856175', 'MARKETING', 'MARKETING', '18-06-2022', '15-04-2030',123456789),
('Laura', 'Perdon', 'annamaria schuurmanlaan 5', 54, 'Laura.Perdon-marketing@PerdonCode.com', '06-98504019', 'MARKETING', 'MANAGER_MARKETING',' 18-06-2022', '15-04-2030',123456789),
('Inge', 'Van den Berg', 'janbeversewijk 175', 23, 'Inge.VanDenBerg-hr@PerdonCode.com', '06-09548185', 'HR', 'HR', '18-06-2022', '15-04-2030',123456789),
('Clemens', 'Perdon', 'loosdrecht 8', 26, 'Clemens.Perdon-hr@PerdonCode.com', '06-75647361', 'HR', 'MANAGER_HR', '18-06-2022', '15-04-2030',123456789),
('Erna', 'Schouten', 'Soestdijkseweg 370', 61, 'Erna.Schouten-support@perdonCode.com', '06-4351753', 'SUPPORT', 'SUPPORT', '18-06-2022', '15-04-2030',123456789),
('Luka', 'Modric', 'Kroatischeweg 118', 31, 'Luka.Modric-support@PerdonCode.com', '06-95637561', 'SUPPORT', 'MANAGER_SUPPORT', '18-06-2022', '15-04-2030',123456789)