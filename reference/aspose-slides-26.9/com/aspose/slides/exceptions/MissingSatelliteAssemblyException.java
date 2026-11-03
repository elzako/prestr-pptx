package com.aspose.slides.exceptions;

import com.aspose.slides.ms.System.j3;

@j3
public class MissingSatelliteAssemblyException extends SystemException {
   private String n5;

   public MissingSatelliteAssemblyException() {
      super("The satellite assembly was not found for the required culture.");
   }

   public MissingSatelliteAssemblyException(String message) {
      super(message);
   }

   public MissingSatelliteAssemblyException(String message, String cultureName) {
      super(message);
      this.n5 = cultureName;
   }

   public MissingSatelliteAssemblyException(String message, Exception inner) {
      super(message, inner);
   }

   public String getCultureName() {
      return this.n5;
   }
}
