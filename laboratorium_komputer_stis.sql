-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 15, 2024 at 04:04 AM
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
-- Database: `laboratorium_komputer_stis`
--

-- --------------------------------------------------------

--
-- Table structure for table `komputer`
--

CREATE TABLE `komputer` (
  `id_komputer` int(11) NOT NULL,
  `status` varchar(255) NOT NULL,
  `lab_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `komputer`
--

INSERT INTO `komputer` (`id_komputer`, `status`, `lab_id`) VALUES
(1, 'Siap Digunakan', 1),
(2, 'Siap Digunakan', 1),
(3, 'Siap Digunakan', 1),
(4, 'Siap Digunakan', 1),
(5, 'Siap Digunakan', 1),
(6, 'Siap Digunakan', 2),
(7, 'Siap Digunakan', 2),
(8, 'Sedang Diperbaiki', 2),
(9, 'Siap Digunakan', 2),
(10, 'Siap Digunakan', 2),
(11, 'Siap Digunakan', 3),
(12, 'Siap Digunakan', 3),
(13, 'Siap Digunakan', 3),
(14, 'Siap Digunakan', 3),
(15, 'Siap Digunakan', 3);

-- --------------------------------------------------------

--
-- Table structure for table `laboratorium`
--

CREATE TABLE `laboratorium` (
  `id_laboratorium` int(11) NOT NULL,
  `lokasi` varchar(255) NOT NULL,
  `nama_laboratorium` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `laboratorium`
--

INSERT INTO `laboratorium` (`id_laboratorium`, `lokasi`, `nama_laboratorium`) VALUES
(1, 'Gedung 2 Lantai 4', 'Laboratorium Komputer 1'),
(2, 'Gedung 2 Lantai 4', 'Laboratorium Komputer 2'),
(3, 'Gedung 2 Lantai 4', 'Laboratorium Komputer 3');

-- --------------------------------------------------------

--
-- Table structure for table `peminjaman`
--

CREATE TABLE `peminjaman` (
  `id_peminjaman` int(11) NOT NULL,
  `waktu_peminjaman` datetime(6) DEFAULT NULL,
  `waktu_pengembalian` datetime(6) DEFAULT NULL,
  `komputer_id` int(11) DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `nim` varchar(255) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `kelas` varchar(255) DEFAULT NULL,
  `nama` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`nim`, `email`, `kelas`, `nama`, `password`, `role`) VALUES
('222212111', 'bagusrega4@gmail.com', '3SI2', 'Ardi', '$2a$10$BG8xqrmIuGK3WU9MOz8mx.Te3yMaoc2I2UtJ0faUhLfRZySBrplOW', 'admin'),
('222212455', '222212455@stis.ac.id', '3SI2', 'Agape Bagus Rega Anggara', '$2a$10$IQ1gMkv5JHFNHi4liVnKk.Cg31hwrn6M7SaY9w/z3XWp2SlLcSQzy', 'mahasiswa');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `komputer`
--
ALTER TABLE `komputer`
  ADD PRIMARY KEY (`id_komputer`),
  ADD KEY `FKsoq3qe7jctrsp2yuxc714n49i` (`lab_id`);

--
-- Indexes for table `laboratorium`
--
ALTER TABLE `laboratorium`
  ADD PRIMARY KEY (`id_laboratorium`);

--
-- Indexes for table `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD PRIMARY KEY (`id_peminjaman`),
  ADD KEY `FKqxsjck5smedj2m0jjajptxdly` (`komputer_id`),
  ADD KEY `FK85aayhce12fpduuk128t4bgqi` (`user_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`nim`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `peminjaman`
--
ALTER TABLE `peminjaman`
  MODIFY `id_peminjaman` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `komputer`
--
ALTER TABLE `komputer`
  ADD CONSTRAINT `FKsoq3qe7jctrsp2yuxc714n49i` FOREIGN KEY (`lab_id`) REFERENCES `laboratorium` (`id_laboratorium`) ON DELETE CASCADE;

--
-- Constraints for table `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD CONSTRAINT `FK85aayhce12fpduuk128t4bgqi` FOREIGN KEY (`user_id`) REFERENCES `user` (`nim`) ON DELETE CASCADE,
  ADD CONSTRAINT `FKqxsjck5smedj2m0jjajptxdly` FOREIGN KEY (`komputer_id`) REFERENCES `komputer` (`id_komputer`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
