-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost:3306
-- Généré le : mar. 18 mai 2021 à 14:34
-- Version du serveur :  5.7.24
-- Version de PHP : 7.2.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `db_codex`
--

-- --------------------------------------------------------

--
-- Structure de la table `t_categorie`
--

CREATE TABLE `t_categorie` (
  `id` int(11) NOT NULL,
  `nom` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `DATE_CREATED` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `t_categorie`
--

INSERT INTO `t_categorie` (`id`, `nom`, `description`, `DATE_CREATED`) VALUES
(1, 'Inventeur', NULL, '2021-05-11 21:28:23'),
(2, 'Prix Turing', NULL, '2021-05-11 21:28:23'),
(3, 'Entreprise', NULL, '2021-05-14 13:01:31'),
(4, 'Culture', NULL, '2021-05-14 13:01:31'),
(5, 'Generation', NULL, '2021-05-15 16:22:39');

-- --------------------------------------------------------

--
-- Structure de la table `t_question_reponse`
--

CREATE TABLE `t_question_reponse` (
  `id` int(11) NOT NULL,
  `question` varchar(255) NOT NULL,
  `reponse` varchar(255) NOT NULL,
  `categorie` int(11) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `DATE_CREATED` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `t_question_reponse`
--

INSERT INTO `t_question_reponse` (`id`, `question`, `reponse`, `categorie`, `description`, `DATE_CREATED`) VALUES
(4, 'que signifie png?', 'portable network graphics', 4, NULL, '2021-05-14 13:02:15'),
(5, 'que signifie url?', 'uniform resource locator', 4, NULL, '2021-05-14 13:02:39'),
(6, 'né à philadelphie le 3 décembre 1924,  est un informaticien américain,  il reçoit le prix turing en 1977 pour « son influence et sa contribution au développement des langages de programmation de haut niveau,  il est l\'inventeur de fortran', 'john backus', 1, NULL, '2021-05-14 13:33:19'),
(7, 'né le 3 septembre 1927, à boston, il est également le créateur du langage lisp, en 1958. il reçoit le prix turing en 1971 pour ses travaux en intelligence artificielle.', 'john mccarthy', 1, NULL, '2021-05-14 13:34:10'),
(8, 'née le 9 décembre 1906 à new york, est une informaticienne américaine et rear admiral (lower half) de la marine américaine. elle est la conceptrice du premier compilateur en 1951 (a-0 system) et du langage cobol en 1959.', 'grace hopper', 1, NULL, '2021-05-14 13:34:53'),
(9, 'qui est consideré commel\'inventeur du langage de requête structurée sql', '	donald d. chamberlin', 1, NULL, '2021-05-14 13:39:55'),
(10, 'née le 4 août 1932 à peru,  elle est la première femme à obtenir le titre d\'ibm fellow, et la première à recevoir le prix turing.  elle a obtenu des résultats importants sur les compilateurs.', 'frances allen', 1, NULL, '2021-05-14 13:42:39'),
(11, 'né le 16 novembre 1922 à flandreau, est un informaticien et un entrepreneur américain, principalement connu pour son travail sur l\'architecture des ordinateurs centraux.', 'gene amdahl', 1, NULL, '2021-05-14 13:44:05'),
(12, 'né le 10 janvier 1938 à milwaukee, informaticien et mathématicien américain de renom.  the art of computer programming (taocp), demeurent des ouvrages de référence.', 'donald knuth', 1, NULL, '2021-05-14 13:47:18'),
(13, 'né le 9 juillet 1971, est un des membres de l\'équipe d\'étudiants de l\'université de l\'illinois qui a développé, en 1993, mosaic, le premier navigateur web complet disponible pour les systèmes d\'exploitation mac os, windows et unix.', 'marc andreessen', 1, NULL, '2021-05-14 13:48:21'),
(14, 'informaticien français, membre de l\'académie des sciences, créateur du langage de description algorithmique exel', 'jacques arsac', 1, NULL, '2021-05-14 13:50:12'),
(15, ' né en 1951, est un concepteur de logiciels destinés à mac os, essentiellement connu comme l\'auteur de deux programmes exceptionnels : macpaint et hypercard', 'bill atkinson', 1, NULL, '2021-05-14 13:51:29'),
(16, 'né le 26 décembre 1791 à londre, il fut le premier à énoncer le principe d\'un ordinateur, inventeur de la machine à calculer mécanique programmable', 'charles babbage', 1, NULL, '2021-05-14 13:53:29'),
(17, 'inventeur de visicalc', 'dan bricklin', 1, NULL, '2021-05-14 13:57:06'),
(18, 'co-inventeur avec bob kahn du protocole tcp/ip?', 'vint cerf', 1, NULL, '2021-05-14 13:59:35'),
(19, ' un informaticien britannique. il est considéré comme l\'inventeur du modèle relationnel des sgbdr', 'frank codd', 1, NULL, '2021-05-14 14:02:47'),
(20, 'né le 30 avril 1916 à petoskey il est l\'un des pères, si ce n\'est le père fondateur, de la théorie de l\'information.', 'claude shannon', 1, NULL, '2021-05-14 14:05:18'),
(21, 'inventeur du langage prolog', 'alain colmerauer', 1, NULL, '2021-05-14 14:06:30'),
(22, 'créateur du concept de sémaphoreet incisif promoteur de la programmation structurée,\nnéerlandais', 'edsger dijkstra', 1, NULL, '2021-05-14 14:08:07'),
(23, 'inventeur du premier micro-ordinateur, le micral', 'françois gernelle', 1, NULL, '2021-05-14 14:09:05'),
(24, 'auteur du code de hamming', 'richard hamming', 1, NULL, '2021-05-14 14:10:55'),
(25, 'créateur du turbo pascal, de delphi puis du langage c#', 'anders hejlsberg', 1, NULL, '2021-05-14 14:11:40'),
(26, 'un informaticien américain. il est notamment connu pour son travail de développement du système d\'exploitation unix bsd et pour avoir été l\'un des cofondateurs de sun microsystems , inventeur de vi', 'bill joy', 1, NULL, '2021-05-14 14:14:19'),
(27, 'actrice et coinventrice d\'une forme de codage des transmissions par étalement de spectrebase de la technologie wi-fi', 'hedy lamarr', 1, NULL, '2021-05-14 14:16:31'),
(28, 'inventeur de latex', 'leslie lamport', 1, NULL, '2021-05-14 14:17:15'),
(29, 'inventeur de php', 'rasmus lerdorf', 1, NULL, '2021-05-14 14:19:33'),
(30, 'né le 14 avril 1965, est un informaticien japonais concepteur du langage de programmation ruby.', 'yukihiro matsumoto', 1, NULL, '2021-05-14 14:21:06'),
(31, 'initiateur du mouvement du logiciel libre, il lance, en 1983, le projet gnu et inventeur du compialteur de c gcc', 'richard stallman', 1, NULL, '2021-05-14 14:22:52'),
(32, 'un ancien pirate informatique américain, devenu depuis les années 2000 consultant en sécurité informatique, surnommé « le condor », il a notamment accédé illégalement aux bases de données de fujitsu, motorola, nokia et sun microsystems', 'kevin mitnick', 1, NULL, '2021-05-14 14:24:56'),
(33, 'auteur de loi de moore', 'gordon moore', 1, NULL, '2021-05-14 14:27:36'),
(34, 'inventeur du langage perl', 'larry wall', 1, NULL, '2021-05-14 14:36:46'),
(35, 'que signifie tcp', 'transmission control protocol', 4, NULL, '2021-05-14 22:40:42'),
(36, 'que signifie sata?', 'serial advanced technology attachment', 4, NULL, '2021-05-14 22:41:24'),
(37, 'crt?', ' cathode ray tube', 4, NULL, '2021-05-14 22:42:04'),
(38, 'virus?', 'vital information resource under seized', 4, NULL, '2021-05-14 22:42:50'),
(39, 'gis?', 'geographical information system', 4, NULL, '2021-05-14 22:43:17'),
(40, 'dds?', ' digital data storage', 4, NULL, '2021-05-14 22:43:38'),
(41, 'gpu?', 'graphics processing unit', 4, NULL, '2021-05-14 22:44:38'),
(42, 'msn?', 'microsoft networks', 4, NULL, '2021-05-14 22:45:05'),
(43, 'csma?', 'carrier sense multiple access', 4, NULL, '2021-05-14 22:46:23'),
(44, 'erp?', 'enterprise resource planning', 4, NULL, '2021-05-14 22:48:22'),
(45, 'fat?', 'file allocation table', 4, NULL, '2021-05-14 22:48:59'),
(46, 'crm?', 'customer relationship management', 4, NULL, '2021-05-14 22:49:33'),
(47, 'udp?', 'user datagram protocol', 4, NULL, '2021-05-14 22:50:00'),
(48, 'nat?', 'network address translation', 4, NULL, '2021-05-14 22:50:22'),
(49, 'snmp ?', 'simple network management protocol', 4, NULL, '2021-05-14 22:50:39'),
(50, 'pop?', 'post office protocol', 4, NULL, '2021-05-14 22:51:00'),
(51, 'crc?', 'cyclic redundancy check', 4, NULL, '2021-05-14 22:51:31'),
(52, 'adsl?', 'asymmetric digital subscriber line', 4, NULL, '2021-05-14 22:52:02'),
(53, 'cli', 'command line interface', 4, NULL, '2021-05-14 22:52:28'),
(54, 'cmos', 'complementary metal–oxide semiconductor', 4, NULL, '2021-05-14 22:53:22'),
(55, 'amd?', 'advanced micro devices', 4, NULL, '2021-05-14 22:53:52'),
(56, 'wap', 'wireless application protocol', 4, NULL, '2021-05-14 22:54:31'),
(57, 'arpanet', 'advanced research project agency network', 4, NULL, '2021-05-14 22:54:57'),
(58, 'iso', 'international organization for standardization', 4, NULL, '2021-05-14 22:56:15'),
(59, 'svg', 'scalable vector graphics', 4, NULL, '2021-05-14 22:56:56'),
(60, 'lcd', 'liquid crystal display', 4, NULL, '2021-05-14 22:58:04'),
(61, 'le vrai nom de bill gate', 'willian henry gates iii', 4, NULL, '2021-05-15 16:16:21'),
(62, 'le nom complet de steve jobs', 'steven paul jobs', 4, NULL, '2021-05-15 16:17:12'),
(63, 'inventeur de msdos', 'tim paterson', 1, NULL, '2021-05-15 16:17:55'),
(64, 'en quelle generation a été introduit le transistor?', '2', 5, NULL, '2021-05-15 16:26:57'),
(65, 'en quelle generation a ete integré les circuits integré?', '3', 5, NULL, '2021-05-15 16:27:40'),
(66, 'quelle generation a été introduit le micro-ordinateur', '4', 5, NULL, '2021-05-15 16:28:21'),
(67, 'en quelle generation a ete introduit l\'interface graphique et le reseau', '5', 5, NULL, '2021-05-15 16:29:08'),
(68, 'en quelle generation a ete introduit les relais aux lampes', '1', 5, NULL, '2021-05-15 16:30:14'),
(69, 'la premiere machine à tisser a été introduit par?', 'basile bouchon', 1, NULL, '2021-05-15 16:31:18'),
(70, 'nom du premier disque dur par ibm?', 'ramac', 4, NULL, '2021-05-15 16:36:35'),
(71, 'inventeur du bytecode?', 'niklaus wirth', 1, NULL, '2021-05-15 16:41:32'),
(72, 'inventeur du smiley', 'scott fahlman', 1, NULL, '2021-05-15 16:44:14'),
(73, 'inventeur de wikipédia?', 'jimmy wales', 1, NULL, '2021-05-15 16:48:07'),
(74, 'un informaticien connu pour avoir coécrit le premier livre sur le langage de programmation c (avec dennis ritchie). il est aussi le cocréateur des langages awk, avec alfred aho et peter weinberger, et ampl.', 'brian kernighan', 3, NULL, '2021-05-18 12:23:26'),
(75, 'est à washington, est un ingénieur américain inventeur de la mécanographie.', 'herman hollerith', 3, NULL, '2021-05-18 12:25:07'),
(76, 'est un ingénieur français en informatique . il a créé le réseau cyclades, à base de datagramme pur, et a contribué au développement des réseaux à commutation de paquets, précurseurs d\'internet', 'louis pouzin', 3, NULL, '2021-05-18 12:27:06'),
(77, 'auteur de c++', 'bjarne stroustrup', 3, NULL, '2021-05-18 12:29:34'),
(78, 'auteur du langage de programmation ml (pour meta-language) ', 'robin milner', 3, NULL, '2021-05-18 12:39:22'),
(79, 'devellopeur de minix', 'andrew tanenbaum', 3, NULL, '2021-05-18 12:46:40'),
(80, 'est une informaticienne américaine. elle devellopa langage clu, le premier langage de programmation à supporter l\'abstraction de données', 'barbara liskov', 3, NULL, '2021-05-18 12:54:28'),
(81, 'le créateur de la notation formelle z et par la suite de la méthode b', 'jean raymond', 3, NULL, '2021-05-18 13:07:13'),
(82, 'auteur de l\'émulateur qemu', 'fabrice bellard', 3, NULL, '2021-05-18 13:08:31'),
(83, 'il est un développeur du noyau linux aux côtés de linus torvalds et alan cox. il est salarié de google et a été nommé mainteneur de la branche -mm du noyau linux 2.6', 'andrew morton', 3, NULL, '2021-05-18 13:10:10'),
(84, 'est une informaticienne, directrice du département génie logiciel  au sein du mit instrumentation laboratory qui conçut le système embarqué du programme spatial apollo', 'margaret hamilton', 3, NULL, '2021-05-18 13:18:37'),
(85, 'il a créé le langage de programmation awk avec peter j', 'alfred aho', 4, NULL, '2021-05-18 13:33:11'),
(86, 'fondateur d\'ibm(international business machines) ou le big bleu', 'charles flint', 3, NULL, '2021-05-18 13:36:06'),
(87, 'fondateur de cisco', 'leonard bosack et sandy lerner', 3, NULL, '2021-05-18 13:38:46');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `t_categorie`
--
ALTER TABLE `t_categorie`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `t_question_reponse`
--
ALTER TABLE `t_question_reponse`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `t_categorie`
--
ALTER TABLE `t_categorie`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT pour la table `t_question_reponse`
--
ALTER TABLE `t_question_reponse`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=88;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
