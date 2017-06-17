//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2016.08.12 a las 10:59:52 AM ART 
//


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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="realmCode"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="typeId"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="templateId" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="id"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="code"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="effectiveTime"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="confidentialityCode"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="languageCode"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="setId"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                 &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="versionNumber"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="recordTarget"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="patientRole"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="id" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                                     &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="addr"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="streetAddressLine" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                                       &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="county" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="additionalLocator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="telecom"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="patient"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="name"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="family" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *                                                 &lt;element name="given" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *                                               &lt;/sequence&gt;
 *                                               &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="administrativeGenderCode"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="birthTime"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="providerOrganization"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="id"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="standardIndustryClassCode"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                                               &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="asOrganizationPartOf"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="id"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                         &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="code"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                                                         &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                         &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="wholeOrganization"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="id"&gt;
 *                                                             &lt;complexType&gt;
 *                                                               &lt;complexContent&gt;
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                   &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                                 &lt;/restriction&gt;
 *                                                               &lt;/complexContent&gt;
 *                                                             &lt;/complexType&gt;
 *                                                           &lt;/element&gt;
 *                                                           &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                           &lt;element name="telecom"&gt;
 *                                                             &lt;complexType&gt;
 *                                                               &lt;complexContent&gt;
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                   &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                                                                 &lt;/restriction&gt;
 *                                                               &lt;/complexContent&gt;
 *                                                             &lt;/complexType&gt;
 *                                                           &lt;/element&gt;
 *                                                           &lt;element name="addr"&gt;
 *                                                             &lt;complexType&gt;
 *                                                               &lt;complexContent&gt;
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                   &lt;sequence&gt;
 *                                                                     &lt;element name="streetAddressLine" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                                     &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                                     &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                                     &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                                                                   &lt;/sequence&gt;
 *                                                                 &lt;/restriction&gt;
 *                                                               &lt;/complexContent&gt;
 *                                                             &lt;/complexType&gt;
 *                                                           &lt;/element&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="author"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="time"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="assignedAuthor"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="id"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                                     &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="code"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="telecom"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="assignedPerson"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="name"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="family" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *                                                 &lt;element name="given" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="custodian"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="assignedCustodian"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="representedCustodianOrganization"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="id"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="participant" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="associatedEntity"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="id"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                                     &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="associatedPerson"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="scopingOrganization"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="id"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="asOrganizationPartOf"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="id"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="wholeOrganization"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="inFulfillmentOf"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="order"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="id"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="code"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="documentationOf"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="serviceEvent"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="id"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="code"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="effectiveTime"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="center"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="performer"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="functionCode"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="assignedEntity"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                                                 &lt;element name="assignedPerson"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="name"&gt;
 *                                                             &lt;complexType&gt;
 *                                                               &lt;complexContent&gt;
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                   &lt;sequence&gt;
 *                                                                     &lt;element name="family" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                                     &lt;element name="given" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                                   &lt;/sequence&gt;
 *                                                                 &lt;/restriction&gt;
 *                                                               &lt;/complexContent&gt;
 *                                                             &lt;/complexType&gt;
 *                                                           &lt;/element&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="componentOf"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="encompassingEncounter"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="id"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                                     &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="code"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="effectiveTime"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="low"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="high"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="component"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="structuredBody"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="component" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="section"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="templateId"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                         &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="code"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                         &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                         &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                         &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="text"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
    "inFulfillmentOf",
    "documentationOf",
    "componentOf",
    "component"
})
@XmlRootElement(name = "ClinicalDocument")
public class ReportStudyPathologicalAnatomy {

    @XmlElement(required = true)
    protected ReportStudyPathologicalAnatomy.RealmCode realmCode;
    @XmlElement(required = true)
    protected ReportStudyPathologicalAnatomy.TypeId typeId;
    @XmlElement(required = true)
    protected List<ReportStudyPathologicalAnatomy.TemplateId> templateId;
    @XmlElement(required = true)
    protected ReportStudyPathologicalAnatomy.Id id;
    @XmlElement(required = true)
    protected ReportStudyPathologicalAnatomy.Code code;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected ReportStudyPathologicalAnatomy.EffectiveTime effectiveTime;
    @XmlElement(required = true)
    protected ReportStudyPathologicalAnatomy.ConfidentialityCode confidentialityCode;
    @XmlElement(required = true)
    protected ReportStudyPathologicalAnatomy.LanguageCode languageCode;
    @XmlElement(required = true)
    protected ReportStudyPathologicalAnatomy.SetId setId;
    @XmlElement(required = true)
    protected ReportStudyPathologicalAnatomy.VersionNumber versionNumber;
    @XmlElement(required = true)
    protected ReportStudyPathologicalAnatomy.RecordTarget recordTarget;
    @XmlElement(required = true)
    protected ReportStudyPathologicalAnatomy.Author author;
    @XmlElement(required = true)
    protected ReportStudyPathologicalAnatomy.Custodian custodian;
    @XmlElement(required = true)
    protected List<ReportStudyPathologicalAnatomy.Participant> participant;
    @XmlElement(required = true)
    protected ReportStudyPathologicalAnatomy.InFulfillmentOf inFulfillmentOf;
    @XmlElement(required = true)
    protected ReportStudyPathologicalAnatomy.DocumentationOf documentationOf;
    @XmlElement(required = true)
    protected ReportStudyPathologicalAnatomy.ComponentOf componentOf;
    @XmlElement(required = true)
    protected ReportStudyPathologicalAnatomy.Components component;

    /**
     * Obtiene el valor de la propiedad realmCode.
     * 
     * @return
     *     possible object is
     *     {@link ReportStudyPathologicalAnatomy.RealmCode }
     *     
     */
    public ReportStudyPathologicalAnatomy.RealmCode getRealmCode() {
        return realmCode;
    }

    /**
     * Define el valor de la propiedad realmCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportStudyPathologicalAnatomy.RealmCode }
     *     
     */
    public void setRealmCode(ReportStudyPathologicalAnatomy.RealmCode value) {
        this.realmCode = value;
    }

    /**
     * Obtiene el valor de la propiedad typeId.
     * 
     * @return
     *     possible object is
     *     {@link ReportStudyPathologicalAnatomy.TypeId }
     *     
     */
    public ReportStudyPathologicalAnatomy.TypeId getTypeId() {
        return typeId;
    }

