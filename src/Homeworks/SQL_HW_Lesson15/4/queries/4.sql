-- Отримання контактних даних співробітників (номери телефонів, місце проживання)
SELECT E.FirstName, E.LastName, E.PhoneNumber, EI.Address
FROM Employees AS E
JOIN EmployeeInfo AS EI ON E.EmployeeID = EI.EmployeeID;

-- Отримання інформації про дату народження всіх неодружених співробітників та їх номери телефонів
SELECT E.FirstName, E.LastName, EI.BirthDate, E.PhoneNumber
FROM Employees AS E
JOIN EmployeeInfo AS EI ON E.EmployeeID = EI.EmployeeID
WHERE EI.MaritalStatus = 'Неодружений' OR EI.MaritalStatus = 'Неодружена';

-- Отримання інформації про всіх менеджерів компанії: дату народження та номер телефону
SELECT E.FirstName, E.LastName, EI.BirthDate, E.PhoneNumber
FROM Employees AS E
JOIN EmployeeInfo AS EI ON E.EmployeeID = EI.EmployeeID
JOIN Positions AS P ON E.PositionID = P.PositionID
WHERE P.PositionName = 'Менеджер';