package common

object DBUtils {

  def getDBName(db: String): String = {
    if (db.equals("kcf") || db.equals("privdoc")) "blog" else db
  }

  def getDBPrefix(db: String): String = {
    if(db.equals("privdoc") || db.equals("kcf")) s"$db." else ""
  }
}
