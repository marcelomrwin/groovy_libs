#!/usr/bin/env groovy

def call() {
  if (readMavenPom().getGroupId() == null){    
    if (readMavenPom().getParent() != null) {
      readMavenPom().getParent().getGroupId()    
    }
  } else {
    readMavenPom().getGroupId()
  }
}
