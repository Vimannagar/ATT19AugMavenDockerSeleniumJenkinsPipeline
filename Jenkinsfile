pipeline {
    agent any

    stages {
        stage('Starting Selenium grid') {
            steps {
                sh "docker-compose up -d hub chrome firefox"
            }
        }
        stage('Executing test cases') {
            steps {
                sh "mvn -Dmaven.test.failure.ignore=true test"
            }
        

    post { 
        always { 
            emailext attachLog: true, attachmentsPattern: 'chrometestreports/cucumber-reports/reports.html', body: '''Hi Team,
<p>Here is the detail of execution from Jenkins:<br>

$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS:<br>

Check console output at $BUILD_URL to view the results.<br>

Thanks,<br>
Automation Team - ATT19Aug''', subject: '$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS! - Execution on Chrome browser', to: 'jawalegourav@gmail.com'
        }
    }

        }
stage('Making infra down') {
            steps {
                sh "docker-compose down"
            }

        }

    
    
}
}