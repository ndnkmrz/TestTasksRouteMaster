# Task 4.1
Create the query to show all toys, that are not in boxes at the moment

## Query:
`select * from toys where toy_id not in(select sl_toy_id
from storage_log where sl_year_to is null)`

# Task 4.2
Create the query to show how many toys are in each box at the moment

## Query:

`select box_id, count(sl_toy_id) from boxes
left join storage_log on SL_BOX_ID = box_id
where sl_year_to is null group by(SL_BOX_ID)`

# Task 4.3
Create the query to show how many toys were in each 'color category' of the boxes (how
many toys were there in all red, blue, etc. boxes) in 2021

## Query:
`select box_color, count(sl_toy_id) as toys_count from boxes
left join storage_log on BOX_ID = SL_BOX_ID
where (sl_year_to is null or SL_YEAR_TO > 2021) and SL_YEAR_FROM <= 2021
group by BOX_COLOR
`