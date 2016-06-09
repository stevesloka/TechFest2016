kubectl run update-demo --image=gcr.io/google_containers/update-demo:nautilus --port=80 -l name=update-demo

kubectl scale deployment/update-demo --replicas=4    

kubectl edit deployments update-demo

kubectl rollout undo deployment/update-demo

kubectl delete deployment update-demo
