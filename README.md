# basic-spring-boot-app
Spring boot hello world with Jenkinsfile for building in a Kubernetes Jenkins cluster

So far this includes:
building -> Testing -> building as a Jar -> building as a docker image -> running a test against that image

In order to push the image into a registry so it can be consumed from within a minikube environment you will need to ```kubectl create -f kube-registry.yaml``` then push the build image into that registry.

You will then need to
```helm --kube-context minikube install --debug ./basic-spring-boot-app-chart/ --set service.type=NodePort```

