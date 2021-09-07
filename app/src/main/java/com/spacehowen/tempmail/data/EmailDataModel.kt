package com.spacehowen.tempmail.data

class EmailDataModel(from: String?, subject: String?, body: String?) {

    private var from: String
    private var subject: String
    private var body: String
    init {
        this.from = from!!
        this.subject = subject!!
        this.body = body!!
    }
    fun getFrom(): String? {
        return from
    }
    fun setFrom(from: String?) {
        this.from = from!!
    }
    fun getSubject(): String? {
        return subject
    }
    fun setSubject(subject: String?) {
        this.subject = subject!!
    }
    fun getBody(): String? {
        return body
    }
    fun setBody(body: String?) {
        this.body = body!!
    }
}