# TACS 22/23 - CV Maker - assignment 2

## Group members

- [Ana Inês Oliveira de Barros <up201806593@fe.up.pt>](up201806593@fe.up.pt)
- [João Alexandre Lobo Cardoso <up201806531@fe.up.pt>](up201806531@fe.up.pt)
- [João de Jesus Costa <up201806560@fe.up.pt>](up201806560@fe.up.pt)

## Changes to the metamodel of the first assignment

- Put everything into a single package:
  - We were already having problems with using packages, e.g., not being able to
    generate the class diagram from the metamodel.
- Make most relationships between classes have the **containment** attribute set
  to true:
  - This makes it much easier to create model instances.
- Add `TimeFrame` to `EducationTraining`:
  - This way a user can associate time frames/dates to their education,
    certifications, etc...
- Add a `parent` reference to (sub)sections:
  - Allows a (sub)section to directly see its parent section.

## Problems to be address

- `EducationTraining` could have an (optional) `Address`;
- `WorkExperience` addresses can be home/work address instances:
  - This is a problem with the metamodel and could be easily fixed.
