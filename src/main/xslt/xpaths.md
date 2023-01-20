# 2.1 XPATH
## Task
What is the xpath to get all boxes, that are not stored in another box (no storedIn
reference)?

## Answer
"/objects/object[not(reference)]"

# 2.2 XPATH
## Task
What is the xpath to get all green boxes ids as a comma-separated list?

## Answer
"string-join(/objects/object[property='green']/@id, ', ')"

# 2.3 XSLT
## Task
Create XSLT to represent boxes in the "storage hierarchy".
If object 'a' is stored in object 'b' (a/reference[@name = ' storedIn ']/@id = b/@id), 'a'
should be a child element of 'b'/nestedObjects.
See output23.xml as an example.
## Answer

# 2.4 Text to XML
## Task
Create XSLT to transform input.csv file into an xml document.
The first line contains headers, not data.
## Answer

# 2.5 Two lists of items
## Task
Create XSLT to print two lists:
- a list of elements, that exist in both lists (check by id)
- a list of elements, that exist in the first list and do not exist in the second list (check
by id)
- ## Answer

# 2.6 XML to JSON
## Task
Transform the given xml to json (XSLT 3.0, xml-to-json() function). Omit the root element of
the input xml.
## Answer