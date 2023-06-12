CREATE TABLE IF NOT EXISTS student (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(30),
    score DOUBLE,
    graduate BOOLEAN,
    create_date TIMESTAMP
);

CREATE TABLE IF NOT EXISTS department (
    departmentId INT PRIMARY KEY AUTO_INCREMENT,
    departmentName VARCHAR(30)
);

CREATE TABLE IF NOT EXISTS Employee(
    EmployeeId INT PRIMARY KEY AUTO_INCREMENT,
    EmployeeName VARCHAR(30),
    department VARCHAR(30),
    dateOfJoining TIMESTAMP
);
