# Restful-CRUD-App
This is a Restful CRUD App Sample divided in Frontend, Backend and Database.

## Requirements
### Use Cases
**Actor(s):**
- Regular User
- Super User

1. **Preconditions:**
   - A user (regular/super) must exist in the database with mandatory fields such as username, full name, and password.

2. **Basic Flow:**
   - Super user logs into the app with secure authentication.
   - Super user creates a Regular user with unique credentials.
   - Super user logs out securely.
   - Regular user logs into the app using its credentials.
   - Regular user performs CRUD actions securely.
   - If a delete action is required, the Super user must securely log in the app to execute it.

3. **Alternate Flow(s):**
   - If a Regular user already exists during  user creation, the system will display a user-friendly error message notifying the Super user about the duplication.
   - Editing a Regular user requires Super user authentication to ensure the security of user data and roles.

4. **Security Considerations:**
- Authentication mechanisms are in place to safeguard user logins and actions.
- Authorization checks are implemented to ensure that only super users can execute critical actions.
![Alt Text](image/use_cases.png)

### Business Rules
- Critical operations such as delete or user management only can be performed by super users.
- User usernames must be unique.
- User must have identification, name, username and password.
- Users are created with Regular role as default.
- User creation in business-layer level also includes creation in database-layer.
## Suggested Software Architecture
Simple whole-system Diagram:
![Alt Text](image/suggested_architecture_simple_diagram.png)
## Data Schema
![Alt Text](image/data_schema.png)
## Class Diagram
- Web Package contains: Controller, API Config, API Security
- Test Package contains: Unit Tests
### User Service
![Alt Text](image/user_service_class_diagram.png)
### Item Service
![Alt Text](image/item_service_class_diagram.png)
### Security Service
![Alt Text](image/security_service_class_diagram.png)
## Tech Stack
- Springboot
- Docker
- React.js
- Typescript
- MySQL
- Nginx
- Jwt