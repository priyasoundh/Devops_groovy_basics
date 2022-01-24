node
{
  stage ("git checkout")
  {
    println "cloning started"
    sh "git clone -b main https://github.com/priyasoundh/shared_library.git"
    println "repo cloned"
  }
}
