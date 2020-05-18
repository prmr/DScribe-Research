# DScribe-Research
This repository contains the data artifact for our research on unit test generation for documentation.

## License and Attribution

<a rel="license" href="http://creativecommons.org/licenses/by-nc-sa/4.0/"><img alt="Creative Commons License" style="border-width:0" src="https://i.creativecommons.org/l/by-nc-sa/4.0/80x15.png" /></a><br />

The content of this repository is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-sa/4.0/">Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License</a>.

To indicate attribution, please link to this repository and cite the following technical report:

```
Mathieu Nassif, Alexa Hernandez, Ashvitha Sridharan, and Martin P. Robillard.
Generating Unit Tests for Documentation.
ArXiv preprint XXX, 12 pages.
18 May 2020.
```

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
