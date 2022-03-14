# Run the following commands

mvn clean package

docker build --tag nikkinicholasromero/hello-world:1.0.0 .

docker push nikkinicholasromero/hello-world:1.0.0

docker run -d -t -p 127.0.0.1:8080:8080 --name hello-world nikkinicholasromero/hello-world:1.0.0

# Open http://localhost/hello-world in the URL
