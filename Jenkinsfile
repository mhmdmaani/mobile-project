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
                    dockerImage = docker.build("osamahkh/mobilestore")
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
         stage('Cleaning up') { 

            steps { 

                sh "docker rmi $registry:$BUILD_NUMBER" 

            }
        } 
    }      
}


