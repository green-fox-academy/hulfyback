SELECT name, title, stars, ratingDate FROM Reviewer review JOIN 
  (SELECT rating.rID, movie.title, rating.stars, rating.ratingDate FROM Rating rating JOIN Movie movie ON rating.mID = movie.mID
  ) AS result ON review.rID = result.rID
ORDER by name, title, stars;