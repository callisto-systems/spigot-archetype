# Spigot Plugin Archetype

This is an archetype for creating a Spigot Plugin. These plugins can be used to create Minecraft Mods.

1. mvn clean install
2. mvn release:prepare -Prelease
3. git push
  * (I was unable to make maven-release-plugin to correctly format the git url, so i'va added <pushChanges>false</pushChanges>)
4. mvn release:perform -Prelease