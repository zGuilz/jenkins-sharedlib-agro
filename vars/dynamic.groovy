def call() {
    pipeline {

        agent any

            stages{

                stage("Checkout Project"){
                    git url: repositor
                }

                stage ("Deploy Google Cloud") {

                    steps{
                        gcloud app deploy
                    }

                }
            }


    }

}
