all: push

test-webserver: test-webserver.go
	CGO_ENABLED=0 GOOS=linux go build -a -installsuffix cgo -ldflags '-w' ./test-webserver.go

container: test-webserver
	docker build -t stevesloka/test-webserver-arm .

push: container
	docker push stevesloka/test-webserver-arm

clean:
	rm -f test-webserver
