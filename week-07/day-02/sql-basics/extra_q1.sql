SELECT DISTINCT name FROM Reviewer reviewer JOIN (SELECT movie.mID, rating.rID FROM Movie movie JOIN Rating rating on movie.mID = rating.mID
ORDER BY movie.mID) AS result ON reviewer.rID = result.rID
WHERE mID = 101;