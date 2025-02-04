# brief17

L'application fonctionne sur base Postgre Sql dont la config se trouve dans application.yml

## Test d'intégration

Un test d'intégration est mené dans test et le profile utilisé est celui sur une base H2
La configuration est dans application-test.yml

## Utilisation de la CI Github pour lancer le test d'intégration

Chaque commit-push donne lieu à un build avec le run des tests.
Le détail de la pipeline est dans ".github/workflows/pipeline.yml"
Ajout de SonarQube Cloud pour reporting coverage