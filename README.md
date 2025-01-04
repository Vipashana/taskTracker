# taskTracker

The taskTracker is a Spring Boot web application designed to help users manage their tasks effectively. It provides features such as creating, updating, and deleting tasks with an easy-to-use interface. The application is built using Spring Boot, Spring Security, and Spring Data JPA, ensuring a secure and scalable architecture.

Features
- User Authentication: Users can log in securely using Spring Security.
- Task Management:
  - Add new tasks with a description and target date.
  - Update existing tasks.
  - Delete tasks that are no longer needed.
- Task List: View all tasks for a logged-in user.
- Form Validation: Ensure proper input using validation for task descriptions.
- H2 Database Integration: In-memory database to store tasks for easy setup and testing.

Project Structure
1. Controllers
    - WelcomeController: Handles requests to the homepage and provides user details.
    - TodoControllerJpa: Manages task-related actions such as listing, adding, updating, and deleting tasks.
2. Entities
    - Todo: Represents a task with attributes such as description, target date, and completion status.
3. Repositories
    - TodoRepository: JPA repository for managing task data.
4. Security
    - SpringSecurityConfiguration: Configures user authentication, password encoding, and authorization settings.
5. Views
    - JSP files for UI, including:
        - welcome.jsp: Homepage for the user after login.
        - listTodos.jsp: Displays the user's task list.
        - todo.jsp: Form to add or update a task.
6. Configuration
    - pom.xml: Manages dependencies, including Spring Boot, H2, JSP, and WebJars.

Technologies Used
- Backend: Spring Boot (Web, Security, Data JPA)
- Frontend: JSP, Bootstrap, jQuery
- Database: H2 Database (In-Memory)
- Validation: Spring Boot Validation
- Build Tool: Maven
- Java Version: 17
