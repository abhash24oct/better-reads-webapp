package io.abhash.betterreads.author;

import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table(value = "author_by_id")
public class Author {

    @Id @PrimaryKeyColumn(name="auhtor_id",ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private String id;
    @Column("author_name")
    @CassandraType(type = CassandraType.Name.TEXT)
    private String name;
    @CassandraType(type = CassandraType.Name.TEXT)
    private String personalName;

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getPersonalName() {
        return personalName;
    }

    public void setPersonalName(final String personalName) {
        this.personalName = personalName;
    }
}
