podTemplate(label: 'mypod', containers: [
    containerTemplate(name: 'maven', image: 'maven:3.3.9-jdk-8-alpine')  
    ]) {

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