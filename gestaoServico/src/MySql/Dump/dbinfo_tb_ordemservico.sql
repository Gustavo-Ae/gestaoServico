-- MySQL dump 10.13  Distrib 5.7.12, for Win32 (AMD64)
--
-- Host: localhost    Database: dbinfo
-- ------------------------------------------------------
-- Server version	5.6.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tb_ordemservico`
--

DROP TABLE IF EXISTS `tb_ordemservico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_ordemservico` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `data_hora` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `tipo` varchar(20) NOT NULL,
  `situacao` varchar(20) NOT NULL,
  `equipamento` varchar(150) NOT NULL,
  `defeito` varchar(150) NOT NULL,
  `servico` varchar(150) DEFAULT NULL,
  `tecnico` varchar(30) DEFAULT NULL,
  `valor` decimal(10,2) DEFAULT NULL,
  `idCliente` int(11) NOT NULL,
  PRIMARY KEY (`codigo`),
  KEY `idCliente` (`idCliente`),
  CONSTRAINT `tb_ordemservico_ibfk_1` FOREIGN KEY (`idCliente`) REFERENCES `tbclientes` (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_ordemservico`
--

LOCK TABLES `tb_ordemservico` WRITE;
/*!40000 ALTER TABLE `tb_ordemservico` DISABLE KEYS */;
INSERT INTO `tb_ordemservico` VALUES (1,'2021-11-19 22:52:52','Orçamento','Aguardando Aprovação','Notebook 100ls','Não Liga','Troca da Fonte','Zé',87.50,1),(4,'2021-12-23 22:09:41','Orçamento','Na bancada','PC','Não liga ','fazer ligar','Piton',50.00,4),(5,'2022-01-24 14:29:35','Orçamento','Aguardando Aprovação','PC','não liga','fazer ligar','marcão',60.00,2),(6,'2022-01-26 14:24:52','Orçamento','Na bancada','PC','queimou placa ','','',0.00,4),(7,'2022-01-26 14:31:12','Ordem de Serviço','Na bancada','Notebook Acer Core i5-10210U 8GB 256GB SSD Tela Full HD 15.6” Windows 10 Aspire 5','Processador ','Concertar processador','Zé',50.00,2),(8,'2022-02-10 13:37:49','Orçamento','Na bancada','Notebook Lenovo G40','Não Liga ','Troca da Fonte','Leandro',130.00,4),(9,'2022-02-10 20:50:43','Ordem de Serviço','Na bancada','Notebook Lenovo Ultrafino IdeaPad 3','HD','','Zé',25.00,1),(10,'2022-02-10 22:44:34','Orçamento','Na bancada','Notebook DELL ','travando','formatação','Edilson',90.00,5),(11,'2022-02-10 22:46:22','Ordem de Serviço','Aguardando Peça','Notebook ACER','sem processador','processador','Zé',100.00,2),(12,'2022-02-10 22:54:06','Ordem de Serviço','Na bancada','notebook','poeira','limpar poeira','edison',120.00,1),(13,'2022-02-10 22:57:03','Ordem de Serviço','Na bancada','notebook','memoria ram','trocar memoria ram','edison',100.00,3),(14,'2022-02-10 23:13:56','Ordem de Serviço','Aguardando Aprovação','notebook dell','processador','processador não funciona','Edilson',111.00,2);
/*!40000 ALTER TABLE `tb_ordemservico` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-02-17 10:56:47
