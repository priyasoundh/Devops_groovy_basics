node
{
  stage ("git checkout")
  {
    println "cloning started"
    sh "ls"
    println "repo cloned"
  }
}
