package io.github.andrefelipeos.santanderdevweek2023.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity(name = "News")
@Table(name = "tb_news")
public class News extends BaseItem {

}
