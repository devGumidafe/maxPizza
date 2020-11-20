-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-05-2020 a las 21:38:36
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `pizzeria`
--
CREATE DATABASE IF NOT EXISTS `pizzeria` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `pizzeria`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallepedido`
--

DROP TABLE IF EXISTS `detallepedido`;
CREATE TABLE `detallepedido` (
  `idPedido` int(11) NOT NULL,
  `idProducto` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precioUnidad` decimal(8,2) NOT NULL,
  `precioTotal` decimal(8,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `detallepedido`
--

INSERT INTO `detallepedido` (`idPedido`, `idProducto`, `cantidad`, `precioUnidad`, `precioTotal`) VALUES
(3, 2, 1, '0.50', '0.50'),
(3, 7, 2, '9.00', '18.00'),
(3, 8, 2, '10.00', '20.00'),
(3, 13, 2, '14.00', '28.00'),
(4, 7, 2, '9.00', '18.00'),
(4, 8, 2, '10.00', '20.00'),
(5, 3, 2, '0.50', '1.00'),
(5, 13, 2, '14.00', '28.00'),
(5, 14, 2, '12.00', '24.00'),
(6, 2, 1, '0.50', '0.50'),
(6, 3, 1, '0.50', '0.50'),
(6, 7, 2, '9.00', '18.00'),
(7, 3, 2, '0.50', '1.00'),
(7, 7, 2, '9.00', '18.00'),
(8, 7, 2, '9.00', '18.00'),
(8, 8, 2, '10.00', '20.00'),
(8, 13, 2, '14.00', '28.00'),
(9, 7, 3, '9.00', '27.00'),
(10, 8, 1, '10.00', '10.00'),
(13, 6, 2, '5.00', '10.00'),
(13, 14, 2, '12.00', '24.00'),
(13, 15, 2, '10.00', '20.00'),
(13, 23, 2, '18.00', '36.00'),
(13, 24, 2, '15.00', '30.00'),
(13, 25, 2, '10.00', '20.00'),
(14, 8, 2, '10.00', '20.00'),
(14, 9, 2, '12.00', '24.00'),
(15, 10, 2, '14.00', '28.00'),
(16, 7, 2, '9.00', '18.00'),
(16, 8, 2, '10.00', '20.00'),
(17, 8, 2, '10.00', '20.00'),
(17, 9, 2, '12.00', '24.00'),
(17, 18, 2, '18.00', '36.00'),
(18, 7, 2, '9.00', '18.00'),
(18, 16, 2, '16.00', '32.00'),
(19, 11, 1, '16.00', '16.00'),
(20, 10, 2, '14.00', '28.00'),
(21, 10, 2, '14.00', '28.00'),
(22, 10, 2, '14.00', '28.00'),
(23, 10, 2, '14.00', '28.00'),
(24, 10, 2, '14.00', '28.00'),
(25, 10, 2, '14.00', '28.00'),
(26, 10, 2, '14.00', '28.00'),
(27, 9, 2, '12.00', '24.00'),
(28, 9, 2, '12.00', '24.00'),
(29, 10, 2, '14.00', '28.00'),
(30, 10, 2, '14.00', '28.00'),
(31, 8, 1, '10.00', '10.00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `direccion`
--

DROP TABLE IF EXISTS `direccion`;
CREATE TABLE `direccion` (
  `idDireccion` int(11) NOT NULL,
  `calle` varchar(50) NOT NULL,
  `numero` int(11) NOT NULL,
  `codigoPostal` varchar(5) NOT NULL,
  `localidad` varchar(50) NOT NULL,
  `telefono` varchar(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `direccion`
--

INSERT INTO `direccion` (`idDireccion`, `calle`, `numero`, `codigoPostal`, `localidad`, `telefono`) VALUES
(7, 'Tomas Morales', 300, '35020', 'TELDE', '600100200'),
(9, 'Tomas Morales', 15, '35000', 'LAS PALMAS DE GRAN CANARIA', '600100200'),
(10, 'LAS MAJADILLAS', 100, '35018', 'LAS PALMAS DE GRAN CANARIA', '664368841'),
(12, 'Marzagan', 14, '35010', 'LAS PALMAS DE GRAN CANARIA', '600100200'),
(13, 'Triana', 300, '35120', 'INGENIO', '600100200');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

DROP TABLE IF EXISTS `pedido`;
CREATE TABLE `pedido` (
  `idPedido` int(11) NOT NULL,
  `idCliente` varchar(20) NOT NULL,
  `fecha` date NOT NULL,
  `precioTotal` decimal(8,2) NOT NULL,
  `formaPago` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pedido`
--

INSERT INTO `pedido` (`idPedido`, `idCliente`, `fecha`, `precioTotal`, `formaPago`) VALUES
(3, 'gumi', '2020-05-05', '66.50', 'Tarjeta'),
(4, 'gumi', '2020-05-05', '38.00', 'Tarjeta'),
(5, 'gumi', '2020-05-05', '53.00', 'Tarjeta'),
(6, 'gumi', '2020-05-05', '25.00', 'Tarjeta'),
(7, 'jose', '2020-05-05', '25.00', 'Tarjeta'),
(8, 'gumi', '2020-05-05', '66.00', 'Efectivo'),
(9, 'gumi', '2020-05-05', '27.00', 'Tarjeta'),
(10, 'gumi', '2020-05-09', '13.00', 'Tarjeta'),
(13, 'gumi', '2020-05-10', '140.00', 'Efectivo'),
(14, 'gumi', '2020-05-10', '44.00', 'Efectivo'),
(15, 'gumi', '2020-05-10', '28.00', 'Efectivo'),
(16, 'jose', '2020-05-10', '38.00', 'Efectivo'),
(17, 'jose', '2020-05-10', '80.00', 'Efectivo'),
(18, 'gumi', '2020-05-18', '50.00', 'Efectivo'),
(19, 'gumi', '2020-05-18', '19.00', 'Efectivo'),
(20, 'gumi', '2020-05-19', '28.00', 'Efectivo'),
(21, 'gumi', '2020-05-20', '28.00', 'Efectivo'),
(22, 'gumi', '2020-05-20', '28.00', 'Efectivo'),
(23, 'gumi', '2020-05-20', '28.00', 'Efectivo'),
(24, 'gumi', '2020-05-20', '28.00', 'Efectivo'),
(25, 'gumi', '2020-05-20', '28.00', 'Efectivo'),
(26, 'gumi', '2020-05-20', '28.00', 'Efectivo'),
(27, 'gumi', '2020-05-20', '24.00', 'Efectivo'),
(28, 'gumi', '2020-05-20', '24.00', 'Efectivo'),
(29, 'gumi', '2020-05-20', '28.00', 'Efectivo'),
(30, 'gumi', '2020-05-20', '28.00', 'Efectivo'),
(31, 'gemma', '2020-05-21', '13.00', 'Efectivo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

DROP TABLE IF EXISTS `persona`;
CREATE TABLE `persona` (
  `usuario` varchar(20) NOT NULL,
  `pass` varchar(20) NOT NULL,
  `tipo` varchar(10) NOT NULL,
  `idDireccion` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`usuario`, `pass`, `tipo`, `idDireccion`) VALUES
('cesar', '000000', 'cliente', 9),
('gemma', '123456', 'cliente', 12),
('gumi', '000000', 'cliente', 10),
('jose', '123456', 'cliente', 7),
('pepe', '123456', 'cliente', 13);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

DROP TABLE IF EXISTS `producto`;
CREATE TABLE `producto` (
  `idProducto` int(11) NOT NULL,
  `tipo` varchar(20) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `descripcion` varchar(200) NOT NULL,
  `tam` varchar(20) DEFAULT NULL,
  `precio` decimal(8,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idProducto`, `tipo`, `nombre`, `descripcion`, `tam`, `precio`) VALUES
(1, 'bebida', 'Sprite', 'Refresco Sprite', '50cl', '1.00'),
(2, 'bebida', 'Agua', 'Agua sin gas', '50cl', '0.50'),
(3, 'bebida', 'Cerveza', 'Cerveza de lata', '33cl', '0.50'),
(4, 'bebida', 'Cola', 'Refresco Coca-Cola', '50cl', '1.00'),
(5, 'bebida', 'Fanta', 'Refresco Fanta Naranja', '50cl', '1.00'),
(6, 'pan', 'PanAjo Mediano', 'Pan de Ajo', '4uds', '5.00'),
(7, 'pizza', 'Cuatro Quesos', 'Pizza Cuatro Quesos', 'Mediana', '9.00'),
(8, 'pizza', 'Carbonara', 'Pizza Carbonara', 'Mediana', '10.00'),
(9, 'pizza', 'Florentina', 'Pizza Florentina', 'Mediana', '12.00'),
(10, 'pizza', 'Hawaiana', 'Pizza Hawaiana', 'Mediana', '14.00'),
(11, 'pizza', 'Supreme', 'Pizza Supreme', 'Mediana', '16.00'),
(12, 'pizza', 'Especial', 'Pizza Especial de la Casa', 'Mediana', '18.00'),
(13, 'pizza', 'Barbacoa', 'Pizza Barbacoa', 'Mediana', '14.00'),
(14, 'pizza', 'Bacon', 'Pizza Bacón', 'Mediana', '12.00'),
(15, 'pizza', 'Peperoni', 'Pizza Peperoni', 'Mediana', '10.00'),
(16, 'pizza', 'Cuatro Quesos Familiar', 'Pizza Cuatro Quesos', 'Familiar', '16.00'),
(17, 'pizza', 'Carbonara Familiar', 'Pizza Carbonara', 'Familiar', '18.00'),
(18, 'pizza', 'Florentina Familiar', 'Pizza Florentia', 'Familiar', '18.00'),
(19, 'pizza', 'Hawaiana Familiar', 'Pizza Hawaiana', 'Familiar', '20.00'),
(20, 'pizza', 'Supreme Familiar', 'Pizza Supreme', 'Familiar', '22.00'),
(21, 'pizza', 'Especial Familiar', 'Pizza Especial de la Casa', 'Familiar', '28.00'),
(22, 'pizza', 'Barbacoa Familiar', 'Pizza Barbacoa', 'Familiar', '20.00'),
(23, 'pizza', 'Bacón Familiar', 'Pizza Bacón', 'Familiar', '18.00'),
(24, 'pizza', 'Peperoni Familiar', 'Pizza Peperoni', 'Familiar', '15.00'),
(25, 'pan', 'PanAjo Grande', 'Pan de Ajo', '10uds', '10.00'),
(26, 'pan', 'PanAjo Pequeño', 'Pan de Ajo', '1ud', '1.00');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `detallepedido`
--
ALTER TABLE `detallepedido`
  ADD PRIMARY KEY (`idPedido`,`idProducto`),
  ADD KEY `idProducto` (`idProducto`);

--
-- Indices de la tabla `direccion`
--
ALTER TABLE `direccion`
  ADD PRIMARY KEY (`idDireccion`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`idPedido`),
  ADD KEY `idCliente` (`idCliente`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`usuario`),
  ADD KEY `idDireccion` (`idDireccion`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idProducto`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `direccion`
--
ALTER TABLE `direccion`
  MODIFY `idDireccion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de la tabla `pedido`
--
ALTER TABLE `pedido`
  MODIFY `idPedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `idProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detallepedido`
--
ALTER TABLE `detallepedido`
  ADD CONSTRAINT `detallepedido_ibfk_1` FOREIGN KEY (`idPedido`) REFERENCES `pedido` (`idPedido`),
  ADD CONSTRAINT `detallepedido_ibfk_2` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`);

--
-- Filtros para la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `pedido_ibfk_1` FOREIGN KEY (`idCliente`) REFERENCES `persona` (`usuario`);

--
-- Filtros para la tabla `persona`
--
ALTER TABLE `persona`
  ADD CONSTRAINT `persona_ibfk_1` FOREIGN KEY (`idDireccion`) REFERENCES `direccion` (`idDireccion`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
