SELECT Title FROM Movie m JOIN 
  (SELECT mID FROM(
  SELECT Movie.mID FROM Movie
  UNION ALL
  SELECT Rating.mID FROM Rating
  ) AS tbl
GROUP BY mID
HAVING COUNT(*) = 1
ORDER BY mID) AS result ON m.mID = result.mID;