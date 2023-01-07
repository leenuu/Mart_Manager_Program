#!/bin/sh

echo "`git add .`"
echo "`git commit -m "$*"`"
echo "`git push -u origin main`"   
