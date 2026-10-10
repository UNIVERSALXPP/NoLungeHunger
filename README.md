# No Lunge Hunger

Fabric mod for Minecraft **1.21.11**. Using the spear's **Lunge** enchantment no longer costs hunger or saturation. Everything else (sprinting, jumping, regeneration, and Lunge's own dash and minimum food requirement) stays vanilla.

Needs Fabric Loader and Fabric API. Works on both client and server (drop the jar in `mods`).

## Build the jar with GitHub (no local setup)

1. Create a new GitHub repository and upload all the files from this folder, including the hidden `.github` folder.
2. Open the **Actions** tab. The "Build mod jar" workflow runs on every push (or press **Run workflow**).
3. When it finishes, open the run and download the **NoLungeHunger-jar** artifact. Inside is `nolungehunger-1.0.0.jar`.

## Build locally

```
./gradlew build
```

The jar is written to `build/libs/`.

## How it works

In 1.21.11 Lunge pays for its dash with the `minecraft:apply_exhaustion` enchantment effect. A small mixin skips that effect, so no exhaustion is added and hunger and saturation stay untouched.
