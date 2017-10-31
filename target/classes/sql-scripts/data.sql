INSERT INTO app_role (id, role_name, description) VALUES (1, 'STANDARD_USER', 'Standard User - Has no admin rights');
INSERT INTO app_role (id, role_name, description) VALUES (2, 'ADMIN_USER', 'Admin User - Has permission to perform admin tasks');

-- USER
-- non-encrypted password: jwtpass
INSERT INTO app_user (id, first_name, last_name, password, username) VALUES (1, 'John', 'Doe', '821f498d827d4edad2ed0960408a98edceb661d9f34287ceda2962417881231a', 'john.doe');
INSERT INTO app_user (id, first_name, last_name, password, username) VALUES (2, 'Admin', 'Admin', '821f498d827d4edad2ed0960408a98edceb661d9f34287ceda2962417881231a', 'admin.admin');


INSERT INTO user_role(user_id, role_id) VALUES(1,1);
INSERT INTO user_role(user_id, role_id) VALUES(2,1);
INSERT INTO user_role(user_id, role_id) VALUES(2,2);

-- Populate random city table

--INSERT INTO random_city(id, name) VALUES (1, 'Bamako');
--INSERT INTO random_city(id, name) VALUES (2, 'Nonkon');
--INSERT INTO random_city(id, name) VALUES (3, 'Houston');
--INSERT INTO random_city(id, name) VALUES (4, 'Toronto');
--INSERT INTO random_city(id, name) VALUES (5, 'New York');
--INSERT INTO random_city(id, name) VALUES (6, 'Mopti');
--INSERT INTO random_city(id, name) VALUES (7, 'Koulikoro');
--INSERT INTO random_city(id, name) VALUES (8, 'Moscow');

-- Populate match table
INSERT INTO match(id_match, number_players, winner, score, number_spike, number_fireball, number_nuke) VALUES (1, '4', 'P2', '1200', '5', '4', '2');
INSERT INTO match(id_match, number_players, winner, score, number_spike, number_fireball, number_nuke) VALUES (2, '3', 'P2', '1900', '6', '9', '1');
INSERT INTO match(id_match, number_players, winner, score, number_spike, number_fireball, number_nuke) VALUES (3, '4', 'P3', '100', '8', '2', '5');
INSERT INTO match(id_match, number_players, winner, score, number_spike, number_fireball, number_nuke) VALUES (4, '2', 'P1', '800', '1', '3', '9');
INSERT INTO match(id_match, number_players, winner, score, number_spike, number_fireball, number_nuke) VALUES (5, '4', 'P4', '1000', '5', '5', '2');