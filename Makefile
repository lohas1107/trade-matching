INFRA_SUBDIR = infra
E2E_SUBDIR = e2e

infra: $(INFRA_SUBDIR)
	$(MAKE) -C infra

e2e: $(E2E_SUBDIR) infra
	$(MAKE) -C e2e

.PHONY: $(INFRA_SUBDIR) $(E2E_SUBDIR)
.PHONY: e2e