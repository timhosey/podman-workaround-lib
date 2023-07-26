#!/usr/bin/env groovy

def call(String containerName, String cmd) {
  echo "DEBUG: Running Podman command ${cmd}"
  sh "podman exec ${containerName} ${cmd}"
}