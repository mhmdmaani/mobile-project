pipeline{
    agent any
    tools{
        maven 'Maven'
    }
    stages{
        stage('Build'){
            steps{

                sh 'java -version'
                sh 'mvn clean compile'

            }
        }
        stage('Test'){
            steps{
                sh 'mvn verify'
                sh 'mvn test'
                 }
        }
        stage('build docker image'){
            sh 'docker build -t latest .'
            sh 'docker push mhmdmaani/mobile:latest'
        }
}
}
