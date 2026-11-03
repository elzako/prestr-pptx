package com.aspose.slides;

public class VbaReferenceOleTypeLib implements IVbaReferenceOleTypeLib {
   private String n5;
   private String l6;

   public VbaReferenceOleTypeLib(String name, String libid) {
      this.n5 = name;
      this.l6 = libid;
   }

   @Override
   public final String getName() {
      return this.n5;
   }

   @Override
   public final void setName(String value) {
      this.n5 = value;
   }

   @Override
   public final String getLibid() {
      return this.l6;
   }

   @Override
   public final void setLibid(String value) {
      this.l6 = value;
   }
}
