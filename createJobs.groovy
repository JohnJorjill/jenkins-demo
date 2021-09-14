pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}

pipelineJob('theme-park-job-docker'){
    definition{
        cpsScm{
            scm{
                git{
                    remote{
                        url 'https://github.com/JohnJorjill/spring-boot-api-jenkins.git'
                    }
                    branch 'master'
                    scriptPath('Jenkinsfile-docker')
                }
            }
        }
    }
}