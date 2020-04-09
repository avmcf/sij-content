package com.vconsulte.sij.content.model;

/**
 * Created by avmcf, V&C Consultoria on 13/02/19.
 */

public interface SijContentModel {
	
    // Types
    public static final String NAMESPACE_SGJ_CONTENT_MODEL  = "http://www.vconsulte.sij.com/model/content/2.0";
    public static final String TYPE_SIJ_DOC = "doc";
    public static final String TYPE_SIJ_DOCUMENTO = "Documento";

    // Aspects
    public static final String ASPECT_SIJ_PUBLICACAO = "Publicacao";
    public static final String ASPECT_SIJ_DOCJURIDICO = "Documento Juridico";

    // Properties
    public static final String PROP_DOCTIPO = "Tipo";   
    public static final String PROP_DOCSITUACAO = "Stituacao";						
    public static final String PROP_DOCATIVO = "Ativo?";	
    public static final String PROP_DOCDTATIVACAO = "Data Ativacao";
    
    public static final String PROP_PUBDTEDICAO = "Edicao";
    public static final String PROP_PUBTRIBUNAL = "Tribunal";
    public static final String PROP_PUBTOKEN = "Tokens";
    public static final String PROP_PUBRELATOR = "Relator";
    public static final String PROP_PUBRECORRENTE = "Recorrente";
    public static final String PROP_PUBRECORRIDO = "Recorrido";
    public static final String PROP_PUBADVOGADOSRECORRENTE = "Advogados do Recorrente";
    public static final String PROP_PUBADVOGADOSRECORRIDO = "Advogados do Recorrido";
    public static final String PROP_PUBINTIMADOS = "Intimados";
    
    public static final String PROP_JURNUMPROCESSO = "Procesoo";
    public static final String PROP_JURTRIBUNAL = "Tribunal";
    public static final String PROP_JURVARA = "Vara";
    public static final String PROP_JURMUNICIPIO = "Vara";

    // Associations
    public static final String ASSN_DOCUMENTOS_RELACIONADOS = "Documentos Relacionados";
	
}