SELECT name, title, stars, ratingDate FROM Movie movie JOIN
	(SELECT name, rating.mID, stars, ratingDate 
		FROM Reviewer reviewer JOIN Rating rating ON reviewer.rID = rating.rID
	) AS result ON movie.mID = result.mID;
-- GROUP BY name HAVING COUNT(name) = 2