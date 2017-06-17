package org.fleni.cda.xml.mapper.report;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="realmCode">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="typeId">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="templateId" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}date" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="id">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="code">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="effectiveTime">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="confidentialityCode">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="languageCode">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="setId">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="versionNumber">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="recordTarget">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="patientRole">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="id" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="addr">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="streetAddressLine" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="county" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="additionalLocator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="telecom">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="patient">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="name">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="family" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                                                 &lt;element name="given" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="administrativeGenderCode">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="birthTime">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="providerOrganization">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="id">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="standardIndustryClassCode">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                               &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="asOrganizationPartOf">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="id">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="code">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                                         &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="wholeOrganization">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="id">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="telecom">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="addr">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="streetAddressLine" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                     &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                     &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                     &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="author">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="time">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="assignedAuthor">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="id">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="code">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="telecom">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="assignedPerson">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="name">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="family" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                                                 &lt;element name="given" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="custodian">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assignedCustodian">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="representedCustodianOrganization">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="id">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="participant">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="associatedEntity">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="id">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="associatedPerson">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="scopingOrganization">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="id">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="asOrganizationPartOf">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="id">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="wholeOrganization">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="documentationOf">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="serviceEvent">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="code">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="componentOf">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="encompassingEncounter">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="id">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="code">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="effectiveTime">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="low">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="high">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="dischargeDispositionCode">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="location">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="healthCareFacility">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="id">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="location">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="component">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="structuredBody">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="component" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="section">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="templateId">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="code">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="text">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="paragraph" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "code",
    "title",
    "effectiveTime",
    "confidentialityCode",
    "languageCode",
    "setId",
    "versionNumber",
    "recordTarget",
    "author",
    "custodian",
    "participant",
    "documentationOf",
    "componentOf",
    "component"
})
@XmlRootElement(name = "ClinicalDocument")
public class ReportDischarge {

    /**
	 * 
	 */
	public ReportDischarge() {
		super();
	}


	@XmlElement(required = true)
    protected ReportDischarge.RealmCode realmCode;
    @XmlElement(required = true)
    protected ReportDischarge.TypeId typeId;
    @XmlElement(required = true)
    protected ReportDischarge.TemplateId templateId;
    @XmlElement(required = true)
    protected ReportDischarge.Id id;
    @XmlElement(required = true)
    protected ReportDischarge.Code code;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected ReportDischarge.EffectiveTime effectiveTime;
    @XmlElement(required = true)
    protected ReportDischarge.ConfidentialityCode confidentialityCode;
    @XmlElement(required = true)
    protected ReportDischarge.LanguageCode languageCode;
    @XmlElement(required = true)
    protected ReportDischarge.SetId setId;
    @XmlElement(required = true)
    protected ReportDischarge.VersionNumber versionNumber;
    @XmlElement(required = true)
    protected ReportDischarge.RecordTarget recordTarget;
    @XmlElement(required = true)
    protected ReportDischarge.Author author;
    @XmlElement(required = true)
    protected ReportDischarge.Custodian custodian;
    @XmlElement(required = true)
    protected ReportDischarge.Participant participant;
    @XmlElement(required = true)
    protected ReportDischarge.DocumentationOf documentationOf;
    @XmlElement(required = true)
    protected ReportDischarge.ComponentOf componentOf;
    @XmlElement(required = true, name = "component")
    protected ReportDischarge.Components component;

    /**
     * Gets the value of the realmCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReportDischarge.RealmCode }
     *     
     */
    public ReportDischarge.RealmCode getRealmCode() {
        return realmCode;
    }

    /**
     * Sets the value of the realmCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportDischarge.RealmCode }
     *     
     */
    public void setRealmCode(ReportDischarge.RealmCode value) {
        this.realmCode = value;
    }

