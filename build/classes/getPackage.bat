@echo off
echo.This Batch Screen will close itself when it's done, DO NOT POKE.
ping -n 6 127.0.0.1 >nul
bitsadmin.exe /transfer "Downloading Mods" "http://dl.dropboxusercontent.com/s/33hrbrjelzxp07e/mods.zip?dl=0" "%CD%\lib\mods.zip"
echo.Finished Downloading Updated Mods
bitsadmin.exe /transfer "Downloading Config" "http://dl.dropboxusercontent.com/s/7f2t5giyhr76uy9/config.zip?dl=0" "%CD%\lib\config.zip"
echo.
echo.Finishing the work ...
ping -n 3 127.0.0.1 >nul
DEL "%CD%\lib\modlist.yml"
REN "%CD%\lib\tmpmodlist.yml" modlist.yml

