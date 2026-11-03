package com.aspose.slides;

public class VbaProjectFactory implements IVbaProjectFactory {
   private static final VbaProjectFactory n5 = new VbaProjectFactory();

   public static VbaProjectFactory getInstance() {
      return n5;
   }

   @Override
   public final IVbaProject createVbaProject() {
      return new VbaProject();
   }

   @Override
   public final IVbaProject readVbaProject(byte[] data) {
      return new VbaProject(data);
   }
}
