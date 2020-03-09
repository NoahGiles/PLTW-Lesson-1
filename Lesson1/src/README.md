# Lesson1
## 1.1.2
#5. Both MediaLib and SecondClass have main() methods. <br/>
#7. String, float, double, and int are four variable types. <br/>
#17. Song@75412c2f is shown. <br/>
Conclusion : <br/>
#1. The advantages of accessors and mutators is that they are easily modified and stored, yet they also are somewhat
difficult to understand immediately. <br/>
#2. The song, movie, and book classes have the same title and rating variables, but have different class names.
To reduce duplication in these classes, it is possible to change what information that the classes provide. <br/>
## 1.1.3
#8. If I were to make a mutator method to set the favorite variable, it might look like <br/>
public void setFavorite(Boolean q) <br/>
{<br/>
favorite = q; <br/>
} <br/>
I prefer using getters and setters for the mutator favorite. <br/>
#12. <br/>
a. This naming convention is called Camel Case. <br/>
b. totalCost should be a double because the song prices are doubles. <br/>
**Conclusion :** <br/>
#1. You would have more than one constructor for a class in order to store different values for variables. If you had a constructor for a movie class with rating, title, and duration, another constructor might be used for another movie. <br/>
## 1.1.4
#25. a, b, and c appear to use short-circuit evaluation, given they both have || and && operators.<br/>
#27. <br/>
a. if (!sunny && !clear) <br/> 
b. if (!(!raining || !snowing)) <br/>
#28. <br/>
a. if (temperature <= 75) <br/>
b. if (temperature > 100) <br/>
c. if (temperature < 32 || temperature > 32) <br/>
**Conclusion :**<br/>
1. Boundary conditions for str might look like "if (str != "" && str != null && str.length() < 80)"<br/>
2.  Using DeMorgan's Law, the "(if str != "")" may be simplified to "if (!(str == ""))" <br/>
## 1.1.5
#2. The first algorithm simulates dice rolls in that it rolls up to 12 to account for two dice, and the second<br/>
rolls one die and adds another onto it. Both might serve their purpose well, but the first would not be able to print a<br/>
reliable number for the numbers on two individual dice. <br/>
**Conclusion :** <br/>
#1. The code finds a length of between 1 and (length - 1) so it doesn't retrieve the name from the beginning or the very end.<br/>
The result of this could be anything from everything but the first letter of a name to only the last two. <br/>
#2. The two statements differ in that the first multiplies Math.random() by 10 and then adds 1, while the second<br/>
adds 10 to 1 and then multiplies it by Math.random(). <br/>
## 1.1.6
#1. <br/>
U :"Hello"<br/> 
C : ""<br/>
U : “Who are you?” <br/>
C : ""<br/>
U : “Goodbye”<br/>
C : ""<br/>
The chatbot seems to respond mostly to nouns as keywords, as well as pronouns.
In the question “where do you come from”, the keywords are likely “where”, “you”, and “from”

#2. <br/>
#3. <br/>
#4 (Skip p2). <br/>
#13. <br/>
**Conclusion :** <br/>
<br/>
