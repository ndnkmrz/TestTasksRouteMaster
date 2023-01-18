# Task 4.1
Create the query to show all toys, that are not in boxes at the moment

## Query:

`SELECT * FROM TOYS WHERE TOY_ID NOT IN(SELECT SL_TOY_ID
FROM STORAGE_LOG WHERE SL_YEAR_TO IS NULL)`

# Task 4.2
Create the query to show how many toys are in each box at the moment

## Query:

`SELECT BOX_ID, COUNT(SL_TOY_ID) FROM BOXES
LEFT JOIN STORAGE_LOG ON SL_BOX_ID = BOX_ID
WHERE SL_YEAR_TO IS NULL GROUP BY(SL_BOX_ID)`

# Task 4.3
Create the query to show how many toys were in each 'color category' of the boxes (how
many toys were there in all red, blue, etc. boxes) in 2021

## Query:

`SELECT BOX_COLOR, COUNT(SL_TOY_ID) AS TOYS_COUNT FROM BOXES
LEFT JOIN STORAGE_LOG ON BOX_ID = SL_BOX_ID
WHERE (SL_YEAR_TO IS NULL OR SL_YEAR_TO > 2021) AND SL_YEAR_FROM <= 2021
GROUP BY BOX_COLOR
`