# Section 18: Back to a Few Nuts and Bolts

Back to a Few Nuts and Bolts

# What I Learned

# Overview: Date & Time (java.time)

<img src="time.JPG" alt="alt text" width="600"/>

1. Give current date and time.

- Java has lot of classes for **Date** and **Time**
	- It can get confusing!

2. `java.time` which like you will use most

3. **OffSetDate** and **ZoneDate** used when need measure or store against universal standard

4. Classes for representing intervals. Most common:
	- Instant
	- Duration
	- Period

<img src="otherTimePackages.JPG" alt="alt text" width="600"/>

1. Under java time package there is many other related packages

<img src="timeTemporal.JPG" alt="alt text" width="600"/>

1. Common way to read and write different Java date time object.
2. **Interfaces** how you want specifically read data time object. Example what portions.  

<img src="timeTemporal2.JPG" alt="alt text" width="600"/>

<br>

<img src="java.time.format.JPG" alt="alt text" width="600"/>

1. Formatting time correctly
	- Option to support localizations

2. There some ENUMS to support different formats for dates.

<img src="noTimeZoneData.JPG" alt="alt text" width="600"/>

1. Most common ones when you **don't** need include time zone data

2.  Interfaces how to access and do magic to these

<img src="methodsForDate.JPG" alt="alt text" width="600"/>

<br>

<img src="creatingInstanceOfTemporalImplementation.JPG" alt="alt text" width="600"/>

1. Different static methods to return new instance of temporal class.

<img src="immutable.JPG" alt="alt text" width="600"/>

<br>

<img src="methodsOfTemporalImplementation.JPG" alt="alt text" width="600"/>

<br>

<img src="methodsOfTemporalImplementation2.JPG" alt="alt text" width="600"/>

<br>

<img src="moreAboutDates.JPG" alt="alt text" width="600"/>

1. Locally stores **date fields**, and **time fields**, in separate numeric field

2. **LocalDateTime** includes **LocalDate** and **LocalTime**

<br>

<img src="LocalDateClass.JPG" alt="alt text" width="600"/>

<br>

<img src="localTime.JPG" alt="alt text" width="600"/>

# LocalDate

- TODO proceed with this one, when structural ready. This was for fix date time bug


