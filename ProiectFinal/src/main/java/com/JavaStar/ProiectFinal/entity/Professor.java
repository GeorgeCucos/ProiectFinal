package com.JavaStar.ProiectFinal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long professorId;
    private String name;
    private String firstName;
    private List<String> materials;

   public Professor() {
   }

   public Professor(Long professorId, String name, String firstName, List<String> materials) {
      this.professorId = professorId;
      this.name = name;
      this.firstName = firstName;
      this.materials = materials;
   }

   public Long getProfessorId() {
      return professorId;
   }

   public void setProfessorId(Long professorId) {
      this.professorId = professorId;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public List<String> getMaterials() {
      return materials;
   }

   public void setMaterials(List<String> materials) {
      this.materials = materials;
   }
}
