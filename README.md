# Simplest-Dagger-Example
This is the simplest Dagger Example for injecting in Android
There are 8 example of using Dagger. All of them are very simple to understand if you follow chronologically.
The examples are ,
1. Inject SharedPreference using Dagger,
2. If you want to inject an object in base activity (althought its not encouraged; doc: base classes are not sufficient as injection targets. Dagger 2 relies on strongly typed classes, so you must specify explicitly which ones should be defined.)
3. Inject Custom SharedPreference Manager
4. Inject Retrofit as Rest Client.
5. Example of inject multiple onjects. In this case Rest Client and SharedPreference.
6. Example of Qualified Types in Dagger. Basically if you want to inject different types of object of same type.
7. Example of dependency in Dagger. A bit structure way to use Dagger. (doc: If we wish to have multiple components that do not need to remain in memory all the time (i.e. components that are tied to the lifecycle of an activity or fragment, or even tied to when a user is signed-in), we can create dependent components or subcomponents.)
8. Example of SubComponent in Dagger. Doc: same as 7
All of them are in seperate branches.
