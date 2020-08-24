pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        
        stage('show Home') {
            steps {
                sh 'echo $HOME'
            }
        }
    }
}