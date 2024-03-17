INFRA_SUBDIR = infra
BACKEND_SUBDIR = backend
E2E_SUBDIR = e2e

infra: $(INFRA_SUBDIR)
	$(MAKE) -C infra

backend: $(BACKEND_SUBDIR)
	$(MAKE) -C backend

e2e: $(E2E_SUBDIR)
	$(MAKE) -C e2e

.PHONY: $(INFRA_SUBDIR) $(E2E_SUBDIR)
.PHONY: backend e2e