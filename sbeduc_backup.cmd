@echo off
FOR /F "tokens=1,2,3 delims=/ " %%a in ("%DATE%") do (
set DIA=%%a
set MES=%%b
set ANO=%%c
)
FOR /F "tokens=1,2,3 delims=:, " %%a in ("%TIME%") do (
set H=%%a
set M=%%b
set S=%%c
)
set H=0%H%
set H=%H:~-2%
set FORMATO=%ANO%_%MES%_%DIA%
echo %FORMATO%
cd "C:\Program Files\MySQL\MySQL Server 5.6\bin"
mysqldump -u root -h localhost --databases biblioteca> F:\TCC\SBEduc - doing backup\backups\%FORMATO%.sql