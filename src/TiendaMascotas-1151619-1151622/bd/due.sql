-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 19-10-2018 a las 00:34:18
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `tiendamascotass`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `due`
--

CREATE TABLE IF NOT EXISTS `due` (
  `codigo_c` int(100) NOT NULL AUTO_INCREMENT,
  `cedula` varchar(100) NOT NULL,
  `nom` varchar(100) NOT NULL,
  `dir` varchar(100) NOT NULL,
  PRIMARY KEY (`codigo_c`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=24 ;

--
-- Volcado de datos para la tabla `due`
--

INSERT INTO `due` (`codigo_c`, `cedula`, `nom`, `dir`) VALUES
(23, '10045348', 'eduardo', 'cucuta');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
