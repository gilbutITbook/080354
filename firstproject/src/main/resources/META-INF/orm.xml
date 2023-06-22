<?xml version="1.0" encoding="utf-8" ?>
<entity-mappings xmlns="https://jakarta.ee/xml/ns/persistence/orm"
                 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                 xsi:schemaLocation="https://jakarta.ee/xml/ns/persistence/orm
                 https://jakarta.ee/xml/ns/persistence/orm/orm_3_0.xsd"
                 version="3.0">
    <named-native-query
            name="Comment.findByNickname"
            result-class="com.example.firstproject.entity.Comment">
        <query>
            <![CDATA[
                    SELECT * FROM comment WHERE nickname = :nickname
            ]]>
        </query>
    </named-native-query>
</entity-mappings>