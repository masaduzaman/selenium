How to install Behat and Mink

Behat: Is a PHP library. It Maps each steps** to a PHP Callback. Behat "executes" your scenarios reading each steps and calling the function associated with it. 

Mink: Is a stand alone library be used PHP to command the browser, be used in Selenium, Goutte, ZombieJs, PhentomJS etc

-Installation by using composer(dependency manager of PHP). See Page https://getcomposer.org/

Step 1. You need PHP latest version installed in your computer. Please see Page http://php.net/manual/en/install.php

Step 2. Create file composer.json in you project and put following dependencies to be install from the online repository:

{
	"require": {
		"behat/behat": "2.4.*@stable", 
		"behat/mink": "1.5.*@stable",
		"behat/mink-goutte-driver": "*",
		"behat/mink-extension":"*",
		"behat/mink-selenium2-driver": "*"
	}
}

Step 3: Go to the command line into you project and type <composer install> then enter


Step 4: open note pad and type following and save it to as <behat.yml>


default:
paths:
features: features
bootstrap: %behat.paths.features%/bootstrap
extensions:
Behat\MinkExtension\Extension:
goutte: ~
selenium2: ~


Step: 5: go to the project folder in the command line and type php bin/behat init then enter 


yaaap! behat will be setup in you project.

