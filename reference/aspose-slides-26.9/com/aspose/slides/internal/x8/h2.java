package com.aspose.slides.internal.x8;

public class h2 extends u3 {
   public h2() {
      super("last-child");
   }

   @Override
   public boolean n5(com.aspose.slides.internal.j3.z3 var1, String var2) {
      if (var1.a5() != null && var1.a5().n3() == 1) {
         for (com.aspose.slides.internal.j3.z8 var3 = var1.z7(); var3 != null; var3 = var3.z7()) {
            if (var3.n3() == 1) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }
}
