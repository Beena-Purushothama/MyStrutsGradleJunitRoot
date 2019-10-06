# MyStrutsGradleJunitRoot

## Overview
A simple struts1 application to demonstrate how unit test cases can be written for action classes and built using gradle.

The application is separated into two diffrent projects one main project where the actual business code resides and another 
test project used purely to write unit test for the main project

Here I have two approaches to write junits for struts1 action using 

* Mockioto
* StrutsTestCases

Mockito - uses MokitoJunitRunner to create mocking objects and invoke action classes, downside of this approach is even though 
we can test action classes we cant really test our struts config. Should be used test only the action class

StrutsTestCases - 



## Installations

## App Functionality
