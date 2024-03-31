workspace:
	docker-compose down --rmi local --remove-orphans --volumes workspace
	docker-compose up -d workspace
	docker-compose exec workspace bash

infra: exit
	docker-compose up -d mysql

exit:
	docker-compose down --rmi local --remove-orphans --volumes mysql