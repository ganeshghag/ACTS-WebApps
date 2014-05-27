call curl2 -X GET -H "Content-Type: application/json" http://localhost:8080/ACTS-WebApps/restapp/hello

call curl2 -X GET -H "Content-Type: application/json" http://localhost:8080/ACTS-WebApps/restapp/person/1

call curl2 -i -X PUT -H "Content-Type: application/json" -d "@insert.txt" http://localhost:8080/ACTS-WebApps/restapp/person

call curl2 -i -X DELETE -H "Content-Type: application/json" -d "@insert.txt" http://localhost:8080/ACTS-WebApps/restapp/person

call curl2 -i -X POST -H "Content-Type: application/json" -d "@insert.txt" http://localhost:8080/ACTS-WebApps/restapp/person

call curl2 -X GET -H "Content-Type: application/json" http://localhost:8080/ACTS-WebApps/restapp/personsQuery?firstName=GanyaGhagDude