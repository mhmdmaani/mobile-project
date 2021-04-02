pipeline {
    environment {
        registry = "osamahkh/mobilestore"
        registryCredential = 'MobileStore'
        dockerImage = ''
    }
    agent any
    tools {
        maven 'Maven'
    }

    stages {
        stage('Build') {
            steps {
             
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
                    dockerImage = docker.build registry + ":$BUILD_NUMBER"
                }
            }
        }
        stage('Deploy our image') {
            steps {
                script {
                    docker.withRegistry('', registryCredential) {
                        dockerImage.push()
                    }
                }
            }
        }
         stage('Cleaning up') { 

            steps { 

                sh "docker rmi $registry:$BUILD_NUMBER" 

            }
        } 
    }
}
