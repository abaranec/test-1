println "Hello"
qq = db.liveTable("DbInternal", "ProcessEventLog").where("Date=today()")

source("Hello2.groovy")
