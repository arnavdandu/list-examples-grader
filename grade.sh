# Create your grading script here

set -e

rm -rf student-submission
git clone $1 student-submission

if -f student-submission/ListExamples.java; then
    cp ./student-submission/ListExamples.java ./
    javac -cp ".:lib\hamcrest-core-1.3.jar:lib\junit-4.13.2.jar" *.java;
    if $? == 0; then
        echo "Compiled successfully"
    else
        echo "Compilation error."
        exit 1
    java TestListExamples

