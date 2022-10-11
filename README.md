# TACS 22/23

## Group members

- [Ana Ines Oliveira de Barros <up201806593@fe.up.pt>](up201806593@fe.up.pt)
- [Joao Alexandre Lobo Cardoso <up201806531@fe.up.pt>](up201806531@fe.up.pt)
- [Joao de Jesus Costa <up201806560@fe.up.pt>](up201806560@fe.up.pt)

## Dev notes

- Enums can't be set to null:
  - Optional enums should have a literal for "unset value";
  - E.g.: EQF in `EducationTraining`
- There seems to be a problem with code generation when comparing a Date with
  null (on OCL):
  - `invariant X: self.endDate <> null` causes the generated code to have a
    semantic error;
  - The use of the `oclIsUndefined` causes the same problem;
  - For this reason, we made the `TimeFrame` class abstract and created 2 other
    classes: `StartEndTimeFrame` and `OnGoingTimeFrame`.
