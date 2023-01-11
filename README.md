stages:
      - build

MainBuild:
      stage: build
      script: 
             -(git clone https://github.com/narendraamara/testProject.git; git pull)
             -(cd sampeapplication; clean compile install)
