pipeline {
    agent any
    environment {
        DOCKERHUB_PASS = credentials('docker-pass')
    }
    stages {
        stage("Building Image") {
            steps {
                script {
                    checkout scm
                    sh 'ls'
                    sh "cd src/main/webapp/target && jar -cvf swe645-hw3-0.0.1-SNAPSHOT.jar *"
                    DATE_TAG = java.time.LocalDate.now()
                    DATETIME_TAG = java.time.LocalDateTime.now()
                    sh "echo ${DATETIME_TAG}"
                    sh "sudo docker login -u srinidhi8 -p ${DOCKERHUB_PASS}"
                    sh "sudo docker build -t srinidhi8/imagedoc:${BUILD_TIMESTAMP} ."
                }
            }
        }
        stage("Pushing Image to DockerHub") {
            steps {
                script {
                    sh "sudo docker push srinidhi8/imagedoc:${BUILD_TIMESTAMP}"
                }
            }
        }
        
        
    }
}