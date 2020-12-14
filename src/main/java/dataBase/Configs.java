package dataBase;

public class Configs {

    public static final String dbHost = "localhost";
    public static final String dbPort = "3306";
    public static final String dbUser = "mysql";
    public static final String dbPass = "mysql";
    public static final String dbName = "max";

    public static final String DB_URL = "jdbc:mysql://localhost:3306/max?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public static final String DB_Driver = "com.mysql.cj.jdbc.Driver";
    public static final String DBLogin = "mysql";
    public static final String DBPass = "mysql";


    public static final String USER_TABLE = "tablet";
    public static final String EN = "en";
    public static final String TRANS = "trans";
    public static final String RU = "ru";
    public static final String PART_OF_SPEECH = "part_of_speech";
    public static final String TYPE = "type";
    public static final String ENTIME = "entime";
    public static final String querySelectEnWhereVerbandNoun = "SELECT en FROM `tablet` WHERE part_of_speech = \"Verb+Noun\" LIMIT 1";
    public static final String querySelectRuWhereVerbandNoun = "SELECT ru FROM `tablet` WHERE part_of_speech = \"Verb+Noun\" LIMIT 1";

    public static String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";


    public static final String[] listPartOfSpeech = new String[]{"Noun", "Verb","Pronoun", "Adjective", "Numeral", "Adverb", "Conjunctions", "Prepositions", "Particles"};
    public static final String[] listTimeSentens = new String[]{"Present_Simple", "Present_Continuous","Present_Perfect", "Present_Perfect_Continuous", "Past_Simple", "Past_Continuous","Past_Perfect", "Past_Perfect_Continuous","Future_Simple", "Future_Continuous","Future_Perfect", "Future_Perfect_Continuous"};
    public static final String[] listTypeSentens = new String[]{"Declarative", "Interrogative ","Imperative", "Exclamatory", "Affirmative", "General", "Alternative", "Special"};
}
