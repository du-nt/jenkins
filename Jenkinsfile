pipeline {
    agent any
    stages {
        stage ('変数設定/初期化' ){
            steps {
                script {
                    def dynamicVars = load 'dynamicVars.groovy'
                    def vars = dynamicVars(projectId: 'DEV')
                }
            }
        }
    }
}