podTemplate(
    label: 'mypod', 
    containers: [ containerTemplate(name: 'maven', image: 'andycjones/maven-docker', ttyEnabled: true, command: 'cat')],
    volumes: [hostPathVolume(hostPath: '/var/run/docker.sock', mountPath: '/var/run/docker.sock')]) {
        node('mypod') {
            stage('Get a Maven project') {
                git 'https://github.com/andy-c-jones/basic-spring-boot-app.git'
                container('maven') {
                    stage('Build a Maven project') {
                        sh 'mvn versions:set -DnewVersion=${env.BUILD_NUMBER}'
                        sh 'mvn versions:commit'
                        sh 'mvn -B clean install'
                    }
                }
            }
        }
}
