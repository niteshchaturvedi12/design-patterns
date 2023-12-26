There should never be more than one reason for a class to change.


This class is focused on  a single functionality
SRP says that one class should address a specific concern

example: if a class Communicator is responsible to send a message on a remote server, consider
following conditions
    1. if server starts to use https instead of http
    2. if server accepts the message in JSON but wants to move on xml format
    3. if server wants to apply authentication.

in all of these cases, our Communicator class needs to change its code.

Solution: we should divide the code of communicator class in such a way that, one class 
handles Authentication, one class handles Message format and One class handles protocols,
and Communicator class handles the business logic to send a message.