package io.github.andrefelipeos.santanderdevweek2023.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity(name = "Feature")
@Table(name = "tb_feature")
public class Feature extends BaseItem {

}
