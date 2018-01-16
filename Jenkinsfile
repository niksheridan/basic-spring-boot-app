podTemplate(
    label: 'mypod', 
    containers: [ containerTemplate(name: 'maven', image: 'andycjones/maven-docker', ttyEnabled: true, command: 'cat')], 
    volumes: [ persistentVolumeClaim(mountPath: '/root/.m2/repository', claimName: 'basic-sping-boot-app-maven-cache', readOnly: false) ]) {
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
