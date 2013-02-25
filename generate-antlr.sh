# download ANTLRv4 from http://www.antlr.org
ANTLR4=java -jar antlr-4.0-complete.jar
OUTPUT=me/grison/jtoml/antlr
PACKAGE=${OUTPUT//\//.}

${ANTLR4} -o src/main/java/${OUTPUT} -package ${PACKAGE} src/main/resources/Toml.g4