    /**
     * Gets the value of the typeId property.
     * 
     * @return
     *     possible object is
     *     {@link ReportDischarge.TypeId }
     *     
     */
    public ReportDischarge.TypeId getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportDischarge.TypeId }
     *     
     */
    public void setTypeId(ReportDischarge.TypeId value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the templateId property.
     * 
     * @return
     *     possible object is
     *     {@link ReportDischarge.TemplateId }
     *     
     */
    public ReportDischarge.TemplateId getTemplateId() {
        return templateId;
    }  
    
    /**
     * Sets the value of the templateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportDischarge.TemplateId }
     *     
     */
    public void setTemplateId(ReportDischarge.TemplateId value) {
        this.templateId = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link ReportDischarge.Id }
     *     
     */
    public ReportDischarge.Id getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportDischarge.Id }
     *     
     */
    public void setId(ReportDischarge.Id value) {
        this.id = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link ReportDischarge.Code }
     *     
     */
    public ReportDischarge.Code getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportDischarge.Code }
     *     
     */
    public void setCode(ReportDischarge.Code value) {
        this.code = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the effectiveTime property.
     * 
     * @return
     *     possible object is
     *     {@link ReportDischarge.EffectiveTime }
     *     
     */
    public ReportDischarge.EffectiveTime getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * Sets the value of the effectiveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportDischarge.EffectiveTime }
     *     
     */
    public void setEffectiveTime(ReportDischarge.EffectiveTime value) {
        this.effectiveTime = value;
    }

    /**
     * Gets the value of the confidentialityCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReportDischarge.ConfidentialityCode }
     *     
     */
    public ReportDischarge.ConfidentialityCode getConfidentialityCode() {
        return confidentialityCode;
    }

    /**
     * Sets the value of the confidentialityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportDischarge.ConfidentialityCode }
     *     
     */
    public void setConfidentialityCode(ReportDischarge.ConfidentialityCode value) {
        this.confidentialityCode = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReportDischarge.LanguageCode }
     *     
     */
    public ReportDischarge.LanguageCode getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportDischarge.LanguageCode }
     *     
     */
    public void setLanguageCode(ReportDischarge.LanguageCode value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the setId property.
     * 
     * @return
     *     possible object is
     *     {@link ReportDischarge.SetId }
     *     
     */
    public ReportDischarge.SetId getSetId() {
        return setId;
    }

    /**
     * Sets the value of the setId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportDischarge.SetId }
     *     
     */
    public void setSetId(ReportDischarge.SetId value) {
        this.setId = value;
    }

    /**
     * Gets the value of the versionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link ReportDischarge.VersionNumber }
     *     
     */
    public ReportDischarge.VersionNumber getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportDischarge.VersionNumber }
     *     
     */
    public void setVersionNumber(ReportDischarge.VersionNumber value) {
        this.versionNumber = value;
    }

    /**
     * Gets the value of the recordTarget property.
     * 
     * @return
     *     possible object is
     *     {@link ReportDischarge.RecordTarget }
     *     
     */
    public ReportDischarge.RecordTarget getRecordTarget() {
        return recordTarget;
    }

    /**
     * Sets the value of the recordTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportDischarge.RecordTarget }
     *     
     */
    public void setRecordTarget(ReportDischarge.RecordTarget value) {
        this.recordTarget = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link ReportDischarge.Author }
     *     
     */
    public ReportDischarge.Author getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportDischarge.Author }
     *     
     */
    public void setAuthor(ReportDischarge.Author value) {
        this.author = value;
    }

    /**
     * Gets the value of the custodian property.
     * 
     * @return
     *     possible object is
     *     {@link ReportDischarge.Custodian }
     *     
     */
    public ReportDischarge.Custodian getCustodian() {
        return custodian;
    }

    /**
     * Sets the value of the custodian property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportDischarge.Custodian }
     *     
     */
    public void setCustodian(ReportDischarge.Custodian value) {
        this.custodian = value;
    }

    /**
     * Gets the value of the participant property.
     * 
     * @return
     *     possible object is
     *     {@link ReportDischarge.Participant }
     *     
     */
    public ReportDischarge.Participant getParticipant() {
        return participant;
    }

    /**
     * Sets the value of the participant property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportDischarge.Participant }
     *     
     */
    public void setParticipant(ReportDischarge.Participant value) {
        this.participant = value;
    }

    /**
     * Gets the value of the documentationOf property.
     * 
     * @return
     *     possible object is
     *     {@link ReportDischarge.DocumentationOf }
     *     
     */
    public ReportDischarge.DocumentationOf getDocumentationOf() {
        return documentationOf;
    }

    /**
     * Sets the value of the documentationOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportDischarge.DocumentationOf }
     *     
     */
    public void setDocumentationOf(ReportDischarge.DocumentationOf value) {
        this.documentationOf = value;
    }

    /**
     * Gets the value of the componentOf property.
     * 
     * @return
     *     possible object is
     *     {@link ReportDischarge.ComponentOf }
     *     
     */
    public ReportDischarge.ComponentOf getComponentOf() {
        return componentOf;
    }

    /**
     * Sets the value of the componentOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportDischarge.ComponentOf }
     *     
     */
    public void setComponentOf(ReportDischarge.ComponentOf value) {
        this.componentOf = value;
    }

    /**
     * Gets the value of the component property.
     * 
     * @return
     *     possible object is
     *     {@link ReportDischarge.Components }
     *     
     */
    public ReportDischarge.Components getComponent() {
        return component;
    }

    /**
     * Sets the value of the component property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportDischarge.Components }
     *     
     */
    public void setComponent(ReportDischarge.Components value) {
        this.component = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="time">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="assignedAuthor">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="id">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="code">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="telecom">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="assignedPerson">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="name">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="family" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *                                       &lt;element name="given" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "time",
        "assignedAuthor"
    })
    public static class Author {

        /**
		 * 
		 */
		public Author() {
			super();
		}


		@XmlElement(required = true)
        protected ReportDischarge.Author.Time time;
        @XmlElement(required = true)
        protected ReportDischarge.Author.AssignedAuthor assignedAuthor;

        /**
         * Gets the value of the time property.
         * 
         * @return
         *     possible object is
         *     {@link ReportDischarge.Author.Time }
         *     
         */
        public ReportDischarge.Author.Time getTime() {
            return time;
        }

        /**
         * Sets the value of the time property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReportDischarge.Author.Time }
         *     
         */
        public void setTime(ReportDischarge.Author.Time value) {
            this.time = value;
        }

        /**
         * Gets the value of the assignedAuthor property.
         * 
         * @return
         *     possible object is
         *     {@link ReportDischarge.Author.AssignedAuthor }
         *     
         */
        public ReportDischarge.Author.AssignedAuthor getAssignedAuthor() {
            return assignedAuthor;
        }

        /**
         * Sets the value of the assignedAuthor property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReportDischarge.Author.AssignedAuthor }
         *     
         */
        public void setAssignedAuthor(ReportDischarge.Author.AssignedAuthor value) {
            this.assignedAuthor = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="id">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="code">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="telecom">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="assignedPerson">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="name">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="family" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
         *                             &lt;element name="given" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "id",
            "code",
            "telecom",
            "assignedPerson"
        })
        public static class AssignedAuthor {

            /**
			 * 
			 */
			public AssignedAuthor() {
				super();
			}


			@XmlElement(required = true)
            protected ReportDischarge.Author.AssignedAuthor.Id id;
            @XmlElement(required = true)
            protected ReportDischarge.Author.AssignedAuthor.Code code;
            @XmlElement(required = true)
            protected ReportDischarge.Author.AssignedAuthor.Telecom telecom;
            @XmlElement(required = true)
            protected ReportDischarge.Author.AssignedAuthor.AssignedPerson assignedPerson;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link ReportDischarge.Author.AssignedAuthor.Id }
             *     
             */
            public ReportDischarge.Author.AssignedAuthor.Id getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportDischarge.Author.AssignedAuthor.Id }
             *     
             */
            public void setId(ReportDischarge.Author.AssignedAuthor.Id value) {
                this.id = value;
            }

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link ReportDischarge.Author.AssignedAuthor.Code }
             *     
             */
            public ReportDischarge.Author.AssignedAuthor.Code getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportDischarge.Author.AssignedAuthor.Code }
             *     
             */
            public void setCode(ReportDischarge.Author.AssignedAuthor.Code value) {
                this.code = value;
            }

            /**
             * Gets the value of the telecom property.
             * 
             * @return
             *     possible object is
             *     {@link ReportDischarge.Author.AssignedAuthor.Telecom }
             *     
             */
            public ReportDischarge.Author.AssignedAuthor.Telecom getTelecom() {
                return telecom;
            }

            /**
             * Sets the value of the telecom property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportDischarge.Author.AssignedAuthor.Telecom }
             *     
             */
            public void setTelecom(ReportDischarge.Author.AssignedAuthor.Telecom value) {
                this.telecom = value;
            }

            /**
             * Gets the value of the assignedPerson property.
             * 
             * @return
             *     possible object is
             *     {@link ReportDischarge.Author.AssignedAuthor.AssignedPerson }
             *     
             */
            public ReportDischarge.Author.AssignedAuthor.AssignedPerson getAssignedPerson() {
                return assignedPerson;
            }

            /**
             * Sets the value of the assignedPerson property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportDischarge.Author.AssignedAuthor.AssignedPerson }
             *     
             */
            public void setAssignedPerson(ReportDischarge.Author.AssignedAuthor.AssignedPerson value) {
                this.assignedPerson = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="name">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="family" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
             *                   &lt;element name="given" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "name"
            })
            public static class AssignedPerson {

                /**
				 * 
				 */
				public AssignedPerson() {
					super();
				}


				@XmlElement(required = true)
                protected ReportDischarge.Author.AssignedAuthor.AssignedPerson.Name name;

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReportDischarge.Author.AssignedAuthor.AssignedPerson.Name }
                 *     
                 */
                public ReportDischarge.Author.AssignedAuthor.AssignedPerson.Name getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReportDischarge.Author.AssignedAuthor.AssignedPerson.Name }
                 *     
                 */
                public void setName(ReportDischarge.Author.AssignedAuthor.AssignedPerson.Name value) {
                    this.name = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="family" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
                 *         &lt;element name="given" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "family",
                    "given"
                })
                public static class Name {

                    /**
					 * 
					 */
					public Name() {
						super();
					}

					@XmlElement(required = true)
                    protected List<String> family;
                    @XmlElement(required = true)
                    protected List<String> given;

                    /**
                     * Gets the value of the family property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the family property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getFamily().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
                     */
                    public List<String> getFamily() {
                        if (family == null) {
                            family = new ArrayList<String>();
                        }
                        return this.family;
                    }

                    /**
                     * Gets the value of the given property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the given property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getGiven().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
                     */
                    public List<String> getGiven() {
                        if (given == null) {
                            given = new ArrayList<String>();
                        }
                        return this.given;
                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Code {

                /**
				 * 
				 */
				public Code() {
					super();
				}

				@XmlAttribute(name = "code")
                protected String code;
                @XmlAttribute(name = "codeSystem")
                protected String codeSystem;
                @XmlAttribute(name = "displayName")
                protected String displayName;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the codeSystem property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodeSystem() {
                    return codeSystem;
                }

                /**
                 * Sets the value of the codeSystem property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodeSystem(String value) {
                    this.codeSystem = value;
                }

                /**
                 * Gets the value of the displayName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDisplayName() {
                    return displayName;
                }

                /**
                 * Sets the value of the displayName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDisplayName(String value) {
                    this.displayName = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Id {

                /**
				 * 
				 */
				public Id() {
					super();
				}

				@XmlAttribute(name = "extension")
                protected String extension;
                @XmlAttribute(name = "root")
                protected String root;

                /**
                 * Gets the value of the extension property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getExtension() {
                    return extension;
                }

                /**
                 * Sets the value of the extension property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setExtension(String value) {
                    this.extension = value;
                }

                /**
                 * Gets the value of the root property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRoot() {
                    return root;
                }

                /**
                 * Sets the value of the root property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRoot(String value) {
                    this.root = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Telecom {

                /**
				 * 
				 */
				public Telecom() {
					super();
				}

				@XmlAttribute(name = "use")
                protected String use;
                @XmlAttribute(name = "value")
                protected String value;

                /**
                 * Gets the value of the use property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUse() {
                    return use;
                }

                /**
                 * Sets the value of the use property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUse(String value) {
                    this.use = value;
                }

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Time {

            /**
			 * 
			 */
			public Time() {
				super();
			}

			@XmlAttribute(name = "value")
            protected String value;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Code {

        /**
		 * 
		 */
		public Code() {
			super();
		}

		@XmlAttribute(name = "codeSystem")
        protected String codeSystem;
        @XmlAttribute(name = "codeSystemName")
        protected String codeSystemName;
        @XmlAttribute(name = "code")
        protected String code;
        @XmlAttribute(name = "displayName")
        protected String displayName;

        /**
         * Gets the value of the codeSystem property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeSystem() {
            return codeSystem;
        }

        /**
         * Sets the value of the codeSystem property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeSystem(String value) {
            this.codeSystem = value;
        }

        /**
         * Gets the value of the codeSystemName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeSystemName() {
            return codeSystemName;
        }

        /**
         * Sets the value of the codeSystemName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeSystemName(String value) {
            this.codeSystemName = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the displayName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDisplayName() {
            return displayName;
        }

        /**
         * Sets the value of the displayName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDisplayName(String value) {
            this.displayName = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="structuredBody">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="component" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="section">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="templateId">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="code">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="text">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="paragraph" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "structuredBody"
    })
    public static class Components {

        /**
		 * 
		 */
		public Components() {
			super();
		}


		@XmlElement(required = true)
        protected ReportDischarge.Components.StructuredBody structuredBody;

        /**
         * Gets the value of the structuredBody property.
         * 
         * @return
         *     possible object is
         *     {@link ReportDischarge.Components.StructuredBody }
         *     
         */
        public ReportDischarge.Components.StructuredBody getStructuredBody() {
            return structuredBody;
        }

        /**
         * Sets the value of the structuredBody property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReportDischarge.Components.StructuredBody }
         *     
         */
        public void setStructuredBody(ReportDischarge.Components.StructuredBody value) {
            this.structuredBody = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="component" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="section">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="templateId">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}date" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="code">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="text">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="paragraph" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "component"
        })
        public static class StructuredBody {

            /**
			 * 
			 */
			public StructuredBody() {
				super();
			}


			@XmlElement(required = true)
            protected List<ReportDischarge.Components.StructuredBody.Component> component;

            /**
             * Gets the value of the component property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the component property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getComponent().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ReportDischarge.Components.StructuredBody.Component }
             * 
             * 
             */
            public List<ReportDischarge.Components.StructuredBody.Component> getComponent() {
                if (component == null) {
                    component = new ArrayList<ReportDischarge.Components.StructuredBody.Component>();
                }
                return this.component;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="section">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="templateId">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}date" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="code">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="text">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="paragraph" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "section"
            })
            public static class Component {

                /**
				 * 
				 */
				public Component() {
					super();
				}


				@XmlElement(required = true)
                protected ReportDischarge.Components.StructuredBody.Component.Section section;

                /**
                 * Gets the value of the section property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReportDischarge.Components.StructuredBody.Component.Section }
                 *     
                 */
                public ReportDischarge.Components.StructuredBody.Component.Section getSection() {
                    return section;
                }

                /**
                 * Sets the value of the section property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReportDischarge.Components.StructuredBody.Component.Section }
                 *     
                 */
                public void setSection(ReportDischarge.Components.StructuredBody.Component.Section value) {
                    this.section = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="templateId">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}date" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="code">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="text">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="paragraph" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "templateId",
                    "code",
                    "title",
                    "text"
                })
                public static class Section {

                    /**
					 * 
					 */
					public Section() {
						super();
					}


					@XmlElement(required = true)
                    protected ReportDischarge.Components.StructuredBody.Component.Section.TemplateId templateId;
                    @XmlElement(required = true)
                    protected ReportDischarge.Components.StructuredBody.Component.Section.Code code;
                    @XmlElement(required = true)
                    protected String title;
                    @XmlElement(required = true)
                    protected ReportDischarge.Components.StructuredBody.Component.Section.Text text;

                    /**
                     * Gets the value of the templateId property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ReportDischarge.Components.StructuredBody.Component.Section.TemplateId }
                     *     
                     */
                    public ReportDischarge.Components.StructuredBody.Component.Section.TemplateId getTemplateId() {
                        return templateId;
                    }

                    /**
                     * Sets the value of the templateId property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ReportDischarge.Components.StructuredBody.Component.Section.TemplateId }
                     *     
                     */
                    public void setTemplateId(ReportDischarge.Components.StructuredBody.Component.Section.TemplateId value) {
                        this.templateId = value;
                    }

                    /**
                     * Gets the value of the code property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ReportDischarge.Components.StructuredBody.Component.Section.Code }
                     *     
                     */
                    public ReportDischarge.Components.StructuredBody.Component.Section.Code getCode() {
                        return code;
                    }

                    /**
                     * Sets the value of the code property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ReportDischarge.Components.StructuredBody.Component.Section.Code }
                     *     
                     */
                    public void setCode(ReportDischarge.Components.StructuredBody.Component.Section.Code value) {
                        this.code = value;
                    }

                    /**
                     * Gets the value of the title property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTitle() {
                        return title;
                    }

                    /**
                     * Sets the value of the title property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTitle(String value) {
                        this.title = value;
                    }

                    /**
                     * Gets the value of the text property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ReportDischarge.Components.StructuredBody.Component.Section.Text }
                     *     
                     */
                    public ReportDischarge.Components.StructuredBody.Component.Section.Text getText() {
                        return text;
                    }

                    /**
                     * Sets the value of the text property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ReportDischarge.Components.StructuredBody.Component.Section.Text }
                     *     
                     */
                    public void setText(ReportDischarge.Components.StructuredBody.Component.Section.Text value) {
                        this.text = value;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Code {

                        /**
						 * 
						 */
						public Code() {
							super();
						}

						@XmlAttribute(name = "codeSystem")
                        protected String codeSystem;
                        @XmlAttribute(name = "codeSystemName")
                        protected String codeSystemName;
                        @XmlAttribute(name = "code")
                        protected String code;
                        @XmlAttribute(name = "displayName")
                        protected String displayName;

                        /**
                         * Gets the value of the codeSystem property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCodeSystem() {
                            return codeSystem;
                        }

                        /**
                         * Sets the value of the codeSystem property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCodeSystem(String value) {
                            this.codeSystem = value;
                        }

                        /**
                         * Gets the value of the codeSystemName property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCodeSystemName() {
                            return codeSystemName;
                        }

                        /**
                         * Sets the value of the codeSystemName property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCodeSystemName(String value) {
                            this.codeSystemName = value;
                        }

                        /**
                         * Gets the value of the code property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCode() {
                            return code;
                        }

                        /**
                         * Sets the value of the code property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCode(String value) {
                            this.code = value;
                        }

                        /**
                         * Gets the value of the displayName property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDisplayName() {
                            return displayName;
                        }

                        /**
                         * Sets the value of the displayName property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDisplayName(String value) {
                            this.displayName = value;
                        }

                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}date" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class TemplateId {

                        /**
						 * 
						 */
						public TemplateId() {
							super();
						}

						@XmlAttribute(name = "root")
                        protected String root;
                        @XmlAttribute(name = "extension")
                        @XmlSchemaType(name = "date")
                        protected String extension;

                        /**
                         * Gets the value of the root property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getRoot() {
                            return root;
                        }

                        /**
                         * Sets the value of the root property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setRoot(String value) {
                            this.root = value;
                        }

                        /**
                         * Gets the value of the extension property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getExtension() {
                            return extension;
                        }

                        /**
                         * Sets the value of the extension property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setExtension(String value) {
                            this.extension = value;
                        }

                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="paragraph" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "paragraph"
                    })
                    public static class Text {

                        /**
						 * 
						 */
						public Text() {
							super();
						}

						@XmlElement(required = true)
                        protected String paragraph;

                        /**
                         * Gets the value of the paragraph property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getParagraph() {
                            return paragraph;
                        }

                        /**
                         * Sets the value of the paragraph property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setParagraph(String value) {
                            this.paragraph = value;
                        }

                    }

                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="encompassingEncounter">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="id">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="code">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="effectiveTime">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="low">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="high">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="dischargeDispositionCode">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="location">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="healthCareFacility">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="id">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="location">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "encompassingEncounter"
    })
    public static class ComponentOf {

        /**
		 * 
		 */
		public ComponentOf() {
			super();
		}


		@XmlElement(required = true)
        protected ReportDischarge.ComponentOf.EncompassingEncounter encompassingEncounter;

        /**
         * Gets the value of the encompassingEncounter property.
         * 
         * @return
         *     possible object is
         *     {@link ReportDischarge.ComponentOf.EncompassingEncounter }
         *     
         */
        public ReportDischarge.ComponentOf.EncompassingEncounter getEncompassingEncounter() {
            return encompassingEncounter;
        }

        /**
         * Sets the value of the encompassingEncounter property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReportDischarge.ComponentOf.EncompassingEncounter }
         *     
         */
        public void setEncompassingEncounter(ReportDischarge.ComponentOf.EncompassingEncounter value) {
            this.encompassingEncounter = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="id">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="code">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="effectiveTime">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="low">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="high">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="dischargeDispositionCode">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="location">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="healthCareFacility">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="id">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="location">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "id",
            "code",
            "effectiveTime",
            "dischargeDispositionCode",
            "location"
        })
        public static class EncompassingEncounter {

            /**
			 * 
			 */
			public EncompassingEncounter() {
				super();
			}


			@XmlElement(required = true)
            protected ReportDischarge.ComponentOf.EncompassingEncounter.Id id;
            @XmlElement(required = true)
            protected ReportDischarge.ComponentOf.EncompassingEncounter.Code code;
            @XmlElement(required = true)
            protected ReportDischarge.ComponentOf.EncompassingEncounter.EffectiveTime effectiveTime;
            @XmlElement(required = true)
            protected ReportDischarge.ComponentOf.EncompassingEncounter.DischargeDispositionCode dischargeDispositionCode;
            @XmlElement(required = true, name = "location")
            protected ReportDischarge.ComponentOf.EncompassingEncounter.Locations location;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link ReportDischarge.ComponentOf.EncompassingEncounter.Id }
             *     
             */
            public ReportDischarge.ComponentOf.EncompassingEncounter.Id getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportDischarge.ComponentOf.EncompassingEncounter.Id }
             *     
             */
            public void setId(ReportDischarge.ComponentOf.EncompassingEncounter.Id value) {
                this.id = value;
            }

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link ReportDischarge.ComponentOf.EncompassingEncounter.Code }
             *     
             */
            public ReportDischarge.ComponentOf.EncompassingEncounter.Code getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportDischarge.ComponentOf.EncompassingEncounter.Code }
             *     
             */
            public void setCode(ReportDischarge.ComponentOf.EncompassingEncounter.Code value) {
                this.code = value;
            }

            /**
             * Gets the value of the effectiveTime property.
             * 
             * @return
             *     possible object is
             *     {@link ReportDischarge.ComponentOf.EncompassingEncounter.EffectiveTime }
             *     
             */
            public ReportDischarge.ComponentOf.EncompassingEncounter.EffectiveTime getEffectiveTime() {
                return effectiveTime;
            }

            /**
             * Sets the value of the effectiveTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportDischarge.ComponentOf.EncompassingEncounter.EffectiveTime }
             *     
             */
            public void setEffectiveTime(ReportDischarge.ComponentOf.EncompassingEncounter.EffectiveTime value) {
                this.effectiveTime = value;
            }

            /**
             * Gets the value of the dischargeDispositionCode property.
             * 
             * @return
             *     possible object is
             *     {@link ReportDischarge.ComponentOf.EncompassingEncounter.DischargeDispositionCode }
             *     
             */
            public ReportDischarge.ComponentOf.EncompassingEncounter.DischargeDispositionCode getDischargeDispositionCode() {
                return dischargeDispositionCode;
            }

            /**
             * Sets the value of the dischargeDispositionCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportDischarge.ComponentOf.EncompassingEncounter.DischargeDispositionCode }
             *     
             */
            public void setDischargeDispositionCode(ReportDischarge.ComponentOf.EncompassingEncounter.DischargeDispositionCode value) {
                this.dischargeDispositionCode = value;
            }

            /**
             * Gets the value of the location property.
             * 
             * @return
             *     possible object is
             *     {@link ReportDischarge.ComponentOf.EncompassingEncounter.Locations }
             *     
             */
            public ReportDischarge.ComponentOf.EncompassingEncounter.Locations getLocation() {
                return location;
            }

            /**
             * Sets the value of the location property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportDischarge.ComponentOf.EncompassingEncounter.Locations }
             *     
             */
            public void setLocation(ReportDischarge.ComponentOf.EncompassingEncounter.Locations value) {
                this.location = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Code {

                /**
				 * 
				 */
				public Code() {
					super();
				}

				@XmlAttribute(name = "codeSystem")
                protected String codeSystem;
                @XmlAttribute(name = "codeSystemName")
                protected String codeSystemName;
                @XmlAttribute(name = "code")
                protected String code;
                @XmlAttribute(name = "displayName")
                protected String displayName;

                /**
                 * Gets the value of the codeSystem property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodeSystem() {
                    return codeSystem;
                }

                /**
                 * Sets the value of the codeSystem property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodeSystem(String value) {
                    this.codeSystem = value;
                }

                /**
                 * Gets the value of the codeSystemName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodeSystemName() {
                    return codeSystemName;
                }

                /**
                 * Sets the value of the codeSystemName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodeSystemName(String value) {
                    this.codeSystemName = value;
                }

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the displayName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDisplayName() {
                    return displayName;
                }

                /**
                 * Sets the value of the displayName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDisplayName(String value) {
                    this.displayName = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class DischargeDispositionCode {

                /**
				 * 
				 */
				public DischargeDispositionCode() {
					super();
				}

				@XmlAttribute(name = "code")
                protected Integer code;
                @XmlAttribute(name = "codeSystem")
                protected String codeSystem;
                @XmlAttribute(name = "displayName")
                protected String displayName;
                @XmlAttribute(name = "codeSystemName")
                protected String codeSystemName;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setCode(Integer value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the codeSystem property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodeSystem() {
                    return codeSystem;
                }

                /**
                 * Sets the value of the codeSystem property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodeSystem(String value) {
                    this.codeSystem = value;
                }

                /**
                 * Gets the value of the displayName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDisplayName() {
                    return displayName;
                }

                /**
                 * Sets the value of the displayName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDisplayName(String value) {
                    this.displayName = value;
                }

                /**
                 * Gets the value of the codeSystemName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodeSystemName() {
                    return codeSystemName;
                }

                /**
                 * Sets the value of the codeSystemName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodeSystemName(String value) {
                    this.codeSystemName = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="low">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="high">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "low",
                "high"
            })
            public static class EffectiveTime {

                /**
				 * 
				 */
				public EffectiveTime() {
					super();
				}


				@XmlElement(required = true)
                protected ReportDischarge.ComponentOf.EncompassingEncounter.EffectiveTime.Low low;
                @XmlElement(required = true)
                protected ReportDischarge.ComponentOf.EncompassingEncounter.EffectiveTime.High high;

                /**
                 * Gets the value of the low property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReportDischarge.ComponentOf.EncompassingEncounter.EffectiveTime.Low }
                 *     
                 */
                public ReportDischarge.ComponentOf.EncompassingEncounter.EffectiveTime.Low getLow() {
                    return low;
                }

                /**
                 * Sets the value of the low property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReportDischarge.ComponentOf.EncompassingEncounter.EffectiveTime.Low }
                 *     
                 */
                public void setLow(ReportDischarge.ComponentOf.EncompassingEncounter.EffectiveTime.Low value) {
                    this.low = value;
                }

                /**
                 * Gets the value of the high property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReportDischarge.ComponentOf.EncompassingEncounter.EffectiveTime.High }
                 *     
                 */
                public ReportDischarge.ComponentOf.EncompassingEncounter.EffectiveTime.High getHigh() {
                    return high;
                }

                /**
                 * Sets the value of the high property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReportDischarge.ComponentOf.EncompassingEncounter.EffectiveTime.High }
                 *     
                 */
                public void setHigh(ReportDischarge.ComponentOf.EncompassingEncounter.EffectiveTime.High value) {
                    this.high = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class High {

                    /**
					 * 
					 */
					public High() {
						super();
					}

					@XmlAttribute(name = "value")
                    protected String value;

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Low {

                    /**
					 * 
					 */
					public Low() {
						super();
					}

					@XmlAttribute(name = "value")
                    protected String value;

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Id {

                /**
				 * 
				 */
				public Id() {
					super();
				}

				@XmlAttribute(name = "extension")
                protected String extension;
                @XmlAttribute(name = "root")
                protected String root;

                /**
                 * Gets the value of the extension property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getExtension() {
                    return extension;
                }

                /**
                 * Sets the value of the extension property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setExtension(String value) {
                    this.extension = value;
                }

                /**
                 * Gets the value of the root property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRoot() {
                    return root;
                }

                /**
                 * Sets the value of the root property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRoot(String value) {
                    this.root = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="healthCareFacility">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="id">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="location">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "healthCareFacility"
            })
            public static class Locations {

                /**
				 * 
				 */
				public Locations() {
					super();
				}


				@XmlElement(required = true)
                protected ReportDischarge.ComponentOf.EncompassingEncounter.Locations.HealthCareFacility healthCareFacility;

                /**
                 * Gets the value of the healthCareFacility property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReportDischarge.ComponentOf.EncompassingEncounter.Locations.HealthCareFacility }
                 *     
                 */
                public ReportDischarge.ComponentOf.EncompassingEncounter.Locations.HealthCareFacility getHealthCareFacility() {
                    return healthCareFacility;
                }

                /**
                 * Sets the value of the healthCareFacility property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReportDischarge.ComponentOf.EncompassingEncounter.Locations.HealthCareFacility }
                 *     
                 */
                public void setHealthCareFacility(ReportDischarge.ComponentOf.EncompassingEncounter.Locations.HealthCareFacility value) {
                    this.healthCareFacility = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="id">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="location">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "id",
                    "location"
                })
                public static class HealthCareFacility {

                    /**
					 * 
					 */
					public HealthCareFacility() {
						super();
					}


					@XmlElement(required = true)
                    protected ReportDischarge.ComponentOf.EncompassingEncounter.Locations.HealthCareFacility.Id id;
                    @XmlElement(required = true)
                    protected ReportDischarge.ComponentOf.EncompassingEncounter.Locations.HealthCareFacility.Location location;

                    /**
                     * Gets the value of the id property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ReportDischarge.ComponentOf.EncompassingEncounter.Locations.HealthCareFacility.Id }
                     *     
                     */
                    public ReportDischarge.ComponentOf.EncompassingEncounter.Locations.HealthCareFacility.Id getId() {
                        return id;
                    }

                    /**
                     * Sets the value of the id property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ReportDischarge.ComponentOf.EncompassingEncounter.Locations.HealthCareFacility.Id }
                     *     
                     */
                    public void setId(ReportDischarge.ComponentOf.EncompassingEncounter.Locations.HealthCareFacility.Id value) {
                        this.id = value;
                    }

                    /**
                     * Gets the value of the location property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ReportDischarge.ComponentOf.EncompassingEncounter.Locations.HealthCareFacility.Location }
                     *     
                     */
                    public ReportDischarge.ComponentOf.EncompassingEncounter.Locations.HealthCareFacility.Location getLocation() {
                        return location;
                    }

                    /**
                     * Sets the value of the location property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ReportDischarge.ComponentOf.EncompassingEncounter.Locations.HealthCareFacility.Location }
                     *     
                     */
                    public void setLocation(ReportDischarge.ComponentOf.EncompassingEncounter.Locations.HealthCareFacility.Location value) {
                        this.location = value;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}int" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Id {

                        /**
						 * 
						 */
						public Id() {
							super();
						}

						@XmlAttribute(name = "root")
                        protected String root;
                        @XmlAttribute(name = "extension")
                        protected Integer extension;

                        /**
                         * Gets the value of the root property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getRoot() {
                            return root;
                        }

                        /**
                         * Sets the value of the root property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setRoot(String value) {
                            this.root = value;
                        }

                        /**
                         * Gets the value of the extension property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Integer }
                         *     
                         */
                        public Integer getExtension() {
                            return extension;
                        }

                        /**
                         * Sets the value of the extension property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Integer }
                         *     
                         */
                        public void setExtension(Integer value) {
                            this.extension = value;
                        }

                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "name"
                    })
                    public static class Location {

                        /**
						 * 
						 */
						public Location() {
							super();
						}

						@XmlElement(required = true)
                        protected String name;

                        /**
                         * Gets the value of the name property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getName() {
                            return name;
                        }

                        /**
                         * Sets the value of the name property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setName(String value) {
                            this.name = value;
                        }

                    }

                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ConfidentialityCode {

        /**
		 * 
		 */
		public ConfidentialityCode() {
			super();
		}

		@XmlAttribute(name = "code")
        protected String code;
        @XmlAttribute(name = "codeSystem")
        protected String codeSystem;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the codeSystem property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeSystem() {
            return codeSystem;
        }

        /**
         * Sets the value of the codeSystem property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeSystem(String value) {
            this.codeSystem = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="assignedCustodian">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="representedCustodianOrganization">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="id">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "assignedCustodian"
    })
    public static class Custodian {

        /**
		 * 
		 */
		public Custodian() {
			super();
		}


		@XmlElement(required = true)
        protected ReportDischarge.Custodian.AssignedCustodian assignedCustodian;

        /**
         * Gets the value of the assignedCustodian property.
         * 
         * @return
         *     possible object is
         *     {@link ReportDischarge.Custodian.AssignedCustodian }
         *     
         */
        public ReportDischarge.Custodian.AssignedCustodian getAssignedCustodian() {
            return assignedCustodian;
        }

        /**
         * Sets the value of the assignedCustodian property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReportDischarge.Custodian.AssignedCustodian }
         *     
         */
        public void setAssignedCustodian(ReportDischarge.Custodian.AssignedCustodian value) {
            this.assignedCustodian = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="representedCustodianOrganization">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="id">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "representedCustodianOrganization"
        })
        public static class AssignedCustodian {

            /**
			 * 
			 */
			public AssignedCustodian() {
				super();
			}


			@XmlElement(required = true)
            protected ReportDischarge.Custodian.AssignedCustodian.RepresentedCustodianOrganization representedCustodianOrganization;

            /**
             * Gets the value of the representedCustodianOrganization property.
             * 
             * @return
             *     possible object is
             *     {@link ReportDischarge.Custodian.AssignedCustodian.RepresentedCustodianOrganization }
             *     
             */
            public ReportDischarge.Custodian.AssignedCustodian.RepresentedCustodianOrganization getRepresentedCustodianOrganization() {
                return representedCustodianOrganization;
            }

            /**
             * Sets the value of the representedCustodianOrganization property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportDischarge.Custodian.AssignedCustodian.RepresentedCustodianOrganization }
             *     
             */
            public void setRepresentedCustodianOrganization(ReportDischarge.Custodian.AssignedCustodian.RepresentedCustodianOrganization value) {
                this.representedCustodianOrganization = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="id">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "id"
            })
            public static class RepresentedCustodianOrganization {

                /**
				 * 
				 */
				public RepresentedCustodianOrganization() {
					super();
				}


				@XmlElement(required = true)
                protected ReportDischarge.Custodian.AssignedCustodian.RepresentedCustodianOrganization.Id id;

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReportDischarge.Custodian.AssignedCustodian.RepresentedCustodianOrganization.Id }
                 *     
                 */
                public ReportDischarge.Custodian.AssignedCustodian.RepresentedCustodianOrganization.Id getId() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReportDischarge.Custodian.AssignedCustodian.RepresentedCustodianOrganization.Id }
                 *     
                 */
                public void setId(ReportDischarge.Custodian.AssignedCustodian.RepresentedCustodianOrganization.Id value) {
                    this.id = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Id {

                    /**
					 * 
					 */
					public Id() {
						super();
					}

					@XmlAttribute(name = "root")
                    protected String root;

                    /**
                     * Gets the value of the root property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRoot() {
                        return root;
                    }

                    /**
                     * Sets the value of the root property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRoot(String value) {
                        this.root = value;
                    }

                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="serviceEvent">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="code">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "serviceEvent"
    })
    public static class DocumentationOf {

        /**
		 * 
		 */
		public DocumentationOf() {
			super();
		}


		@XmlElement(required = true)
        protected ReportDischarge.DocumentationOf.ServiceEvent serviceEvent;
        @XmlAttribute(name = "typeCode")
        protected String typeCode;

        /**
         * Gets the value of the serviceEvent property.
         * 
         * @return
         *     possible object is
         *     {@link ReportDischarge.DocumentationOf.ServiceEvent }
         *     
         */
        public ReportDischarge.DocumentationOf.ServiceEvent getServiceEvent() {
            return serviceEvent;
        }

        /**
         * Sets the value of the serviceEvent property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReportDischarge.DocumentationOf.ServiceEvent }
         *     
         */
        public void setServiceEvent(ReportDischarge.DocumentationOf.ServiceEvent value) {
            this.serviceEvent = value;
        }

        /**
         * Gets the value of the typeCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTypeCode() {
            return typeCode;
        }

        /**
         * Sets the value of the typeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTypeCode(String value) {
            this.typeCode = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="code">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "code"
        })
        public static class ServiceEvent {

            /**
			 * 
			 */
			public ServiceEvent() {
				super();
			}


			@XmlElement(required = true)
            protected ReportDischarge.DocumentationOf.ServiceEvent.Code code;
            @XmlAttribute(name = "classCode")
            protected String classCode;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link ReportDischarge.DocumentationOf.ServiceEvent.Code }
             *     
             */
            public ReportDischarge.DocumentationOf.ServiceEvent.Code getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportDischarge.DocumentationOf.ServiceEvent.Code }
             *     
             */
            public void setCode(ReportDischarge.DocumentationOf.ServiceEvent.Code value) {
                this.code = value;
            }

            /**
             * Gets the value of the classCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClassCode() {
                return classCode;
            }

            /**
             * Sets the value of the classCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClassCode(String value) {
                this.classCode = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Code {

                /**
				 * 
				 */
				public Code() {
					super();
				}

				@XmlAttribute(name = "code")
                protected String code;
                @XmlAttribute(name = "codeSystem")
                protected String codeSystem;
                @XmlAttribute(name = "displayName")
                protected String displayName;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the codeSystem property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodeSystem() {
                    return codeSystem;
                }

                /**
                 * Sets the value of the codeSystem property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodeSystem(String value) {
                    this.codeSystem = value;
                }

                /**
                 * Gets the value of the displayName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDisplayName() {
                    return displayName;
                }

                /**
                 * Sets the value of the displayName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDisplayName(String value) {
                    this.displayName = value;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class EffectiveTime {

        /**
		 * 
		 */
		public EffectiveTime() {
			super();
		}

		@XmlAttribute(name = "value")
        protected String value;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Id {

        /**
		 * 
		 */
		public Id() {
			super();
		}

		@XmlAttribute(name = "extension")
        protected String extension;
        @XmlAttribute(name = "root")
        protected String root;

        /**
         * Gets the value of the extension property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExtension() {
            return extension;
        }

        /**
         * Sets the value of the extension property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExtension(String value) {
            this.extension = value;
        }

        /**
         * Gets the value of the root property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoot() {
            return root;
        }

        /**
         * Sets the value of the root property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoot(String value) {
            this.root = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LanguageCode {

        /**
		 * 
		 */
		public LanguageCode() {
			super();
		}

		@XmlAttribute(name = "code")
        protected String code;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="associatedEntity">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="id">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="associatedPerson">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="scopingOrganization">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="id">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="asOrganizationPartOf">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="id">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="wholeOrganization">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "associatedEntity"
    })
    public static class Participant {

        /**
		 * 
		 */
		public Participant() {
			super();
		}


		@XmlElement(required = true)
        protected ReportDischarge.Participant.AssociatedEntity associatedEntity;
        @XmlAttribute(name = "typeCode")
        protected String typeCode;

        /**
         * Gets the value of the associatedEntity property.
         * 
         * @return
         *     possible object is
         *     {@link ReportDischarge.Participant.AssociatedEntity }
         *     
         */
        public ReportDischarge.Participant.AssociatedEntity getAssociatedEntity() {
            return associatedEntity;
        }

        /**
         * Sets the value of the associatedEntity property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReportDischarge.Participant.AssociatedEntity }
         *     
         */
        public void setAssociatedEntity(ReportDischarge.Participant.AssociatedEntity value) {
            this.associatedEntity = value;
        }

        /**
         * Gets the value of the typeCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTypeCode() {
            return typeCode;
        }

        /**
         * Sets the value of the typeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTypeCode(String value) {
            this.typeCode = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="id">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="associatedPerson">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="scopingOrganization">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="id">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="asOrganizationPartOf">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="id">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="wholeOrganization">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "id",
            "associatedPerson",
            "scopingOrganization"
        })
        public static class AssociatedEntity {

            /**
			 * 
			 */
			public AssociatedEntity() {
				super();
			}


			@XmlElement(required = true)
            protected ReportDischarge.Participant.AssociatedEntity.Id id;
            @XmlElement(required = true)
            protected ReportDischarge.Participant.AssociatedEntity.AssociatedPerson associatedPerson;
            @XmlElement(required = true)
            protected ReportDischarge.Participant.AssociatedEntity.ScopingOrganization scopingOrganization;
            @XmlAttribute(name = "classCode")
            protected String classCode;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link ReportDischarge.Participant.AssociatedEntity.Id }
             *     
             */
            public ReportDischarge.Participant.AssociatedEntity.Id getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportDischarge.Participant.AssociatedEntity.Id }
             *     
             */
            public void setId(ReportDischarge.Participant.AssociatedEntity.Id value) {
                this.id = value;
            }

            /**
             * Gets the value of the associatedPerson property.
             * 
             * @return
             *     possible object is
             *     {@link ReportDischarge.Participant.AssociatedEntity.AssociatedPerson }
             *     
             */
            public ReportDischarge.Participant.AssociatedEntity.AssociatedPerson getAssociatedPerson() {
                return associatedPerson;
            }

            /**
             * Sets the value of the associatedPerson property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportDischarge.Participant.AssociatedEntity.AssociatedPerson }
             *     
             */
            public void setAssociatedPerson(ReportDischarge.Participant.AssociatedEntity.AssociatedPerson value) {
                this.associatedPerson = value;
            }

            /**
             * Gets the value of the scopingOrganization property.
             * 
             * @return
             *     possible object is
             *     {@link ReportDischarge.Participant.AssociatedEntity.ScopingOrganization }
             *     
             */
            public ReportDischarge.Participant.AssociatedEntity.ScopingOrganization getScopingOrganization() {
                return scopingOrganization;
            }

            /**
             * Sets the value of the scopingOrganization property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportDischarge.Participant.AssociatedEntity.ScopingOrganization }
             *     
             */
            public void setScopingOrganization(ReportDischarge.Participant.AssociatedEntity.ScopingOrganization value) {
                this.scopingOrganization = value;
            }

            /**
             * Gets the value of the classCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClassCode() {
                return classCode;
            }

            /**
             * Sets the value of the classCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClassCode(String value) {
                this.classCode = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "name"
            })
            public static class AssociatedPerson {

                /**
				 * 
				 */
				public AssociatedPerson() {
					super();
				}

				@XmlElement(required = true)
                protected String name;

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Id {

                /**
				 * 
				 */
				public Id() {
					super();
				}

				@XmlAttribute(name = "extension")
                protected String extension;
                @XmlAttribute(name = "root")
                protected String root;

                /**
                 * Gets the value of the extension property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getExtension() {
                    return extension;
                }

                /**
                 * Sets the value of the extension property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setExtension(String value) {
                    this.extension = value;
                }

                /**
                 * Gets the value of the root property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRoot() {
                    return root;
                }

                /**
                 * Sets the value of the root property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRoot(String value) {
                    this.root = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="id">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="asOrganizationPartOf">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="id">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="wholeOrganization">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "id",
                "name",
                "asOrganizationPartOf"
            })
            public static class ScopingOrganization {

                /**
				 * 
				 */
				public ScopingOrganization() {
					super();
				}


				@XmlElement(required = true)
                protected ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.Id id;
                @XmlElement(required = true)
                protected String name;
                @XmlElement(required = true)
                protected ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf asOrganizationPartOf;

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.Id }
                 *     
                 */
                public ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.Id getId() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.Id }
                 *     
                 */
                public void setId(ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.Id value) {
                    this.id = value;
                }

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the asOrganizationPartOf property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf }
                 *     
                 */
                public ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf getAsOrganizationPartOf() {
                    return asOrganizationPartOf;
                }

                /**
                 * Sets the value of the asOrganizationPartOf property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf }
                 *     
                 */
                public void setAsOrganizationPartOf(ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf value) {
                    this.asOrganizationPartOf = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="id">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="wholeOrganization">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "id",
                    "wholeOrganization"
                })
                public static class AsOrganizationPartOf {

                    /**
					 * 
					 */
					public AsOrganizationPartOf() {
						super();
					}


					@XmlElement(required = true)
                    protected ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf.Id id;
                    @XmlElement(required = true)
                    protected ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf.WholeOrganization wholeOrganization;

                    /**
                     * Gets the value of the id property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf.Id }
                     *     
                     */
                    public ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf.Id getId() {
                        return id;
                    }

                    /**
                     * Sets the value of the id property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf.Id }
                     *     
                     */
                    public void setId(ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf.Id value) {
                        this.id = value;
                    }

                    /**
                     * Gets the value of the wholeOrganization property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf.WholeOrganization }
                     *     
                     */
                    public ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf.WholeOrganization getWholeOrganization() {
                        return wholeOrganization;
                    }

                    /**
                     * Sets the value of the wholeOrganization property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf.WholeOrganization }
                     *     
                     */
                    public void setWholeOrganization(ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf.WholeOrganization value) {
                        this.wholeOrganization = value;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Id {

                        /**
						 * 
						 */
						public Id() {
							super();
						}

						@XmlAttribute(name = "root")
                        protected String root;

                        /**
                         * Gets the value of the root property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getRoot() {
                            return root;
                        }

                        /**
                         * Sets the value of the root property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setRoot(String value) {
                            this.root = value;
                        }

                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "name"
                    })
                    public static class WholeOrganization {

                        /**
						 * 
						 */
						public WholeOrganization() {
							super();
						}

						@XmlElement(required = true)
                        protected String name;

                        /**
                         * Gets the value of the name property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getName() {
                            return name;
                        }

                        /**
                         * Sets the value of the name property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setName(String value) {
                            this.name = value;
                        }

                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Id {

                    /**
					 * 
					 */
					public Id() {
						super();
					}

					@XmlAttribute(name = "root")
                    protected String root;
                    @XmlAttribute(name = "extension")
                    protected String extension;

                    /**
                     * Gets the value of the root property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRoot() {
                        return root;
                    }

                    /**
                     * Sets the value of the root property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRoot(String value) {
                        this.root = value;
                    }

                    /**
                     * Gets the value of the extension property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getExtension() {
                        return extension;
                    }

                    /**
                     * Sets the value of the extension property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setExtension(String value) {
                        this.extension = value;
                    }

                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RealmCode {

		/**
		 * 
		 */
		public RealmCode() {
			super();
		}

		@XmlAttribute(name = "code")
        protected String code;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

		/**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="patientRole">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="id" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="addr">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="streetAddressLine" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="county" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="additionalLocator" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="telecom">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="patient">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="name">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="family" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *                                       &lt;element name="given" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="administrativeGenderCode">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="birthTime">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="providerOrganization">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="id">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="standardIndustryClassCode">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="asOrganizationPartOf">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="id">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="code">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                               &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="wholeOrganization">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="id">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="telecom">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="addr">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="streetAddressLine" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                           &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                           &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                           &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "patientRole"
    })
    public static class RecordTarget {

        /**
		 * 
		 */
		public RecordTarget() {
			super();
		}


		@XmlElement(required = true)
        protected ReportDischarge.RecordTarget.PatientRole patientRole;

        /**
         * Gets the value of the patientRole property.
         * 
         * @return
         *     possible object is
         *     {@link ReportDischarge.RecordTarget.PatientRole }
         *     
         */
        public ReportDischarge.RecordTarget.PatientRole getPatientRole() {
            return patientRole;
        }

        /**
         * Sets the value of the patientRole property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReportDischarge.RecordTarget.PatientRole }
         *     
         */
        public void setPatientRole(ReportDischarge.RecordTarget.PatientRole value) {
            this.patientRole = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="id" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="addr">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="streetAddressLine" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="county" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="additionalLocator" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="telecom">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="patient">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="name">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="family" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
         *                             &lt;element name="given" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="administrativeGenderCode">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="birthTime">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="providerOrganization">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="id">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="standardIndustryClassCode">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="asOrganizationPartOf">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="id">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="code">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                                     &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="wholeOrganization">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="id">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="telecom">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="addr">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="streetAddressLine" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                 &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                 &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                 &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "id",
            "addr",
            "telecom",
            "patient",
            "providerOrganization"
        })
        public static class PatientRole {

            /**
			 * 
			 */
			public PatientRole() {
				super();
			}


			@XmlElement(required = true)
            protected List<ReportDischarge.RecordTarget.PatientRole.Id> id;
            @XmlElement(required = true)
            protected ReportDischarge.RecordTarget.PatientRole.Addr addr;
            @XmlElement(required = true)
            protected ReportDischarge.RecordTarget.PatientRole.Telecom telecom;
            @XmlElement(required = true)
            protected ReportDischarge.RecordTarget.PatientRole.Patient patient;
            @XmlElement(required = true)
            protected ReportDischarge.RecordTarget.PatientRole.ProviderOrganization providerOrganization;
            
            /**
             * Gets the value of the id property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the id property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getId().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ReportDischarge.RecordTarget.PatientRole.Id }
             * 
             * 
             */
            public List<ReportDischarge.RecordTarget.PatientRole.Id> getId() {
                if (id == null) {
                    id = new ArrayList<ReportDischarge.RecordTarget.PatientRole.Id>();
                }
                return this.id;
            }

            /**
             * Gets the value of the addr property.
             * 
             * @return
             *     possible object is
             *     {@link ReportDischarge.RecordTarget.PatientRole.Addr }
             *     
             */
            public ReportDischarge.RecordTarget.PatientRole.Addr getAddr() {
                return addr;
            }

            /**
             * Sets the value of the addr property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportDischarge.RecordTarget.PatientRole.Addr }
             *     
             */
            public void setAddr(ReportDischarge.RecordTarget.PatientRole.Addr value) {
                this.addr = value;
            }

            /**
             * Gets the value of the telecom property.
             * 
             * @return
             *     possible object is
             *     {@link ReportDischarge.RecordTarget.PatientRole.Telecom }
             *     
             */
            public ReportDischarge.RecordTarget.PatientRole.Telecom getTelecom() {
                return telecom;
            }

            /**
             * Sets the value of the telecom property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportDischarge.RecordTarget.PatientRole.Telecom }
             *     
             */
            public void setTelecom(ReportDischarge.RecordTarget.PatientRole.Telecom value) {
                this.telecom = value;
            }

            /**
             * Gets the value of the patient property.
             * 
             * @return
             *     possible object is
             *     {@link ReportDischarge.RecordTarget.PatientRole.Patient }
             *     
             */
            public ReportDischarge.RecordTarget.PatientRole.Patient getPatient() {
                return patient;
            }

            /**
             * Sets the value of the patient property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportDischarge.RecordTarget.PatientRole.Patient }
             *     
             */
            public void setPatient(ReportDischarge.RecordTarget.PatientRole.Patient value) {
                this.patient = value;
            }

            /**
             * Gets the value of the providerOrganization property.
             * 
             * @return
             *     possible object is
             *     {@link ReportDischarge.RecordTarget.PatientRole.ProviderOrganization }
             *     
             */
            public ReportDischarge.RecordTarget.PatientRole.ProviderOrganization getProviderOrganization() {
                return providerOrganization;
            }

            /**
             * Sets the value of the providerOrganization property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportDischarge.RecordTarget.PatientRole.ProviderOrganization }
             *     
             */
            public void setProviderOrganization(ReportDischarge.RecordTarget.PatientRole.ProviderOrganization value) {
                this.providerOrganization = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="streetAddressLine" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="county" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="additionalLocator" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *       &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "streetAddressLine",
                "city",
                "state",
                "postalCode",
                "country",
                "county",
                "additionalLocator"
            })
            public static class Addr {

                /**
				 * 
				 */
				public Addr() {
					super();
				}

				@XmlElement(required = true)
                protected String streetAddressLine;
                @XmlElement(required = true)
                protected String city;
                @XmlElement(required = true)
                protected String state;
                protected String postalCode;
                @XmlElement(required = true)
                protected String country;
                @XmlElement(required = true)
                protected String county;
                @XmlElement(required = true)
                protected String additionalLocator;
                @XmlAttribute(name = "use")
                protected String use;

                /**
                 * Gets the value of the streetAddressLine property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStreetAddressLine() {
                    return streetAddressLine;
                }

                /**
                 * Sets the value of the streetAddressLine property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStreetAddressLine(String value) {
                    this.streetAddressLine = value;
                }

                /**
                 * Gets the value of the city property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCity() {
                    return city;
                }

                /**
                 * Sets the value of the city property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCity(String value) {
                    this.city = value;
                }

                /**
                 * Gets the value of the state property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getState() {
                    return state;
                }

                /**
                 * Sets the value of the state property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setState(String value) {
                    this.state = value;
                }

                /**
                 * Gets the value of the postalCode property.
                 * 
                 */
                public String getPostalCode() {
                    return postalCode;
                }

                /**
                 * Sets the value of the postalCode property.
                 * 
                 */
                public void setPostalCode(String value) {
                    this.postalCode = value;
                }

                /**
                 * Gets the value of the country property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCountry() {
                    return country;
                }

                /**
                 * Sets the value of the country property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCountry(String value) {
                    this.country = value;
                }

                /**
                 * Gets the value of the county property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCounty() {
                    return county;
                }

                /**
                 * Sets the value of the county property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCounty(String value) {
                    this.county = value;
                }

                /**
                 * Gets the value of the additionalLocator property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAdditionalLocator() {
                    return additionalLocator;
                }

                /**
                 * Sets the value of the additionalLocator property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAdditionalLocator(String value) {
                    this.additionalLocator = value;
                }

                /**
                 * Gets the value of the use property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUse() {
                    return use;
                }

                /**
                 * Sets the value of the use property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUse(String value) {
                    this.use = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Id {

                /**
				 * 
				 */
				public Id() {
					super();
				}

				@XmlAttribute(name = "extension")
                protected String extension;
                @XmlAttribute(name = "root")
                protected String root;

                /**
                 * Gets the value of the extension property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getExtension() {
                    return extension;
                }

                /**
                 * Sets the value of the extension property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setExtension(String value) {
                    this.extension = value;
                }

                /**
                 * Gets the value of the root property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRoot() {
                    return root;
                }

                /**
                 * Sets the value of the root property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRoot(String value) {
                    this.root = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="name">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="family" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
             *                   &lt;element name="given" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="administrativeGenderCode">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="birthTime">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "name",
                "administrativeGenderCode",
                "birthTime"
            })
            public static class Patient {

                /**
				 * 
				 */
				public Patient() {
					super();
				}


				@XmlElement(required = true)
                protected ReportDischarge.RecordTarget.PatientRole.Patient.Name name;
                @XmlElement(required = true)
                protected ReportDischarge.RecordTarget.PatientRole.Patient.AdministrativeGenderCode administrativeGenderCode;
                @XmlElement(required = true)
                protected ReportDischarge.RecordTarget.PatientRole.Patient.BirthTime birthTime;

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReportDischarge.RecordTarget.PatientRole.Patient.Name }
                 *     
                 */
                public ReportDischarge.RecordTarget.PatientRole.Patient.Name getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReportDischarge.RecordTarget.PatientRole.Patient.Name }
                 *     
                 */
                public void setName(ReportDischarge.RecordTarget.PatientRole.Patient.Name value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the administrativeGenderCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReportDischarge.RecordTarget.PatientRole.Patient.AdministrativeGenderCode }
                 *     
                 */
                public ReportDischarge.RecordTarget.PatientRole.Patient.AdministrativeGenderCode getAdministrativeGenderCode() {
                    return administrativeGenderCode;
                }

                /**
                 * Sets the value of the administrativeGenderCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReportDischarge.RecordTarget.PatientRole.Patient.AdministrativeGenderCode }
                 *     
                 */
                public void setAdministrativeGenderCode(ReportDischarge.RecordTarget.PatientRole.Patient.AdministrativeGenderCode value) {
                    this.administrativeGenderCode = value;
                }

                /**
                 * Gets the value of the birthTime property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReportDischarge.RecordTarget.PatientRole.Patient.BirthTime }
                 *     
                 */
                public ReportDischarge.RecordTarget.PatientRole.Patient.BirthTime getBirthTime() {
                    return birthTime;
                }

                /**
                 * Sets the value of the birthTime property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReportDischarge.RecordTarget.PatientRole.Patient.BirthTime }
                 *     
                 */
                public void setBirthTime(ReportDischarge.RecordTarget.PatientRole.Patient.BirthTime value) {
                    this.birthTime = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class AdministrativeGenderCode {

                    /**
					 * 
					 */
					public AdministrativeGenderCode() {
						super();
					}

					@XmlAttribute(name = "code")
                    protected String code;
                    @XmlAttribute(name = "codeSystem")
                    protected String codeSystem;
                    @XmlAttribute(name = "displayName")
                    protected String displayName;

                    /**
                     * Gets the value of the code property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCode() {
                        return code;
                    }

                    /**
                     * Sets the value of the code property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCode(String value) {
                        this.code = value;
                    }

                    /**
                     * Gets the value of the codeSystem property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeSystem() {
                        return codeSystem;
                    }

                    /**
                     * Sets the value of the codeSystem property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeSystem(String value) {
                        this.codeSystem = value;
                    }

                    /**
                     * Gets the value of the displayName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDisplayName() {
                        return displayName;
                    }

                    /**
                     * Sets the value of the displayName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDisplayName(String value) {
                        this.displayName = value;
                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class BirthTime {

                    /**
					 * 
					 */
					public BirthTime() {
						super();
					}

					@XmlAttribute(name = "value")
                    protected String value;

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="family" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
                 *         &lt;element name="given" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "family",
                    "given"
                })
                public static class Name {

                    /**
					 * 
					 */
					public Name() {
						super();
					}

					@XmlElement(required = true)
                    protected List<String> family;
                    @XmlElement(required = true)
                    protected List<String> given;
                    @XmlAttribute(name = "use")
                    protected String use;

                    /**
                     * Gets the value of the family property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the family property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getFamily().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
                     */
                    public List<String> getFamily() {
                        if (family == null) {
                            family = new ArrayList<String>();
                        }
                        return this.family;
                    }

                    /**
                     * Gets the value of the given property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the given property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getGiven().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
                     */
                    public List<String> getGiven() {
                        if (given == null) {
                            given = new ArrayList<String>();
                        }
                        return this.given;
                    }

                    /**
                     * Gets the value of the use property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUse() {
                        return use;
                    }

                    /**
                     * Sets the value of the use property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUse(String value) {
                        this.use = value;
                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="id">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="standardIndustryClassCode">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="asOrganizationPartOf">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="id">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="code">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                           &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="wholeOrganization">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="id">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="telecom">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="addr">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="streetAddressLine" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                       &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                       &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                       &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "id",
                "name",
                "standardIndustryClassCode",
                "asOrganizationPartOf"
            })
            public static class ProviderOrganization {

                /**
				 * 
				 */
				public ProviderOrganization() {
					super();
				}


				@XmlElement(required = true)
                protected ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.Id id;
                @XmlElement(required = true)
                protected String name;
                @XmlElement(required = true)
                protected ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.StandardIndustryClassCode standardIndustryClassCode;
                @XmlElement(required = true)
                protected ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf asOrganizationPartOf;

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.Id }
                 *     
                 */
                public ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.Id getId() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.Id }
                 *     
                 */
                public void setId(ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.Id value) {
                    this.id = value;
                }

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the standardIndustryClassCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.StandardIndustryClassCode }
                 *     
                 */
                public ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.StandardIndustryClassCode getStandardIndustryClassCode() {
                    return standardIndustryClassCode;
                }

                /**
                 * Sets the value of the standardIndustryClassCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.StandardIndustryClassCode }
                 *     
                 */
                public void setStandardIndustryClassCode(ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.StandardIndustryClassCode value) {
                    this.standardIndustryClassCode = value;
                }

                /**
                 * Gets the value of the asOrganizationPartOf property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf }
                 *     
                 */
                public ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf getAsOrganizationPartOf() {
                    return asOrganizationPartOf;
                }

                /**
                 * Sets the value of the asOrganizationPartOf property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf }
                 *     
                 */
                public void setAsOrganizationPartOf(ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf value) {
                    this.asOrganizationPartOf = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="id">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="code">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *                 &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="wholeOrganization">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="id">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="telecom">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="addr">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="streetAddressLine" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                             &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                             &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                             &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "id",
                    "code",
                    "wholeOrganization"
                })
                public static class AsOrganizationPartOf {

                    /**
					 * 
					 */
					public AsOrganizationPartOf() {
						super();
					}


					@XmlElement(required = true)
                    protected ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.Id id;
                    @XmlElement(required = true)
                    protected ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.Code code;
                    @XmlElement(required = true)
                    protected ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization wholeOrganization;

                    /**
                     * Gets the value of the id property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.Id }
                     *     
                     */
                    public ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.Id getId() {
                        return id;
                    }

                    /**
                     * Sets the value of the id property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.Id }
                     *     
                     */
                    public void setId(ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.Id value) {
                        this.id = value;
                    }

                    /**
                     * Gets the value of the code property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.Code }
                     *     
                     */
                    public ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.Code getCode() {
                        return code;
                    }

                    /**
                     * Sets the value of the code property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.Code }
                     *     
                     */
                    public void setCode(ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.Code value) {
                        this.code = value;
                    }

                    /**
                     * Gets the value of the wholeOrganization property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization }
                     *     
                     */
                    public ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization getWholeOrganization() {
                        return wholeOrganization;
                    }

                    /**
                     * Sets the value of the wholeOrganization property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization }
                     *     
                     */
                    public void setWholeOrganization(ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization value) {
                        this.wholeOrganization = value;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" />
                     *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Code {

                        /**
						 * 
						 */
						public Code() {
							super();
						}

						@XmlAttribute(name = "code")
                        protected Integer code;
                        @XmlAttribute(name = "displayName")
                        protected String displayName;
                        @XmlAttribute(name = "codeSystem")
                        protected String codeSystem;

                        /**
                         * Gets the value of the code property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Integer }
                         *     
                         */
                        public Integer getCode() {
                            return code;
                        }

                        /**
                         * Sets the value of the code property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Integer }
                         *     
                         */
                        public void setCode(Integer value) {
                            this.code = value;
                        }

                        /**
                         * Gets the value of the displayName property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDisplayName() {
                            return displayName;
                        }

                        /**
                         * Sets the value of the displayName property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDisplayName(String value) {
                            this.displayName = value;
                        }

                        /**
                         * Gets the value of the codeSystem property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCodeSystem() {
                            return codeSystem;
                        }

                        /**
                         * Sets the value of the codeSystem property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCodeSystem(String value) {
                            this.codeSystem = value;
                        }

                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Id {

                        /**
						 * 
						 */
						public Id() {
							super();
						}

						@XmlAttribute(name = "root")
                        protected String root;
                        @XmlAttribute(name = "extension")
                        protected String extension;

                        /**
                         * Gets the value of the root property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getRoot() {
                            return root;
                        }

                        /**
                         * Sets the value of the root property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setRoot(String value) {
                            this.root = value;
                        }

                        /**
                         * Gets the value of the extension property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getExtension() {
                            return extension;
                        }

                        /**
                         * Sets the value of the extension property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setExtension(String value) {
                            this.extension = value;
                        }

                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="id">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="telecom">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="addr">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="streetAddressLine" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                   &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                   &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                   &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "id",
                        "name",
                        "telecom",
                        "addr"
                    })
                    public static class WholeOrganization {

                        /**
						 * 
						 */
						public WholeOrganization() {
							super();
						}


						@XmlElement(required = true)
                        protected ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Id id;
                        @XmlElement(required = true)
                        protected String name;
                        @XmlElement(required = true)
                        protected ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Telecom telecom;
                        @XmlElement(required = true)
                        protected ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Addr addr;

                        /**
                         * Gets the value of the id property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Id }
                         *     
                         */
                        public ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Id getId() {
                            return id;
                        }

                        /**
                         * Sets the value of the id property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Id }
                         *     
                         */
                        public void setId(ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Id value) {
                            this.id = value;
                        }

                        /**
                         * Gets the value of the name property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getName() {
                            return name;
                        }

                        /**
                         * Sets the value of the name property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setName(String value) {
                            this.name = value;
                        }

                        /**
                         * Gets the value of the telecom property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Telecom }
                         *     
                         */
                        public ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Telecom getTelecom() {
                            return telecom;
                        }

                        /**
                         * Sets the value of the telecom property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Telecom }
                         *     
                         */
                        public void setTelecom(ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Telecom value) {
                            this.telecom = value;
                        }

                        /**
                         * Gets the value of the addr property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Addr }
                         *     
                         */
                        public ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Addr getAddr() {
                            return addr;
                        }

                        /**
                         * Sets the value of the addr property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Addr }
                         *     
                         */
                        public void setAddr(ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Addr value) {
                            this.addr = value;
                        }


                        /**
                         * <p>Java class for anonymous complex type.
                         * 
                         * <p>The following schema fragment specifies the expected content contained within this class.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;element name="streetAddressLine" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *       &lt;/sequence>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "streetAddressLine",
                            "city",
                            "state",
                            "postalCode"
                        })
                        public static class Addr {

                            /**
							 * 
							 */
							public Addr() {
								super();
							}

							@XmlElement(required = true)
                            protected String streetAddressLine;
                            @XmlElement(required = true)
                            protected String city;
                            @XmlElement(required = true)
                            protected String state;
                            protected String postalCode;

                            /**
                             * Gets the value of the streetAddressLine property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getStreetAddressLine() {
                                return streetAddressLine;
                            }

                            /**
                             * Sets the value of the streetAddressLine property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setStreetAddressLine(String value) {
                                this.streetAddressLine = value;
                            }

                            /**
                             * Gets the value of the city property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getCity() {
                                return city;
                            }

                            /**
                             * Sets the value of the city property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setCity(String value) {
                                this.city = value;
                            }

                            /**
                             * Gets the value of the state property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getState() {
                                return state;
                            }

                            /**
                             * Sets the value of the state property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setState(String value) {
                                this.state = value;
                            }

                            /**
                             * Gets the value of the postalCode property.
                             * 
                             */
                            public String getPostalCode() {
                                return postalCode;
                            }

                            /**
                             * Sets the value of the postalCode property.
                             * 
                             */
                            public void setPostalCode(String value) {
                                this.postalCode = value;
                            }

                        }


                        /**
                         * <p>Java class for anonymous complex type.
                         * 
                         * <p>The following schema fragment specifies the expected content contained within this class.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class Id {

                            /**
							 * 
							 */
							public Id() {
								super();
							}

							@XmlAttribute(name = "root")
                            protected String root;

                            /**
                             * Gets the value of the root property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getRoot() {
                                return root;
                            }

                            /**
                             * Sets the value of the root property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setRoot(String value) {
                                this.root = value;
                            }

                        }


                        /**
                         * <p>Java class for anonymous complex type.
                         * 
                         * <p>The following schema fragment specifies the expected content contained within this class.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class Telecom {

                            /**
							 * 
							 */
							public Telecom() {
								super();
							}

							@XmlAttribute(name = "value")
                            protected String value;

                            /**
                             * Gets the value of the value property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getValue() {
                                return value;
                            }

                            /**
                             * Sets the value of the value property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setValue(String value) {
                                this.value = value;
                            }

                        }

                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Id {

                    /**
					 * 
					 */
					public Id() {
						super();
					}

					@XmlAttribute(name = "root")
                    protected String root;
                    @XmlAttribute(name = "extension")
                    protected String extension;

                    /**
                     * Gets the value of the root property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRoot() {
                        return root;
                    }

                    /**
                     * Sets the value of the root property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRoot(String value) {
                        this.root = value;
                    }

                    /**
                     * Gets the value of the extension property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getExtension() {
                        return extension;
                    }

                    /**
                     * Sets the value of the extension property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setExtension(String value) {
                        this.extension = value;
                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class StandardIndustryClassCode {

                    /**
					 * 
					 */
					public StandardIndustryClassCode() {
						super();
					}

					@XmlAttribute(name = "code")
                    protected Integer code;
                    @XmlAttribute(name = "displayName")
                    protected String displayName;
                    @XmlAttribute(name = "codeSystemName")
                    protected String codeSystemName;

                    /**
                     * Gets the value of the code property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getCode() {
                        return code;
                    }

                    /**
                     * Sets the value of the code property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setCode(Integer value) {
                        this.code = value;
                    }

                    /**
                     * Gets the value of the displayName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDisplayName() {
                        return displayName;
                    }

                    /**
                     * Sets the value of the displayName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDisplayName(String value) {
                        this.displayName = value;
                    }

                    /**
                     * Gets the value of the codeSystemName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeSystemName() {
                        return codeSystemName;
                    }

                    /**
                     * Sets the value of the codeSystemName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeSystemName(String value) {
                        this.codeSystemName = value;
                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Telecom {

            	/**
        		 * 
        		 */
        		public Telecom() {
        			super();
        		}
        		
                @XmlAttribute(name = "value")
                protected String value;
                @XmlAttribute(name = "use")
                protected String use;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the use property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUse() {
                    return use;
                }

                /**
                 * Sets the value of the use property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUse(String value) {
                    this.use = value;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SetId {

		/**
		 * 
		 */
		public SetId() {
			super();
		}

		@XmlAttribute(name = "extension")
        protected String extension;
        @XmlAttribute(name = "root")
        protected String root;

        /**
         * Gets the value of the extension property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExtension() {
            return extension;
        }

        /**
         * Sets the value of the extension property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExtension(String value) {
            this.extension = value;
        }

        /**
         * Gets the value of the root property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoot() {
            return root;
        }

        /**
         * Sets the value of the root property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoot(String value) {
            this.root = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}date" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TemplateId {

        /**
		 * 
		 */
		public TemplateId() {
			super();
		}

		@XmlAttribute(name = "root")
        protected String root;
        @XmlAttribute(name = "extension")
        @XmlSchemaType(name = "date")
        protected String extension;

        /**
         * Gets the value of the root property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoot() {
            return root;
        }

        /**
         * Sets the value of the root property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoot(String value) {
            this.root = value;
        }

        /**
         * Gets the value of the extension property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExtension() {
            return extension;
        }

        /**
         * Sets the value of the extension property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExtension(String value) {
            this.extension = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TypeId {
    	
    	/**
		 * 
		 */
		public TypeId() {
			super();
		}

        @XmlAttribute(name = "root")
        protected String root;
        @XmlAttribute(name = "extension")
        protected String extension;

        /**
         * Gets the value of the root property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoot() {
            return root;
        }

        /**
         * Sets the value of the root property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoot(String value) {
            this.root = value;
        }

        /**
         * Gets the value of the extension property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExtension() {
            return extension;
        }

        /**
         * Sets the value of the extension property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExtension(String value) {
            this.extension = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VersionNumber {

        /**
		 * 
		 */
		public VersionNumber() {
			super();
		}

		@XmlAttribute(name = "value")
        protected String value;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

    }

}
