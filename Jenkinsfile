podTemplate(
    label: 'mypod', 
    containers: [ containerTemplate(name: 'maven', image: 'andycjones/maven-docker', ttyEnabled: true, command: 'cat')]) {
        node('mypod') {
            stage('Get a Maven project') {
                git 'https://github.com/andy-c-jones/basic-spring-boot-app.git'
                container('maven') {
                    stage('Build a Maven project') {
                        sh 'mvn -B clean install'
                    }
                }
            }
        }
}
