param(
    [Parameter(Mandatory = $true)]
    [string]$File
)

$Root = "D:\JAVA"
$File = (Resolve-Path $File).Path

Set-Location $Root

$Match = Select-String -Path $File -Pattern '^\s*package\s+([\w.]+)\s*;'

$Class = [IO.Path]::GetFileNameWithoutExtension($File)

if ($Match) {
    $Package = $Match.Matches[0].Groups[1].Value
    $MainClass = "$Package.$Class"
} else {
    $MainClass = $Class
}

javac -d $Root $File

if ($LASTEXITCODE -eq 0) {
    java -cp $Root $MainClass
}