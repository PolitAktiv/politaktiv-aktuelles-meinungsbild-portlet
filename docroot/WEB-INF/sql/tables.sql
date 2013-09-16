create table meinungsbild_Rating (
	ratingId LONG not null primary key,
	userId LONG,
	subtopicId LONG,
	score INTEGER
);

create table meinungsbild_Subtopic (
	subtopicId LONG not null primary key,
	name VARCHAR(75) null,
	url VARCHAR(250) null,
	parentTopic LONG
);

create table meinungsbild_Topic (
	topicId LONG not null primary key,
	name VARCHAR(75) null,
	communityId LONG
);