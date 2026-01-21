pipeline {
    agent any

    
    stages {

        stage('Checkout Code') {
            steps {
                git 'https://github.com/Manasa4243/testing'
            }
        }
stage('Checkout Code') {
    steps {
        git branch: 'main', url: 'https://github.com/Manasa4243/testing.git'
    }
}

        stage('Build & Run Selenium Tests') {
            steps {
                sh 'mvn clean test'
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
        }
        success {
            echo 'Selenium tests PASSED'
        }
        failure {
            echo 'Selenium tests FAILED'
        }
    }
}
