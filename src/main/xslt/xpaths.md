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