stages:
      - build

MainBuild:
      stage: build
      script: 
             -(git clone https://github.com/narendraamara/testProject.git; git pull)
             -(cd sampeapplication; clean compile install)



To install Maven 3.2.5
1. Update the System
sudo yum update -y  # For RHEL/CentOS/Amazon Linux
sudo apt update -y  # For Ubuntu/Debian

2. Download Maven 3.2.5
wget https://archive.apache.org/dist/maven/maven-3/3.2.5/binaries/apache-maven-3.2.5-bin.tar.gz

3. Extract the Archive
sudo tar -xzf apache-maven-3.2.5-bin.tar.gz -C /opt

4. Configure Maven
sudo mv /opt/apache-maven-3.2.5 /opt/maven

Add Maven to the system PATH by updating the environment variables:

      1. Open the profile file:
      sudo nano /etc/profile.d/maven.sh
      2. Add the following content:
      export M2_HOME=/opt/maven
      export PATH=$M2_HOME/bin:$PATH
      3. Save the file and exit.

Make the script executable:
sudo chmod +x /etc/profile.d/maven.sh

Reload the environment variables:
source /etc/profile.d/maven.sh

5. Verify the Installation
Check the Maven version to confirm:
mvn -version

6. Clean Up
Remove the downloaded tarball to save space:
rm apache-maven-3.2.5-bin.tar.gz


