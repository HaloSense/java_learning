# Day 4

## If 语句

注意事项：

1. 开头大括号统一放在上一句末尾。
    ```java
    public class ifDemo {
        static void main(String[] args) {
            int a = 10;
            if (a > 10) {
                System.out.println("a > 10");
            }
        }
    }
    ``` 
2. 语句体中只有一行语句时可以省略大括号，但原则上不省略。
3. 对布尔类型变量进行判断时直接判断该变量，不需要写`== true`。

## Switch 语句

### default 省略和位置

1. default 可以被省略，但是当所有 case 都不匹配时，不执行任何语句，不建议省略。
2. default 不一定写在最下面。

### case 穿透

如果在写某一个case语句体时没有break，那么会继续执行下面的case语句体，直到遇到break或者switch语句体结束。

如果多个case语句重复，那么可以利用case穿透简化代码。

## For 和 While

对比：
for循环中控制循环的变量，在循环结束后**无法被访问**；while循环中，初始化控制循环的变量不是循环语句的一部分，
所以在循环结束后**可以被访问**。

for循环和while循环一定可以互相改写（条件充足情况下）。

一般使用场景：
1. 如果*循环的次数或循环范围已知*，一般用for循环
2. 如果*不知道具体循环次数或者范围*，只知道循环条件，一般用while循环
