SELECT name FROM Movie movie JOIN 
	(SELECT name, rating.mID FROM Reviewer reviewer JOIN Rating rating ON reviewer.rID = rating.rID) AS result
    ON movie.mID = result.mID WHERE name = movie.director;