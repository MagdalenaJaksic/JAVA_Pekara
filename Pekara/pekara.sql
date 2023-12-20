-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jan 21, 2023 at 01:46 PM
-- Server version: 5.7.37-log
-- PHP Version: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pekara`
--

-- --------------------------------------------------------

--
-- Table structure for table `pekara`
--

DROP TABLE IF EXISTS `pekara`;
CREATE TABLE IF NOT EXISTS `pekara` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tipProizvoda` enum('HLEB','KROASAN','KIFLA') COLLATE utf8mb4_unicode_ci NOT NULL,
  `kolicina` int(11) NOT NULL,
  `cena` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
COMMIT;

INSERT INTO `pekara` (`tipProizvoda`, `kolicina`, `cena`) VALUES
('HLEB', '5', '100'),
( 'KROASAN', '3', '400'),
( 'KIFLA', '4', '300');
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
