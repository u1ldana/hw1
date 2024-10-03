
Singleton — System Configuration: The CinemaConfig class is responsible for managing the global settings of the cinema, such as the name, number of screens, and opening hours. Using the Singleton pattern, we ensure that only one instance of this class is created, available everywhere in the system.

The getInstance() method checks if the object has already been created, and if not, creates it. Otherwise, it returns an already existing object.
This allows you to have one configuration for the entire application, which saves resources and simplifies the management of settings.

The Movie interface defines the methods that all types of movies should implement (for example, get the title and type of the movie).
RegularMovie is a specific implementation of a regular movie.
MovieFactory is an abstract factory that creates movies, and RegularMovieFactory is a concrete factory for making regular movies.
The factory makes it easy to expand the project and add new types of movies without changing the existing code.

The Button interface defines the render() method that will be implemented for various themes.
DarkThemeButton is a specific implementation of a button for a dark theme.
UIFactory is an abstract factory that creates interface elements (in this case buttons).
DarkThemeFactory is a specific factory for creating interface elements in a dark theme.

The MovieSchedule interface defines the clone() method, which is used to clone schedule objects.
The StandardSchedule class implements the interface and provides the ability to clone schedule objects using the clone() method.
The Prototype pattern allows you to create copies of objects and make changes to each copy regardless of the original, which is useful when working with cinema schedules.
 
 
