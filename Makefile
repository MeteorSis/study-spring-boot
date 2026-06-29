setup:
	curl -sSLO https://github.com/pinterest/ktlint/releases/download/1.7.1/ktlint
	chmod +x ./ktlint
	mv ./ktlint ./scripts/ktlint
	pre-commit install

lint:
	sh ./scripts/lint-correct.sh
