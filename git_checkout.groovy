node
{
  stage ("git checkout")
  {
    println "cloning started"
    bat "ls"
    println "repo cloned"
  }
}
