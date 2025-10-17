#!/bin/bash

echo -e  "Whadodo?\n	1 >> cd to randoms\n	2 >> do nothing"

read userInput

if [ userInput == 1 ]; then
	cd /home/ryce/Desktop/CodeKeeper/randoms
else
	neofetch
fi
