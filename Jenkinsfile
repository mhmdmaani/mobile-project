pipeline {
    environment {
        registry = "osamahkh/mobilestore"
        registryCredential = '0fb75e80-e0e7-4420-815a-38254637040a'
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
                     docker.withRegistry('https://registry.hub.docker.com', registryCredential) {
                        dockerImage.push("altest")
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


