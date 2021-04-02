pipeline {
    environment {
        registry = "osamahkh/mobilestore"
        registryCredential = 'eaca6f1b-0224-4681-b90f-af20de6d7343'
        dockerImage = ''
    }
    agent any
    tools {
        maven 'Maven'
    }

    stages {
        stage('Build') {
            steps {
                echo 'Starting to build Greeter'
                sh 'java --version'
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Package'){
            steps{
                sh 'mvn package'
            }
        }
        stage('Dockerbuild') {
            steps {
                script {
                    dockerImage = docker.build("osamahkh/mobilestore1")
                }
            }
        }
        stage('Deploy our image') {
            steps {
                script {
                    docker.withRegistry('https://registry-1.docker.io/v2/', registryCredential) {
                        dockerImage.push()
                    }
                }
            }
        }
    }
}
