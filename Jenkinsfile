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
            steps('build docker image') {
                sh 'docker build -t latest .'
                sh 'docker push mhmdmaani/mobile:latest'
            }
        }
        stage('Deploy our image') {
            steps {
                script {
                     docker.withRegistry('https://registry-1.docker.io/v2/', registryCredential) {
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


