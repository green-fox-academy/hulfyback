SELECT name FROM Rating rat JOIN Reviewer rev ON rat.rID = rev.rID
WHERE ratingDate IS null;