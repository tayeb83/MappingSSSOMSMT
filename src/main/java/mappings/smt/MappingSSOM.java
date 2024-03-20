package mappings.smt;

import java.util.Date;

public class MappingSSOM {
    String subject_id;
    String subject_label;
    String subject_code;
    String object_code;
    String subject_category;
    String predicate_id;
    String predicate_label;
    String predicate_modifier;  // VARCHAR(3),
    String object_id;
    String object_label;
    String object_category ;
    String mapping_justification ;
    String author_id ;
    String author_label ;
    String reviewer_id ;
    String reviewer_label ;
    String creator_id ;
    String creator_label ;
    String license ;
    String subject_type ;
    String subject_source ;
    String subject_source_version ;
    String object_type ;
    String object_source ;
    String object_source_version ;
    String mapping_provider ;
    String mapping_cardinality ;
    String mapping_tool ;
    String mapping_tool_version ;
    Date mapping_date ;
    float confidence ;
    String subject_match_field ;
    String object_match_field ;
    String match_string ;
    String subject_preprocessing ;
    String object_preprocessing ;
    float semantic_similarity_score ;
    String semantic_similarity_measure ;
    String  see_also ;
    String other ;
    String comment ;
    String validationStatus;

    public MappingSSOM(String subject_id, String subject_label, String predicate_id, String predicate_label, String object_id, String object_label, String mapping_justification) {
        this.subject_id = subject_id;
        this.subject_label = subject_label;
        this.predicate_id = predicate_id;
        this.predicate_label = predicate_label;
        this.object_id = object_id;
        this.object_label = object_label;
        this.mapping_justification = mapping_justification;
    }

    public MappingSSOM() {
    }

    public String getSubject_code() {
        return subject_code;
    }

    public void setSubject_code(String subject_code) {
        this.subject_code = subject_code;
    }

    public String getValidationStatus() {
        return validationStatus;
    }

    public void setValidationStatus(String validationStatus) {
        this.validationStatus = validationStatus;
    }

    public String getObject_code() {
        return object_code;
    }

    public void setObject_code(String object_code) {
        this.object_code = object_code;
    }

    public String getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(String subject_id) {
        this.subject_id = subject_id;
    }

    public String getSubject_label() {
        return subject_label;
    }

    public void setSubject_label(String subject_label) {
        this.subject_label = subject_label;
    }

    public String getSubject_category() {
        return subject_category;
    }

    public void setSubject_category(String subject_category) {
        this.subject_category = subject_category;
    }

    public String getPredicate_id() {
        return predicate_id;
    }

    public void setPredicate_id(String predicate_id) {
        this.predicate_id = predicate_id;
    }

    public String getPredicate_label() {
        return predicate_label;
    }

    public void setPredicate_label(String predicate_label) {
        this.predicate_label = predicate_label;
    }

    public String getPredicate_modifier() {
        return predicate_modifier;
    }

    public void setPredicate_modifier(String predicate_modifier) {
        this.predicate_modifier = predicate_modifier;
    }

    public String getObject_id() {
        return object_id;
    }

    public void setObject_id(String object_id) {
        this.object_id = object_id;
    }

    public String getObject_label() {
        return object_label;
    }

    public void setObject_label(String object_label) {
        this.object_label = object_label;
    }

    public String getObject_category() {
        return object_category;
    }

    public void setObject_category(String object_category) {
        this.object_category = object_category;
    }

    public String getMapping_justification() {
        return mapping_justification;
    }

    public void setMapping_justification(String mapping_justification) {
        this.mapping_justification = mapping_justification;
    }

    public String getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(String author_id) {
        this.author_id = author_id;
    }

    public String getAuthor_label() {
        return author_label;
    }

    public void setAuthor_label(String author_label) {
        this.author_label = author_label;
    }

    public String getReviewer_id() {
        return reviewer_id;
    }

