FROM hypriot/rpi-java:1.8.0

RUN curl -L https://packages.gitlab.com/install/repositories/runner/gitlab-ci-multi-runner/script.deb.sh | sudo bash
RUN apt-get update -y && apt-get install gitlab-ci-multi-runner -y

# Preserve runner's data
VOLUME ["/etc/gitlab-runner", "/home/gitlab-runner"]

# init sets up the environment and launches gitlab-runner
CMD ["run", "--user=gitlab-runner", "--working-directory=/home/gitlab-runner"]
ENTRYPOINT ["/usr/bin/gitlab-runner"]