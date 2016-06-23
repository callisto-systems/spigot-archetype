# Spigot or Bukkit Plugin Archetype

This is an archetype for creating a Spigot or Bukkit Plugin. These plugins can be used to create Minecraft Mods.

## Usage

Create a new sample plugin as:

`console
mvn --batch-mode archetype:generate -DarchetypeGroupId=org.devoxx4kids.spigot.plugins -DarchetypeArtifactId=spigot-template -DarchetypeVersion=0.3 -DartifactId=sampleArtifact -DpluginFile=samplePluginName 
`

- Change the value of "samplePluginName" to your plugin name.

## Install the Archetype Locally (only if asked)

Clone workspace, build and install archetype

`console
git clone https://github.com/arun-gupta/spigot-archetype.git
mvn install
`
