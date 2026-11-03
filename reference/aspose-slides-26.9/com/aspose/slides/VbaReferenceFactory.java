package com.aspose.slides;

public class VbaReferenceFactory implements IVbaReferenceFactory {
   private static final VbaReferenceFactory n5 = new VbaReferenceFactory();

   public static VbaReferenceFactory getInstance() {
      return n5;
   }

   @Override
   public final IVbaReferenceOleTypeLib createOleTypeLibReference(String name, String libid) {
      return new VbaReferenceOleTypeLib(name, libid);
   }
}
