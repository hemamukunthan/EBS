-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Dec 06, 2021 at 01:18 PM
-- Server version: 5.7.31
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `login`
--

-- --------------------------------------------------------

--
-- Table structure for table `bill_info`
--

DROP TABLE IF EXISTS `bill_info`;
CREATE TABLE IF NOT EXISTS `bill_info` (
  `Id` int(11) NOT NULL,
  `J_Unit` int(11) NOT NULL,
  `J_Amt` varchar(45) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bill_info`
--

INSERT INTO `bill_info` (`Id`, `J_Unit`, `J_Amt`) VALUES
(1, 476, '2716.0'),
(123, 572, '3120.0');

-- --------------------------------------------------------

--
-- Table structure for table `login_info`
--

DROP TABLE IF EXISTS `login_info`;
CREATE TABLE IF NOT EXISTS `login_info` (
  `User_ID` int(11) NOT NULL,
  `Username` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  `Gender` varchar(45) NOT NULL,
  `DOB` varchar(45) NOT NULL,
  `Address` varchar(45) NOT NULL,
  `Number` varchar(45) NOT NULL,
  `Mail` varchar(45) NOT NULL,
  `MeterNo` int(11) NOT NULL,
  `J_unit` int(11) DEFAULT NULL,
  `J_Amt` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`User_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login_info`
--

INSERT INTO `login_info` (`User_ID`, `Username`, `Password`, `Gender`, `DOB`, `Address`, `Number`, `Mail`, `MeterNo`, `J_unit`, `J_Amt`) VALUES
(123, 'Pavithra T', '1234', 'Female', '02/05/2002', '43, PRM str., Sainathapuram, Vellore', '8825985872', 'pavithraalice8@gmail.com', 54322, 345, '1552.5'),
(124, 'dharsh', '1245', 'Female', '13/07/2002', 'XYZ, vellore.', '8756433689', 'dharsh@gmail.com', 54323, 256, '1152.0'),
(125, 'Hema', '1245', 'Female', '22/02/2021', 'zyx,vellore.', '8475385789', 'hema@gmail.com', 54324, 320, 'Rs. 1440.0');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
