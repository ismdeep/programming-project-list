#!/usr/bin/env bash
current_path=`pwd`

categories=(
    "01-text-processing"
    "02-network"
    "03-class"
    "04-thread-processing"
    "05-web-application"
    "06-file"
    "07-database"
    "08-multimedia"
    "09-games")

echo "# Programming Project List

" > README.md

for category in ${categories[@]};do
    cat ${category}/README.md >> README.md
done
