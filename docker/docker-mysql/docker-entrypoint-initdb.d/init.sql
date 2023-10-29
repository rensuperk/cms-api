
create database if not exists  `cms` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016
DEFAULT ENCRYPTION='N' */ ;
use cms ;
source /docker-entrypoint-initdb.d/latest/quartz.sql   ;
source /docker-entrypoint-initdb.d/latest/ry_20230706.sql   ;
