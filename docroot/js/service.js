Liferay.Service.register("Liferay.Service.meinungsbild", "org.politaktiv.meinungsbild.infrastructure.service", "politaktiv-aktuelles-meinungsbild-portlet");

Liferay.Service.registerClass(
	Liferay.Service.meinungsbild, "Rating",
	{
		addRating: true
	}
);

Liferay.Service.registerClass(
	Liferay.Service.meinungsbild, "Subtopic",
	{
		addSubtopic: true,
		deleteSubtopic: true,
		updateSubtopic: true
	}
);

Liferay.Service.registerClass(
	Liferay.Service.meinungsbild, "Topic",
	{
		addTopic: true,
		deleteTopic: true
	}
);