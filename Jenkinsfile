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
       
}
}
