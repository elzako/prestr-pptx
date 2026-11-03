package com.aspose.slides;

public interface IVbaProject {
   String getName();

   IVbaModuleCollection getModules();

   IVbaReferenceCollection getReferences();

   byte[] toBinary();

   boolean isPasswordProtected();
}
