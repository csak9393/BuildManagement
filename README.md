BuildManagement
===============

Continious Integration

*Continuous Integration*, in short CI, is a practice used in software engineering, where all developers integrate their code into a share repository several times a day. The main aim of CI is to prevent integration problems, it allows teams to detect problems quickly and locate them more easily. This is due to the fact that developers who are working on a code together will encounter the so called integration problems, which can easily hold back a project from its initial schedule or fail the whole project.

There are several reasons, as to why CI is beneficial for software engineers:


*	No more long and tense integrations
*	Increases visibility which enables greater communication
*	Find issues faster and clear it out before it becomes a bigger problem
*	Less time debugging and use the time for adding features etc.
*	No need to wait if the code works or not
*	Developers can see what’s happening to the code
*	The most important point: reduces integration problems and deliver the software in time

To make CI work there are several principles that need to be kept. Key practices:

1.	Maintain a single source repository

    All the projects should be placed in the repository, so that everyone can integrate their code and also see the changes.

2.	Automate the build

    A single command should have the capability of building the system. Many build-tools, such as make, have existed for many years. Other more recent tools are frequently used in continuous integration environments. Automation of the build should include automating the integration, which often includes deployment into a production-like environment.

3.	Make your build self-testing

    When the code is built in, then all tests should run as a conformation that it behaves as the developers expect it to behave.

4.	Every commit should build on an integration machine

    The system should build commits to the current working version to verify that they integrate correctly. A common practice is to use Automated Continuous Integration, although this may be done manually. 

5.	Keep the build fast

    The build needs to complete rapidly, so that if there is a problem with integration, it is quickly identified.


6.	Test in a clone of the production environment

    Having a test environment can lead to failures in tested systems when they deploy in the production environment, because the production environment may differ from the test environment in a significant way. 

7.	Make it easy for anyone to get the latest executable

    Making builds readily available to stakeholders and testers can reduce the amount of rework necessary when rebuilding a feature that doesn't meet requirements. Furthermore testing will help the project survive till it’s finished and also reduces the amount of work.

8.	Everyone can see what’s happening

    Make it accessible for everyone and be able to follow as to who made the changes.

9.	Automate deployment

    Most CI systems allow the running of scripts after a build finishes. In most situations, it is possible to write a script to deploy the application to a live test server that everyone can look at.


