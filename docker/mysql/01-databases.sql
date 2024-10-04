-- create databases
CREATE DATABASE IF NOT EXISTS `giftibox`;
CREATE DATABASE IF NOT EXISTS `users`;

-- create root user and grant rights (제거)
GRANT ALL ON *.* TO 'root'@'localhost';