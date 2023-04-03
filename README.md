### Build 
```bash
./mvnw clean install 
```
### Summary 

Principles and Recommendations from the book.
```
Recommendations
- Birth
	- Never use -er names
	- Make one constructor Primary
	- Keep Constructors Code Free
- Education
	- Encapsulate as little as possible
	- Encapsulate something, at the very least
	- Always use Interfaces
	- Chose Method Names Carefully
		- Builders are Nouns
		- Manipulators are Verbs
		- Examples of Both
		- Boolean Results
	- Dont use Public Constants
		- Introduction of coupling
		- Loss of Cohesion
	- Be Immutable
		- Identify Mutability
		- Failure Atomicity
		- Temporal Coupling
		- Side-effect Free
		- No NULL References
		- Thread Safety
		- Smaller and Simpler Objects
	- Write tests instead of documentation
	- Dont Mock, use Fakes
	- Keep Interfaces short, use smarts
- Employment
	- Expose fwer than 5 public methods 
	- Don't use Static Methods
	- Objects vs. Computer Thinking
	- Declarative vs. Imperative Style
	- Utility Classes
	- Singleton Pattern
	- Functional Programming
	- Composable Decorators
	- Never Accept NULL Arguments
	- Be Loyal and Immutable or  constants
	- Never use Getters and Setters
		- Objects vs. Data Structures
		- Good Intention, Bad Outcomes
		- It's all about prefixes
	- Dont use new outside of secondary sectors
	- Avoid type introspection and casting
- Retirement
	- Never Return NULL
		- Fail Fast vs. Fail Safe
		- Alternatives to NULL
	- Throw only Checked Exceptions
	- Don't catch unless you have to
	- Always chain exceptions
	- Recover only Once
	- Use Aspect Oriented Programming
	- Just one exception type is enough
	- Be either Final or Abstract
	- use RAII
```