In this project, I used several design patterns to create an efficient and structured cinema management system. Here's how I applied each of them:
Singleton, Factory Method,Abstract Factory,Builder,Prototype ...
#Singleton — System Configuration: The CinemaConfig class is responsible for managing the global settings of the cinema, such as the name, number of screens, and opening hours. Using the Singleton pattern, we ensure that only one instance of this class is created, available everywhere in the system.

#The getInstance() method checks if the object has already been created, and if not, creates it. Otherwise, it returns an already existing object.
This allows you to have one configuration for the entire application, which saves resources and simplifies the management of settings.


CinemaConfig.java     . Singleton class for cinema configuration
Movie.java            . Abstract representation of a movie
 RegularMovie.java     . Concrete class for a regular movie
MovieFactory.java     . Factory Method interface for movie creation
RegularMovieFactory.java  . Concrete factory for creating regular movies
UIFactory.java        . Abstract factory for UI elements
DarkThemeFactory.java . Concrete factory for creating dark theme UI components
 Button.java           . UI button interface
TicketBooking.java    . Represents a movie ticket booking
TicketBookingBuilder.java . Builder class for ticket bookings
 MovieSchedule.java    . Interface for movie schedules
 StandardSchedule.java . Concrete schedule that can be cloned (Prototype)
CinemaManagementApp.java      . Main entry point for the Cinema Management App

 
 
