//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.05.17 a las 04:25:25 PM ART 
//


package org.fleni.cda.xml.mapper.report;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="effectiveTime"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="setId"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
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
 *                                     &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                                     &lt;attribute name="assigningAuthorityName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="displayable" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
 *                                                 &lt;element name="family" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="given" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                               &lt;/sequence&gt;
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
 *                                               &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="codeSystemVersion" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
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
 *                                     &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
 *                 &lt;attribute name="contextControlCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
 *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="encounterParticipant"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="assignedEntity"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="id"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="nullFlavor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="code"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                         &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                         &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
 *                           &lt;attribute name="moodCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "effectiveTime",
    "setId",
    "recordTarget",
    "componentOf"
})
@XmlRootElement(namespace = "http://www.pqr.com/awd/rest/v1", name = "ClinicalDocument")
public class DNLabReportResumido {

    @XmlElement(required = true)
    protected DNLabReportResumido.EffectiveTime effectiveTime;
    @XmlElement(required = true)
    protected DNLabReportResumido.SetId setId;
    @XmlElement(required = true)
    protected DNLabReportResumido.RecordTarget recordTarget;
    @XmlElement(required = true)
    protected DNLabReportResumido.ComponentOf componentOf;

    /**
     * Obtiene el valor de la propiedad effectiveTime.
     * 
     * @return
     *     possible object is
     *     {@link DNLabReportResumido.EffectiveTime }
     *     
     */
    public DNLabReportResumido.EffectiveTime getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * Define el valor de la propiedad effectiveTime.
     * 
     * @param value
     *     allowed object is
     *     {@link DNLabReportResumido.EffectiveTime }
     *     
     */
    public void setEffectiveTime(DNLabReportResumido.EffectiveTime value) {
        this.effectiveTime = value;
    }

    /**
     * Obtiene el valor de la propiedad setId.
     * 
     * @return
     *     possible object is
     *     {@link DNLabReportResumido.SetId }
     *     
     */
    public DNLabReportResumido.SetId getSetId() {
        return setId;
    }

    /**
     * Define el valor de la propiedad setId.
     * 
     * @param value
     *     allowed object is
     *     {@link DNLabReportResumido.SetId }
     *     
     */
    public void setSetId(DNLabReportResumido.SetId value) {
        this.setId = value;
    }

    /**
     * Obtiene el valor de la propiedad recordTarget.
     * 
     * @return
     *     possible object is
     *     {@link DNLabReportResumido.RecordTarget }
     *     
     */
    public DNLabReportResumido.RecordTarget getRecordTarget() {
        return recordTarget;
    }

    /**
     * Define el valor de la propiedad recordTarget.
     * 
     * @param value
     *     allowed object is
     *     {@link DNLabReportResumido.RecordTarget }
     *     
     */
    public void setRecordTarget(DNLabReportResumido.RecordTarget value) {
        this.recordTarget = value;
    }

    /**
     * Obtiene el valor de la propiedad componentOf.
     * 
     * @return
     *     possible object is
     *     {@link DNLabReportResumido.ComponentOf }
     *     
     */
    public DNLabReportResumido.ComponentOf getComponentOf() {
        return componentOf;
    }

