def call(Map config = [:]) {
    def result = [:]

    if (projectId == "DEV") {
        config.secretId = 'atomic-dev'
        config.bucketName = 'bucket-dev'
        config.region = 'us-central1'
        config.zone = 'us-central1-a'
    } else {
        config.secretId = 'atomic-prod'
        config.bucketName = 'bucket-prod'
        config.region = 'us-central1'
        config.zone = 'us-central1-a'
    }
    return config
}

return this