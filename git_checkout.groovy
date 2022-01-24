node
{
  stage ("git checkout")
  {
    println "cloning started"
    bat "git clone -b main https://github.com/priyasoundh/shared_library.git"
    println "repo cloned"
  }
}
