-- Drop user first if they exist
DROP USER if exists 'springdb'@'%' ;

-- Now create user with prop privileges
CREATE USER 'springdb'@'%' IDENTIFIED BY 'springdb';

GRANT ALL PRIVILEGES ON * . * TO 'springdb'@'%';