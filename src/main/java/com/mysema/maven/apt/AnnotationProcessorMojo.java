/*
 * Copyright (c) 2009 Mysema Ltd.
 * All rights reserved.
 * 
 */
package com.mysema.maven.apt;

import java.io.File;

/**
 * AnnotationProcessorMojo calls APT processors for code generation
 * 
 * @goal process
 * @phase generate-sources
 * @requiresDependencyResolution compile
 */
public class AnnotationProcessorMojo extends AbstractProcessorMojo {

    /**
     * @parameter
     */
    private File outputDirectory;

    @Override
    public File getOutputDirectory() {
        return outputDirectory;
    }
    
}
