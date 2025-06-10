pipeline {
    agent any

    stages {
        stage('Cloner le projet') {
            steps {
                git branch: 'main', url: 'https://github.com/Najibe-hash/Spring.git'
            }
        }

        stage('Build avec Maven') {
            steps {
                dir('demo') {
                    sh 'mvn clean package'
                }
            }
        }

        stage('Deploiement app') {
            steps {
                sh 'cp demo/target/demo-0.0.1-SNAPSHOT.war deployments/demo.war'
            }
        }

        stage('Test API') {
            steps{
                script {
                    sleep 90
                    def res = sh(
                        script: 'curl -s http://websphere:9080/api/hello',
                        returnStdout: true
                    ).trim()

                    echo "Réponse API : ${res}"

                    if (res != "Hello, World") {
                        error("Réponse inattendue de l'API : ${res}")
                    }
                }
            }
        }
    }
}