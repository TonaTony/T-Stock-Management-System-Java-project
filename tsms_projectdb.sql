-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 06, 2025 at 12:19 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tsms_projectdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `current_stock`
--

CREATE TABLE `current_stock` (
  `ITEM_CODE` varchar(100) NOT NULL,
  `ITEM_NAME` varchar(200) NOT NULL,
  `PRICE_$` double NOT NULL,
  `QUANTITY` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `current_stock`
--

INSERT INTO `current_stock` (`ITEM_CODE`, `ITEM_NAME`, `PRICE_$`, `QUANTITY`) VALUES
('Asus-BQ16 Pro', 'Asus BQ16 Mesh System', 999, 20),
('Asus-ET12', 'Asus ET12 Mesh System', 899, 20),
('Asus-GT6', 'Asus GT6 Mesh Router', 599, 20),
('Cisco-AIR-AP2802I-B-K9', 'Cisco 2802i Access Point', 1000, 20),
('Cisco-AIR-AP3802I-B-K9', 'Cisco 3802i Access Point', 1200, 15),
('Cisco-AIR-AP4800-B-K9', 'Cisco 4800 Access Point', 1500, 15),
('Cisco-ASA5506-K9', 'Cisco 5506-X Firewall', 600, 20),
('Cisco-ASA5516-FPWR-K9', 'Cisco 5516-X Firewall', 1200, 15),
('Cisco-C9200L-24P-4G-E', 'Cisco 9200L Switch', 2500, 10),
('Cisco-C9300-48P-E', 'Cisco 9300 Switch', 4000, 15),
('Cisco-C9500-24Y4C', 'Cisco 9500 Switch', 12000, 5),
('Cisco-ISR4331/K9', 'Cisco 4331 Router', 1800, 20),
('Cisco-ISR4451-X/K9', 'Cisco 4451-X Router', 3500, 5),
('Netgear-RBE970', 'Netgear RBE970 Mesh', 1299, 15),
('Netgear-RBE973', 'Netgear RBE973 Mesh', 1499, 15),
('TP-Link-Archer AX5400', 'TP-Link AX5400 Router', 129, 50),
('TP-Link-Archer AX90', 'TP-Link AX90 Router', 249, 30),
('TP-Link-Archer BE900', 'TP-Link BE900 Router', 499, 30),
('TP-Link-BE800', 'TP-Link BE800 Router', 299, 30),
('TP-Link-ColorPro', 'TP-Link ColorPro Camera', 50, 40),
('TP-Link-Deco BE63', 'TP-Link BE63 Mesh', 699, 20),
('TP-Link-Deco BE85', 'TP-Link BE85 Mesh', 999, 20),
('TP-Link-Deco XE75', 'TP-Link XE75 Mesh', 299, 30),
('TP-Link-ER706W', 'TP-Link ER706W Gateway', 129, 40),
('TP-Link-SG3428XMP', 'TP-Link SG3428XMP Switch', 499, 20),
('TP-Link-TL-R600VPN', 'TP-Link R600VPN Router', 59, 50),
('TP-Link-TL-WA850RE', 'TP-Link WA850RE Extender', 18, 50);

-- --------------------------------------------------------

--
-- Table structure for table `employees_credentials`
--

CREATE TABLE `employees_credentials` (
  `CODE` varchar(100) NOT NULL,
  `FULL_NAME` varchar(200) NOT NULL,
  `EMAIL` varchar(200) NOT NULL,
  `USERNAME` varchar(100) NOT NULL,
  `PASSWORD` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `employees_credentials`
--

INSERT INTO `employees_credentials` (`CODE`, `FULL_NAME`, `EMAIL`, `USERNAME`, `PASSWORD`) VALUES
('tsms001', 'John Doe', 'johndoe@tsms.com', 'jdoe', 'p123'),
('tsms002', 'Jane Doe', 'janedoe@tsms.com', 'janedoe', 'j123'),
('tsms003', 'Richard Roe', 'richardroe@tsms.com', 'ricroe', 'r123'),
('tsms004', 'Pauline Poe', 'paulinepoe@tsms.com', 'paulinepoe', 'poe123'),
('tsms005', 'Joe Shmoe', 'joeshmoe@tsms.com', 'jshmoe', 'js123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `current_stock`
--
ALTER TABLE `current_stock`
  ADD PRIMARY KEY (`ITEM_CODE`),
  ADD UNIQUE KEY `ITEM_NAME` (`ITEM_NAME`);

--
-- Indexes for table `employees_credentials`
--
ALTER TABLE `employees_credentials`
  ADD PRIMARY KEY (`CODE`),
  ADD UNIQUE KEY `USERNAME` (`USERNAME`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
