# sessionlifecycleservelt


Session Object is one of the most important objects in Servlet's Object Model. This sequence shows how and when Session objects are created. It illustrates how servlets can participate in sessions and how sessions can be terminated. Web Applications usually use Session objects to store user related data. Understanding Session Object's life cycle and way to manage it is very fundamental to using Servlet Technology. 



This code shows how to use getSession method of  HttpRequest Object. getSession returns the handle of an existing Session Object. Just in case of the Session Object being absent, a new session object is created and its handle returned.
This code shows how to use parameterised getSession method of  HttpRequest Object. If we pass false as a parameter to getSession method it returns the handle of an existing Session Object. Just in case of the Session Object being absent, null is returned.
This code shows how to use getSession method of  HttpRequest Object. getSession returns the handle of an existing Session Object. You can terminate the session by invoking invalidate method on the Session Object