    public void setReviewer_id(String reviewer_id) {
        this.reviewer_id = reviewer_id;
    }

    public String getReviewer_label() {
        return reviewer_label;
    }

    public void setReviewer_label(String reviewer_label) {
        this.reviewer_label = reviewer_label;
    }

    public String getCreator_id() {
        return creator_id;
    }

    public void setCreator_id(String creator_id) {
        this.creator_id = creator_id;
    }

    public String getCreator_label() {
        return creator_label;
    }

    public void setCreator_label(String creator_label) {
        this.creator_label = creator_label;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getSubject_type() {
        return subject_type;
    }

    public void setSubject_type(String subject_type) {
        this.subject_type = subject_type;
    }

    public String getSubject_source() {
        return subject_source;
    }

    public void setSubject_source(String subject_source) {
        this.subject_source = subject_source;
    }

    public String getSubject_source_version() {
        return subject_source_version;
    }

    public void setSubject_source_version(String subject_source_version) {
        this.subject_source_version = subject_source_version;
    }

    public String getObject_type() {
        return object_type;
    }

    public void setObject_type(String object_type) {
        this.object_type = object_type;
    }

    public String getObject_source() {
        return object_source;
    }

    public void setObject_source(String object_source) {
        this.object_source = object_source;
    }

    public String getObject_source_version() {
        return object_source_version;
    }

    public void setObject_source_version(String object_source_version) {
        this.object_source_version = object_source_version;
    }

    public String getMapping_provider() {
        return mapping_provider;
    }

    public void setMapping_provider(String mapping_provider) {
        this.mapping_provider = mapping_provider;
    }

    public String getMapping_cardinality() {
        return mapping_cardinality;
    }

    public void setMapping_cardinality(String mapping_cardinality) {
        this.mapping_cardinality = mapping_cardinality;
    }

    public String getMapping_tool() {
        return mapping_tool;
    }

    public void setMapping_tool(String mapping_tool) {
        this.mapping_tool = mapping_tool;
    }

    public String getMapping_tool_version() {
        return mapping_tool_version;
    }

    public void setMapping_tool_version(String mapping_tool_version) {
        this.mapping_tool_version = mapping_tool_version;
    }

    public Date getMapping_date() {
        return mapping_date;
    }

    public void setMapping_date(Date mapping_date) {
        this.mapping_date = mapping_date;
    }

    public float getConfidence() {
        return confidence;
    }

    public void setConfidence(float confidence) {
        this.confidence = confidence;
    }

    public String getSubject_match_field() {
        return subject_match_field;
    }

    public void setSubject_match_field(String subject_match_field) {
        this.subject_match_field = subject_match_field;
    }

    public String getObject_match_field() {
        return object_match_field;
    }

    public void setObject_match_field(String object_match_field) {
        this.object_match_field = object_match_field;
    }

    public String getMatch_string() {
        return match_string;
    }

    public void setMatch_string(String match_string) {
        this.match_string = match_string;
    }

    public String getSubject_preprocessing() {
        return subject_preprocessing;
    }

    public void setSubject_preprocessing(String subject_preprocessing) {
        this.subject_preprocessing = subject_preprocessing;
    }

    public String getObject_preprocessing() {
        return object_preprocessing;
    }

    public void setObject_preprocessing(String object_preprocessing) {
        this.object_preprocessing = object_preprocessing;
    }

    public float getSemantic_similarity_score() {
        return semantic_similarity_score;
    }

    public void setSemantic_similarity_score(float semantic_similarity_score) {
        this.semantic_similarity_score = semantic_similarity_score;
    }

    public String getSemantic_similarity_measure() {
        return semantic_similarity_measure;
    }

    public void setSemantic_similarity_measure(String semantic_similarity_measure) {
        this.semantic_similarity_measure = semantic_similarity_measure;
    }

    public String getSee_also() {
        return see_also;
    }

    public void setSee_also(String see_also) {
        this.see_also = see_also;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
