def vars = [:]

pipeline {
    environment {
        gcloud = "/var/local/google-cloud-sdk/bin/gcloud --project=$GCP_PROJECT_ID "
    }
    agent any
    stages {
        stage ('変数設定/初期化' ){
            steps {
                script {
                    GCP_PROJECT_ID = "du-project"
                    echo 'Hello World'
                    def dynamicVars = load 'dynamicVars.groovy'
                    vars = dynamicVars(projectId : "DEV")
                    echo "Variables: ${vars}"
                }
            }
        }
        stage('GCPコマンド認証') {
      steps{
        script{
           echo "Variables: ${vars.key}"
        }
      }
    }
    }
}