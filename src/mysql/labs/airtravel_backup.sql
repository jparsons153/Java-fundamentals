-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: airtravel
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `flights`
--

DROP TABLE IF EXISTS `flights`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `flights` (
  `flightIndex` int NOT NULL AUTO_INCREMENT,
  `Flight_No` varchar(45) NOT NULL,
  `departure_time` datetime NOT NULL,
  `arrival_time` datetime NOT NULL,
  `Airport_depart` varchar(45) NOT NULL,
  `Airport_arrive` varchar(45) NOT NULL,
  `NumPassengers` int NOT NULL,
  `Plane_ID` int NOT NULL,
  `flight_details` varchar(45) GENERATED ALWAYS AS (concat(`Flight_No`,`departure_time`)) STORED,
  PRIMARY KEY (`flightIndex`),
  KEY `plane ID_idx` (`Plane_ID`),
  KEY `flight_details_idx` (`flight_details`),
  CONSTRAINT `index` FOREIGN KEY (`flight_details`) REFERENCES `passengers` (`Flight_details`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flights`
--

LOCK TABLES `flights` WRITE;
/*!40000 ALTER TABLE `flights` DISABLE KEYS */;
INSERT INTO `flights` (`flightIndex`, `Flight_No`, `departure_time`, `arrival_time`, `Airport_depart`, `Airport_arrive`, `NumPassengers`, `Plane_ID`) VALUES (1,'EI134','2022-03-01 08:00:00','2022-03-01 09:00:00','LHR','DUB',384,101),(2,'EI154','2022-03-01 09:55:00','2022-03-01 10:30:00','LHR','SHN',384,101),(3,'LN203','2022-03-01 10:05:00','2022-03-01 11:10:00','LGW','MUN',410,205),(4,'BA550','2022-03-01 08:55:00','2022-03-01 09:55:00','LHR','DUB',399,302),(5,'BA455','2022-03-19 15:55:00','2022-03-19 17:58:00','LGW','GNV',384,302),(6,'BA455','2022-03-18 15:55:00','2022-03-19 17:58:00','LGW','GNV',384,302),(7,'EI134','2022-02-01 08:00:00','2022-02-01 09:00:00','LHR','DUB',384,101),(8,'EI134','2022-01-01 08:00:00','2022-01-01 09:00:00','LHR','DUB',384,101),(9,'EI134','2022-03-02 08:00:00','2022-03-02 09:00:00','LHR','DUB',384,101),(10,'EI134','2022-03-03 08:00:00','2022-03-03 09:00:00','LHR','DUB',384,101),(11,'EI134','2022-02-02 08:00:00','2022-02-02 09:00:00','LHR','DUB',384,101),(12,'BA550','2022-03-03 08:55:00','2022-03-03 09:55:00','LHR','DUB',399,302),(13,'BA550','2022-03-04 08:55:00','2022-03-04 09:55:00','LHR','DUB',399,302),(14,'BA550','2022-03-05 08:55:00','2022-03-05 09:55:00','LHR','DUB',399,302),(15,'BA550','2021-03-01 08:55:00','2021-03-01 09:55:00','LHR','DUB',399,302),(16,'BA550','2021-03-02 08:55:00','2021-03-02 09:55:00','LHR','DUB',399,302),(17,'BA550','2022-01-01 11:55:00','2022-01-01 13:05:00','SNN','DUB',399,302);
/*!40000 ALTER TABLE `flights` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `passengers`
--

DROP TABLE IF EXISTS `passengers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `passengers` (
  `Booking_ref` int NOT NULL,
  `First_name` varchar(45) NOT NULL,
  `Last_name` varchar(45) NOT NULL,
  `Date_of_birth` date NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Passengers` int DEFAULT NULL,
  `Flight_details` varchar(45) NOT NULL,
  `Meal_preference` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Booking_ref`),
  KEY `Flight No._idx` (`Flight_details`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `passengers`
--

LOCK TABLES `passengers` WRITE;
/*!40000 ALTER TABLE `passengers` DISABLE KEYS */;
INSERT INTO `passengers` VALUES (100101,'Joe','Bloggs','1951-09-01','1 Park lane',1,'EI1542022-03-01 09:55:00',NULL),(100102,'Chuck','Norris','1968-01-02','The hill',2,'BA4552022-03-19 15:55:00',NULL),(100103,'William','Hill','1970-12-28','1 the square',1,'BA4552022-03-19 15:55:00','Vegetrian'),(100104,'Jill','Smith','1990-01-02','10 Park lane',1,'BA4552022-03-18 15:55:00',NULL),(100105,'Jane','Hill','1989-11-24','1 the square',1,'BA4552022-03-12 15:55:00',NULL),(100106,'John','Smith','1989-10-24','Flat 6 illex house',1,'BA4552022-03-05 15:55:00',NULL),(100107,'John','Smith','1989-10-24','Flat 6 illex house',1,'BA4552021-10-19 15:55:00',NULL),(100108,'John','Smith','1989-10-24','Flat 6 illex house',1,'BA4552022-01-19 15:55:00',NULL),(100109,'John','Smith','1989-10-24','Flat 6 illex house',1,'BA4552022-01-10 15:55:00',NULL),(100120,'Joe','Smith','1948-09-09','12 Bristol st',1,'BA4552022-01-10 15:55:00','N/A');
/*!40000 ALTER TABLE `passengers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `planes`
--

DROP TABLE IF EXISTS `planes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `planes` (
  `plane_ID` int NOT NULL AUTO_INCREMENT,
  `Air_carrier` varchar(45) NOT NULL,
  `payload` int NOT NULL,
  `make_model` varchar(45) NOT NULL,
  `year_of_manufacture` varchar(45) NOT NULL,
  `leasing_agent` varchar(45) NOT NULL,
  PRIMARY KEY (`plane_ID`),
  CONSTRAINT `plane ID` FOREIGN KEY (`plane_ID`) REFERENCES `flights` (`Plane_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=303 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `planes`
--

LOCK TABLES `planes` WRITE;
/*!40000 ALTER TABLE `planes` DISABLE KEYS */;
INSERT INTO `planes` VALUES (101,'AerLingus',10000,'Aerbus A320','2020','Plane leasing Co.'),(102,'Aerlingus',10000,'Aerbus A320','2020','Plane leasing Co.'),(205,'Ryanair',10000,'Aerbus A340','2019','Joe Bloggs leasing'),(302,'British Airways',10000,'Aerbus A340','2021','Plane leasing Co.');
/*!40000 ALTER TABLE `planes` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-19 20:02:05
