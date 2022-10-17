# TACS 22/23 - CV Maker - assignment 1

## Group members

- [Ana Ines Oliveira de Barros <up201806593@fe.up.pt>](up201806593@fe.up.pt)
- [Joao Alexandre Lobo Cardoso <up201806531@fe.up.pt>](up201806531@fe.up.pt)
- [Joao de Jesus Costa <up201806560@fe.up.pt>](up201806560@fe.up.pt)

## Design decisions

### (Sub)section's names

Section can contain subsections (recursively). We enforced that each section's
name should be unique within its siblings. This allows tree structures with
names like the following:

```txt
   SectionLayer
    /        \
Section1  Section2
   |          |
 Name       Name
```

But not like the following:

```txt
  SectionLayer
   /        \
Section   Section
```

**Note:** Sections can't contain themselves (as subsections). This restriction
is applied recursively. This forbids cycles on the tree structure.

### Section and content ordering

The user is able to order both sections and their content arbitrarily (within
their parent). To achieve this, we created an `Orderable` interface, which they
implement.

All `Orderable` sections/content have an integer representing their order. These
integers are forced to be higher than 0, unique within their parent, and always
in sequence (e.g., 1, 2, 3, etc...).

**Note:** The `IdentificationSection` is the only _non-orderable_ section. This
is the only mandatory section, and it always appears in the first position
(before the rest) of the document.

### Contant info

@startuml
class Contact {
  name: String
  info: String
}

class PhoneNumber {
  countryCode: PhoneCountryCode
}

Email -|> Contact
PhoneNumber -u-|> Contact
HomePhoneNumber -u-|> PhoneNumber
WorkPhoneNumber -u-|> PhoneNumber
MobilePhoneNumber -u-|> PhoneNumber
UrlContact -u-|> Contact
@enduml

## Concept tables

| Concept | Intrinsit Properties | Extrinsic Properties             |
| ------- | -------------------- | -------------------------------- |
| CV      |                      | sectionLayer: One `SectionLayer` |

### `order` package

