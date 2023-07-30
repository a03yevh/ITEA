-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: mydb
-- ------------------------------------------------------
-- Server version	8.0.34

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
-- Table structure for table `personalinfo`
--

DROP TABLE IF EXISTS `personalinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `personalinfo` (
  `info_id` int NOT NULL AUTO_INCREMENT,
  `employee_id` int DEFAULT NULL,
  `marital_status` varchar(20) DEFAULT NULL,
  `date_of_birth` date DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`info_id`),
  KEY `employee_id` (`employee_id`),
  CONSTRAINT `personalinfo_ibfk_1` FOREIGN KEY (`employee_id`) REFERENCES `employees` (`employee_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personalinfo`
--

LOCK TABLES `personalinfo` WRITE;
/*!40000 ALTER TABLE `personalinfo` DISABLE KEYS */;
INSERT INTO `personalinfo` VALUES (1,1,'Холостий','1980-05-15','м. Київ, вул. Центральна, 10'),(2,2,'Заміжня','1985-09-25','м. Львів, вул. Пушкіна, 5'),(3,3,'Холостий','1992-11-10','м. Харків, вул. Сов, 20'),(4,4,'Одружений','1978-12-03','м. Київ, вул. Незалежності, 25'),(5,5,'Холостий','1990-07-18','м. Львів, вул. Грушевського, 15'),(6,6,'Заміжня','1982-04-20','м. Харків, вул. Шевченка, 8'),(7,7,'Одружений','1987-09-02','м. Одеса, вул. Приморська, 30'),(8,8,'Холостий','1993-01-08','м. Київ, вул. Лесі Українки, 12'),(9,9,'Заміжня','1981-06-14','м. Львів, вул. Гагаріна, 5'),(10,10,'Одружений','1989-02-28','м. Одеса, вул. Дерибасівська, 18'),(11,11,'Холостий','1991-10-22','м. Харків, вул. Сумська, 45'),(12,12,'Заміжня','1979-03-07','м. Київ, вул. Володимирська, 40'),(13,13,'Одружений','1986-08-12','м. Львів, вул. Шота Руставелі, 60'),(14,14,'Холостий','1995-05-29','м. Харків, вул. Луніна, 70'),(15,15,'Заміжня','1983-11-17','м. Одеса, вул. Французький бульвар, 33'),(16,16,'Одружений','1994-07-23','м. Київ, вул. Івана Франка, 28'),(17,17,'Холостий','1990-04-11','м. Львів, вул. Саксаганського, 22'),(18,18,'Заміжня','1988-12-09','м. Одеса, вул. Буніна, 17'),(19,19,'Одружений','1984-03-05','м. Харків, вул. Мироносицька, 12'),(20,20,'Холостий','1996-08-27','м. Київ, вул. Андріївська, 8');
/*!40000 ALTER TABLE `personalinfo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-07-30 18:01:23
