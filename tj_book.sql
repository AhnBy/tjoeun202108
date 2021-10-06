-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: tj
-- ------------------------------------------------------
-- Server version	8.0.26

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
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `book` (
  `bookNumber` int NOT NULL AUTO_INCREMENT,
  `personNumber` int NOT NULL,
  `title` varchar(45) NOT NULL,
  `sub_title` varchar(45) DEFAULT NULL,
  `writer` varchar(45) NOT NULL,
  `publisher` varchar(45) NOT NULL,
  `price` int NOT NULL,
  `publication_date` date NOT NULL,
  PRIMARY KEY (`bookNumber`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES (4,0,'작별하지 않는다','한강 장편소설','한강','문학동네',14000,'2021-09-09'),(5,0,'인생은 실전이다','아주 작은 날갯짓의 시작','주언규','상상스퀘어',18500,'2021-09-08'),(6,0,'달러구트 꿈 백화점2','단골손님을 찾습니다','이미예','팩토리나인',13800,'2021-07-27'),(7,0,'달러구트 꿈 백화점','주문하신 꿈은 매진입니다','이미예','팩토리나인',13800,'2020-07-08'),(8,0,'소크라테스 익스프레스','철학이 우리인생에 스며드는 순간','에릭 와이너','어크로스',18000,'2021-04-28'),(9,0,'오늘 밤 세계에서 이 사랑이 사라진다 해도','null','이치조 미사키','모모',14000,'2021-06-28'),(10,0,'햇빛은 찬란하고 인생은 귀하니까요 : 밀라논나이야기','null','장명숙','김영사',14800,'2021-08-18'),(11,0,'럭키','내 안에 잠든 운을 깨우는 7가지 법칙','김도윤','북로망스',16000,'2021-08-25'),(12,0,'미드나잇 라이브러리','null','매트 헤이그','인플루엔셜',15800,'2021-04-28'),(13,0,'백조와 박쥐','히가시노 게이고 장편소설','히가시노 게이고','현대문학',18000,'2021-08-16');
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-06 11:52:50