| Concept`                  | Intrinsit Properties | Extrinsic Properties |
| ------------------------- | -------------------- | -------------------- |
| `Orderable` _(interface)_ | order: int           |                      |

### `content` package

| Concept                                    | Intrinsit Properties                                                                                                                              | Extrinsic Properties              |
| ------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------- | ----- | ----- | --- |
| `Content` _(extends: Orderable)_           | name: String<br />description: String _(optional)_ <br />url: String _(optional)_                                                                 | files: Arbitrary number of `File` |
| `File`                                     | path: String<br />createdDate: Date                                                                                                               | type: `FileType` _(Enum)_         |
| `FileType ` _(enum)_                       | `PDF`                                                                                                                                             | `PNG`                             | `JPG` | `SVG` |     |
| `TimeFrame` _(abstract)_                   | startDate: Date                                                                                                                                   |                                   |
| `StartEndTimeFrame` _(extends: TimeFrame)_ | endDate: Date                                                                                                                                     |                                   |
| `OnGoingTimeFrame` _(extends: TimeFrame)_  |                                                                                                                                                   |                                   |
| `Address`                                  | line1: String _(optional)_<br />line2: String _(optional)_<br />postalCode: String (optional)<br />city: String _(optional)_<br />country: String |                                   |

### `section` package

| Concept                                              | Intrinsit Properties | Extrinsic Properties                               |
| ---------------------------------------------------- | -------------------- | -------------------------------------------------- |
| `SectionContainer` _(abstract)_                      |                      | sections: Arbitrary number of `Section`            |
| `Section` _(abstract)_ _(extends: SectionContainer)_ | name: String         | content: Arbitrary number of `Content`             |
| `OrderedSection` _(extends: Section, Orderable)_     |                      |                                                    |
| `SectionLayer` _(extends: SectionLayer)_             |                      | identificationSection: One `IdentificationSection` |

### `workexp` package

| Concept                                             | Intrinsit Properties                                                           | Extrinsic Properties                                        |
| --------------------------------------------------- | ------------------------------------------------------------------------------ | ----------------------------------------------------------- |
| `WorkExperienceSection` _(extends: OrderedSection)_ |                                                                                | workExperiences: One or more `WorkExperience`               |
| `WorkExperience`                                    | occupation: String<br />employer: String<br />description: String _(optional)_ | timeFrame: One `TimeFrame`<br />address: Optional `Address` |

### `edutrain` package

| Concept                                                |                                                                                                            Intrinsit Properties | Extrinsic Properties                                                                        |
| ------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------: | ------------------------------------------------------------------------------------------- | ------------------------ | --- |
| `EducationTrainingSection` _(extends: OrderedSection)_ |                                                                                                                                 | educationTraining: One or more `EducationTraining`                                          |
| `EducationTraining`                                    | title: String<br />organization: String _(optional)_<br />description: String _(optional)_<br />finalGrade: String _(optional)_ | fieldsOfStudy: Arbitrary number of`FieldOfStudy` _(enum)_<br />eqf: Optional `EQF` _(enum)_ |
| `FieldOfStudy` _(enum)_                                |                                                                                                                       `GENERIC` | `EDUCATION`                                                                                 | `ARTS_HUMANITIES` \| ... |     |
| `EQF` _(enum)_                                         |                                                                                                                          `EQF1` | `EQF2`                                                                                      | `EQF3` \| ...            |     |

### `identification` package

| Concept                                      | Intrinsit Properties                                                                                                                                                                            | Extrinsic Properties                                                                                                                                                                                         |
| -------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------ | --- |
| `IdentificationSection` _(extends: Section)_ |                                                                                                                                                                                                 | One Person                                                                                                                                                                                                   |
| `Person`                                     | firstNames: String<br />lastNames: String _(optional)_<br />title: String _(optional)_<br />dateOfBirth: Date _(optional)_<br />aboutMe: String _(optional)_<br />nationalities: List of String | gender: One `Gender` _(enum)_<br />maritalStatus: One `MaritalStatus` _(enum)_<br />picture: Optional `File`<br />contacts: Arbitrary number of `Contact`<br />addresses: Arbitrary number of `NamedAddress` |
| `Gender` _(enum)_                            | `MALE`                                                                                                                                                                                          | `FEMALE` \| ...                                                                                                                                                                                              |                    |
| `MartialStatus` _(enum)_                     | `MARRIED`                                                                                                                                                                                       | `DIVORCED`                                                                                                                                                                                                   | `SEPARATED` \| ... |     |
| `NamedAddress` _(extends: Address)_          | name: String                                                                                                                                                                                    |                                                                                                                                                                                                              |
| `HomeAddress` _(extends: NamedAddress)_      |                                                                                                                                                                                                 |                                                                                                                                                                                                              |
| `WorkAddress` _(extends: NamedAddress)_      |                                                                                                                                                                                                 |                                                                                                                                                                                                              |

#### `identification.contact` package

| Concept                                      | Intrinsit Properties           | Extrinsic Properties                         |
| -------------------------------------------- | ------------------------------ | -------------------------------------------- | ---------------- | --- |
| `Contact`                                    | name: String<br />info: String |                                              |
| `Email` _(extends: Contact)_                 |                                |                                              |
| `PhoneNumber` _(extends: Contact)_           |                                | countryCode: One `PhoneCountryCode` _(enum)_ |
| `PhoneCountryCode` _(enum)_                  | `UNITED_STATES`                | `AFGHANISTAN`                                | `ALBANIA` \| ... |     |
| `HomePhoneNumber` _(extends: PhoneNumber)_   |                                |                                              |
| `WorkPhoneNumber` _(extends: PhoneNumber)_   |                                |                                              |
| `MobilePhoneNumber` _(extends: PhoneNumber)_ |                                |                                              |
| `UrlContact` _(extends: Contact)_            |                                |                                              |

### `skill` package

| Concept                                    | Intrinsit Properties                    | Extrinsic Properties                                                                                                                                                                                                                                  |
| ------------------------------------------ | --------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---- | ---- | ---- | ---- | --- |
| `SkillSection` _(extends: OrderedSection)_ | softSkills: Arbitratry number of String | hardSkills: Arbitrary number of `HardSkill`<br />motherTongues: Arbitrary number of `MotherTongue`<br />secondLanguages: Arbitrary number of `SecondLanguage`                                                                                         |
| `HardSkill`                                | name: String<br />proficiency: Float    |                                                                                                                                                                                                                                                       |
| `Language` _(abstract)_                    | name: String                            |                                                                                                                                                                                                                                                       |
| `MotherTongue` _(extends: Language)_       |                                         |                                                                                                                                                                                                                                                       |
| `SecondLanguage` _(extends: Language)_     |                                         | conversation: One `LanguageSkillLevel` _(enum)_<br/>reading: One `LanguageSkillLevel` _(enum)_<br/>writting: One `LanguageSkillLevel` _(enum)_<br/>comprehension: One `LanguageSkillLevel` _(enum)_<br/>peerReview: One `LanguageSkillLevel` _(enum)_ |
| `LanguageSkillLevel` _(enum)_              | `A1`                                    | `A2`                                                                                                                                                                                                                                                  | `B1` | `B2` | `C1` | `C2` |     |