    /**
     * Define el valor de la propiedad componentOf.
     * 
     * @param value
     *     allowed object is
     *     {@link DNLabReportResumido.ComponentOf }
     *     
     */
    public void setComponentOf(DNLabReportResumido.ComponentOf value) {
        this.componentOf = value;
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
     *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="encounterParticipant"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="assignedEntity"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="id"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="nullFlavor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="code"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                               &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                               &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
     *                 &lt;attribute name="moodCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
        "encompassingEncounter"
    })
    public static class ComponentOf {

        @XmlElement(required = true)
        protected DNLabReportResumido.ComponentOf.EncompassingEncounter encompassingEncounter;
        @XmlAttribute(name = "typeCode")
        protected String typeCode;

        /**
         * Obtiene el valor de la propiedad encompassingEncounter.
         * 
         * @return
         *     possible object is
         *     {@link DNLabReportResumido.ComponentOf.EncompassingEncounter }
         *     
         */
        public DNLabReportResumido.ComponentOf.EncompassingEncounter getEncompassingEncounter() {
            return encompassingEncounter;
        }

        /**
         * Define el valor de la propiedad encompassingEncounter.
         * 
         * @param value
         *     allowed object is
         *     {@link DNLabReportResumido.ComponentOf.EncompassingEncounter }
         *     
         */
        public void setEncompassingEncounter(DNLabReportResumido.ComponentOf.EncompassingEncounter value) {
            this.encompassingEncounter = value;
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
         *         &lt;element name="code"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
         *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="encounterParticipant"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="assignedEntity"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="id"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="nullFlavor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="code"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                                     &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
         *                 &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="moodCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
            "encounterParticipant"
        })
        public static class EncompassingEncounter {

            @XmlElement(required = true)
            protected DNLabReportResumido.ComponentOf.EncompassingEncounter.Id id;
            @XmlElement(required = true)
            protected DNLabReportResumido.ComponentOf.EncompassingEncounter.Code code;
            @XmlElement(required = true)
            protected DNLabReportResumido.ComponentOf.EncompassingEncounter.EffectiveTime effectiveTime;
            @XmlElement(required = true)
            protected DNLabReportResumido.ComponentOf.EncompassingEncounter.EncounterParticipant encounterParticipant;
            @XmlAttribute(name = "classCode")
            protected String classCode;
            @XmlAttribute(name = "moodCode")
            protected String moodCode;

            /**
             * Obtiene el valor de la propiedad id.
             * 
             * @return
             *     possible object is
             *     {@link DNLabReportResumido.ComponentOf.EncompassingEncounter.Id }
             *     
             */
            public DNLabReportResumido.ComponentOf.EncompassingEncounter.Id getId() {
                return id;
            }

            /**
             * Define el valor de la propiedad id.
             * 
             * @param value
             *     allowed object is
             *     {@link DNLabReportResumido.ComponentOf.EncompassingEncounter.Id }
             *     
             */
            public void setId(DNLabReportResumido.ComponentOf.EncompassingEncounter.Id value) {
                this.id = value;
            }

            /**
             * Obtiene el valor de la propiedad code.
             * 
             * @return
             *     possible object is
             *     {@link DNLabReportResumido.ComponentOf.EncompassingEncounter.Code }
             *     
             */
            public DNLabReportResumido.ComponentOf.EncompassingEncounter.Code getCode() {
                return code;
            }

            /**
             * Define el valor de la propiedad code.
             * 
             * @param value
             *     allowed object is
             *     {@link DNLabReportResumido.ComponentOf.EncompassingEncounter.Code }
             *     
             */
            public void setCode(DNLabReportResumido.ComponentOf.EncompassingEncounter.Code value) {
                this.code = value;
            }

            /**
             * Obtiene el valor de la propiedad effectiveTime.
             * 
             * @return
             *     possible object is
             *     {@link DNLabReportResumido.ComponentOf.EncompassingEncounter.EffectiveTime }
             *     
             */
            public DNLabReportResumido.ComponentOf.EncompassingEncounter.EffectiveTime getEffectiveTime() {
                return effectiveTime;
            }

            /**
             * Define el valor de la propiedad effectiveTime.
             * 
             * @param value
             *     allowed object is
             *     {@link DNLabReportResumido.ComponentOf.EncompassingEncounter.EffectiveTime }
             *     
             */
            public void setEffectiveTime(DNLabReportResumido.ComponentOf.EncompassingEncounter.EffectiveTime value) {
                this.effectiveTime = value;
            }

            /**
             * Obtiene el valor de la propiedad encounterParticipant.
             * 
             * @return
             *     possible object is
             *     {@link DNLabReportResumido.ComponentOf.EncompassingEncounter.EncounterParticipant }
             *     
             */
            public DNLabReportResumido.ComponentOf.EncompassingEncounter.EncounterParticipant getEncounterParticipant() {
                return encounterParticipant;
            }

            /**
             * Define el valor de la propiedad encounterParticipant.
             * 
             * @param value
             *     allowed object is
             *     {@link DNLabReportResumido.ComponentOf.EncompassingEncounter.EncounterParticipant }
             *     
             */
            public void setEncounterParticipant(DNLabReportResumido.ComponentOf.EncompassingEncounter.EncounterParticipant value) {
                this.encounterParticipant = value;
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
             * Obtiene el valor de la propiedad moodCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMoodCode() {
                return moodCode;
            }

            /**
             * Define el valor de la propiedad moodCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMoodCode(String value) {
                this.moodCode = value;
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
            public static class EffectiveTime {

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
             *         &lt;element name="assignedEntity"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="id"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="nullFlavor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="code"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                           &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
                "assignedEntity"
            })
            public static class EncounterParticipant {

                @XmlElement(required = true)
                protected DNLabReportResumido.ComponentOf.EncompassingEncounter.EncounterParticipant.AssignedEntity assignedEntity;
                @XmlAttribute(name = "typeCode")
                protected String typeCode;

                /**
                 * Obtiene el valor de la propiedad assignedEntity.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DNLabReportResumido.ComponentOf.EncompassingEncounter.EncounterParticipant.AssignedEntity }
                 *     
                 */
                public DNLabReportResumido.ComponentOf.EncompassingEncounter.EncounterParticipant.AssignedEntity getAssignedEntity() {
                    return assignedEntity;
                }

                /**
                 * Define el valor de la propiedad assignedEntity.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DNLabReportResumido.ComponentOf.EncompassingEncounter.EncounterParticipant.AssignedEntity }
                 *     
                 */
                public void setAssignedEntity(DNLabReportResumido.ComponentOf.EncompassingEncounter.EncounterParticipant.AssignedEntity value) {
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
                 *         &lt;element name="id"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="nullFlavor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="code"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *                 &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
                public static class AssignedEntity {

                    @XmlElement(required = true)
                    protected DNLabReportResumido.ComponentOf.EncompassingEncounter.EncounterParticipant.AssignedEntity.Id id;
                    @XmlElement(required = true)
                    protected DNLabReportResumido.ComponentOf.EncompassingEncounter.EncounterParticipant.AssignedEntity.Code code;

                    /**
                     * Obtiene el valor de la propiedad id.
                     * 
                     * @return
                     *     possible object is
                     *     {@link DNLabReportResumido.ComponentOf.EncompassingEncounter.EncounterParticipant.AssignedEntity.Id }
                     *     
                     */
                    public DNLabReportResumido.ComponentOf.EncompassingEncounter.EncounterParticipant.AssignedEntity.Id getId() {
                        return id;
                    }

                    /**
                     * Define el valor de la propiedad id.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link DNLabReportResumido.ComponentOf.EncompassingEncounter.EncounterParticipant.AssignedEntity.Id }
                     *     
                     */
                    public void setId(DNLabReportResumido.ComponentOf.EncompassingEncounter.EncounterParticipant.AssignedEntity.Id value) {
                        this.id = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad code.
                     * 
                     * @return
                     *     possible object is
                     *     {@link DNLabReportResumido.ComponentOf.EncompassingEncounter.EncounterParticipant.AssignedEntity.Code }
                     *     
                     */
                    public DNLabReportResumido.ComponentOf.EncompassingEncounter.EncounterParticipant.AssignedEntity.Code getCode() {
                        return code;
                    }

                    /**
                     * Define el valor de la propiedad code.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link DNLabReportResumido.ComponentOf.EncompassingEncounter.EncounterParticipant.AssignedEntity.Code }
                     *     
                     */
                    public void setCode(DNLabReportResumido.ComponentOf.EncompassingEncounter.EncounterParticipant.AssignedEntity.Code value) {
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
                     *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
                     *       &lt;attribute name="nullFlavor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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

                        @XmlAttribute(name = "nullFlavor")
                        protected String nullFlavor;

                        /**
                         * Obtiene el valor de la propiedad nullFlavor.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNullFlavor() {
                            return nullFlavor;
                        }

                        /**
                         * Define el valor de la propiedad nullFlavor.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNullFlavor(String value) {
                            this.nullFlavor = value;
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
    public static class EffectiveTime {

        @XmlAttribute(name = "value")
        protected String value;

        /**
         * Obtiene el valor de la propiedad value.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
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
         *     {@link Integer }
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
     *                           &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                           &lt;attribute name="assigningAuthorityName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="displayable" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
     *                                       &lt;element name="family" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="given" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                     &lt;/sequence&gt;
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
     *                                     &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="codeSystemVersion" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
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
     *                           &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
     *       &lt;attribute name="contextControlCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
        protected DNLabReportResumido.RecordTarget.PatientRole patientRole;
        @XmlAttribute(name = "typeCode")
        protected String typeCode;
        @XmlAttribute(name = "contextControlCode")
        protected String contextControlCode;

        /**
         * Obtiene el valor de la propiedad patientRole.
         * 
         * @return
         *     possible object is
         *     {@link DNLabReportResumido.RecordTarget.PatientRole }
         *     
         */
        public DNLabReportResumido.RecordTarget.PatientRole getPatientRole() {
            return patientRole;
        }

        /**
         * Define el valor de la propiedad patientRole.
         * 
         * @param value
         *     allowed object is
         *     {@link DNLabReportResumido.RecordTarget.PatientRole }
         *     
         */
        public void setPatientRole(DNLabReportResumido.RecordTarget.PatientRole value) {
            this.patientRole = value;
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
         * Obtiene el valor de la propiedad contextControlCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContextControlCode() {
            return contextControlCode;
        }

        /**
         * Define el valor de la propiedad contextControlCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContextControlCode(String value) {
            this.contextControlCode = value;
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
         *                 &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *                 &lt;attribute name="assigningAuthorityName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="displayable" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
         *                             &lt;element name="family" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="given" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                           &lt;/sequence&gt;
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
         *                           &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="codeSystemVersion" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
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
         *                 &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
            "patient"
        })
        public static class PatientRole {

            @XmlElement(required = true)
            protected List<DNLabReportResumido.RecordTarget.PatientRole.Id> id;
            @XmlElement(required = true)
            protected DNLabReportResumido.RecordTarget.PatientRole.Patient patient;
            @XmlAttribute(name = "classCode")
            protected String classCode;

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
             * {@link DNLabReportResumido.RecordTarget.PatientRole.Id }
             * 
             * 
             */
            public List<DNLabReportResumido.RecordTarget.PatientRole.Id> getId() {
                if (id == null) {
                    id = new ArrayList<DNLabReportResumido.RecordTarget.PatientRole.Id>();
                }
                return this.id;
            }

            /**
             * Obtiene el valor de la propiedad patient.
             * 
             * @return
             *     possible object is
             *     {@link DNLabReportResumido.RecordTarget.PatientRole.Patient }
             *     
             */
            public DNLabReportResumido.RecordTarget.PatientRole.Patient getPatient() {
                return patient;
            }

            /**
             * Define el valor de la propiedad patient.
             * 
             * @param value
             *     allowed object is
             *     {@link DNLabReportResumido.RecordTarget.PatientRole.Patient }
             *     
             */
            public void setPatient(DNLabReportResumido.RecordTarget.PatientRole.Patient value) {
                this.patient = value;
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
             *       &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *       &lt;attribute name="assigningAuthorityName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="displayable" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
                @XmlAttribute(name = "assigningAuthorityName")
                protected String assigningAuthorityName;
                @XmlAttribute(name = "displayable")
                protected String displayable;

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

                /**
                 * Obtiene el valor de la propiedad assigningAuthorityName.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAssigningAuthorityName() {
                    return assigningAuthorityName;
                }

                /**
                 * Define el valor de la propiedad assigningAuthorityName.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAssigningAuthorityName(String value) {
                    this.assigningAuthorityName = value;
                }

                /**
                 * Obtiene el valor de la propiedad displayable.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDisplayable() {
                    return displayable;
                }

                /**
                 * Define el valor de la propiedad displayable.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDisplayable(String value) {
                    this.displayable = value;
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
             *                   &lt;element name="family" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="given" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                 &lt;/sequence&gt;
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
             *                 &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="codeSystemVersion" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
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
             *       &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
                protected DNLabReportResumido.RecordTarget.PatientRole.Patient.Name name;
                @XmlElement(required = true)
                protected DNLabReportResumido.RecordTarget.PatientRole.Patient.AdministrativeGenderCode administrativeGenderCode;
                @XmlElement(required = true)
                protected DNLabReportResumido.RecordTarget.PatientRole.Patient.BirthTime birthTime;
                @XmlAttribute(name = "classCode")
                protected String classCode;
                @XmlAttribute(name = "determinerCode")
                protected String determinerCode;

                /**
                 * Obtiene el valor de la propiedad name.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DNLabReportResumido.RecordTarget.PatientRole.Patient.Name }
                 *     
                 */
                public DNLabReportResumido.RecordTarget.PatientRole.Patient.Name getName() {
                    return name;
                }

                /**
                 * Define el valor de la propiedad name.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DNLabReportResumido.RecordTarget.PatientRole.Patient.Name }
                 *     
                 */
                public void setName(DNLabReportResumido.RecordTarget.PatientRole.Patient.Name value) {
                    this.name = value;
                }

                /**
                 * Obtiene el valor de la propiedad administrativeGenderCode.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DNLabReportResumido.RecordTarget.PatientRole.Patient.AdministrativeGenderCode }
                 *     
                 */
                public DNLabReportResumido.RecordTarget.PatientRole.Patient.AdministrativeGenderCode getAdministrativeGenderCode() {
                    return administrativeGenderCode;
                }

                /**
                 * Define el valor de la propiedad administrativeGenderCode.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DNLabReportResumido.RecordTarget.PatientRole.Patient.AdministrativeGenderCode }
                 *     
                 */
                public void setAdministrativeGenderCode(DNLabReportResumido.RecordTarget.PatientRole.Patient.AdministrativeGenderCode value) {
                    this.administrativeGenderCode = value;
                }

                /**
                 * Obtiene el valor de la propiedad birthTime.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DNLabReportResumido.RecordTarget.PatientRole.Patient.BirthTime }
                 *     
                 */
                public DNLabReportResumido.RecordTarget.PatientRole.Patient.BirthTime getBirthTime() {
                    return birthTime;
                }

                /**
                 * Define el valor de la propiedad birthTime.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DNLabReportResumido.RecordTarget.PatientRole.Patient.BirthTime }
                 *     
                 */
                public void setBirthTime(DNLabReportResumido.RecordTarget.PatientRole.Patient.BirthTime value) {
                    this.birthTime = value;
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
                 * Obtiene el valor de la propiedad determinerCode.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDeterminerCode() {
                    return determinerCode;
                }

                /**
                 * Define el valor de la propiedad determinerCode.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDeterminerCode(String value) {
                    this.determinerCode = value;
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
                 *       &lt;attribute name="codeSystemVersion" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
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
                    @XmlAttribute(name = "codeSystemName")
                    protected String codeSystemName;
                    @XmlAttribute(name = "codeSystemVersion")
                    protected String codeSystemVersion;
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
                     * Obtiene el valor de la propiedad codeSystemVersion.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public String getCodeSystemVersion() {
                        return codeSystemVersion;
                    }

                    /**
                     * Define el valor de la propiedad codeSystemVersion.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setCodeSystemVersion(String value) {
                        this.codeSystemVersion = value;
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
    public static class SetId {

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
