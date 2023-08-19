-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: myjoinsdb
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `employeeinfo`
--

DROP TABLE IF EXISTS `employeeinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employeeinfo` (
  `EmployeeID` int NOT NULL,
  `BirthDate` date DEFAULT NULL,
  `MaritalStatus` varchar(20) DEFAULT NULL,
  `Address` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`EmployeeID`),
  CONSTRAINT `employeeinfo_ibfk_1` FOREIGN KEY (`EmployeeID`) REFERENCES `employees` (`EmployeeID`),
  CONSTRAINT `FK_EmployeeInfo_Employees` FOREIGN KEY (`EmployeeID`) REFERENCES `employees` (`EmployeeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employeeinfo`
--

LOCK TABLES `employeeinfo` WRITE;
/*!40000 ALTER TABLE `employeeinfo` DISABLE KEYS */;
INSERT INTO `employeeinfo` VALUES (1,'1990-05-15','Одружений','м. Київ, вул. Польова, 123'),(2,'1985-08-22','Неодружена','м. Львів, вул. Мінська, 456'),(3,'1995-02-10','Одружений','м. Харків, вул. Тростова, 789'),(4,'1992-11-03','Неодружена','м. Одеса, вул. Культурна, 234'),(5,'1988-07-20','Одружений','м. Дніпро, вул. Львівська, 567'),(6,'1993-09-18','Неодружена','м. Хмельницький, вул. Нова, 890'),(7,'1987-04-12','Одружений','м. Рівне, вул. Справжня, 123'),(8,'1991-01-25','Неодружена','м. Тернопіль, вул. Мікла, 456'),(9,'1994-06-08','Одружений','м. Луцьк, вул. Ліська, 789'),(10,'1990-03-30','Неодружена','м. Івано-Франківськ, вул. Загальна, 234'),(11,'1996-10-17','Одружений','м. Запоріжжя, вул. Велика, 567'),(12,'1989-12-01','Неодружена','м. Суми, вул. Далека, 890'),(13,'1993-02-28','Одружений','м. Чернігів, вул. Близька, 123'),(14,'1986-03-09','Неодружена','м. Кропивницький, вул. Форт, 456'),(15,'1992-09-05','Одружений','м. Миколаїв, вул. Парусів, 789');
/*!40000 ALTER TABLE `employeeinfo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-08-08 12:16:49
