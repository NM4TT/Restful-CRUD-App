INSERT INTO restful_crud_app.role (description, is_admin) VALUES ('Super', 1);
INSERT INTO restful_crud_app.role (description) VALUES ('Regular');

INSERT INTO restful_crud_app.user (role_id, name, username, password) 
VALUES (1,'Super User 001','SU001','strong_password');
INSERT INTO restful_crud_app.user (role_id, name, username, password) 
VALUES (2,'Regular User 001','RU001','strong_password');
COMMIT;