@echo off
echo "Compiling app..."
javac com/rath/GraphicalSorter.java
javac com/rath/elem/*.java
javac com/rath/gui/*.java
javac com/rath/util/*.java
echo "Compiling sorts..."
javac com/rath/sorts/*.java
javac com/rath/sortext/*.java
pause