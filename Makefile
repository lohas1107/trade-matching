INFRA_SUBDIR = infra

infra: $(INFRA_SUBDIR)
	$(MAKE) -C infra

e2e:
	cd e2e && \
	./gradlew cucumber

.PHONY: $(INFRA_SUBDIR)
.PHONY: e2e