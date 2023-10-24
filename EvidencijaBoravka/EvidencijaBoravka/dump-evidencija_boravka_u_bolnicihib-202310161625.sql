-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: evidencija_boravka_u_bolnicihib
-- ------------------------------------------------------
-- Server version	11.1.2-MariaDB

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
-- Table structure for table `boravak`
--

DROP TABLE IF EXISTS `boravak`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `boravak` (
  `sifra` int(11) NOT NULL AUTO_INCREMENT,
  `datumOtpusta` datetime(6) DEFAULT NULL,
  `datumPrimitka` datetime(6) DEFAULT NULL,
  `odjel_sifra` int(11) DEFAULT NULL,
  PRIMARY KEY (`sifra`),
  KEY `FKf7kvixmnee03ihehb05um9nbv` (`odjel_sifra`),
  CONSTRAINT `FKf7kvixmnee03ihehb05um9nbv` FOREIGN KEY (`odjel_sifra`) REFERENCES `odjel` (`sifra`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `boravak`
--

LOCK TABLES `boravak` WRITE;
/*!40000 ALTER TABLE `boravak` DISABLE KEYS */;
INSERT INTO `boravak` VALUES (51,'1974-09-06 07:39:49.355000','1973-02-22 00:40:00.000000',12),(52,'1972-11-12 14:50:09.938000','2005-07-09 03:44:49.705000',14),(53,'1982-12-25 15:25:16.496000','1975-05-08 01:29:13.522000',14),(54,'2001-11-29 05:35:45.195000','2000-03-18 19:41:09.734000',12),(55,'1998-09-12 05:04:42.369000','2002-08-13 06:14:26.448000',13),(56,'1981-07-01 23:57:20.000000','1972-11-01 06:04:53.678000',13),(57,'1981-09-10 14:12:59.435000','1980-08-08 03:22:44.339000',12),(58,'1967-06-21 11:48:54.747000','1971-10-30 22:31:02.598000',13),(59,'1971-06-25 05:59:35.356000','1960-06-10 05:11:25.122000',13),(60,'1960-03-11 08:34:05.644000','1982-12-14 07:48:07.604000',13),(61,'1974-01-27 11:02:24.479000','2000-12-02 08:47:28.288000',13),(62,'1983-10-25 02:19:56.573000','1972-04-27 15:18:55.677000',14),(63,'1970-03-05 12:50:27.714000','1995-04-26 14:11:47.060000',14),(64,'1995-10-08 06:41:27.390000','1980-04-24 00:38:14.885000',13),(65,'1991-04-02 12:34:51.475000','1983-05-15 09:07:13.889000',11),(66,'2000-11-15 01:19:01.978000','1990-11-21 03:47:54.225000',12),(67,'1989-12-29 02:28:19.006000','1982-11-27 19:24:30.926000',14),(68,'1966-08-04 07:13:08.894000','1968-06-15 11:49:53.127000',13),(69,'1981-01-26 02:45:12.560000','1981-03-16 13:58:13.086000',12),(70,'1975-02-11 09:41:26.137000','1983-10-05 01:07:35.691000',14),(71,'2002-07-30 00:03:27.573000','1983-01-19 01:04:00.375000',13),(72,'1973-04-03 11:59:50.005000','2000-07-28 21:57:27.907000',13),(73,'1960-05-30 19:14:53.596000','1976-07-15 21:40:10.943000',14),(74,'1994-11-14 19:53:11.778000','1990-03-22 11:09:27.987000',12),(75,'1976-01-19 23:08:48.305000','1992-01-11 14:35:32.633000',14);
/*!40000 ALTER TABLE `boravak` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lijecnik`
--

DROP TABLE IF EXISTS `lijecnik`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lijecnik` (
  `sifra` int(11) NOT NULL AUTO_INCREMENT,
  `ime` varchar(255) DEFAULT NULL,
  `prezime` varchar(255) DEFAULT NULL,
  `odjel_sifra` int(11) DEFAULT NULL,
  PRIMARY KEY (`sifra`),
  KEY `FKjwung1rl0d2kbrd97yravvs7h` (`odjel_sifra`),
  CONSTRAINT `FKjwung1rl0d2kbrd97yravvs7h` FOREIGN KEY (`odjel_sifra`) REFERENCES `odjel` (`sifra`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lijecnik`
--

LOCK TABLES `lijecnik` WRITE;
/*!40000 ALTER TABLE `lijecnik` DISABLE KEYS */;
INSERT INTO `lijecnik` VALUES (1,'Reyes','Kling',13),(2,'Eddie','Stracke',13),(3,'Drucilla','Cummerata',13),(4,'Bernadette','Mraz',11),(5,'Tonda','Feil',13);
/*!40000 ALTER TABLE `lijecnik` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `odjel`
--

DROP TABLE IF EXISTS `odjel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `odjel` (
  `sifra` int(11) NOT NULL AUTO_INCREMENT,
  `naziv` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sifra`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `odjel`
--

LOCK TABLES `odjel` WRITE;
/*!40000 ALTER TABLE `odjel` DISABLE KEYS */;
INSERT INTO `odjel` VALUES (11,'Ms. Youn Leuschke'),(12,'Armand Tromp Jr.'),(13,'Loree Gorczany'),(14,'Dr. Latonia Kreiger'),(15,'Sha Durgan I');
/*!40000 ALTER TABLE `odjel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `operater`
--

DROP TABLE IF EXISTS `operater`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `operater` (
  `sifra` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `ime` varchar(255) DEFAULT NULL,
  `lozinka` varchar(255) DEFAULT NULL,
  `prezime` varchar(255) DEFAULT NULL,
  `uloga` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sifra`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `operater`
--

LOCK TABLES `operater` WRITE;
/*!40000 ALTER TABLE `operater` DISABLE KEYS */;
INSERT INTO `operater` VALUES (1,'ana@evidencija.hr','Ana','$argon2i$v=19$m=65536,t=10,p=1$F6YKMe2CFDfvAlN0KVq3eA$1W8zMhTtMt8Xuvb2XbCkfICK3EEQ5NudBBZzGHhWNRc','Jurić','oper');
/*!40000 ALTER TABLE `operater` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pacijent`
--

DROP TABLE IF EXISTS `pacijent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pacijent` (
  `sifra` int(11) NOT NULL AUTO_INCREMENT,
  `ime` varchar(255) DEFAULT NULL,
  `prezime` varchar(255) DEFAULT NULL,
  `lijecnik_sifra` int(11) DEFAULT NULL,
  PRIMARY KEY (`sifra`),
  KEY `FKk12mbi6wyekia5r9q7oq5lwqt` (`lijecnik_sifra`),
  CONSTRAINT `FKk12mbi6wyekia5r9q7oq5lwqt` FOREIGN KEY (`lijecnik_sifra`) REFERENCES `lijecnik` (`sifra`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pacijent`
--

LOCK TABLES `pacijent` WRITE;
/*!40000 ALTER TABLE `pacijent` DISABLE KEYS */;
INSERT INTO `pacijent` VALUES (1,'Donn','Mayert',4),(2,'Herminia','Kemmer',3),(4,'Claudia','Stamm',2),(5,'Vito','Bernier',3),(6,'Tamie','Braun',2),(7,'Marinda','Zemlak',3),(8,'Velma','Carroll',3),(9,'Lucina','Lueilwitz',4),(10,'Phillis','Luettgen',2),(11,'Eddie','Heaney',3),(12,'Wilmer','Langworth',1),(13,'Raye','Stehr',2),(14,'Nathan','Wiza',3),(15,'Brooks','Hills',4),(16,'Matt','Stanton',3),(17,'Sydney','O\'Keefe',2),(18,'Drusilla','Dooley',4),(19,'Ramon','Hodkiewicz',1),(20,'Elmer','Beier',4),(21,'Tonig','Corwin',NULL);
/*!40000 ALTER TABLE `pacijent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'evidencija_boravka_u_bolnicihib'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-16 16:25:28
