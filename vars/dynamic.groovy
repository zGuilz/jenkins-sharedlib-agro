import br.com.core.PipeSteps

def call(String repositor) {
    node {

        stage("Checkout Project"){
            git url: repositor

        }

        stage ("Deploy Google Cloud") {
            sh gcloud app deploy
        }
    }
}
