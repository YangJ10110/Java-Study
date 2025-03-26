Here’s a completed version of your README with explanations and formatting improvements:  

---

# **JAVA IS A WEIRD LANGUAGE**  
*(COMING FROM A GUY THAT MOSTLY USED PYTHON AND DECLARATIVE LANGUAGES)*  

## **BASIC LEARNING**  

### **1. NOT A STATEMENT**  
Java restricts what counts as a valid **statement**. Expressions like `5;` or `a + b;` are meaningless and won’t compile. Java forces statements to either modify something (assignment) or perform an action (like calling a function).  

✅ **Valid:**  
```java
int x = 5;   // Assignment (modifies x)
System.out.println("Hello"); // Function call (has an effect)
```
🚫 **Invalid:**  
```java
5;   // Does nothing (not allowed)
a + b;   // Just computes a value but doesn't use it
```

---

### **2. POTENTIAL SIDE EFFECTS AND EXPRESSION STATEMENTS**  
Coming from Python, it was hard to grasp that Java doesn’t allow expressions unless they **"do something"** (change a variable, print output, etc.).  

**Expression statements** in Java must have **side effects**, meaning they should modify program state or interact with the world.  

✅ **Allowed in Java:**  
```java
x = x + 1;   // Changes x
foo();       // Function call (may change something)
```
🚫 **Not Allowed in Java:**  
```java
3 + 4;   // Computes a value but does nothing
```
Unlike Python, where you can casually write `3 + 4` in interactive mode, Java forces structure.

---

### **3. CLASS NAME = FILE NAME OR IT WON'T COMPILE**  
In Java, the **public class name** must match the **file name**, or the compiler gets mad.  

✅ **Allowed (`HelloWorld.java`)**  
```java
public class HelloWorld {  // Matches file name
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```
🚫 **Won’t Compile (`Hello.java` with a different class name)**  
```java
public class NotHello {  // Doesn't match "Hello.java"
    public static void main(String[] args) {
        System.out.println("Hello!");
    }
}
```

---

### **4. YOU CAN’T JUST DECLARE AN EMPTY STRING**  
In Python, this is fine:  
```python
s = ""  # Empty string
```
But in Java, if you try:  
```java
String s;
System.out.println(s); // ERROR: Variable might not have been initialized
```
Java doesn’t allow using **uninitialized** variables. You must explicitly assign something:  
```java
String s = "";  // This works
```

---

### **5. METHODS VS. FUNCTIONS**  
Coming from Python, it’s weird that **Java doesn’t have standalone functions**. Everything must be inside a class.  

#### **Python (Functions Exist on Their Own)**  
```python
def add(a, b):
    return a + b

print(add(3, 5))  # Works fine
```
#### **Java (Everything is in a Class)**  
```java
class MathUtils {
    public int add(int a, int b) {  // This is a method
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        MathUtils math = new MathUtils();
        System.out.println(math.add(3, 5));  // Need an object to call
    }
}
```
- **Functions** = Standalone in Python  
- **Methods** = Must be inside a class in Java  

---

## **CONCLUSION**  
Java has a **strict** structure compared to Python. It enforces rules that Python ignores, making it feel **weird** at first. But once you get used to it, the structure helps prevent a lot of hidden errors.

