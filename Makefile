infra: exit
	cd infra && \
	docker-compose up -d mysql

exit:
	cd infra && \
	docker-compose down --rmi local --remove-orphans --volumes mysql

e2e:
	cd e2e && \
	./gradlew cucumber

.PHONY: e2e