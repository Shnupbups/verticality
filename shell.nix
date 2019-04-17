{ pkgs ? import <nixpkgs> {} }:
let
  libPath = with pkgs; stdenv.lib.makeLibraryPath [ xlibs.libX11 xlibs.libXext xlibs.libXcursor xlibs.libXrandr xlibs.libXxf86vm libpulseaudio ];
in pkgs.mkShell {
  buildInputs = with pkgs; [ jdk jetbrains.idea-ultimate ];
  shellHook = ''
    export LD_LIBRARY_PATH="$LD_LIBRARY_PATH:${libPath}"
    '';
}
