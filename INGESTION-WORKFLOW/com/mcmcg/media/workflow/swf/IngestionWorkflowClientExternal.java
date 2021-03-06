/*
 * This code was generated by AWS Flow Framework Annotation Processor.
 * Refer to Amazon Simple Workflow Service documentation at http://aws.amazon.com/documentation/swf 
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
 package com.mcmcg.media.workflow.swf;

import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.WorkflowClientExternal;

/**
 * Generated from {@link com.mcmcg.media.workflow.swf.IngestionWorkflow}. 
 * Used to start workflow executions or send signals from outside of the scope of a workflow.
 * Created through {@link IngestionWorkflowClientExternalFactory#getClient}.
 * <p>
 * When starting child workflow from a parent workflow use {@link IngestionWorkflowClient} instead.
 */
public interface IngestionWorkflowClientExternal extends WorkflowClientExternal
{

    /**
     * Generated from {@link com.mcmcg.media.workflow.swf.IngestionWorkflow#execute}
     */
    void execute(String filename, String messageId);

    /**
     * Generated from {@link com.mcmcg.media.workflow.swf.IngestionWorkflow#execute}
     */
    void execute(String filename, String messageId, StartWorkflowOptions optionsOverride);
}