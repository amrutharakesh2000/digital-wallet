-- MySQL dump 10.13  Distrib 8.0.45, for Win64 (x86_64)
--
-- Host: localhost    Database: digital_wallet
-- ------------------------------------------------------
-- Server version	8.0.45

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
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'amrut@gmail.com','Amrut','1234'),(2,'amrutha@gmail.com','Amrutha','test123'),(3,'test@gmail.com',NULL,'1234'),(4,'rbabu@gmail.com',NULL,'12349879'),(5,'test@gmail.com','Test User','1234'),(6,'HARSHITHA@gmail.com','Test User','1234'),(7,'Preethu@gmail.com',NULL,'1234'),(8,'nikhil@gmail.com',NULL,'qwertyuiop'),(9,'am@test.com','Am','123456'),(10,'am@test.com','Am','123456'),(11,'amrut@gmail.com','Amrut','1234'),(12,'Dhanya@gmail.com','Dhanya','1234'),(13,'Dhanny@gmail.com','Dhanny','$2a$10$SSxyBSrNM0.JYLG1alSA1uIXlpDILZd/HAu0Y0gdJm69u.GOq9Dzy'),(14,'Dhanny@gmail.com','Dhanny','qwertyyuiop'),(15,'Sri@gmail.com',NULL,'test'),(16,'Sri@gmail.com',NULL,'$2a$10$qFGPBgz6JxewbYBSZOBU2ecO/7x0I70QITFD/x24O5MVB...3.8D.'),(17,'Srirangini@gmail.com','Srirangini','$2a$10$b1QMa23jD3jaFPaiwu6QfeStVxkVBIg.eVrtgXYzrC.zbDJz5YKtW'),(18,'Srirangini@gmail.com','Srirangini','$2a$10$pahprrwtvA6At2etJ.7UUe7dUYcE.vRAJs0BjVm6qBL7v4fcOhtAS'),(19,'Kiran@gmail.com','Kiran','$2a$10$4Fsl7.lamo6RiKl7CInvkujJmroyDyuFovJKv.bSl5pJ5vodwYcs2'),(20,'Kiran@gmail.com','Kiran','$2a$10$DT3f.vZgPhEKZLmB5/ZlgOIJTFFR.UMOedg8n/rIRNSoZDgiZWJNO'),(21,'Patil@gmail.com','Patil','$2a$10$vW3sPeK4yv8TAaQOfEFEQO26q/Q79tgRXSeiRhchGgv.Iq2KrPiti'),(22,'Patil@gmail.com','Patil','$2a$10$j.e7e3mLYe.coj0UtUPf3.BVeX2vQHj0crMXgNAbZmrFettKDwNLK'),(23,'sudha@gmail.com','sudha','$2a$10$vFSE3YSDr66.s6NjpaSRfuOPLVlwyeNOTn.0iLvVIheTt4.Qb8leK'),(24,'sudha@gmail.com','sudha','$2a$10$f.J/5rCqxmpVWYM7A5CTPePvNbP0Aq0uaneUypBYSgD61iLvhjE7q'),(25,'sudha@gmail.com','sudha','$2a$10$cFsi3rU43OL0XzKsYs.8yeuryIzLvve7Ni9wm3JBXLhP.My7WEsmG'),(26,'varun@gmail.com','varun','$2a$10$Od4ZXalqk3aIc5Q2D5pgj.DsUPwrw1uhLE5u7vnTXQbQqQsQEcz9O');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-03-23 17:58:53
