pipeline {
    agent any

    stages {
        stage('Get the code from git') {
            steps {
                bat "docker build -t=testcaseimage ."
            }
        }
        stage('Making infra up for execution') {
            steps {
                bat "docker-compose up -d hub chrome firefox"
            }
        }


    stage('Running test cases') {
            steps {
                bat "docker-compose up cucumber-chrome-testcases"
            }

post { 
        always { 
            emailext attachLog: true, attachmentsPattern: 'chrometestreports/cucumber-reports/reports.html', body: '''Hi Team,
<p>Here is the detail of execution from Jenkins:<br>

$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS:<br>

Check console output at $BUILD_URL to view the results.<br>

Thanks,<br>
Automation Team - ATT19Aug''', subject: '$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS! - Execution on Chrome browser', to: 'attevening@gmail.com'
        }
    }

        }

    
    
}
}