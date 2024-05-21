pipeline {
    agent any
    stages {
        stage ('変数設定/初期化' ){
            steps {
                script {
                    echo 'Hello World'
                    def dynamicVars = load 'dynamicVars.groovy'
                    def vars = dynamicVars(projectId : "DEV")
                    echo "Variables: ${vars}"
                }
            }
        }
    }
    parameters {
    choice              name: 'GCP_PROJECT_ID', choices: ['development-201811',	'atomic-key-172201'], description: 'GCPの環境（本番：development-201811 ／ 開発：atomic-key-172201）'
    choice              name: 'REGION',         choices: ['asia-northeast1',	'us-central1'],         description: 'リージョン（本番：asia-northeast1 ／ 開発：us-central1）'                        description: 'メモリサイズ（本番：6GB～）'
    string trim: true,	name: 'DISK_SIZE',      defaultValue: '80GB',                                 description: 'ディスクサイズ（本番：200GB）'
    booleanParam        name: 'PREEMPTIBLE',    defaultValue: false,                                  description: 'GCP 開発環境 ナイトリービルド用（プリエンプティブル設定） ★設定すると1日でサーバが自動停止します！'
    }
}