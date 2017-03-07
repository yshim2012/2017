@echo off
set "Ymd=%date:~,4%%date:~5,2%%date:~8,2%"
set "HM=%TIME:~,2%%TIME:~3,2%"
:intercept_left
if "%HM:~0,1%"==" " set "HM=%HM:~1%"&goto intercept_left

:intercept_right
if "%HM:~-1%"==" " set "HM=%HM:~0,-1%"&goto intercept_right

"C:\Program Files\Java\jdk1.8.0_45\bin\java.exe" -jar D:\javawork2\通勤车自己接口文件\initInterface.jar
pause
@echo on
