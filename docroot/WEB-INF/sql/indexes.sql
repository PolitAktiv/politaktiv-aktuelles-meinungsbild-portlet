create index IX_E215A51F on meinungsbild_Rating (subtopicId);
create index IX_8524457B on meinungsbild_Rating (userId);
create index IX_73322559 on meinungsbild_Rating (userId, subtopicId);

create index IX_152658E2 on meinungsbild_Subtopic (parentTopic);

create index IX_CFB3961D on meinungsbild_Topic (communityId);
create index IX_5A21FBD6 on meinungsbild_Topic (name);