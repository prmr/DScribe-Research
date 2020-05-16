# DScribe-Research
This repository contains the data artifact for our research on unit test generation for documentation.

## Structure

- `Section 6 - Usefulness Study`: this folder contains the configuration and results of our application of DScribe to the Apache Commons IO project, as well as an Excel file detailing all identified *exception specification units* (ESU). The internal structure is as follow:
  - `Apache Commons IO.xlsx`: detail of the ESUs
  - `configs`: invocation files
  - `templates`: template definition file
  - `output`: generated unit tests
  - `testUtils`: helper methods for the test code
- `Section 7 - Validation Study`: this folder contains the detailed list of all units of specifications extracted from a subset the unit tests of the Apache Commons Lang, Math, and Configuration projects.
- `Section 8 - Limitations Study`: this folder contains the final codes attributed to each test in our sample from five open source projects (Freemind, Eclipse, Weka, Tomcat, and Hibernate). The catalog of codes is the result of a preliminary open coding process.

## DScribe tool

The implementation of our technique, DScribe, is available in a separate repository, located at https://github.com/prmr/DScribe