    /**
     * Define el valor de la propiedad typeId.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportStudyPathologicalAnatomy.TypeId }
     *     
     */
    public void setTypeId(ReportStudyPathologicalAnatomy.TypeId value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the templateId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the templateId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplateId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportStudyPathologicalAnatomy.TemplateId }
     * 
     * 
     */
    public List<ReportStudyPathologicalAnatomy.TemplateId> getTemplateId() {
        if (templateId == null) {
            templateId = new ArrayList<ReportStudyPathologicalAnatomy.TemplateId>();
        }
        return this.templateId;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link ReportStudyPathologicalAnatomy.Id }
     *     
     */
    public ReportStudyPathologicalAnatomy.Id getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportStudyPathologicalAnatomy.Id }
     *     
     */
    public void setId(ReportStudyPathologicalAnatomy.Id value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad code.
     * 
     * @return
     *     possible object is
     *     {@link ReportStudyPathologicalAnatomy.Code }
     *     
     */
    public ReportStudyPathologicalAnatomy.Code getCode() {
        return code;
    }

    /**
     * Define el valor de la propiedad code.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportStudyPathologicalAnatomy.Code }
     *     
     */
    public void setCode(ReportStudyPathologicalAnatomy.Code value) {
        this.code = value;
    }

    /**
     * Obtiene el valor de la propiedad title.
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
     * Define el valor de la propiedad title.
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
     * Obtiene el valor de la propiedad effectiveTime.
     * 
     * @return
     *     possible object is
     *     {@link ReportStudyPathologicalAnatomy.EffectiveTime }
     *     
     */
    public ReportStudyPathologicalAnatomy.EffectiveTime getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * Define el valor de la propiedad effectiveTime.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportStudyPathologicalAnatomy.EffectiveTime }
     *     
     */
    public void setEffectiveTime(ReportStudyPathologicalAnatomy.EffectiveTime value) {
        this.effectiveTime = value;
    }

    /**
     * Obtiene el valor de la propiedad confidentialityCode.
     * 
     * @return
     *     possible object is
     *     {@link ReportStudyPathologicalAnatomy.ConfidentialityCode }
     *     
     */
    public ReportStudyPathologicalAnatomy.ConfidentialityCode getConfidentialityCode() {
        return confidentialityCode;
    }

    /**
     * Define el valor de la propiedad confidentialityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportStudyPathologicalAnatomy.ConfidentialityCode }
     *     
     */
    public void setConfidentialityCode(ReportStudyPathologicalAnatomy.ConfidentialityCode value) {
        this.confidentialityCode = value;
    }

    /**
     * Obtiene el valor de la propiedad languageCode.
     * 
     * @return
     *     possible object is
     *     {@link ReportStudyPathologicalAnatomy.LanguageCode }
     *     
     */
    public ReportStudyPathologicalAnatomy.LanguageCode getLanguageCode() {
        return languageCode;
    }

    /**
     * Define el valor de la propiedad languageCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportStudyPathologicalAnatomy.LanguageCode }
     *     
     */
    public void setLanguageCode(ReportStudyPathologicalAnatomy.LanguageCode value) {
        this.languageCode = value;
    }

    /**
     * Obtiene el valor de la propiedad setId.
     * 
     * @return
     *     possible object is
     *     {@link ReportStudyPathologicalAnatomy.SetId }
     *     
     */
    public ReportStudyPathologicalAnatomy.SetId getSetId() {
        return setId;
    }

    /**
     * Define el valor de la propiedad setId.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportStudyPathologicalAnatomy.SetId }
     *     
     */
    public void setSetId(ReportStudyPathologicalAnatomy.SetId value) {
        this.setId = value;
    }

    /**
     * Obtiene el valor de la propiedad versionNumber.
     * 
     * @return
     *     possible object is
     *     {@link ReportStudyPathologicalAnatomy.VersionNumber }
     *     
     */
    public ReportStudyPathologicalAnatomy.VersionNumber getVersionNumber() {
        return versionNumber;
    }

    /**
     * Define el valor de la propiedad versionNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportStudyPathologicalAnatomy.VersionNumber }
     *     
     */
    public void setVersionNumber(ReportStudyPathologicalAnatomy.VersionNumber value) {
        this.versionNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad recordTarget.
     * 
     * @return
     *     possible object is
     *     {@link ReportStudyPathologicalAnatomy.RecordTarget }
     *     
     */
    public ReportStudyPathologicalAnatomy.RecordTarget getRecordTarget() {
        return recordTarget;
    }

    /**
     * Define el valor de la propiedad recordTarget.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportStudyPathologicalAnatomy.RecordTarget }
     *     
     */
    public void setRecordTarget(ReportStudyPathologicalAnatomy.RecordTarget value) {
        this.recordTarget = value;
    }

    /**
     * Obtiene el valor de la propiedad author.
     * 
     * @return
     *     possible object is
     *     {@link ReportStudyPathologicalAnatomy.Author }
     *     
     */
    public ReportStudyPathologicalAnatomy.Author getAuthor() {
        return author;
    }

    /**
     * Define el valor de la propiedad author.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportStudyPathologicalAnatomy.Author }
     *     
     */
    public void setAuthor(ReportStudyPathologicalAnatomy.Author value) {
        this.author = value;
    }

    /**
     * Obtiene el valor de la propiedad custodian.
     * 
     * @return
     *     possible object is
     *     {@link ReportStudyPathologicalAnatomy.Custodian }
     *     
     */
    public ReportStudyPathologicalAnatomy.Custodian getCustodian() {
        return custodian;
    }

    /**
     * Define el valor de la propiedad custodian.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportStudyPathologicalAnatomy.Custodian }
     *     
     */
    public void setCustodian(ReportStudyPathologicalAnatomy.Custodian value) {
        this.custodian = value;
    }

    /**
     * Gets the value of the participant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportStudyPathologicalAnatomy.Participant }
     * 
     * 
     */
    public List<ReportStudyPathologicalAnatomy.Participant> getParticipant() {
        if (participant == null) {
            participant = new ArrayList<ReportStudyPathologicalAnatomy.Participant>();
        }
        return this.participant;
    }

    /**
     * Obtiene el valor de la propiedad inFulfillmentOf.
     * 
     * @return
     *     possible object is
     *     {@link ReportStudyPathologicalAnatomy.InFulfillmentOf }
     *     
     */
    public ReportStudyPathologicalAnatomy.InFulfillmentOf getInFulfillmentOf() {
        return inFulfillmentOf;
    }

    /**
     * Define el valor de la propiedad inFulfillmentOf.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportStudyPathologicalAnatomy.InFulfillmentOf }
     *     
     */
    public void setInFulfillmentOf(ReportStudyPathologicalAnatomy.InFulfillmentOf value) {
        this.inFulfillmentOf = value;
    }

    /**
     * Obtiene el valor de la propiedad documentationOf.
     * 
     * @return
     *     possible object is
     *     {@link ReportStudyPathologicalAnatomy.DocumentationOf }
     *     
     */
    public ReportStudyPathologicalAnatomy.DocumentationOf getDocumentationOf() {
        return documentationOf;
    }

    /**
     * Define el valor de la propiedad documentationOf.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportStudyPathologicalAnatomy.DocumentationOf }
     *     
     */
    public void setDocumentationOf(ReportStudyPathologicalAnatomy.DocumentationOf value) {
        this.documentationOf = value;
    }

    /**
     * Obtiene el valor de la propiedad componentOf.
     * 
     * @return
     *     possible object is
     *     {@link ReportStudyPathologicalAnatomy.ComponentOf }
     *     
     */
    public ReportStudyPathologicalAnatomy.ComponentOf getComponentOf() {
        return componentOf;
    }

    /**
     * Define el valor de la propiedad componentOf.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportStudyPathologicalAnatomy.ComponentOf }
     *     
     */
    public void setComponentOf(ReportStudyPathologicalAnatomy.ComponentOf value) {
        this.componentOf = value;
    }

    /**
     * Obtiene el valor de la propiedad component.
     * 
     * @return
     *     possible object is
     *     {@link ReportStudyPathologicalAnatomy.Components }
     *     
     */
    public ReportStudyPathologicalAnatomy.Components getComponent() {
        return component;
    }

    /**
     * Define el valor de la propiedad component.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportStudyPathologicalAnatomy.Components }
     *     
     */
    public void setComponent(ReportStudyPathologicalAnatomy.Components value) {
        this.component = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="time"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="assignedAuthor"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="id"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                           &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="code"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="telecom"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="assignedPerson"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="name"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="family" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
     *                                       &lt;element name="given" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
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

        @XmlElement(required = true)
        protected ReportStudyPathologicalAnatomy.Author.Time time;
        @XmlElement(required = true)
        protected ReportStudyPathologicalAnatomy.Author.AssignedAuthor assignedAuthor;

        /**
         * Obtiene el valor de la propiedad time.
         * 
         * @return
         *     possible object is
         *     {@link ReportStudyPathologicalAnatomy.Author.Time }
         *     
         */
        public ReportStudyPathologicalAnatomy.Author.Time getTime() {
            return time;
        }

        /**
         * Define el valor de la propiedad time.
         * 
         * @param value
         *     allowed object is
         *     {@link ReportStudyPathologicalAnatomy.Author.Time }
         *     
         */
        public void setTime(ReportStudyPathologicalAnatomy.Author.Time value) {
            this.time = value;
        }

        /**
         * Obtiene el valor de la propiedad assignedAuthor.
         * 
         * @return
         *     possible object is
         *     {@link ReportStudyPathologicalAnatomy.Author.AssignedAuthor }
         *     
         */
        public ReportStudyPathologicalAnatomy.Author.AssignedAuthor getAssignedAuthor() {
            return assignedAuthor;
        }

        /**
         * Define el valor de la propiedad assignedAuthor.
         * 
         * @param value
         *     allowed object is
         *     {@link ReportStudyPathologicalAnatomy.Author.AssignedAuthor }
         *     
         */
        public void setAssignedAuthor(ReportStudyPathologicalAnatomy.Author.AssignedAuthor value) {
            this.assignedAuthor = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="id"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *                 &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="code"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="telecom"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="assignedPerson"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="name"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="family" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
         *                             &lt;element name="given" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
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

            @XmlElement(required = true)
            protected ReportStudyPathologicalAnatomy.Author.AssignedAuthor.Id id;
            @XmlElement(required = true)
            protected ReportStudyPathologicalAnatomy.Author.AssignedAuthor.Code code;
            @XmlElement(required = true)
            protected ReportStudyPathologicalAnatomy.Author.AssignedAuthor.Telecom telecom;
            @XmlElement(required = true)
            protected ReportStudyPathologicalAnatomy.Author.AssignedAuthor.AssignedPerson assignedPerson;

            /**
             * Obtiene el valor de la propiedad id.
             * 
             * @return
             *     possible object is
             *     {@link ReportStudyPathologicalAnatomy.Author.AssignedAuthor.Id }
             *     
             */
            public ReportStudyPathologicalAnatomy.Author.AssignedAuthor.Id getId() {
                return id;
            }

            /**
             * Define el valor de la propiedad id.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportStudyPathologicalAnatomy.Author.AssignedAuthor.Id }
             *     
             */
            public void setId(ReportStudyPathologicalAnatomy.Author.AssignedAuthor.Id value) {
                this.id = value;
            }

            /**
             * Obtiene el valor de la propiedad code.
             * 
             * @return
             *     possible object is
             *     {@link ReportStudyPathologicalAnatomy.Author.AssignedAuthor.Code }
             *     
             */
            public ReportStudyPathologicalAnatomy.Author.AssignedAuthor.Code getCode() {
                return code;
            }

            /**
             * Define el valor de la propiedad code.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportStudyPathologicalAnatomy.Author.AssignedAuthor.Code }
             *     
             */
            public void setCode(ReportStudyPathologicalAnatomy.Author.AssignedAuthor.Code value) {
                this.code = value;
            }

            /**
             * Obtiene el valor de la propiedad telecom.
             * 
             * @return
             *     possible object is
             *     {@link ReportStudyPathologicalAnatomy.Author.AssignedAuthor.Telecom }
             *     
             */
            public ReportStudyPathologicalAnatomy.Author.AssignedAuthor.Telecom getTelecom() {
                return telecom;
            }

            /**
             * Define el valor de la propiedad telecom.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportStudyPathologicalAnatomy.Author.AssignedAuthor.Telecom }
             *     
             */
            public void setTelecom(ReportStudyPathologicalAnatomy.Author.AssignedAuthor.Telecom value) {
                this.telecom = value;
            }

            /**
             * Obtiene el valor de la propiedad assignedPerson.
             * 
             * @return
             *     possible object is
             *     {@link ReportStudyPathologicalAnatomy.Author.AssignedAuthor.AssignedPerson }
             *     
             */
            public ReportStudyPathologicalAnatomy.Author.AssignedAuthor.AssignedPerson getAssignedPerson() {
                return assignedPerson;
            }

            /**
             * Define el valor de la propiedad assignedPerson.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportStudyPathologicalAnatomy.Author.AssignedAuthor.AssignedPerson }
             *     
             */
            public void setAssignedPerson(ReportStudyPathologicalAnatomy.Author.AssignedAuthor.AssignedPerson value) {
                this.assignedPerson = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="name"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="family" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
             *                   &lt;element name="given" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "name"
            })
            public static class AssignedPerson {

                @XmlElement(required = true)
                protected ReportStudyPathologicalAnatomy.Author.AssignedAuthor.AssignedPerson.Name name;

                /**
                 * Obtiene el valor de la propiedad name.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReportStudyPathologicalAnatomy.Author.AssignedAuthor.AssignedPerson.Name }
                 *     
                 */
                public ReportStudyPathologicalAnatomy.Author.AssignedAuthor.AssignedPerson.Name getName() {
                    return name;
                }

                /**
                 * Define el valor de la propiedad name.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReportStudyPathologicalAnatomy.Author.AssignedAuthor.AssignedPerson.Name }
                 *     
                 */
                public void setName(ReportStudyPathologicalAnatomy.Author.AssignedAuthor.AssignedPerson.Name value) {
                    this.name = value;
                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="family" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
                 *         &lt;element name="given" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
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
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Code {

                @XmlAttribute(name = "code")
                protected String code;
                @XmlAttribute(name = "codeSystem")
                protected String codeSystem;
                @XmlAttribute(name = "displayName")
                protected String displayName;

                /**
                 * Obtiene el valor de la propiedad code.
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
                 * Define el valor de la propiedad code.
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
                 * Obtiene el valor de la propiedad codeSystem.
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
                 * Define el valor de la propiedad codeSystem.
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
                 * Obtiene el valor de la propiedad displayName.
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
                 * Define el valor de la propiedad displayName.
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
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *       &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Id {

                @XmlAttribute(name = "extension")
                protected Integer extension;
                @XmlAttribute(name = "root")
                protected String root;

                /**
                 * Obtiene el valor de la propiedad extension.
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
                 * Define el valor de la propiedad extension.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setExtension(Integer value) {
                    this.extension = value;
                }

                /**
                 * Obtiene el valor de la propiedad root.
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
                 * Define el valor de la propiedad root.
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
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Telecom {

                @XmlAttribute(name = "use")
                protected String use;
                @XmlAttribute(name = "value")
                protected String value;

                /**
                 * Obtiene el valor de la propiedad use.
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
                 * Define el valor de la propiedad use.
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
                 * Obtiene el valor de la propiedad value.
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
                 * Define el valor de la propiedad value.
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
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Time {

            @XmlAttribute(name = "value")
            protected String value;

            /**
             * Obtiene el valor de la propiedad value.
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
             * Define el valor de la propiedad value.
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
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Code {

        @XmlAttribute(name = "codeSystem")
        protected String codeSystem;
        @XmlAttribute(name = "codeSystemName")
        protected String codeSystemName;
        @XmlAttribute(name = "code")
        protected String code;
        @XmlAttribute(name = "displayName")
        protected String displayName;

        /**
         * Obtiene el valor de la propiedad codeSystem.
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
         * Define el valor de la propiedad codeSystem.
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
         * Obtiene el valor de la propiedad codeSystemName.
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
         * Define el valor de la propiedad codeSystemName.
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
         * Obtiene el valor de la propiedad code.
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
         * Define el valor de la propiedad code.
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
         * Obtiene el valor de la propiedad displayName.
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
         * Define el valor de la propiedad displayName.
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
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="structuredBody"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="component" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="section"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="templateId"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                               &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="code"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                               &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                               &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                               &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="text"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "structuredBody"
    })
    public static class Components {

        @XmlElement(required = true)
        protected ReportStudyPathologicalAnatomy.Components.StructuredBody structuredBody;

        /**
         * Obtiene el valor de la propiedad structuredBody.
         * 
         * @return
         *     possible object is
         *     {@link ReportStudyPathologicalAnatomy.Components.StructuredBody }
         *     
         */
        public ReportStudyPathologicalAnatomy.Components.StructuredBody getStructuredBody() {
            return structuredBody;
        }

        /**
         * Define el valor de la propiedad structuredBody.
         * 
         * @param value
         *     allowed object is
         *     {@link ReportStudyPathologicalAnatomy.Components.StructuredBody }
         *     
         */
        public void setStructuredBody(ReportStudyPathologicalAnatomy.Components.StructuredBody value) {
            this.structuredBody = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="component" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="section"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="templateId"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                                     &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="code"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                                     &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                                     &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                                     &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="text"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "component"
        })
        public static class StructuredBody {

            @XmlElement(required = true)
            protected List<ReportStudyPathologicalAnatomy.Components.StructuredBody.Component> component;

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
             * {@link ReportStudyPathologicalAnatomy.Components.StructuredBody.Component }
             * 
             * 
             */
            public List<ReportStudyPathologicalAnatomy.Components.StructuredBody.Component> getComponent() {
                if (component == null) {
                    component = new ArrayList<ReportStudyPathologicalAnatomy.Components.StructuredBody.Component>();
                }
                return this.component;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="section"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="templateId"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                           &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="code"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                           &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                           &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                           &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="text"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                           &lt;/sequence&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "section"
            })
            public static class Component {

                @XmlElement(required = true)
                protected ReportStudyPathologicalAnatomy.Components.StructuredBody.Component.Section section;

                /**
                 * Obtiene el valor de la propiedad section.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReportStudyPathologicalAnatomy.Components.StructuredBody.Component.Section }
                 *     
                 */
                public ReportStudyPathologicalAnatomy.Components.StructuredBody.Component.Section getSection() {
                    return section;
                }

                /**
                 * Define el valor de la propiedad section.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReportStudyPathologicalAnatomy.Components.StructuredBody.Component.Section }
                 *     
                 */
                public void setSection(ReportStudyPathologicalAnatomy.Components.StructuredBody.Component.Section value) {
                    this.section = value;
                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="templateId"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *                 &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="code"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *                 &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *                 &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *                 &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="text"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *                 &lt;/sequence&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
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

                    @XmlElement(required = true)
                    protected ReportStudyPathologicalAnatomy.Components.StructuredBody.Component.Section.TemplateId templateId;
                    @XmlElement(required = true)
                    protected ReportStudyPathologicalAnatomy.Components.StructuredBody.Component.Section.Code code;
                    @XmlElement(required = true)
                    protected String title;
                    @XmlElement(required = true)
                    protected ReportStudyPathologicalAnatomy.Components.StructuredBody.Component.Section.Text text;

                    /**
                     * Obtiene el valor de la propiedad templateId.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ReportStudyPathologicalAnatomy.Components.StructuredBody.Component.Section.TemplateId }
                     *     
                     */
                    public ReportStudyPathologicalAnatomy.Components.StructuredBody.Component.Section.TemplateId getTemplateId() {
                        return templateId;
                    }

                    /**
                     * Define el valor de la propiedad templateId.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ReportStudyPathologicalAnatomy.Components.StructuredBody.Component.Section.TemplateId }
                     *     
                     */
                    public void setTemplateId(ReportStudyPathologicalAnatomy.Components.StructuredBody.Component.Section.TemplateId value) {
                        this.templateId = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad code.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ReportStudyPathologicalAnatomy.Components.StructuredBody.Component.Section.Code }
                     *     
                     */
                    public ReportStudyPathologicalAnatomy.Components.StructuredBody.Component.Section.Code getCode() {
                        return code;
                    }

                    /**
                     * Define el valor de la propiedad code.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ReportStudyPathologicalAnatomy.Components.StructuredBody.Component.Section.Code }
                     *     
                     */
                    public void setCode(ReportStudyPathologicalAnatomy.Components.StructuredBody.Component.Section.Code value) {
                        this.code = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad title.
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
                     * Define el valor de la propiedad title.
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
                     * Obtiene el valor de la propiedad text.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ReportStudyPathologicalAnatomy.Components.StructuredBody.Component.Section.Text }
                     *     
                     */
                    public ReportStudyPathologicalAnatomy.Components.StructuredBody.Component.Section.Text getText() {
                        return text;
                    }

                    /**
                     * Define el valor de la propiedad text.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ReportStudyPathologicalAnatomy.Components.StructuredBody.Component.Section.Text }
                     *     
                     */
                    public void setText(ReportStudyPathologicalAnatomy.Components.StructuredBody.Component.Section.Text value) {
                        this.text = value;
                    }


                    /**
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;complexContent&gt;
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                     *       &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                     *       &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                     *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Code {

                        @XmlAttribute(name = "code")
                        protected String code;
                        @XmlAttribute(name = "codeSystem")
                        protected String codeSystem;
                        @XmlAttribute(name = "codeSystemName")
                        protected String codeSystemName;
                        @XmlAttribute(name = "displayName")
                        protected String displayName;

                        /**
                         * Obtiene el valor de la propiedad code.
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
                         * Define el valor de la propiedad code.
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
                         * Obtiene el valor de la propiedad codeSystem.
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
                         * Define el valor de la propiedad codeSystem.
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
                         * Obtiene el valor de la propiedad codeSystemName.
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
                         * Define el valor de la propiedad codeSystemName.
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
                         * Obtiene el valor de la propiedad displayName.
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
                         * Define el valor de la propiedad displayName.
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
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;complexContent&gt;
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *       &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                     *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class TemplateId {

                        @XmlAttribute(name = "root")
                        protected String root;
                        @XmlAttribute(name = "extension")
                        @XmlSchemaType(name = "date")
                        protected XMLGregorianCalendar extension;

                        /**
                         * Obtiene el valor de la propiedad root.
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
                         * Define el valor de la propiedad root.
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
                         * Obtiene el valor de la propiedad extension.
                         * 
                         * @return
                         *     possible object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public XMLGregorianCalendar getExtension() {
                            return extension;
                        }

                        /**
                         * Define el valor de la propiedad extension.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public void setExtension(XMLGregorianCalendar value) {
                            this.extension = value;
                        }

                    }


                    /**
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;complexContent&gt;
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *       &lt;sequence&gt;
                     *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                     *       &lt;/sequence&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "content"
                    })
                    public static class Text {

                        @XmlElement(required = true)
                        protected String content;

                        /**
                         * Obtiene el valor de la propiedad content.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getContent() {
                            return content;
                        }

                        /**
                         * Define el valor de la propiedad content.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setContent(String value) {
                            this.content = value;
                        }

                    }

                }

            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="encompassingEncounter"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="id"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                           &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="code"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="effectiveTime"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="low"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="high"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "encompassingEncounter"
    })
    public static class ComponentOf {

        @XmlElement(required = true)
        protected ReportStudyPathologicalAnatomy.ComponentOf.EncompassingEncounter encompassingEncounter;

        /**
         * Obtiene el valor de la propiedad encompassingEncounter.
         * 
         * @return
         *     possible object is
         *     {@link ReportStudyPathologicalAnatomy.ComponentOf.EncompassingEncounter }
         *     
         */
        public ReportStudyPathologicalAnatomy.ComponentOf.EncompassingEncounter getEncompassingEncounter() {
            return encompassingEncounter;
        }

        /**
         * Define el valor de la propiedad encompassingEncounter.
         * 
         * @param value
         *     allowed object is
         *     {@link ReportStudyPathologicalAnatomy.ComponentOf.EncompassingEncounter }
         *     
         */
        public void setEncompassingEncounter(ReportStudyPathologicalAnatomy.ComponentOf.EncompassingEncounter value) {
            this.encompassingEncounter = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="id"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *                 &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="code"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="effectiveTime"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="low"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="high"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "id",
            "code",
            "effectiveTime"
        })
        public static class EncompassingEncounter {

            @XmlElement(required = true)
            protected ReportStudyPathologicalAnatomy.ComponentOf.EncompassingEncounter.Id id;
            @XmlElement(required = true)
            protected ReportStudyPathologicalAnatomy.ComponentOf.EncompassingEncounter.Code code;
            @XmlElement(required = true)
            protected ReportStudyPathologicalAnatomy.ComponentOf.EncompassingEncounter.EffectiveTime effectiveTime;

            /**
             * Obtiene el valor de la propiedad id.
             * 
             * @return
             *     possible object is
             *     {@link ReportStudyPathologicalAnatomy.ComponentOf.EncompassingEncounter.Id }
             *     
             */
            public ReportStudyPathologicalAnatomy.ComponentOf.EncompassingEncounter.Id getId() {
                return id;
            }

            /**
             * Define el valor de la propiedad id.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportStudyPathologicalAnatomy.ComponentOf.EncompassingEncounter.Id }
             *     
             */
            public void setId(ReportStudyPathologicalAnatomy.ComponentOf.EncompassingEncounter.Id value) {
                this.id = value;
            }

            /**
             * Obtiene el valor de la propiedad code.
             * 
             * @return
             *     possible object is
             *     {@link ReportStudyPathologicalAnatomy.ComponentOf.EncompassingEncounter.Code }
             *     
             */
            public ReportStudyPathologicalAnatomy.ComponentOf.EncompassingEncounter.Code getCode() {
                return code;
            }

            /**
             * Define el valor de la propiedad code.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportStudyPathologicalAnatomy.ComponentOf.EncompassingEncounter.Code }
             *     
             */
            public void setCode(ReportStudyPathologicalAnatomy.ComponentOf.EncompassingEncounter.Code value) {
                this.code = value;
            }

            /**
             * Obtiene el valor de la propiedad effectiveTime.
             * 
             * @return
             *     possible object is
             *     {@link ReportStudyPathologicalAnatomy.ComponentOf.EncompassingEncounter.EffectiveTime }
             *     
             */
            public ReportStudyPathologicalAnatomy.ComponentOf.EncompassingEncounter.EffectiveTime getEffectiveTime() {
                return effectiveTime;
            }

            /**
             * Define el valor de la propiedad effectiveTime.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportStudyPathologicalAnatomy.ComponentOf.EncompassingEncounter.EffectiveTime }
             *     
             */
            public void setEffectiveTime(ReportStudyPathologicalAnatomy.ComponentOf.EncompassingEncounter.EffectiveTime value) {
                this.effectiveTime = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Code {

                @XmlAttribute(name = "codeSystem")
                protected String codeSystem;
                @XmlAttribute(name = "codeSystemName")
                protected String codeSystemName;
                @XmlAttribute(name = "code")
                protected String code;
                @XmlAttribute(name = "displayName")
                protected String displayName;

                /**
                 * Obtiene el valor de la propiedad codeSystem.
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
                 * Define el valor de la propiedad codeSystem.
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
                 * Obtiene el valor de la propiedad codeSystemName.
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
                 * Define el valor de la propiedad codeSystemName.
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
                 * Obtiene el valor de la propiedad code.
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
                 * Define el valor de la propiedad code.
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
                 * Obtiene el valor de la propiedad displayName.
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
                 * Define el valor de la propiedad displayName.
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
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="low"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="high"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
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

                @XmlElement(required = true)
                protected ReportStudyPathologicalAnatomy.ComponentOf.EncompassingEncounter.EffectiveTime.Low low;
                @XmlElement(required = true)
                protected ReportStudyPathologicalAnatomy.ComponentOf.EncompassingEncounter.EffectiveTime.High high;

                /**
                 * Obtiene el valor de la propiedad low.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReportStudyPathologicalAnatomy.ComponentOf.EncompassingEncounter.EffectiveTime.Low }
                 *     
                 */
                public ReportStudyPathologicalAnatomy.ComponentOf.EncompassingEncounter.EffectiveTime.Low getLow() {
                    return low;
                }

                /**
                 * Define el valor de la propiedad low.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReportStudyPathologicalAnatomy.ComponentOf.EncompassingEncounter.EffectiveTime.Low }
                 *     
                 */
                public void setLow(ReportStudyPathologicalAnatomy.ComponentOf.EncompassingEncounter.EffectiveTime.Low value) {
                    this.low = value;
                }

                /**
                 * Obtiene el valor de la propiedad high.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReportStudyPathologicalAnatomy.ComponentOf.EncompassingEncounter.EffectiveTime.High }
                 *     
                 */
                public ReportStudyPathologicalAnatomy.ComponentOf.EncompassingEncounter.EffectiveTime.High getHigh() {
                    return high;
                }

                /**
                 * Define el valor de la propiedad high.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReportStudyPathologicalAnatomy.ComponentOf.EncompassingEncounter.EffectiveTime.High }
                 *     
                 */
                public void setHigh(ReportStudyPathologicalAnatomy.ComponentOf.EncompassingEncounter.EffectiveTime.High value) {
                    this.high = value;
                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class High {

                    @XmlAttribute(name = "value")
                    protected String value;

                    /**
                     * Obtiene el valor de la propiedad value.
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
                     * Define el valor de la propiedad value.
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
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Low {

                    @XmlAttribute(name = "value")
                    protected String value;

                    /**
                     * Obtiene el valor de la propiedad value.
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
                     * Define el valor de la propiedad value.
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
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *       &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Id {

                @XmlAttribute(name = "extension")
                protected Integer extension;
                @XmlAttribute(name = "root")
                protected String root;

                /**
                 * Obtiene el valor de la propiedad extension.
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
                 * Define el valor de la propiedad extension.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setExtension(Integer value) {
                    this.extension = value;
                }

                /**
                 * Obtiene el valor de la propiedad root.
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
                 * Define el valor de la propiedad root.
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


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ConfidentialityCode {

        @XmlAttribute(name = "code")
        protected String code;
        @XmlAttribute(name = "codeSystem")
        protected String codeSystem;

        /**
         * Obtiene el valor de la propiedad code.
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
         * Define el valor de la propiedad code.
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
         * Obtiene el valor de la propiedad codeSystem.
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
         * Define el valor de la propiedad codeSystem.
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
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="assignedCustodian"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="representedCustodianOrganization"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="id"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "assignedCustodian"
    })
    public static class Custodian {

        @XmlElement(required = true)
        protected ReportStudyPathologicalAnatomy.Custodian.AssignedCustodian assignedCustodian;

        /**
         * Obtiene el valor de la propiedad assignedCustodian.
         * 
         * @return
         *     possible object is
         *     {@link ReportStudyPathologicalAnatomy.Custodian.AssignedCustodian }
         *     
         */
        public ReportStudyPathologicalAnatomy.Custodian.AssignedCustodian getAssignedCustodian() {
            return assignedCustodian;
        }

        /**
         * Define el valor de la propiedad assignedCustodian.
         * 
         * @param value
         *     allowed object is
         *     {@link ReportStudyPathologicalAnatomy.Custodian.AssignedCustodian }
         *     
         */
        public void setAssignedCustodian(ReportStudyPathologicalAnatomy.Custodian.AssignedCustodian value) {
            this.assignedCustodian = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="representedCustodianOrganization"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="id"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "representedCustodianOrganization"
        })
        public static class AssignedCustodian {

            @XmlElement(required = true)
            protected ReportStudyPathologicalAnatomy.Custodian.AssignedCustodian.RepresentedCustodianOrganization representedCustodianOrganization;

            /**
             * Obtiene el valor de la propiedad representedCustodianOrganization.
             * 
             * @return
             *     possible object is
             *     {@link ReportStudyPathologicalAnatomy.Custodian.AssignedCustodian.RepresentedCustodianOrganization }
             *     
             */
            public ReportStudyPathologicalAnatomy.Custodian.AssignedCustodian.RepresentedCustodianOrganization getRepresentedCustodianOrganization() {
                return representedCustodianOrganization;
            }

            /**
             * Define el valor de la propiedad representedCustodianOrganization.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportStudyPathologicalAnatomy.Custodian.AssignedCustodian.RepresentedCustodianOrganization }
             *     
             */
            public void setRepresentedCustodianOrganization(ReportStudyPathologicalAnatomy.Custodian.AssignedCustodian.RepresentedCustodianOrganization value) {
                this.representedCustodianOrganization = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="id"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "id"
            })
            public static class RepresentedCustodianOrganization {

                @XmlElement(required = true)
                protected ReportStudyPathologicalAnatomy.Custodian.AssignedCustodian.RepresentedCustodianOrganization.Id id;

                /**
                 * Obtiene el valor de la propiedad id.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReportStudyPathologicalAnatomy.Custodian.AssignedCustodian.RepresentedCustodianOrganization.Id }
                 *     
                 */
                public ReportStudyPathologicalAnatomy.Custodian.AssignedCustodian.RepresentedCustodianOrganization.Id getId() {
                    return id;
                }

                /**
                 * Define el valor de la propiedad id.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReportStudyPathologicalAnatomy.Custodian.AssignedCustodian.RepresentedCustodianOrganization.Id }
                 *     
                 */
                public void setId(ReportStudyPathologicalAnatomy.Custodian.AssignedCustodian.RepresentedCustodianOrganization.Id value) {
                    this.id = value;
                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Id {

                    @XmlAttribute(name = "root")
                    protected String root;

                    /**
                     * Obtiene el valor de la propiedad root.
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
                     * Define el valor de la propiedad root.
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
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="serviceEvent"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="id"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="code"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="effectiveTime"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="center"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="performer"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="functionCode"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="assignedEntity"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                                       &lt;element name="assignedPerson"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="name"&gt;
     *                                                   &lt;complexType&gt;
     *                                                     &lt;complexContent&gt;
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                         &lt;sequence&gt;
     *                                                           &lt;element name="family" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                                           &lt;element name="given" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                                         &lt;/sequence&gt;
     *                                                       &lt;/restriction&gt;
     *                                                     &lt;/complexContent&gt;
     *                                                   &lt;/complexType&gt;
     *                                                 &lt;/element&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "serviceEvent"
    })
    public static class DocumentationOf {

        @XmlElement(required = true)
        protected ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent serviceEvent;
        @XmlAttribute(name = "typeCode")
        protected String typeCode;

        /**
         * Obtiene el valor de la propiedad serviceEvent.
         * 
         * @return
         *     possible object is
         *     {@link ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent }
         *     
         */
        public ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent getServiceEvent() {
            return serviceEvent;
        }

        /**
         * Define el valor de la propiedad serviceEvent.
         * 
         * @param value
         *     allowed object is
         *     {@link ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent }
         *     
         */
        public void setServiceEvent(ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent value) {
            this.serviceEvent = value;
        }

        /**
         * Obtiene el valor de la propiedad typeCode.
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
         * Define el valor de la propiedad typeCode.
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
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="id"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="code"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="effectiveTime"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="center"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="performer"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="functionCode"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="assignedEntity"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                             &lt;element name="assignedPerson"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="name"&gt;
         *                                         &lt;complexType&gt;
         *                                           &lt;complexContent&gt;
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                               &lt;sequence&gt;
         *                                                 &lt;element name="family" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                                 &lt;element name="given" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                               &lt;/sequence&gt;
         *                                             &lt;/restriction&gt;
         *                                           &lt;/complexContent&gt;
         *                                         &lt;/complexType&gt;
         *                                       &lt;/element&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "id",
            "code",
            "effectiveTime",
            "performer"
        })
        public static class ServiceEvent {

            @XmlElement(required = true)
            protected ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.Id id;
            @XmlElement(required = true)
            protected ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.Code code;
            @XmlElement(required = true)
            protected ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.EffectiveTime effectiveTime;
            @XmlElement(required = true)
            protected ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.Performer performer;
            @XmlAttribute(name = "classCode")
            protected String classCode;

            /**
             * Obtiene el valor de la propiedad id.
             * 
             * @return
             *     possible object is
             *     {@link ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.Id }
             *     
             */
            public ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.Id getId() {
                return id;
            }

            /**
             * Define el valor de la propiedad id.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.Id }
             *     
             */
            public void setId(ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.Id value) {
                this.id = value;
            }

            /**
             * Obtiene el valor de la propiedad code.
             * 
             * @return
             *     possible object is
             *     {@link ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.Code }
             *     
             */
            public ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.Code getCode() {
                return code;
            }

            /**
             * Define el valor de la propiedad code.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.Code }
             *     
             */
            public void setCode(ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.Code value) {
                this.code = value;
            }

            /**
             * Obtiene el valor de la propiedad effectiveTime.
             * 
             * @return
             *     possible object is
             *     {@link ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.EffectiveTime }
             *     
             */
            public ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.EffectiveTime getEffectiveTime() {
                return effectiveTime;
            }

            /**
             * Define el valor de la propiedad effectiveTime.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.EffectiveTime }
             *     
             */
            public void setEffectiveTime(ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.EffectiveTime value) {
                this.effectiveTime = value;
            }

            /**
             * Obtiene el valor de la propiedad performer.
             * 
             * @return
             *     possible object is
             *     {@link ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.Performer }
             *     
             */
            public ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.Performer getPerformer() {
                return performer;
            }

            /**
             * Define el valor de la propiedad performer.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.Performer }
             *     
             */
            public void setPerformer(ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.Performer value) {
                this.performer = value;
            }

            /**
             * Obtiene el valor de la propiedad classCode.
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
             * Define el valor de la propiedad classCode.
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
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Code {

                @XmlAttribute(name = "codeSystem")
                protected String codeSystem;
                @XmlAttribute(name = "codeSystemName")
                protected String codeSystemName;
                @XmlAttribute(name = "code")
                protected String code;
                @XmlAttribute(name = "displayName")
                protected String displayName;

                /**
                 * Obtiene el valor de la propiedad codeSystem.
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
                 * Define el valor de la propiedad codeSystem.
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
                 * Obtiene el valor de la propiedad codeSystemName.
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
                 * Define el valor de la propiedad codeSystemName.
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
                 * Obtiene el valor de la propiedad code.
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
                 * Define el valor de la propiedad code.
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
                 * Obtiene el valor de la propiedad displayName.
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
                 * Define el valor de la propiedad displayName.
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
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="center"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "center"
            })
            public static class EffectiveTime {

                @XmlElement(required = true)
                protected ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.EffectiveTime.Center center;

                /**
                 * Obtiene el valor de la propiedad center.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.EffectiveTime.Center }
                 *     
                 */
                public ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.EffectiveTime.Center getCenter() {
                    return center;
                }

                /**
                 * Define el valor de la propiedad center.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.EffectiveTime.Center }
                 *     
                 */
                public void setCenter(ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.EffectiveTime.Center value) {
                    this.center = value;
                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Center {

                    @XmlAttribute(name = "value")
                    protected Integer value;

                    /**
                     * Obtiene el valor de la propiedad value.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getValue() {
                        return value;
                    }

                    /**
                     * Define el valor de la propiedad value.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setValue(Integer value) {
                        this.value = value;
                    }

                }

            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Id {

                @XmlAttribute(name = "root")
                protected String root;
                @XmlAttribute(name = "extension")
                protected Integer extension;

                /**
                 * Obtiene el valor de la propiedad root.
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
                 * Define el valor de la propiedad root.
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
                 * Obtiene el valor de la propiedad extension.
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
                 * Define el valor de la propiedad extension.
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
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="functionCode"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="assignedEntity"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
             *                   &lt;element name="assignedPerson"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="name"&gt;
             *                               &lt;complexType&gt;
             *                                 &lt;complexContent&gt;
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                     &lt;sequence&gt;
             *                                       &lt;element name="family" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                                       &lt;element name="given" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                                     &lt;/sequence&gt;
             *                                   &lt;/restriction&gt;
             *                                 &lt;/complexContent&gt;
             *                               &lt;/complexType&gt;
             *                             &lt;/element&gt;
             *                           &lt;/sequence&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "functionCode",
                "assignedEntity"
            })
            public static class Performer {

                @XmlElement(required = true)
                protected ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.Performer.FunctionCode functionCode;
                @XmlElement(required = true)
                protected ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.Performer.AssignedEntity assignedEntity;
                @XmlAttribute(name = "typeCode")
                protected String typeCode;

                /**
                 * Obtiene el valor de la propiedad functionCode.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.Performer.FunctionCode }
                 *     
                 */
                public ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.Performer.FunctionCode getFunctionCode() {
                    return functionCode;
                }

                /**
                 * Define el valor de la propiedad functionCode.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.Performer.FunctionCode }
                 *     
                 */
                public void setFunctionCode(ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.Performer.FunctionCode value) {
                    this.functionCode = value;
                }

                /**
                 * Obtiene el valor de la propiedad assignedEntity.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.Performer.AssignedEntity }
                 *     
                 */
                public ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.Performer.AssignedEntity getAssignedEntity() {
                    return assignedEntity;
                }

                /**
                 * Define el valor de la propiedad assignedEntity.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.Performer.AssignedEntity }
                 *     
                 */
                public void setAssignedEntity(ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.Performer.AssignedEntity value) {
                    this.assignedEntity = value;
                }

                /**
                 * Obtiene el valor de la propiedad typeCode.
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
                 * Define el valor de la propiedad typeCode.
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
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
                 *         &lt;element name="assignedPerson"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="name"&gt;
                 *                     &lt;complexType&gt;
                 *                       &lt;complexContent&gt;
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                           &lt;sequence&gt;
                 *                             &lt;element name="family" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *                             &lt;element name="given" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *                           &lt;/sequence&gt;
                 *                         &lt;/restriction&gt;
                 *                       &lt;/complexContent&gt;
                 *                     &lt;/complexType&gt;
                 *                   &lt;/element&gt;
                 *                 &lt;/sequence&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "id",
                    "assignedPerson"
                })
                public static class AssignedEntity {

                    @XmlElement(required = true)
                    protected Object id;
                    @XmlElement(required = true)
                    protected ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.Performer.AssignedEntity.AssignedPerson assignedPerson;

                    /**
                     * Obtiene el valor de la propiedad id.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Object }
                     *     
                     */
                    public Object getId() {
                        return id;
                    }

                    /**
                     * Define el valor de la propiedad id.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Object }
                     *     
                     */
                    public void setId(Object value) {
                        this.id = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad assignedPerson.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.Performer.AssignedEntity.AssignedPerson }
                     *     
                     */
                    public ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.Performer.AssignedEntity.AssignedPerson getAssignedPerson() {
                        return assignedPerson;
                    }

                    /**
                     * Define el valor de la propiedad assignedPerson.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.Performer.AssignedEntity.AssignedPerson }
                     *     
                     */
                    public void setAssignedPerson(ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.Performer.AssignedEntity.AssignedPerson value) {
                        this.assignedPerson = value;
                    }


                    /**
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;complexContent&gt;
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *       &lt;sequence&gt;
                     *         &lt;element name="name"&gt;
                     *           &lt;complexType&gt;
                     *             &lt;complexContent&gt;
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                 &lt;sequence&gt;
                     *                   &lt;element name="family" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                     *                   &lt;element name="given" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                     *                 &lt;/sequence&gt;
                     *               &lt;/restriction&gt;
                     *             &lt;/complexContent&gt;
                     *           &lt;/complexType&gt;
                     *         &lt;/element&gt;
                     *       &lt;/sequence&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "name"
                    })
                    public static class AssignedPerson {

                        @XmlElement(required = true)
                        protected ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.Performer.AssignedEntity.AssignedPerson.Name name;

                        /**
                         * Obtiene el valor de la propiedad name.
                         * 
                         * @return
                         *     possible object is
                         *     {@link ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.Performer.AssignedEntity.AssignedPerson.Name }
                         *     
                         */
                        public ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.Performer.AssignedEntity.AssignedPerson.Name getName() {
                            return name;
                        }

                        /**
                         * Define el valor de la propiedad name.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.Performer.AssignedEntity.AssignedPerson.Name }
                         *     
                         */
                        public void setName(ReportStudyPathologicalAnatomy.DocumentationOf.ServiceEvent.Performer.AssignedEntity.AssignedPerson.Name value) {
                            this.name = value;
                        }


                        /**
                         * <p>Clase Java para anonymous complex type.
                         * 
                         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                         * 
                         * <pre>
                         * &lt;complexType&gt;
                         *   &lt;complexContent&gt;
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                         *       &lt;sequence&gt;
                         *         &lt;element name="family" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                         *         &lt;element name="given" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                         *       &lt;/sequence&gt;
                         *     &lt;/restriction&gt;
                         *   &lt;/complexContent&gt;
                         * &lt;/complexType&gt;
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

                            @XmlElement(required = true)
                            protected String family;
                            @XmlElement(required = true)
                            protected String given;

                            /**
                             * Obtiene el valor de la propiedad family.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getFamily() {
                                return family;
                            }

                            /**
                             * Define el valor de la propiedad family.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setFamily(String value) {
                                this.family = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad given.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getGiven() {
                                return given;
                            }

                            /**
                             * Define el valor de la propiedad given.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setGiven(String value) {
                                this.given = value;
                            }

                        }

                    }

                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class FunctionCode {

                    @XmlAttribute(name = "code")
                    protected String code;
                    @XmlAttribute(name = "codeSystem")
                    protected String codeSystem;
                    @XmlAttribute(name = "codeSystemName")
                    protected String codeSystemName;
                    @XmlAttribute(name = "displayName")
                    protected String displayName;

                    /**
                     * Obtiene el valor de la propiedad code.
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
                     * Define el valor de la propiedad code.
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
                     * Obtiene el valor de la propiedad codeSystem.
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
                     * Define el valor de la propiedad codeSystem.
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
                     * Obtiene el valor de la propiedad codeSystemName.
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
                     * Define el valor de la propiedad codeSystemName.
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
                     * Obtiene el valor de la propiedad displayName.
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
                     * Define el valor de la propiedad displayName.
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

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class EffectiveTime {

        @XmlAttribute(name = "value")
        protected String value;

        /**
         * Obtiene el valor de la propiedad value.
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
         * Define el valor de la propiedad value.
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
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Id {

        @XmlAttribute(name = "extension")
        protected String extension;
        @XmlAttribute(name = "root")
        protected String root;

        /**
         * Obtiene el valor de la propiedad extension.
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
         * Define el valor de la propiedad extension.
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
         * Obtiene el valor de la propiedad root.
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
         * Define el valor de la propiedad root.
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
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="order"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="id"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="code"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "order"
    })
    public static class InFulfillmentOf {

        @XmlElement(required = true)
        protected ReportStudyPathologicalAnatomy.InFulfillmentOf.Order order;

        /**
         * Obtiene el valor de la propiedad order.
         * 
         * @return
         *     possible object is
         *     {@link ReportStudyPathologicalAnatomy.InFulfillmentOf.Order }
         *     
         */
        public ReportStudyPathologicalAnatomy.InFulfillmentOf.Order getOrder() {
            return order;
        }

        /**
         * Define el valor de la propiedad order.
         * 
         * @param value
         *     allowed object is
         *     {@link ReportStudyPathologicalAnatomy.InFulfillmentOf.Order }
         *     
         */
        public void setOrder(ReportStudyPathologicalAnatomy.InFulfillmentOf.Order value) {
            this.order = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="id"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="code"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "id",
            "code"
        })
        public static class Order {

            @XmlElement(required = true)
            protected ReportStudyPathologicalAnatomy.InFulfillmentOf.Order.Id id;
            @XmlElement(required = true)
            protected ReportStudyPathologicalAnatomy.InFulfillmentOf.Order.Code code;

            /**
             * Obtiene el valor de la propiedad id.
             * 
             * @return
             *     possible object is
             *     {@link ReportStudyPathologicalAnatomy.InFulfillmentOf.Order.Id }
             *     
             */
            public ReportStudyPathologicalAnatomy.InFulfillmentOf.Order.Id getId() {
                return id;
            }

            /**
             * Define el valor de la propiedad id.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportStudyPathologicalAnatomy.InFulfillmentOf.Order.Id }
             *     
             */
            public void setId(ReportStudyPathologicalAnatomy.InFulfillmentOf.Order.Id value) {
                this.id = value;
            }

            /**
             * Obtiene el valor de la propiedad code.
             * 
             * @return
             *     possible object is
             *     {@link ReportStudyPathologicalAnatomy.InFulfillmentOf.Order.Code }
             *     
             */
            public ReportStudyPathologicalAnatomy.InFulfillmentOf.Order.Code getCode() {
                return code;
            }

            /**
             * Define el valor de la propiedad code.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportStudyPathologicalAnatomy.InFulfillmentOf.Order.Code }
             *     
             */
            public void setCode(ReportStudyPathologicalAnatomy.InFulfillmentOf.Order.Code value) {
                this.code = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Code {

                @XmlAttribute(name = "codeSystem")
                protected String codeSystem;
                @XmlAttribute(name = "codeSystemName")
                protected String codeSystemName;
                @XmlAttribute(name = "code")
                protected String code;
                @XmlAttribute(name = "displayName")
                protected String displayName;

                /**
                 * Obtiene el valor de la propiedad codeSystem.
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
                 * Define el valor de la propiedad codeSystem.
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
                 * Obtiene el valor de la propiedad codeSystemName.
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
                 * Define el valor de la propiedad codeSystemName.
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
                 * Obtiene el valor de la propiedad code.
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
                 * Define el valor de la propiedad code.
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
                 * Obtiene el valor de la propiedad displayName.
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
                 * Define el valor de la propiedad displayName.
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
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Id {

                @XmlAttribute(name = "root")
                protected String root;
                @XmlAttribute(name = "extension")
                protected Integer extension;

                /**
                 * Obtiene el valor de la propiedad root.
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
                 * Define el valor de la propiedad root.
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
                 * Obtiene el valor de la propiedad extension.
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
                 * Define el valor de la propiedad extension.
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

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LanguageCode {

        @XmlAttribute(name = "code")
        protected String code;

        /**
         * Obtiene el valor de la propiedad code.
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
         * Define el valor de la propiedad code.
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
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="associatedEntity"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="id"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                           &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="associatedPerson"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="scopingOrganization"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="id"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="asOrganizationPartOf"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="id"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="wholeOrganization"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "associatedEntity"
    })
    public static class Participant {

        @XmlElement(required = true)
        protected ReportStudyPathologicalAnatomy.Participant.AssociatedEntity associatedEntity;
        @XmlAttribute(name = "typeCode")
        protected String typeCode;

        /**
         * Obtiene el valor de la propiedad associatedEntity.
         * 
         * @return
         *     possible object is
         *     {@link ReportStudyPathologicalAnatomy.Participant.AssociatedEntity }
         *     
         */
        public ReportStudyPathologicalAnatomy.Participant.AssociatedEntity getAssociatedEntity() {
            return associatedEntity;
        }

        /**
         * Define el valor de la propiedad associatedEntity.
         * 
         * @param value
         *     allowed object is
         *     {@link ReportStudyPathologicalAnatomy.Participant.AssociatedEntity }
         *     
         */
        public void setAssociatedEntity(ReportStudyPathologicalAnatomy.Participant.AssociatedEntity value) {
            this.associatedEntity = value;
        }

        /**
         * Obtiene el valor de la propiedad typeCode.
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
         * Define el valor de la propiedad typeCode.
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
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="id"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *                 &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="associatedPerson"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="scopingOrganization"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="id"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="asOrganizationPartOf"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="id"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="wholeOrganization"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
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

            @XmlElement(required = true)
            protected ReportStudyPathologicalAnatomy.Participant.AssociatedEntity.Id id;
            @XmlElement(required = true)
            protected ReportStudyPathologicalAnatomy.Participant.AssociatedEntity.AssociatedPerson associatedPerson;
            @XmlElement(required = true)
            protected ReportStudyPathologicalAnatomy.Participant.AssociatedEntity.ScopingOrganization scopingOrganization;
            @XmlAttribute(name = "classCode")
            protected String classCode;

            /**
             * Obtiene el valor de la propiedad id.
             * 
             * @return
             *     possible object is
             *     {@link ReportStudyPathologicalAnatomy.Participant.AssociatedEntity.Id }
             *     
             */
            public ReportStudyPathologicalAnatomy.Participant.AssociatedEntity.Id getId() {
                return id;
            }

            /**
             * Define el valor de la propiedad id.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportStudyPathologicalAnatomy.Participant.AssociatedEntity.Id }
             *     
             */
            public void setId(ReportStudyPathologicalAnatomy.Participant.AssociatedEntity.Id value) {
                this.id = value;
            }

            /**
             * Obtiene el valor de la propiedad associatedPerson.
             * 
             * @return
             *     possible object is
             *     {@link ReportStudyPathologicalAnatomy.Participant.AssociatedEntity.AssociatedPerson }
             *     
             */
            public ReportStudyPathologicalAnatomy.Participant.AssociatedEntity.AssociatedPerson getAssociatedPerson() {
                return associatedPerson;
            }

            /**
             * Define el valor de la propiedad associatedPerson.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportStudyPathologicalAnatomy.Participant.AssociatedEntity.AssociatedPerson }
             *     
             */
            public void setAssociatedPerson(ReportStudyPathologicalAnatomy.Participant.AssociatedEntity.AssociatedPerson value) {
                this.associatedPerson = value;
            }

            /**
             * Obtiene el valor de la propiedad scopingOrganization.
             * 
             * @return
             *     possible object is
             *     {@link ReportStudyPathologicalAnatomy.Participant.AssociatedEntity.ScopingOrganization }
             *     
             */
            public ReportStudyPathologicalAnatomy.Participant.AssociatedEntity.ScopingOrganization getScopingOrganization() {
                return scopingOrganization;
            }

            /**
             * Define el valor de la propiedad scopingOrganization.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportStudyPathologicalAnatomy.Participant.AssociatedEntity.ScopingOrganization }
             *     
             */
            public void setScopingOrganization(ReportStudyPathologicalAnatomy.Participant.AssociatedEntity.ScopingOrganization value) {
                this.scopingOrganization = value;
            }

            /**
             * Obtiene el valor de la propiedad classCode.
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
             * Define el valor de la propiedad classCode.
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
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "name"
            })
            public static class AssociatedPerson {

                @XmlElement(required = true)
                protected String name;

                /**
                 * Obtiene el valor de la propiedad name.
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
                 * Define el valor de la propiedad name.
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
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *       &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Id {

                @XmlAttribute(name = "extension")
                protected Integer extension;
                @XmlAttribute(name = "root")
                protected String root;

                /**
                 * Obtiene el valor de la propiedad extension.
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
                 * Define el valor de la propiedad extension.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setExtension(Integer value) {
                    this.extension = value;
                }

                /**
                 * Obtiene el valor de la propiedad root.
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
                 * Define el valor de la propiedad root.
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
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="id"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="asOrganizationPartOf"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="id"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="wholeOrganization"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                           &lt;/sequence&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
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

                @XmlElement(required = true)
                protected ReportStudyPathologicalAnatomy.Participant.AssociatedEntity.ScopingOrganization.Id id;
                @XmlElement(required = true)
                protected String name;
                @XmlElement(required = true)
                protected ReportStudyPathologicalAnatomy.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf asOrganizationPartOf;

                /**
                 * Obtiene el valor de la propiedad id.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReportStudyPathologicalAnatomy.Participant.AssociatedEntity.ScopingOrganization.Id }
                 *     
                 */
                public ReportStudyPathologicalAnatomy.Participant.AssociatedEntity.ScopingOrganization.Id getId() {
                    return id;
                }

                /**
                 * Define el valor de la propiedad id.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReportStudyPathologicalAnatomy.Participant.AssociatedEntity.ScopingOrganization.Id }
                 *     
                 */
                public void setId(ReportStudyPathologicalAnatomy.Participant.AssociatedEntity.ScopingOrganization.Id value) {
                    this.id = value;
                }

                /**
                 * Obtiene el valor de la propiedad name.
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
                 * Define el valor de la propiedad name.
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
                 * Obtiene el valor de la propiedad asOrganizationPartOf.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReportStudyPathologicalAnatomy.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf }
                 *     
                 */
                public ReportStudyPathologicalAnatomy.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf getAsOrganizationPartOf() {
                    return asOrganizationPartOf;
                }

                /**
                 * Define el valor de la propiedad asOrganizationPartOf.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReportStudyPathologicalAnatomy.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf }
                 *     
                 */
                public void setAsOrganizationPartOf(ReportStudyPathologicalAnatomy.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf value) {
                    this.asOrganizationPartOf = value;
                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="id"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="wholeOrganization"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *                 &lt;/sequence&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
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

                    @XmlElement(required = true)
                    protected ReportStudyPathologicalAnatomy.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf.Id id;
                    @XmlElement(required = true)
                    protected ReportStudyPathologicalAnatomy.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf.WholeOrganization wholeOrganization;

                    /**
                     * Obtiene el valor de la propiedad id.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ReportStudyPathologicalAnatomy.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf.Id }
                     *     
                     */
                    public ReportStudyPathologicalAnatomy.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf.Id getId() {
                        return id;
                    }

                    /**
                     * Define el valor de la propiedad id.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ReportStudyPathologicalAnatomy.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf.Id }
                     *     
                     */
                    public void setId(ReportStudyPathologicalAnatomy.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf.Id value) {
                        this.id = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad wholeOrganization.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ReportStudyPathologicalAnatomy.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf.WholeOrganization }
                     *     
                     */
                    public ReportStudyPathologicalAnatomy.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf.WholeOrganization getWholeOrganization() {
                        return wholeOrganization;
                    }

                    /**
                     * Define el valor de la propiedad wholeOrganization.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ReportStudyPathologicalAnatomy.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf.WholeOrganization }
                     *     
                     */
                    public void setWholeOrganization(ReportStudyPathologicalAnatomy.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf.WholeOrganization value) {
                        this.wholeOrganization = value;
                    }


                    /**
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;complexContent&gt;
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *       &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Id {

                        @XmlAttribute(name = "root")
                        protected String root;

                        /**
                         * Obtiene el valor de la propiedad root.
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
                         * Define el valor de la propiedad root.
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
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;complexContent&gt;
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *       &lt;sequence&gt;
                     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                     *       &lt;/sequence&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "name"
                    })
                    public static class WholeOrganization {

                        @XmlElement(required = true)
                        protected String name;

                        /**
                         * Obtiene el valor de la propiedad name.
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
                         * Define el valor de la propiedad name.
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
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Id {

                    @XmlAttribute(name = "root")
                    protected String root;
                    @XmlAttribute(name = "extension")
                    protected Integer extension;

                    /**
                     * Obtiene el valor de la propiedad root.
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
                     * Define el valor de la propiedad root.
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
                     * Obtiene el valor de la propiedad extension.
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
                     * Define el valor de la propiedad extension.
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

            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RealmCode {

        @XmlAttribute(name = "code")
        protected String code;

        /**
         * Obtiene el valor de la propiedad code.
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
         * Define el valor de la propiedad code.
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
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="patientRole"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="id" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                           &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="addr"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="streetAddressLine" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                             &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="county" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="additionalLocator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="telecom"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="patient"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="name"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="family" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
     *                                       &lt;element name="given" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
     *                                     &lt;/sequence&gt;
     *                                     &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="administrativeGenderCode"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="birthTime"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="providerOrganization"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="id"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="standardIndustryClassCode"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                                     &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="asOrganizationPartOf"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="id"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                               &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="code"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                                               &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                               &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="wholeOrganization"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="id"&gt;
     *                                                   &lt;complexType&gt;
     *                                                     &lt;complexContent&gt;
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                         &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                                       &lt;/restriction&gt;
     *                                                     &lt;/complexContent&gt;
     *                                                   &lt;/complexType&gt;
     *                                                 &lt;/element&gt;
     *                                                 &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                                 &lt;element name="telecom"&gt;
     *                                                   &lt;complexType&gt;
     *                                                     &lt;complexContent&gt;
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                         &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                                                       &lt;/restriction&gt;
     *                                                     &lt;/complexContent&gt;
     *                                                   &lt;/complexType&gt;
     *                                                 &lt;/element&gt;
     *                                                 &lt;element name="addr"&gt;
     *                                                   &lt;complexType&gt;
     *                                                     &lt;complexContent&gt;
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                         &lt;sequence&gt;
     *                                                           &lt;element name="streetAddressLine" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                                           &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                                           &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                                           &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                                                         &lt;/sequence&gt;
     *                                                       &lt;/restriction&gt;
     *                                                     &lt;/complexContent&gt;
     *                                                   &lt;/complexType&gt;
     *                                                 &lt;/element&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "patientRole"
    })
    public static class RecordTarget {

        @XmlElement(required = true)
        protected ReportStudyPathologicalAnatomy.RecordTarget.PatientRole patientRole;

        /**
         * Obtiene el valor de la propiedad patientRole.
         * 
         * @return
         *     possible object is
         *     {@link ReportStudyPathologicalAnatomy.RecordTarget.PatientRole }
         *     
         */
        public ReportStudyPathologicalAnatomy.RecordTarget.PatientRole getPatientRole() {
            return patientRole;
        }

        /**
         * Define el valor de la propiedad patientRole.
         * 
         * @param value
         *     allowed object is
         *     {@link ReportStudyPathologicalAnatomy.RecordTarget.PatientRole }
         *     
         */
        public void setPatientRole(ReportStudyPathologicalAnatomy.RecordTarget.PatientRole value) {
            this.patientRole = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="id" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *                 &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="addr"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="streetAddressLine" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *                   &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="county" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="additionalLocator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="telecom"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="patient"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="name"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="family" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
         *                             &lt;element name="given" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
         *                           &lt;/sequence&gt;
         *                           &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="administrativeGenderCode"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="birthTime"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="providerOrganization"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="id"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="standardIndustryClassCode"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *                           &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="asOrganizationPartOf"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="id"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                                     &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="code"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *                                     &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                                     &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="wholeOrganization"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="id"&gt;
         *                                         &lt;complexType&gt;
         *                                           &lt;complexContent&gt;
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                               &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                                             &lt;/restriction&gt;
         *                                           &lt;/complexContent&gt;
         *                                         &lt;/complexType&gt;
         *                                       &lt;/element&gt;
         *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                       &lt;element name="telecom"&gt;
         *                                         &lt;complexType&gt;
         *                                           &lt;complexContent&gt;
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                               &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *                                             &lt;/restriction&gt;
         *                                           &lt;/complexContent&gt;
         *                                         &lt;/complexType&gt;
         *                                       &lt;/element&gt;
         *                                       &lt;element name="addr"&gt;
         *                                         &lt;complexType&gt;
         *                                           &lt;complexContent&gt;
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                               &lt;sequence&gt;
         *                                                 &lt;element name="streetAddressLine" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                                 &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                                 &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                                 &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *                                               &lt;/sequence&gt;
         *                                             &lt;/restriction&gt;
         *                                           &lt;/complexContent&gt;
         *                                         &lt;/complexType&gt;
         *                                       &lt;/element&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
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

            @XmlElement(required = true)
            protected List<ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.Id> id;
            @XmlElement(required = true)
            protected ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.Addr addr;
            @XmlElement(required = true)
            protected ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.Telecom telecom;
            @XmlElement(required = true)
            protected ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.Patient patient;
            @XmlElement(required = true)
            protected ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization providerOrganization;

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
             * {@link ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.Id }
             * 
             * 
             */
            public List<ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.Id> getId() {
                if (id == null) {
                    id = new ArrayList<ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.Id>();
                }
                return this.id;
            }

            /**
             * Obtiene el valor de la propiedad addr.
             * 
             * @return
             *     possible object is
             *     {@link ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.Addr }
             *     
             */
            public ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.Addr getAddr() {
                return addr;
            }

            /**
             * Define el valor de la propiedad addr.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.Addr }
             *     
             */
            public void setAddr(ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.Addr value) {
                this.addr = value;
            }

            /**
             * Obtiene el valor de la propiedad telecom.
             * 
             * @return
             *     possible object is
             *     {@link ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.Telecom }
             *     
             */
            public ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.Telecom getTelecom() {
                return telecom;
            }

            /**
             * Define el valor de la propiedad telecom.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.Telecom }
             *     
             */
            public void setTelecom(ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.Telecom value) {
                this.telecom = value;
            }

            /**
             * Obtiene el valor de la propiedad patient.
             * 
             * @return
             *     possible object is
             *     {@link ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.Patient }
             *     
             */
            public ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.Patient getPatient() {
                return patient;
            }

            /**
             * Define el valor de la propiedad patient.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.Patient }
             *     
             */
            public void setPatient(ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.Patient value) {
                this.patient = value;
            }

            /**
             * Obtiene el valor de la propiedad providerOrganization.
             * 
             * @return
             *     possible object is
             *     {@link ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization }
             *     
             */
            public ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization getProviderOrganization() {
                return providerOrganization;
            }

            /**
             * Define el valor de la propiedad providerOrganization.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization }
             *     
             */
            public void setProviderOrganization(ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization value) {
                this.providerOrganization = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="streetAddressLine" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
             *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="county" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="additionalLocator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
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

                @XmlElement(required = true)
                protected String streetAddressLine;
                @XmlElement(required = true)
                protected String city;
                @XmlElement(required = true)
                protected String state;
                protected int postalCode;
                @XmlElement(required = true)
                protected String country;
                @XmlElement(required = true)
                protected String county;
                @XmlElement(required = true)
                protected String additionalLocator;
                @XmlAttribute(name = "use")
                protected String use;

                /**
                 * Obtiene el valor de la propiedad streetAddressLine.
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
                 * Define el valor de la propiedad streetAddressLine.
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
                 * Obtiene el valor de la propiedad city.
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
                 * Define el valor de la propiedad city.
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
                 * Obtiene el valor de la propiedad state.
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
                 * Define el valor de la propiedad state.
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
                 * Obtiene el valor de la propiedad postalCode.
                 * 
                 */
                public int getPostalCode() {
                    return postalCode;
                }

                /**
                 * Define el valor de la propiedad postalCode.
                 * 
                 */
                public void setPostalCode(int value) {
                    this.postalCode = value;
                }

                /**
                 * Obtiene el valor de la propiedad country.
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
                 * Define el valor de la propiedad country.
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
                 * Obtiene el valor de la propiedad county.
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
                 * Define el valor de la propiedad county.
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
                 * Obtiene el valor de la propiedad additionalLocator.
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
                 * Define el valor de la propiedad additionalLocator.
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
                 * Obtiene el valor de la propiedad use.
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
                 * Define el valor de la propiedad use.
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
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *       &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Id {

                @XmlAttribute(name = "extension")
                protected Integer extension;
                @XmlAttribute(name = "root")
                protected String root;

                /**
                 * Obtiene el valor de la propiedad extension.
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
                 * Define el valor de la propiedad extension.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setExtension(Integer value) {
                    this.extension = value;
                }

                /**
                 * Obtiene el valor de la propiedad root.
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
                 * Define el valor de la propiedad root.
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
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="name"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="family" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
             *                   &lt;element name="given" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
             *                 &lt;/sequence&gt;
             *                 &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="administrativeGenderCode"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="birthTime"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
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

                @XmlElement(required = true)
                protected ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.Patient.Name name;
                @XmlElement(required = true)
                protected ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.Patient.AdministrativeGenderCode administrativeGenderCode;
                @XmlElement(required = true)
                protected ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.Patient.BirthTime birthTime;

                /**
                 * Obtiene el valor de la propiedad name.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.Patient.Name }
                 *     
                 */
                public ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.Patient.Name getName() {
                    return name;
                }

                /**
                 * Define el valor de la propiedad name.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.Patient.Name }
                 *     
                 */
                public void setName(ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.Patient.Name value) {
                    this.name = value;
                }

                /**
                 * Obtiene el valor de la propiedad administrativeGenderCode.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.Patient.AdministrativeGenderCode }
                 *     
                 */
                public ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.Patient.AdministrativeGenderCode getAdministrativeGenderCode() {
                    return administrativeGenderCode;
                }

                /**
                 * Define el valor de la propiedad administrativeGenderCode.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.Patient.AdministrativeGenderCode }
                 *     
                 */
                public void setAdministrativeGenderCode(ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.Patient.AdministrativeGenderCode value) {
                    this.administrativeGenderCode = value;
                }

                /**
                 * Obtiene el valor de la propiedad birthTime.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.Patient.BirthTime }
                 *     
                 */
                public ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.Patient.BirthTime getBirthTime() {
                    return birthTime;
                }

                /**
                 * Define el valor de la propiedad birthTime.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.Patient.BirthTime }
                 *     
                 */
                public void setBirthTime(ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.Patient.BirthTime value) {
                    this.birthTime = value;
                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class AdministrativeGenderCode {

                    @XmlAttribute(name = "code")
                    protected String code;
                    @XmlAttribute(name = "codeSystem")
                    protected String codeSystem;
                    @XmlAttribute(name = "displayName")
                    protected String displayName;

                    /**
                     * Obtiene el valor de la propiedad code.
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
                     * Define el valor de la propiedad code.
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
                     * Obtiene el valor de la propiedad codeSystem.
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
                     * Define el valor de la propiedad codeSystem.
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
                     * Obtiene el valor de la propiedad displayName.
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
                     * Define el valor de la propiedad displayName.
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
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class BirthTime {

                    @XmlAttribute(name = "value")
                    protected Integer value;

                    /**
                     * Obtiene el valor de la propiedad value.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getValue() {
                        return value;
                    }

                    /**
                     * Define el valor de la propiedad value.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setValue(Integer value) {
                        this.value = value;
                    }

                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="family" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
                 *         &lt;element name="given" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
                 *       &lt;/sequence&gt;
                 *       &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
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
                     * Obtiene el valor de la propiedad use.
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
                     * Define el valor de la propiedad use.
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
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="id"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="standardIndustryClassCode"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *                 &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="asOrganizationPartOf"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="id"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                           &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="code"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *                           &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                           &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="wholeOrganization"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="id"&gt;
             *                               &lt;complexType&gt;
             *                                 &lt;complexContent&gt;
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                     &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                                   &lt;/restriction&gt;
             *                                 &lt;/complexContent&gt;
             *                               &lt;/complexType&gt;
             *                             &lt;/element&gt;
             *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                             &lt;element name="telecom"&gt;
             *                               &lt;complexType&gt;
             *                                 &lt;complexContent&gt;
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *                                   &lt;/restriction&gt;
             *                                 &lt;/complexContent&gt;
             *                               &lt;/complexType&gt;
             *                             &lt;/element&gt;
             *                             &lt;element name="addr"&gt;
             *                               &lt;complexType&gt;
             *                                 &lt;complexContent&gt;
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                     &lt;sequence&gt;
             *                                       &lt;element name="streetAddressLine" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                                       &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                                       &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                                       &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
             *                                     &lt;/sequence&gt;
             *                                   &lt;/restriction&gt;
             *                                 &lt;/complexContent&gt;
             *                               &lt;/complexType&gt;
             *                             &lt;/element&gt;
             *                           &lt;/sequence&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
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

                @XmlElement(required = true)
                protected ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.Id id;
                @XmlElement(required = true)
                protected String name;
                @XmlElement(required = true)
                protected ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.StandardIndustryClassCode standardIndustryClassCode;
                @XmlElement(required = true)
                protected ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf asOrganizationPartOf;

                /**
                 * Obtiene el valor de la propiedad id.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.Id }
                 *     
                 */
                public ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.Id getId() {
                    return id;
                }

                /**
                 * Define el valor de la propiedad id.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.Id }
                 *     
                 */
                public void setId(ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.Id value) {
                    this.id = value;
                }

                /**
                 * Obtiene el valor de la propiedad name.
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
                 * Define el valor de la propiedad name.
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
                 * Obtiene el valor de la propiedad standardIndustryClassCode.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.StandardIndustryClassCode }
                 *     
                 */
                public ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.StandardIndustryClassCode getStandardIndustryClassCode() {
                    return standardIndustryClassCode;
                }

                /**
                 * Define el valor de la propiedad standardIndustryClassCode.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.StandardIndustryClassCode }
                 *     
                 */
                public void setStandardIndustryClassCode(ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.StandardIndustryClassCode value) {
                    this.standardIndustryClassCode = value;
                }

                /**
                 * Obtiene el valor de la propiedad asOrganizationPartOf.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf }
                 *     
                 */
                public ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf getAsOrganizationPartOf() {
                    return asOrganizationPartOf;
                }

                /**
                 * Define el valor de la propiedad asOrganizationPartOf.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf }
                 *     
                 */
                public void setAsOrganizationPartOf(ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf value) {
                    this.asOrganizationPartOf = value;
                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="id"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *                 &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="code"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
                 *                 &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *                 &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="wholeOrganization"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="id"&gt;
                 *                     &lt;complexType&gt;
                 *                       &lt;complexContent&gt;
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                           &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *                         &lt;/restriction&gt;
                 *                       &lt;/complexContent&gt;
                 *                     &lt;/complexType&gt;
                 *                   &lt;/element&gt;
                 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *                   &lt;element name="telecom"&gt;
                 *                     &lt;complexType&gt;
                 *                       &lt;complexContent&gt;
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
                 *                         &lt;/restriction&gt;
                 *                       &lt;/complexContent&gt;
                 *                     &lt;/complexType&gt;
                 *                   &lt;/element&gt;
                 *                   &lt;element name="addr"&gt;
                 *                     &lt;complexType&gt;
                 *                       &lt;complexContent&gt;
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                           &lt;sequence&gt;
                 *                             &lt;element name="streetAddressLine" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *                             &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *                             &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *                             &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
                 *                           &lt;/sequence&gt;
                 *                         &lt;/restriction&gt;
                 *                       &lt;/complexContent&gt;
                 *                     &lt;/complexType&gt;
                 *                   &lt;/element&gt;
                 *                 &lt;/sequence&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
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

                    @XmlElement(required = true)
                    protected ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.Id id;
                    @XmlElement(required = true)
                    protected ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.Code code;
                    @XmlElement(required = true)
                    protected ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization wholeOrganization;

                    /**
                     * Obtiene el valor de la propiedad id.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.Id }
                     *     
                     */
                    public ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.Id getId() {
                        return id;
                    }

                    /**
                     * Define el valor de la propiedad id.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.Id }
                     *     
                     */
                    public void setId(ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.Id value) {
                        this.id = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad code.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.Code }
                     *     
                     */
                    public ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.Code getCode() {
                        return code;
                    }

                    /**
                     * Define el valor de la propiedad code.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.Code }
                     *     
                     */
                    public void setCode(ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.Code value) {
                        this.code = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad wholeOrganization.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization }
                     *     
                     */
                    public ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization getWholeOrganization() {
                        return wholeOrganization;
                    }

                    /**
                     * Define el valor de la propiedad wholeOrganization.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization }
                     *     
                     */
                    public void setWholeOrganization(ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization value) {
                        this.wholeOrganization = value;
                    }


                    /**
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;complexContent&gt;
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
                     *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                     *       &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Code {

                        @XmlAttribute(name = "code")
                        protected Integer code;
                        @XmlAttribute(name = "displayName")
                        protected String displayName;
                        @XmlAttribute(name = "codeSystem")
                        protected String codeSystem;

                        /**
                         * Obtiene el valor de la propiedad code.
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
                         * Define el valor de la propiedad code.
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
                         * Obtiene el valor de la propiedad displayName.
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
                         * Define el valor de la propiedad displayName.
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
                         * Obtiene el valor de la propiedad codeSystem.
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
                         * Define el valor de la propiedad codeSystem.
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
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;complexContent&gt;
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *       &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                     *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Id {

                        @XmlAttribute(name = "root")
                        protected String root;
                        @XmlAttribute(name = "extension")
                        protected String extension;

                        /**
                         * Obtiene el valor de la propiedad root.
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
                         * Define el valor de la propiedad root.
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
                         * Obtiene el valor de la propiedad extension.
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
                         * Define el valor de la propiedad extension.
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
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;complexContent&gt;
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *       &lt;sequence&gt;
                     *         &lt;element name="id"&gt;
                     *           &lt;complexType&gt;
                     *             &lt;complexContent&gt;
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                 &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                     *               &lt;/restriction&gt;
                     *             &lt;/complexContent&gt;
                     *           &lt;/complexType&gt;
                     *         &lt;/element&gt;
                     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                     *         &lt;element name="telecom"&gt;
                     *           &lt;complexType&gt;
                     *             &lt;complexContent&gt;
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
                     *               &lt;/restriction&gt;
                     *             &lt;/complexContent&gt;
                     *           &lt;/complexType&gt;
                     *         &lt;/element&gt;
                     *         &lt;element name="addr"&gt;
                     *           &lt;complexType&gt;
                     *             &lt;complexContent&gt;
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                 &lt;sequence&gt;
                     *                   &lt;element name="streetAddressLine" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                     *                   &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                     *                   &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                     *                   &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
                     *                 &lt;/sequence&gt;
                     *               &lt;/restriction&gt;
                     *             &lt;/complexContent&gt;
                     *           &lt;/complexType&gt;
                     *         &lt;/element&gt;
                     *       &lt;/sequence&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
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

                        @XmlElement(required = true)
                        protected ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Id id;
                        @XmlElement(required = true)
                        protected String name;
                        @XmlElement(required = true)
                        protected ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Telecom telecom;
                        @XmlElement(required = true)
                        protected ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Addr addr;

                        /**
                         * Obtiene el valor de la propiedad id.
                         * 
                         * @return
                         *     possible object is
                         *     {@link ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Id }
                         *     
                         */
                        public ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Id getId() {
                            return id;
                        }

                        /**
                         * Define el valor de la propiedad id.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Id }
                         *     
                         */
                        public void setId(ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Id value) {
                            this.id = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad name.
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
                         * Define el valor de la propiedad name.
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
                         * Obtiene el valor de la propiedad telecom.
                         * 
                         * @return
                         *     possible object is
                         *     {@link ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Telecom }
                         *     
                         */
                        public ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Telecom getTelecom() {
                            return telecom;
                        }

                        /**
                         * Define el valor de la propiedad telecom.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Telecom }
                         *     
                         */
                        public void setTelecom(ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Telecom value) {
                            this.telecom = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad addr.
                         * 
                         * @return
                         *     possible object is
                         *     {@link ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Addr }
                         *     
                         */
                        public ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Addr getAddr() {
                            return addr;
                        }

                        /**
                         * Define el valor de la propiedad addr.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Addr }
                         *     
                         */
                        public void setAddr(ReportStudyPathologicalAnatomy.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Addr value) {
                            this.addr = value;
                        }


                        /**
                         * <p>Clase Java para anonymous complex type.
                         * 
                         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                         * 
                         * <pre>
                         * &lt;complexType&gt;
                         *   &lt;complexContent&gt;
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                         *       &lt;sequence&gt;
                         *         &lt;element name="streetAddressLine" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                         *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                         *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                         *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
                         *       &lt;/sequence&gt;
                         *     &lt;/restriction&gt;
                         *   &lt;/complexContent&gt;
                         * &lt;/complexType&gt;
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

                            @XmlElement(required = true)
                            protected String streetAddressLine;
                            @XmlElement(required = true)
                            protected String city;
                            @XmlElement(required = true)
                            protected String state;
                            protected int postalCode;

                            /**
                             * Obtiene el valor de la propiedad streetAddressLine.
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
                             * Define el valor de la propiedad streetAddressLine.
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
                             * Obtiene el valor de la propiedad city.
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
                             * Define el valor de la propiedad city.
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
                             * Obtiene el valor de la propiedad state.
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
                             * Define el valor de la propiedad state.
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
                             * Obtiene el valor de la propiedad postalCode.
                             * 
                             */
                            public int getPostalCode() {
                                return postalCode;
                            }

                            /**
                             * Define el valor de la propiedad postalCode.
                             * 
                             */
                            public void setPostalCode(int value) {
                                this.postalCode = value;
                            }

                        }


                        /**
                         * <p>Clase Java para anonymous complex type.
                         * 
                         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                         * 
                         * <pre>
                         * &lt;complexType&gt;
                         *   &lt;complexContent&gt;
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                         *       &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                         *     &lt;/restriction&gt;
                         *   &lt;/complexContent&gt;
                         * &lt;/complexType&gt;
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class Id {

                            @XmlAttribute(name = "root")
                            protected String root;

                            /**
                             * Obtiene el valor de la propiedad root.
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
                             * Define el valor de la propiedad root.
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
                         * <p>Clase Java para anonymous complex type.
                         * 
                         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                         * 
                         * <pre>
                         * &lt;complexType&gt;
                         *   &lt;complexContent&gt;
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                         *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
                         *     &lt;/restriction&gt;
                         *   &lt;/complexContent&gt;
                         * &lt;/complexType&gt;
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class Telecom {

                            @XmlAttribute(name = "value")
                            protected Integer value;

                            /**
                             * Obtiene el valor de la propiedad value.
                             * 
                             * @return
                             *     possible object is
                             *     {@link Integer }
                             *     
                             */
                            public Integer getValue() {
                                return value;
                            }

                            /**
                             * Define el valor de la propiedad value.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Integer }
                             *     
                             */
                            public void setValue(Integer value) {
                                this.value = value;
                            }

                        }

                    }

                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Id {

                    @XmlAttribute(name = "root")
                    protected String root;
                    @XmlAttribute(name = "extension")
                    protected String extension;

                    /**
                     * Obtiene el valor de la propiedad root.
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
                     * Define el valor de la propiedad root.
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
                     * Obtiene el valor de la propiedad extension.
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
                     * Define el valor de la propiedad extension.
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
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
                 *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class StandardIndustryClassCode {

                    @XmlAttribute(name = "code")
                    protected Integer code;
                    @XmlAttribute(name = "displayName")
                    protected String displayName;
                    @XmlAttribute(name = "codeSystemName")
                    protected String codeSystemName;

                    /**
                     * Obtiene el valor de la propiedad code.
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
                     * Define el valor de la propiedad code.
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
                     * Obtiene el valor de la propiedad displayName.
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
                     * Define el valor de la propiedad displayName.
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
                     * Obtiene el valor de la propiedad codeSystemName.
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
                     * Define el valor de la propiedad codeSystemName.
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
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Telecom {

                @XmlAttribute(name = "value")
                protected String value;
                @XmlAttribute(name = "use")
                protected String use;

                /**
                 * Obtiene el valor de la propiedad value.
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
                 * Define el valor de la propiedad value.
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
                 * Obtiene el valor de la propiedad use.
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
                 * Define el valor de la propiedad use.
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
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *       &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SetId {

        @XmlAttribute(name = "extension")
        protected Integer extension;
        @XmlAttribute(name = "root")
        protected String root;

        /**
         * Obtiene el valor de la propiedad extension.
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
         * Define el valor de la propiedad extension.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setExtension(Integer value) {
            this.extension = value;
        }

        /**
         * Obtiene el valor de la propiedad root.
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
         * Define el valor de la propiedad root.
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
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TemplateId {

        @XmlAttribute(name = "root")
        protected String root;
        @XmlAttribute(name = "extension")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar extension;

        /**
         * Obtiene el valor de la propiedad root.
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
         * Define el valor de la propiedad root.
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
         * Obtiene el valor de la propiedad extension.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getExtension() {
            return extension;
        }

        /**
         * Define el valor de la propiedad extension.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setExtension(XMLGregorianCalendar value) {
            this.extension = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TypeId {

        @XmlAttribute(name = "root")
        protected String root;
        @XmlAttribute(name = "extension")
        protected String extension;

        /**
         * Obtiene el valor de la propiedad root.
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
         * Define el valor de la propiedad root.
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
         * Obtiene el valor de la propiedad extension.
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
         * Define el valor de la propiedad extension.
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
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VersionNumber {

        @XmlAttribute(name = "value")
        protected Integer value;

        /**
         * Obtiene el valor de la propiedad value.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getValue() {
            return value;
        }

        /**
         * Define el valor de la propiedad value.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setValue(Integer value) {
            this.value = value;
        }

    }

}
