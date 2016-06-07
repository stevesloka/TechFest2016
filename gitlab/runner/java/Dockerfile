FROM hypriot/rpi-java:1.8.0

RUN apt-get update -y && apt-get install curl git ssh vim -y

RUN curl -k --output /usr/bin/gitlab-runner https://gitlab-ci-multi-runner-downloads.s3.amazonaws.com/latest/binaries/gitlab-ci-multi-runner-linux-arm
RUN chmod +x /usr/bin/gitlab-runner

# Preserve runner's data
VOLUME ["/etc/gitlab-runner", "/home/gitlab-runner"]

RUN mkdir -p /root/.ssh
ADD ./config /root/.ssh/config
ADD ./id_rsa /root/.ssh/id_rsa
ADD ./id_rsa.pub /root/.ssh/id_rsa.pub
RUN chmod 400 /root/.ssh/id_rsa

# init sets up the environment and launches gitlab-runner
CMD ["run", "--user=gitlab-runner", "--working-directory=/home/gitlab-runner"]
ENTRYPOINT ["/usr/bin/gitlab-runner"]
