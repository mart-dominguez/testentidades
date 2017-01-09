-- phpMyAdmin SQL Dump
-- version 4.0.10deb1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 09-01-2017 a las 11:37:34
-- Versión del servidor: 5.5.52-0ubuntu0.14.04.1
-- Versión de PHP: 5.5.9-1ubuntu4.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `tpjee7`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TABLA_Q`
--

CREATE TABLE IF NOT EXISTS `TABLA_Q` (
  `A` int(11) NOT NULL,
  `B` int(11) NOT NULL,
  `DATOS` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `TABLA_Q`
--

INSERT INTO `TABLA_Q` (`A`, `B`, `DATOS`) VALUES
(1, 1, 550),
(2, 2, 555);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TABLA_R`
--

CREATE TABLE IF NOT EXISTS `TABLA_R` (
  `C` int(11) NOT NULL,
  `D` int(11) NOT NULL,
  `E` int(11) NOT NULL,
  `DATA2` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `TABLA_R`
--

INSERT INTO `TABLA_R` (`C`, `D`, `E`, `DATA2`) VALUES
(1, 1, 1, 99),
(2, 2, 2, 100),
(3, 1, 1, 101);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
