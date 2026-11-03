package com.aspose.slides;

import java.util.UUID;

public class PptOptions extends SaveOptions implements IPptOptions, Cloneable {
   private com.aspose.slides.ms.System.o0 n5 = new com.aspose.slides.ms.System.o0("{64818d11-4f9b-11cf-86ea-00aa00b929e8}");

   @Override
   public final UUID getRootDirectoryClsid() {
      return com.aspose.slides.ms.System.o0.n5(this.n5());
   }

   com.aspose.slides.ms.System.o0 n5() {
      return this.n5;
   }

   @Override
   public final void setRootDirectoryClsid(UUID value) {
      this.n5(com.aspose.slides.ms.System.o0.n5(value));
   }

   void n5(com.aspose.slides.ms.System.o0 var1) {
      var1.k5(this.n5);
   }

   protected Object memberwiseClone() {
      try {
         PptOptions var1 = (PptOptions)super.clone();
         var1.n5 = this.n5.k5();
         return var1;
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }
}
