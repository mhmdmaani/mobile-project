pipeline{
    agent { dockerfile true }
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
        stage('deploy'){
            steps{
                sh 'docker build --tag latest .'
                sh 'docker push mhmdmaani/mobile'
            }
        }
}
}
